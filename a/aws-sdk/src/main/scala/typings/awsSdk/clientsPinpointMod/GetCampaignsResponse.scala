package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCampaignsResponse extends StObject {
  
  var CampaignsResponse: typings.awsSdk.clientsPinpointMod.CampaignsResponse
}
object GetCampaignsResponse {
  
  inline def apply(CampaignsResponse: CampaignsResponse): GetCampaignsResponse = {
    val __obj = js.Dynamic.literal(CampaignsResponse = CampaignsResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCampaignsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetCampaignsResponse] (val x: Self) extends AnyVal {
    
    inline def setCampaignsResponse(value: CampaignsResponse): Self = StObject.set(x, "CampaignsResponse", value.asInstanceOf[js.Any])
  }
}
