package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JourneyChannelSettings extends StObject {
  
  /**
    * Amazon Resource Name (ARN) of the Connect Campaign.
    */
  var ConnectCampaignArn: js.UndefOr[string] = js.undefined
  
  /**
    * IAM role ARN to be assumed when invoking Connect campaign execution APIs for dialing.
    */
  var ConnectCampaignExecutionRoleArn: js.UndefOr[string] = js.undefined
}
object JourneyChannelSettings {
  
  inline def apply(): JourneyChannelSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JourneyChannelSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JourneyChannelSettings] (val x: Self) extends AnyVal {
    
    inline def setConnectCampaignArn(value: string): Self = StObject.set(x, "ConnectCampaignArn", value.asInstanceOf[js.Any])
    
    inline def setConnectCampaignArnUndefined: Self = StObject.set(x, "ConnectCampaignArn", js.undefined)
    
    inline def setConnectCampaignExecutionRoleArn(value: string): Self = StObject.set(x, "ConnectCampaignExecutionRoleArn", value.asInstanceOf[js.Any])
    
    inline def setConnectCampaignExecutionRoleArnUndefined: Self = StObject.set(x, "ConnectCampaignExecutionRoleArn", js.undefined)
  }
}
