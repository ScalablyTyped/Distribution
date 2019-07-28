package typings.awsDashSdk.clientsMturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BonusPayment extends js.Object {
  /**
    * The ID of the assignment associated with this bonus payment.
    */
  var AssignmentId: js.UndefOr[EntityId] = js.undefined
  var BonusAmount: js.UndefOr[CurrencyAmount] = js.undefined
  /**
    * The date and time of when the bonus was granted.
    */
  var GrantTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * The Reason text given when the bonus was granted, if any.
    */
  var Reason: js.UndefOr[String] = js.undefined
  /**
    * The ID of the Worker to whom the bonus was paid.
    */
  var WorkerId: js.UndefOr[CustomerId] = js.undefined
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
    if (AssignmentId != null) __obj.updateDynamic("AssignmentId")(AssignmentId)
    if (BonusAmount != null) __obj.updateDynamic("BonusAmount")(BonusAmount)
    if (GrantTime != null) __obj.updateDynamic("GrantTime")(GrantTime)
    if (Reason != null) __obj.updateDynamic("Reason")(Reason)
    if (WorkerId != null) __obj.updateDynamic("WorkerId")(WorkerId)
    __obj.asInstanceOf[BonusPayment]
  }
}

