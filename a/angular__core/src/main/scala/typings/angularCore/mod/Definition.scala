package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Definition[DF /* <: DefinitionFactory[_] */] extends StObject {
  
  var factory: DF | Null = js.native
}
object Definition {
  
  @scala.inline
  def apply[DF /* <: DefinitionFactory[_] */](): Definition[DF] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Definition[DF]]
  }
  
  @scala.inline
  implicit class DefinitionMutableBuilder[Self <: Definition[_], DF /* <: DefinitionFactory[_] */] (val x: Self with Definition[DF]) extends AnyVal {
    
    @scala.inline
    def setFactory(value: DF): Self = StObject.set(x, "factory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFactoryNull: Self = StObject.set(x, "factory", null)
  }
}
