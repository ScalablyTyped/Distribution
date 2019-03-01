package typings
package aliDashOssLib.aliDashOssMod.OSSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterOptions extends js.Object {
  var clusters: js.Array[ClusterType]
  var schedule: js.UndefOr[java.lang.String] = js.undefined
}

object ClusterOptions {
  @scala.inline
  def apply(clusters: js.Array[ClusterType], schedule: java.lang.String = null): ClusterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clusters")(clusters)
    if (schedule != null) __obj.updateDynamic("schedule")(schedule)
    __obj.asInstanceOf[ClusterOptions]
  }
}

