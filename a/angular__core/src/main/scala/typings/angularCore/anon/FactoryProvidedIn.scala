package typings.angularCore.anon

import typings.angularCore.angularCoreStrings.any
import typings.angularCore.angularCoreStrings.platform
import typings.angularCore.angularCoreStrings.root
import typings.angularCore.mod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FactoryProvidedIn[T] extends StObject {
  
  def factory(): T
  
  var providedIn: js.UndefOr[Type[Any] | root | platform | any | Null] = js.undefined
}
object FactoryProvidedIn {
  
  inline def apply[T](factory: () => T): FactoryProvidedIn[T] = {
    val __obj = js.Dynamic.literal(factory = js.Any.fromFunction0(factory))
    __obj.asInstanceOf[FactoryProvidedIn[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FactoryProvidedIn[?], T] (val x: Self & FactoryProvidedIn[T]) extends AnyVal {
    
    inline def setFactory(value: () => T): Self = StObject.set(x, "factory", js.Any.fromFunction0(value))
    
    inline def setProvidedIn(value: Type[Any] | root | platform | any): Self = StObject.set(x, "providedIn", value.asInstanceOf[js.Any])
    
    inline def setProvidedInNull: Self = StObject.set(x, "providedIn", null)
    
    inline def setProvidedInUndefined: Self = StObject.set(x, "providedIn", js.undefined)
  }
}
