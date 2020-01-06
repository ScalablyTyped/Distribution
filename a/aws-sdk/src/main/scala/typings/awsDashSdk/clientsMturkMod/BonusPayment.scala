package typings.awsDashSdk.clientsMturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BonusPayment extends js.Object {
  /**
    * The ID of the assignment associated with this bonus payment.
    */
  var AssignmentId: js.UndefOr[EntityId] = js.native
  var BonusAmount: js.UndefOr[CurrencyAmount] = js.native
  /**
    * The date and time of when the bonus was granted.
    */
  var GrantTime: js.UndefOr[Timestamp] = js.native
  /**
    * The Reason text given when the bonus was granted, if any.
    */
  var Reason: js.UndefOr[String] = js.native
  /**
    * The ID of the Worker to whom the bonus was paid.
    */
  var WorkerId: js.UndefOr[CustomerId] = js.native
}

object BonusPayment {
  @scala.inline
  def apply(
    AssignmentId: EntityId = null,
    BonusAmount: CurrencyAmount = null,
    GrantTime: Timestamp = null,
    Reason: String = null,
    WorkerId: CustomerId = null
  ): BonusPayment = {
    val __obj = js.Dynamic.literal()
    if (AssignmentId != null) __obj.updateDynamic("AssignmentId")(AssignmentId.asInstanceOf[js.Any])
    if (BonusAmount != null) __obj.updateDynamic("BonusAmount")(BonusAmount.asInstanceOf[js.Any])
    if (GrantTime != null) __obj.updateDynamic("GrantTime")(GrantTime.asInstanceOf[js.Any])
    if (Reason != null) __obj.updateDynamic("Reason")(Reason.asInstanceOf[js.Any])
    if (WorkerId != null) __obj.updateDynamic("WorkerId")(WorkerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BonusPayment]
  }
}

