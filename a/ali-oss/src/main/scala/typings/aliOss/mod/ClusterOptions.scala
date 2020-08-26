package typings.aliOss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterOptions extends js.Object {
  var clusters: js.Array[ClusterType] = js.native
  var schedule: js.UndefOr[String] = js.native
}

object ClusterOptions {
  @scala.inline
  def apply(clusters: js.Array[ClusterType]): ClusterOptions = {
    val __obj = js.Dynamic.literal(clusters = clusters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterOptions]
  }
  @scala.inline
  implicit class ClusterOptionsOps[Self <: ClusterOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClustersVarargs(value: ClusterType*): Self = this.set("clusters", js.Array(value :_*))
    @scala.inline
    def setClusters(value: js.Array[ClusterType]): Self = this.set("clusters", value.asInstanceOf[js.Any])
    @scala.inline
    def setSchedule(value: String): Self = this.set("schedule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchedule: Self = this.set("schedule", js.undefined)
  }
  
}

