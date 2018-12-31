package typings
package atAngularCoreLib.publicUnderscoreApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/public_api", "WrappedValue")
@js.native
class WrappedValue protected ()
  extends atAngularCoreLib.srcCoreMod.WrappedValue {
  def this(value: js.Any) = this()
}

@JSImport("@angular/core/public_api", "WrappedValue")
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

