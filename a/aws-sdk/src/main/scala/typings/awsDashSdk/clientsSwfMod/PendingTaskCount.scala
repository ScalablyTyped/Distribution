package typings.awsDashSdk.clientsSwfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PendingTaskCount extends js.Object {
  /**
    * The number of tasks in the task list.
    */
  var count: Count
  /**
    * If set to true, indicates that the actual count was more than the maximum supported by this API and the count returned is the truncated value.
    */
  var truncated: js.UndefOr[Truncated] = js.undefined
}

object PendingTaskCount {
  @scala.inline
  def apply(count: Count, truncated: js.UndefOr[Boolean] = js.undefined): PendingTaskCount = {
    val __obj = js.Dynamic.literal(count = count)
    if (!js.isUndefined(truncated)) __obj.updateDynamic("truncated")(truncated)
    __obj.asInstanceOf[PendingTaskCount]
  }
}

