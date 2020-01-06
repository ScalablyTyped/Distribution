package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteQueuedReservedInstancesResult extends js.Object {
  /**
    * Information about the queued purchases that could not be deleted.
    */
  var FailedQueuedPurchaseDeletions: js.UndefOr[FailedQueuedPurchaseDeletionSet] = js.native
  /**
    * Information about the queued purchases that were successfully deleted.
    */
  var SuccessfulQueuedPurchaseDeletions: js.UndefOr[SuccessfulQueuedPurchaseDeletionSet] = js.native
}

object DeleteQueuedReservedInstancesResult {
  @scala.inline
  def apply(
    FailedQueuedPurchaseDeletions: FailedQueuedPurchaseDeletionSet = null,
    SuccessfulQueuedPurchaseDeletions: SuccessfulQueuedPurchaseDeletionSet = null
  ): DeleteQueuedReservedInstancesResult = {
    val __obj = js.Dynamic.literal()
    if (FailedQueuedPurchaseDeletions != null) __obj.updateDynamic("FailedQueuedPurchaseDeletions")(FailedQueuedPurchaseDeletions.asInstanceOf[js.Any])
    if (SuccessfulQueuedPurchaseDeletions != null) __obj.updateDynamic("SuccessfulQueuedPurchaseDeletions")(SuccessfulQueuedPurchaseDeletions.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteQueuedReservedInstancesResult]
  }
}

