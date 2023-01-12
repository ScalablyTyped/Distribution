package typings.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateComponentOutput extends StObject {
  
  /**
    * The detailed data of the updated component.
    */
  var component: Component
}
object UpdateComponentOutput {
  
  inline def apply(component: Component): UpdateComponentOutput = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateComponentOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateComponentOutput] (val x: Self) extends AnyVal {
    
    inline def setComponent(value: Component): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
  }
}
