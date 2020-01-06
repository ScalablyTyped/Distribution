package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FailedQueuedPurchaseDeletion extends js.Object {
  /**
    * The error.
    */
  var Error: js.UndefOr[DeleteQueuedReservedInstancesError] = js.native
  /**
    * The ID of the Reserved Instance.
    */
  var ReservedInstancesId: js.UndefOr[String] = js.native
}

object FailedQueuedPurchaseDeletion {
  @scala.inline
  def apply(Error: DeleteQueuedReservedInstancesError = null, ReservedInstancesId: String = null): FailedQueuedPurchaseDeletion = {
    val __obj = js.Dynamic.literal()
    if (Error != null) __obj.updateDynamic("Error")(Error.asInstanceOf[js.Any])
    if (ReservedInstancesId != null) __obj.updateDynamic("ReservedInstancesId")(ReservedInstancesId.asInstanceOf[js.Any])
    __obj.asInstanceOf[FailedQueuedPurchaseDeletion]
  }
}

