package typings.awsSdk.clientsConnectcampaignsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateCampaignDialerConfigRequest extends StObject {
  
  var dialerConfig: DialerConfig
  
  var id: CampaignId
}
object UpdateCampaignDialerConfigRequest {
  
  inline def apply(dialerConfig: DialerConfig, id: CampaignId): UpdateCampaignDialerConfigRequest = {
    val __obj = js.Dynamic.literal(dialerConfig = dialerConfig.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateCampaignDialerConfigRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateCampaignDialerConfigRequest] (val x: Self) extends AnyVal {
    
    inline def setDialerConfig(value: DialerConfig): Self = StObject.set(x, "dialerConfig", value.asInstanceOf[js.Any])
    
    inline def setId(value: CampaignId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
