package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDefaultPatchBaselineRequest extends js.Object {
  /**
    * Returns the default patch baseline for the specified operating system.
    */
  var OperatingSystem: js.UndefOr[OperatingSystem] = js.undefined
}

object GetDefaultPatchBaselineRequest {
  @scala.inline
  def apply(OperatingSystem: OperatingSystem = null): GetDefaultPatchBaselineRequest = {
    val __obj = js.Dynamic.literal()
    if (OperatingSystem != null) __obj.updateDynamic("OperatingSystem")(OperatingSystem.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDefaultPatchBaselineRequest]
  }
}

