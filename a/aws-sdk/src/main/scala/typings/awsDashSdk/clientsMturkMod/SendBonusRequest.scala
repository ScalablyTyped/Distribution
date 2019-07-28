package typings.awsDashSdk.clientsMturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendBonusRequest extends js.Object {
  /**
    * The ID of the assignment for which this bonus is paid.
    */
  var AssignmentId: EntityId
  /**
    *  The Bonus amount is a US Dollar amount specified using a string (for example, "5" represents $5.00 USD and "101.42" represents $101.42 USD). Do not include currency symbols or currency codes. 
    */
  var BonusAmount: CurrencyAmount
  /**
    * A message that explains the reason for the bonus payment. The Worker receiving the bonus can see this message.
    */
  var Reason: String
  /**
    * A unique identifier for this request, which allows you to retry the call on error without granting multiple bonuses. This is useful in cases such as network timeouts where it is unclear whether or not the call succeeded on the server. If the bonus already exists in the system from a previous call using the same UniqueRequestToken, subsequent calls will return an error with a message containing the request ID.
    */
  var UniqueRequestToken: js.UndefOr[IdempotencyToken] = js.undefined
  /**
    * The ID of the Worker being paid the bonus.
    */
  var WorkerId: CustomerId
}

object SendBonusRequest {
  @scala.inline
  def apply(
    AssignmentId: EntityId,
    BonusAmount: CurrencyAmount,
    Reason: String,
    WorkerId: CustomerId,
    UniqueRequestToken: IdempotencyToken = null
  ): SendBonusRequest = {
    val __obj = js.Dynamic.literal(AssignmentId = AssignmentId, BonusAmount = BonusAmount, Reason = Reason, WorkerId = WorkerId)
    if (UniqueRequestToken != null) __obj.updateDynamic("UniqueRequestToken")(UniqueRequestToken)
    __obj.asInstanceOf[SendBonusRequest]
  }
}

