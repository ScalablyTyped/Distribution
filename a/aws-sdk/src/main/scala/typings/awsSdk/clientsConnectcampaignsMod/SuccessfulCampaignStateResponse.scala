package typings.awsSdk.clientsConnectcampaignsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SuccessfulCampaignStateResponse extends StObject {
  
  var campaignId: js.UndefOr[CampaignId] = js.undefined
  
  var state: js.UndefOr[CampaignState] = js.undefined
}
object SuccessfulCampaignStateResponse {
  
  inline def apply(): SuccessfulCampaignStateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuccessfulCampaignStateResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SuccessfulCampaignStateResponse] (val x: Self) extends AnyVal {
    
    inline def setCampaignId(value: CampaignId): Self = StObject.set(x, "campaignId", value.asInstanceOf[js.Any])
    
    inline def setCampaignIdUndefined: Self = StObject.set(x, "campaignId", js.undefined)
    
    inline def setState(value: CampaignState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
