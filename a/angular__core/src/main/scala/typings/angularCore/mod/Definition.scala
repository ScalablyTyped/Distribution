package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Definition[DF /* <: DefinitionFactory[js.Any] */] extends StObject {
  
  var factory: DF | Null
}
object Definition {
  
  inline def apply[DF /* <: DefinitionFactory[js.Any] */](): Definition[DF] = {
    val __obj = js.Dynamic.literal(factory = null)
    __obj.asInstanceOf[Definition[DF]]
  }
  
  extension [Self <: Definition[?], DF /* <: DefinitionFactory[js.Any] */](x: Self & Definition[DF]) {
    
    inline def setFactory(value: DF): Self = StObject.set(x, "factory", value.asInstanceOf[js.Any])
    
    inline def setFactoryNull: Self = StObject.set(x, "factory", null)
  }
}
