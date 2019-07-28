package typings.awsDashSdk.clientsMturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotifyWorkersFailureStatus extends js.Object {
  /**
    *  Encoded value for the failure type. 
    */
  var NotifyWorkersFailureCode: js.UndefOr[typings.awsDashSdk.clientsMturkMod.NotifyWorkersFailureCode] = js.undefined
  /**
    *  A message detailing the reason the Worker could not be notified. 
    */
  var NotifyWorkersFailureMessage: js.UndefOr[String] = js.undefined
  /**
    *  The ID of the Worker.
    */
  var WorkerId: js.UndefOr[CustomerId] = js.undefined
}

object NotifyWorkersFailureStatus {
  @scala.inline
  def apply(
    NotifyWorkersFailureCode: NotifyWorkersFailureCode = null,
    NotifyWorkersFailureMessage: String = null,
    WorkerId: CustomerId = null
  ): NotifyWorkersFailureStatus = {
    val __obj = js.Dynamic.literal()
    if (NotifyWorkersFailureCode != null) __obj.updateDynamic("NotifyWorkersFailureCode")(NotifyWorkersFailureCode.asInstanceOf[js.Any])
    if (NotifyWorkersFailureMessage != null) __obj.updateDynamic("NotifyWorkersFailureMessage")(NotifyWorkersFailureMessage)
    if (WorkerId != null) __obj.updateDynamic("WorkerId")(WorkerId)
    __obj.asInstanceOf[NotifyWorkersFailureStatus]
  }
}

