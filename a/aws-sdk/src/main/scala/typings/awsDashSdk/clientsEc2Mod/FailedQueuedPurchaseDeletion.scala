package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FailedQueuedPurchaseDeletion extends js.Object {
  /**
    * The error.
    */
  var Error: js.UndefOr[DeleteQueuedReservedInstancesError] = js.undefined
  /**
    * The ID of the Reserved Instance.
    */
  var ReservedInstancesId: js.UndefOr[String] = js.undefined
}

object FailedQueuedPurchaseDeletion {
  @scala.inline
  def apply(Error: DeleteQueuedReservedInstancesError = null, ReservedInstancesId: String = null): FailedQueuedPurchaseDeletion = {
    val __obj = js.Dynamic.literal()
    if (Error != null) __obj.updateDynamic("Error")(Error)
    if (ReservedInstancesId != null) __obj.updateDynamic("ReservedInstancesId")(ReservedInstancesId)
    __obj.asInstanceOf[FailedQueuedPurchaseDeletion]
  }
}

