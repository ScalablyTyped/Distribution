package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyReservedInstancesResult extends js.Object {
  /**
    * The ID for the modification.
    */
  var ReservedInstancesModificationId: js.UndefOr[String] = js.native
}

object ModifyReservedInstancesResult {
  @scala.inline
  def apply(ReservedInstancesModificationId: String = null): ModifyReservedInstancesResult = {
    val __obj = js.Dynamic.literal()
    if (ReservedInstancesModificationId != null) __obj.updateDynamic("ReservedInstancesModificationId")(ReservedInstancesModificationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyReservedInstancesResult]
  }
}

