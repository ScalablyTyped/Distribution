package typings
package atAngularCoreLib.srcChangeUnderscoreDetectionChangeUnderscoreDetectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/src/change_detection/change_detection", "WrappedValue")
@js.native
class WrappedValue protected ()
  extends atAngularCoreLib.srcChangeUnderscoreDetectionChangeUnderscoreDetectionUnderscoreUtilMod.WrappedValue {
  def this(value: js.Any) = this()
}

/* static members */
@JSImport("@angular/core/src/change_detection/change_detection", "WrappedValue")
@js.native
object WrappedValue extends js.Object {
  /** Returns true if `value` is a wrapped value. */
  def isWrapped(value: js.Any): /* is @angular/core.@angular/core/src/change_detection/change_detection_util.WrappedValue */ scala.Boolean = js.native
  /**
    * Returns the underlying value of a wrapped value.
    * Returns the given `value` when it is not wrapped.
    **/
  def unwrap(value: js.Any): js.Any = js.native
  /** Creates a wrapped value. */
  def wrap(value: js.Any): atAngularCoreLib.srcChangeUnderscoreDetectionChangeUnderscoreDetectionUnderscoreUtilMod.WrappedValue = js.native
}

