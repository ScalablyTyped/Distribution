package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCampaignVersionsResponse extends StObject {
  
  var CampaignsResponse: typings.awsSdk.clientsPinpointMod.CampaignsResponse
}
object GetCampaignVersionsResponse {
  
  inline def apply(CampaignsResponse: CampaignsResponse): GetCampaignVersionsResponse = {
    val __obj = js.Dynamic.literal(CampaignsResponse = CampaignsResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCampaignVersionsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetCampaignVersionsResponse] (val x: Self) extends AnyVal {
    
    inline def setCampaignsResponse(value: CampaignsResponse): Self = StObject.set(x, "CampaignsResponse", value.asInstanceOf[js.Any])
  }
}
