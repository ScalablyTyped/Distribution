package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteQueuedReservedInstancesResult extends js.Object {
  /**
    * Information about the queued purchases that could not be deleted.
    */
  var FailedQueuedPurchaseDeletions: js.UndefOr[FailedQueuedPurchaseDeletionSet] = js.undefined
  /**
    * Information about the queued purchases that were successfully deleted.
    */
  var SuccessfulQueuedPurchaseDeletions: js.UndefOr[SuccessfulQueuedPurchaseDeletionSet] = js.undefined
}

object DeleteQueuedReservedInstancesResult {
  @scala.inline
  def apply(
    FailedQueuedPurchaseDeletions: FailedQueuedPurchaseDeletionSet = null,
    SuccessfulQueuedPurchaseDeletions: SuccessfulQueuedPurchaseDeletionSet = null
  ): DeleteQueuedReservedInstancesResult = {
    val __obj = js.Dynamic.literal()
    if (FailedQueuedPurchaseDeletions != null) __obj.updateDynamic("FailedQueuedPurchaseDeletions")(FailedQueuedPurchaseDeletions)
    if (SuccessfulQueuedPurchaseDeletions != null) __obj.updateDynamic("SuccessfulQueuedPurchaseDeletions")(SuccessfulQueuedPurchaseDeletions)
    __obj.asInstanceOf[DeleteQueuedReservedInstancesResult]
  }
}

