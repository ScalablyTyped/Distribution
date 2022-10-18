package typings.awsSdk.clientsKafkaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomPluginDescription extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the custom plugin.
    */
  var customPluginArn: js.UndefOr[string] = js.undefined
  
  /**
    * The revision of the custom plugin.
    */
  var revision: js.UndefOr[long] = js.undefined
}
object CustomPluginDescription {
  
  inline def apply(): CustomPluginDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomPluginDescription]
  }
  
  extension [Self <: CustomPluginDescription](x: Self) {
    
    inline def setCustomPluginArn(value: string): Self = StObject.set(x, "customPluginArn", value.asInstanceOf[js.Any])
    
    inline def setCustomPluginArnUndefined: Self = StObject.set(x, "customPluginArn", js.undefined)
    
    inline def setRevision(value: long): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
    
    inline def setRevisionUndefined: Self = StObject.set(x, "revision", js.undefined)
  }
}
