package typings.awsDashSdk.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PurchaseReservedDBInstancesOfferingResult extends js.Object {
  var ReservedDBInstance: js.UndefOr[typings.awsDashSdk.clientsRdsMod.ReservedDBInstance] = js.undefined
}

object PurchaseReservedDBInstancesOfferingResult {
  @scala.inline
  def apply(ReservedDBInstance: ReservedDBInstance = null): PurchaseReservedDBInstancesOfferingResult = {
    val __obj = js.Dynamic.literal()
    if (ReservedDBInstance != null) __obj.updateDynamic("ReservedDBInstance")(ReservedDBInstance)
    __obj.asInstanceOf[PurchaseReservedDBInstancesOfferingResult]
  }
}

