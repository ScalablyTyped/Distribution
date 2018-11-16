package typings
package atAngularCoreLib.srcChangeUnderscoreDetectionChangeUnderscoreDetectionUnderscoreUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/src/change_detection/change_detection_util", "WrappedValue")
@js.native
class WrappedValue protected () extends js.Object {
  def this(value: js.Any) = this()
  /** @deprecated from 5.3, use `unwrap()` instead - will switch to protected */
  var wrapped: js.Any = js.native
}

@JSImport("@angular/core/src/change_detection/change_detection_util", "WrappedValue")
@js.native
object WrappedValue extends js.Object {
  /** Returns true if `value` is a wrapped value. */
  def isWrapped(value: js.Any): /* is WrappedValue */scala.Boolean = js.native
  /**
       * Returns the underlying value of a wrapped value.
       * Returns the given `value` when it is not wrapped.
       **/
  def unwrap(value: js.Any): js.Any = js.native
  /** Creates a wrapped value. */
  def wrap(value: js.Any): atAngularCoreLib.srcChangeUnderscoreDetectionChangeUnderscoreDetectionUnderscoreUtilMod.WrappedValue = js.native
}

