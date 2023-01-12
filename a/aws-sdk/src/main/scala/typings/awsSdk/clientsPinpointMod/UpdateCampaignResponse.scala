package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateCampaignResponse extends StObject {
  
  var CampaignResponse: typings.awsSdk.clientsPinpointMod.CampaignResponse
}
object UpdateCampaignResponse {
  
  inline def apply(CampaignResponse: CampaignResponse): UpdateCampaignResponse = {
    val __obj = js.Dynamic.literal(CampaignResponse = CampaignResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateCampaignResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateCampaignResponse] (val x: Self) extends AnyVal {
    
    inline def setCampaignResponse(value: CampaignResponse): Self = StObject.set(x, "CampaignResponse", value.asInstanceOf[js.Any])
  }
}
