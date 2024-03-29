package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCampaignRequest extends StObject {
  
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: string
  
  var WriteCampaignRequest: typings.awsSdk.clientsPinpointMod.WriteCampaignRequest
}
object CreateCampaignRequest {
  
  inline def apply(ApplicationId: string, WriteCampaignRequest: WriteCampaignRequest): CreateCampaignRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], WriteCampaignRequest = WriteCampaignRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCampaignRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateCampaignRequest] (val x: Self) extends AnyVal {
    
    inline def setApplicationId(value: string): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    inline def setWriteCampaignRequest(value: WriteCampaignRequest): Self = StObject.set(x, "WriteCampaignRequest", value.asInstanceOf[js.Any])
  }
}
