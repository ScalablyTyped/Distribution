package typings.awsDashSdk.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeValidDBInstanceModificationsResult extends js.Object {
  var ValidDBInstanceModificationsMessage: js.UndefOr[typings.awsDashSdk.clientsRdsMod.ValidDBInstanceModificationsMessage] = js.undefined
}

object DescribeValidDBInstanceModificationsResult {
  @scala.inline
  def apply(ValidDBInstanceModificationsMessage: ValidDBInstanceModificationsMessage = null): DescribeValidDBInstanceModificationsResult = {
    val __obj = js.Dynamic.literal()
    if (ValidDBInstanceModificationsMessage != null) __obj.updateDynamic("ValidDBInstanceModificationsMessage")(ValidDBInstanceModificationsMessage)
    __obj.asInstanceOf[DescribeValidDBInstanceModificationsResult]
  }
}

