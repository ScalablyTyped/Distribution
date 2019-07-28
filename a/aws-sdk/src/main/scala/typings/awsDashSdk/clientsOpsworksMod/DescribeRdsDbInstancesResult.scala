package typings.awsDashSdk.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeRdsDbInstancesResult extends js.Object {
  /**
    * An a array of RdsDbInstance objects that describe the instances.
    */
  var RdsDbInstances: js.UndefOr[typings.awsDashSdk.clientsOpsworksMod.RdsDbInstances] = js.undefined
}

object DescribeRdsDbInstancesResult {
  @scala.inline
  def apply(RdsDbInstances: RdsDbInstances = null): DescribeRdsDbInstancesResult = {
    val __obj = js.Dynamic.literal()
    if (RdsDbInstances != null) __obj.updateDynamic("RdsDbInstances")(RdsDbInstances)
    __obj.asInstanceOf[DescribeRdsDbInstancesResult]
  }
}

