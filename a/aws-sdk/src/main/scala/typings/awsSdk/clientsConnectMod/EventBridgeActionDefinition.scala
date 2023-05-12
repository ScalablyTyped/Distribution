package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventBridgeActionDefinition extends StObject {
  
  /**
    * The name.
    */
  var Name: EventBridgeActionName
}
object EventBridgeActionDefinition {
  
  inline def apply(Name: EventBridgeActionName): EventBridgeActionDefinition = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventBridgeActionDefinition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EventBridgeActionDefinition] (val x: Self) extends AnyVal {
    
    inline def setName(value: EventBridgeActionName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
