package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeBundleTasksResult extends js.Object {
  /**
    * Information about the bundle tasks.
    */
  var BundleTasks: js.UndefOr[BundleTaskList] = js.undefined
}

object DescribeBundleTasksResult {
  @scala.inline
  def apply(BundleTasks: BundleTaskList = null): DescribeBundleTasksResult = {
    val __obj = js.Dynamic.literal()
    if (BundleTasks != null) __obj.updateDynamic("BundleTasks")(BundleTasks)
    __obj.asInstanceOf[DescribeBundleTasksResult]
  }
}

