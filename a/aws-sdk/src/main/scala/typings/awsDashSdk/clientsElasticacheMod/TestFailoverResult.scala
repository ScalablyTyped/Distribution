package typings.awsDashSdk.clientsElasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestFailoverResult extends js.Object {
  var ReplicationGroup: js.UndefOr[typings.awsDashSdk.clientsElasticacheMod.ReplicationGroup] = js.undefined
}

object TestFailoverResult {
  @scala.inline
  def apply(ReplicationGroup: ReplicationGroup = null): TestFailoverResult = {
    val __obj = js.Dynamic.literal()
    if (ReplicationGroup != null) __obj.updateDynamic("ReplicationGroup")(ReplicationGroup)
    __obj.asInstanceOf[TestFailoverResult]
  }
}

