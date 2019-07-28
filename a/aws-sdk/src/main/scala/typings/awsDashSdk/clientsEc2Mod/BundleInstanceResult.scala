package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BundleInstanceResult extends js.Object {
  /**
    * Information about the bundle task.
    */
  var BundleTask: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.BundleTask] = js.undefined
}

object BundleInstanceResult {
  @scala.inline
  def apply(BundleTask: BundleTask = null): BundleInstanceResult = {
    val __obj = js.Dynamic.literal()
    if (BundleTask != null) __obj.updateDynamic("BundleTask")(BundleTask)
    __obj.asInstanceOf[BundleInstanceResult]
  }
}

