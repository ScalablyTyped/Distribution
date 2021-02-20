package typings.angularCore.anon

import typings.angularCore.angularCoreStrings.any
import typings.angularCore.angularCoreStrings.platform
import typings.angularCore.angularCoreStrings.root
import typings.angularCore.mod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FactoryProvidedIn[T] extends StObject {
  
  def factory(): T = js.native
  
  var providedIn: js.UndefOr[Type[_] | root | platform | any | Null] = js.native
}
object FactoryProvidedIn {
  
  @scala.inline
  def apply[T](factory: () => T): FactoryProvidedIn[T] = {
    val __obj = js.Dynamic.literal(factory = js.Any.fromFunction0(factory))
    __obj.asInstanceOf[FactoryProvidedIn[T]]
  }
  
  @scala.inline
  implicit class FactoryProvidedInMutableBuilder[Self <: FactoryProvidedIn[_], T] (val x: Self with FactoryProvidedIn[T]) extends AnyVal {
    
    @scala.inline
    def setFactory(value: () => T): Self = StObject.set(x, "factory", js.Any.fromFunction0(value))
    
    @scala.inline
    def setProvidedIn(value: Type[_] | root | platform | any): Self = StObject.set(x, "providedIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvidedInNull: Self = StObject.set(x, "providedIn", null)
    
    @scala.inline
    def setProvidedInUndefined: Self = StObject.set(x, "providedIn", js.undefined)
  }
}
