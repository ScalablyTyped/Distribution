package typings.awsSdk.clientsKafkaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteCustomPluginRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the custom plugin that you want to delete.
    */
  var customPluginArn: string
}
object DeleteCustomPluginRequest {
  
  inline def apply(customPluginArn: string): DeleteCustomPluginRequest = {
    val __obj = js.Dynamic.literal(customPluginArn = customPluginArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCustomPluginRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteCustomPluginRequest] (val x: Self) extends AnyVal {
    
    inline def setCustomPluginArn(value: string): Self = StObject.set(x, "customPluginArn", value.asInstanceOf[js.Any])
  }
}
