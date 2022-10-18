package typings.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetComponentOutput extends StObject {
  
  /**
    * The detailed data of the requested component.
    */
  var component: js.UndefOr[Component] = js.undefined
}
object GetComponentOutput {
  
  inline def apply(): GetComponentOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetComponentOutput]
  }
  
  extension [Self <: GetComponentOutput](x: Self) {
    
    inline def setComponent(value: Component): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
  }
}
