package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSignalOptions[T] extends StObject {
  
  /**
    * A comparison function which defines equality for signal values.
    */
  var equal: js.UndefOr[ValueEqualityFn[T]] = js.undefined
}
object CreateSignalOptions {
  
  inline def apply[T](): CreateSignalOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSignalOptions[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateSignalOptions[?], T] (val x: Self & CreateSignalOptions[T]) extends AnyVal {
    
    inline def setEqual(value: (T, T) => Boolean): Self = StObject.set(x, "equal", js.Any.fromFunction2(value))
    
    inline def setEqualUndefined: Self = StObject.set(x, "equal", js.undefined)
  }
}
