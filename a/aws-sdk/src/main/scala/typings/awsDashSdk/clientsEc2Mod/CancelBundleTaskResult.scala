package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelBundleTaskResult extends js.Object {
  /**
    * Information about the bundle task.
    */
  var BundleTask: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.BundleTask] = js.native
}

object CancelBundleTaskResult {
  @scala.inline
  def apply(BundleTask: BundleTask = null): CancelBundleTaskResult = {
    val __obj = js.Dynamic.literal()
    if (BundleTask != null) __obj.updateDynamic("BundleTask")(BundleTask.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelBundleTaskResult]
  }
}

