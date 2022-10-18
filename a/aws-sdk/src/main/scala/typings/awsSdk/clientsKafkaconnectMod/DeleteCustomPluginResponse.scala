package typings.awsSdk.clientsKafkaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteCustomPluginResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the custom plugin that you requested to delete.
    */
  var customPluginArn: js.UndefOr[string] = js.undefined
  
  /**
    * The state of the custom plugin.
    */
  var customPluginState: js.UndefOr[CustomPluginState] = js.undefined
}
object DeleteCustomPluginResponse {
  
  inline def apply(): DeleteCustomPluginResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteCustomPluginResponse]
  }
  
  extension [Self <: DeleteCustomPluginResponse](x: Self) {
    
    inline def setCustomPluginArn(value: string): Self = StObject.set(x, "customPluginArn", value.asInstanceOf[js.Any])
    
    inline def setCustomPluginArnUndefined: Self = StObject.set(x, "customPluginArn", js.undefined)
    
    inline def setCustomPluginState(value: CustomPluginState): Self = StObject.set(x, "customPluginState", value.asInstanceOf[js.Any])
    
    inline def setCustomPluginStateUndefined: Self = StObject.set(x, "customPluginState", js.undefined)
  }
}
