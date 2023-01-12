package typings.awsSdk.clientsKafkaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Plugin extends StObject {
  
  /**
    * Details about a custom plugin.
    */
  var customPlugin: CustomPlugin
}
object Plugin {
  
  inline def apply(customPlugin: CustomPlugin): Plugin = {
    val __obj = js.Dynamic.literal(customPlugin = customPlugin.asInstanceOf[js.Any])
    __obj.asInstanceOf[Plugin]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Plugin] (val x: Self) extends AnyVal {
    
    inline def setCustomPlugin(value: CustomPlugin): Self = StObject.set(x, "customPlugin", value.asInstanceOf[js.Any])
  }
}
