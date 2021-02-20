package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  
  /** Returns true if `value` is a wrapped value. */
  @JSImport("@angular/core", "WrappedValue.isWrapped")
  @js.native
  def isWrapped(value: js.Any): /* is @angular/core.@angular/core.WrappedValue */ Boolean = js.native
  
  /**
    * Returns the underlying value of a wrapped value.
    * Returns the given `value` when it is not wrapped.
    **/
  @JSImport("@angular/core", "WrappedValue.unwrap")
  @js.native
  def unwrap(value: js.Any): js.Any = js.native
  
  /** Creates a wrapped value. */
  @JSImport("@angular/core", "WrappedValue.wrap")
  @js.native
  def wrap(value: js.Any): WrappedValue = js.native
}
