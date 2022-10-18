package typings.awsSdk.clientsPinpointsmsvoicev2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetDefaultSenderIdResult extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the updated configuration set.
    */
  var ConfigurationSetArn: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the configuration set that was updated.
    */
  var ConfigurationSetName: js.UndefOr[typings.awsSdk.clientsPinpointsmsvoicev2Mod.ConfigurationSetName] = js.undefined
  
  /**
    * The default sender ID to set for the ConfigurationSet.
    */
  var SenderId: js.UndefOr[typings.awsSdk.clientsPinpointsmsvoicev2Mod.SenderId] = js.undefined
}
object SetDefaultSenderIdResult {
  
  inline def apply(): SetDefaultSenderIdResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetDefaultSenderIdResult]
  }
  
  extension [Self <: SetDefaultSenderIdResult](x: Self) {
    
    inline def setConfigurationSetArn(value: String): Self = StObject.set(x, "ConfigurationSetArn", value.asInstanceOf[js.Any])
    
    inline def setConfigurationSetArnUndefined: Self = StObject.set(x, "ConfigurationSetArn", js.undefined)
    
    inline def setConfigurationSetName(value: ConfigurationSetName): Self = StObject.set(x, "ConfigurationSetName", value.asInstanceOf[js.Any])
    
    inline def setConfigurationSetNameUndefined: Self = StObject.set(x, "ConfigurationSetName", js.undefined)
    
    inline def setSenderId(value: SenderId): Self = StObject.set(x, "SenderId", value.asInstanceOf[js.Any])
    
    inline def setSenderIdUndefined: Self = StObject.set(x, "SenderId", js.undefined)
  }
}
