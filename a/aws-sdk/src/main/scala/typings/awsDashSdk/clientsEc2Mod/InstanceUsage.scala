package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceUsage extends js.Object {
  /**
    * The ID of the AWS account that is making use of the Capacity Reservation.
    */
  var AccountId: js.UndefOr[String] = js.native
  /**
    * The number of instances the AWS account currently has in the Capacity Reservation.
    */
  var UsedInstanceCount: js.UndefOr[Integer] = js.native
}

object InstanceUsage {
  @scala.inline
  def apply(AccountId: String = null, UsedInstanceCount: Int | scala.Double = null): InstanceUsage = {
    val __obj = js.Dynamic.literal()
    if (AccountId != null) __obj.updateDynamic("AccountId")(AccountId.asInstanceOf[js.Any])
    if (UsedInstanceCount != null) __obj.updateDynamic("UsedInstanceCount")(UsedInstanceCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceUsage]
  }
}

