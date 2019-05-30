package typings
package atAngularCoreLib.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core", "WrappedValue")
@js.native
class WrappedValue protected () extends js.Object {
  def this(value: js.Any) = this()
  /** @deprecated from 5.3, use `unwrap()` instead - will switch to protected */
  var wrapped: js.Any = js.native
}

/* static members */
@JSImport("@angular/core", "WrappedValue")
@js.native
object WrappedValue extends js.Object {
  /** Returns true if `value` is a wrapped value. */
  def isWrapped(value: js.Any): /* is @angular/core.@angular/core.WrappedValue */ scala.Boolean = js.native
  /**
    * Returns the underlying value of a wrapped value.
    * Returns the given `value` when it is not wrapped.
    **/
  def unwrap(value: js.Any): js.Any = js.native
  /** Creates a wrapped value. */
  def wrap(value: js.Any): atAngularCoreLib.atAngularCoreMod.WrappedValue = js.native
}

