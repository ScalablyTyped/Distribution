package typings.aliOss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterOptions extends js.Object {
  var clusters: js.Array[ClusterType]
  var schedule: js.UndefOr[String] = js.undefined
}

object ClusterOptions {
  @scala.inline
  def apply(clusters: js.Array[ClusterType], schedule: String = null): ClusterOptions = {
    val __obj = js.Dynamic.literal(clusters = clusters.asInstanceOf[js.Any])
    if (schedule != null) __obj.updateDynamic("schedule")(schedule.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterOptions]
  }
}

