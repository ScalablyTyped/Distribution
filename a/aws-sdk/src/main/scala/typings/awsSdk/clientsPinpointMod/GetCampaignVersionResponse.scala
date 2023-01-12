package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCampaignVersionResponse extends StObject {
  
  var CampaignResponse: typings.awsSdk.clientsPinpointMod.CampaignResponse
}
object GetCampaignVersionResponse {
  
  inline def apply(CampaignResponse: CampaignResponse): GetCampaignVersionResponse = {
    val __obj = js.Dynamic.literal(CampaignResponse = CampaignResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCampaignVersionResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetCampaignVersionResponse] (val x: Self) extends AnyVal {
    
    inline def setCampaignResponse(value: CampaignResponse): Self = StObject.set(x, "CampaignResponse", value.asInstanceOf[js.Any])
  }
}
