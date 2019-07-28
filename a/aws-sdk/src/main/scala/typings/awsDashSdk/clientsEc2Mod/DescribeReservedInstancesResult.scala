package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeReservedInstancesResult extends js.Object {
  /**
    * A list of Reserved Instances.
    */
  var ReservedInstances: js.UndefOr[ReservedInstancesList] = js.undefined
}

object DescribeReservedInstancesResult {
  @scala.inline
  def apply(ReservedInstances: ReservedInstancesList = null): DescribeReservedInstancesResult = {
    val __obj = js.Dynamic.literal()
    if (ReservedInstances != null) __obj.updateDynamic("ReservedInstances")(ReservedInstances)
    __obj.asInstanceOf[DescribeReservedInstancesResult]
  }
}

