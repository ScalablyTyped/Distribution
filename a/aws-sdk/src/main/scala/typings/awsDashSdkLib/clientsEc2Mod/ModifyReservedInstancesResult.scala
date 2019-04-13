package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyReservedInstancesResult extends js.Object {
  /**
    * The ID for the modification.
    */
  var ReservedInstancesModificationId: js.UndefOr[String] = js.undefined
}

object ModifyReservedInstancesResult {
  @scala.inline
  def apply(ReservedInstancesModificationId: String = null): ModifyReservedInstancesResult = {
    val __obj = js.Dynamic.literal()
    if (ReservedInstancesModificationId != null) __obj.updateDynamic("ReservedInstancesModificationId")(ReservedInstancesModificationId)
    __obj.asInstanceOf[ModifyReservedInstancesResult]
  }
}

