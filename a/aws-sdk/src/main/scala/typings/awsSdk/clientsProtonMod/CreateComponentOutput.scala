package typings.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateComponentOutput extends StObject {
  
  /**
    * The detailed data of the created component.
    */
  var component: Component
}
object CreateComponentOutput {
  
  inline def apply(component: Component): CreateComponentOutput = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateComponentOutput]
  }
  
  extension [Self <: CreateComponentOutput](x: Self) {
    
    inline def setComponent(value: Component): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
  }
}
