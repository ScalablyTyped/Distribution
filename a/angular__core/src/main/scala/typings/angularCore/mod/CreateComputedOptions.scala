package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateComputedOptions[T] extends StObject {
  
  /**
    * A comparison function which defines equality for computed values.
    */
  var equal: js.UndefOr[ValueEqualityFn[T]] = js.undefined
}
object CreateComputedOptions {
  
  inline def apply[T](): CreateComputedOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateComputedOptions[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateComputedOptions[?], T] (val x: Self & CreateComputedOptions[T]) extends AnyVal {
    
    inline def setEqual(value: (T, T) => Boolean): Self = StObject.set(x, "equal", js.Any.fromFunction2(value))
    
    inline def setEqualUndefined: Self = StObject.set(x, "equal", js.undefined)
  }
}
