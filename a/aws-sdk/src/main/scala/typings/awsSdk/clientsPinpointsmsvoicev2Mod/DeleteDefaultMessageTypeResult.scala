package typings.awsSdk.clientsPinpointsmsvoicev2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDefaultMessageTypeResult extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the configuration set.
    */
  var ConfigurationSetArn: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the configuration set.
    */
  var ConfigurationSetName: js.UndefOr[typings.awsSdk.clientsPinpointsmsvoicev2Mod.ConfigurationSetName] = js.undefined
  
  /**
    * The current message type for the configuration set.
    */
  var MessageType: js.UndefOr[typings.awsSdk.clientsPinpointsmsvoicev2Mod.MessageType] = js.undefined
}
object DeleteDefaultMessageTypeResult {
  
  inline def apply(): DeleteDefaultMessageTypeResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteDefaultMessageTypeResult]
  }
  
  extension [Self <: DeleteDefaultMessageTypeResult](x: Self) {
    
    inline def setConfigurationSetArn(value: String): Self = StObject.set(x, "ConfigurationSetArn", value.asInstanceOf[js.Any])
    
    inline def setConfigurationSetArnUndefined: Self = StObject.set(x, "ConfigurationSetArn", js.undefined)
    
    inline def setConfigurationSetName(value: ConfigurationSetName): Self = StObject.set(x, "ConfigurationSetName", value.asInstanceOf[js.Any])
    
    inline def setConfigurationSetNameUndefined: Self = StObject.set(x, "ConfigurationSetName", js.undefined)
    
    inline def setMessageType(value: MessageType): Self = StObject.set(x, "MessageType", value.asInstanceOf[js.Any])
    
    inline def setMessageTypeUndefined: Self = StObject.set(x, "MessageType", js.undefined)
  }
}
