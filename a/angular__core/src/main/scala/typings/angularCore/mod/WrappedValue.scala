package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/core", "WrappedValue")
@js.native
class WrappedValue protected () extends StObject {
  def this(value: js.Any) = this()
  
  /** @deprecated from 5.3, use `unwrap()` instead - will switch to protected */
  var wrapped: js.Any = js.native
}
/* static members */
object WrappedValue {
  
  @JSImport("@angular/core", "WrappedValue")
  @js.native
  val ^ : js.Any = js.native
  
  /** Returns true if `value` is a wrapped value. */
  inline def isWrapped(value: js.Any): /* is @angular/core.@angular/core.WrappedValue */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isWrapped")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @angular/core.@angular/core.WrappedValue */ Boolean]
  
  /**
    * Returns the underlying value of a wrapped value.
    * Returns the given `value` when it is not wrapped.
    **/
  inline def unwrap(value: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("unwrap")(value.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  /** Creates a wrapped value. */
  inline def wrap(value: js.Any): WrappedValue = ^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(value.asInstanceOf[js.Any]).asInstanceOf[WrappedValue]
}
