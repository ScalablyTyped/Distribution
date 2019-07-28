package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceUsage extends js.Object {
  var AccountId: js.UndefOr[String] = js.undefined
  var UsedInstanceCount: js.UndefOr[Integer] = js.undefined
}

object InstanceUsage {
  @scala.inline
  def apply(AccountId: String = null, UsedInstanceCount: js.UndefOr[Integer] = js.undefined): InstanceUsage = {
    val __obj = js.Dynamic.literal()
    if (AccountId != null) __obj.updateDynamic("AccountId")(AccountId)
    if (!js.isUndefined(UsedInstanceCount)) __obj.updateDynamic("UsedInstanceCount")(UsedInstanceCount)
    __obj.asInstanceOf[InstanceUsage]
  }
}

