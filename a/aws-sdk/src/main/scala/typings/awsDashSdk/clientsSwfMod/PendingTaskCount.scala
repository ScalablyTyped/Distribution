package typings.awsDashSdk.clientsSwfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PendingTaskCount extends js.Object {
  /**
    * The number of tasks in the task list.
    */
  var count: Count = js.native
  /**
    * If set to true, indicates that the actual count was more than the maximum supported by this API and the count returned is the truncated value.
    */
  var truncated: js.UndefOr[Truncated] = js.native
}

object PendingTaskCount {
  @scala.inline
  def apply(count: Count, truncated: js.UndefOr[Boolean] = js.undefined): PendingTaskCount = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any])
    if (!js.isUndefined(truncated)) __obj.updateDynamic("truncated")(truncated.asInstanceOf[js.Any])
    __obj.asInstanceOf[PendingTaskCount]
  }
}

