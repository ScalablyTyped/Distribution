package typings.angularCore.anon

import typings.angularCore.angularCoreBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InitialValue[U /* <: js.UndefOr[T | Null] */, T] extends StObject {
  
  var initialValue: U
  
  var requireSync: js.UndefOr[`false`] = js.undefined
}
object InitialValue {
  
  inline def apply[U /* <: js.UndefOr[T | Null] */, T](initialValue: U): InitialValue[U, T] = {
    val __obj = js.Dynamic.literal(initialValue = initialValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitialValue[U, T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InitialValue[?, ?], U /* <: js.UndefOr[T | Null] */, T] (val x: Self & (InitialValue[U, T])) extends AnyVal {
    
    inline def setInitialValue(value: U): Self = StObject.set(x, "initialValue", value.asInstanceOf[js.Any])
    
    inline def setRequireSync(value: `false`): Self = StObject.set(x, "requireSync", value.asInstanceOf[js.Any])
    
    inline def setRequireSyncUndefined: Self = StObject.set(x, "requireSync", js.undefined)
  }
}
