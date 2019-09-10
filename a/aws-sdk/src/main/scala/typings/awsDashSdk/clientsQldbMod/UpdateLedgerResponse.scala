package typings.awsDashSdk.clientsQldbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateLedgerResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) for the ledger.
    */
  var Arn: js.UndefOr[typings.awsDashSdk.clientsQldbMod.Arn] = js.undefined
  /**
    * The date and time, in epoch time format, when the ledger was created. (Epoch time format is the number of seconds elapsed since 12:00:00 AM January 1, 1970 UTC.)
    */
  var CreationDateTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * The flag that prevents a ledger from being deleted by any user. If not provided on ledger creation, this feature is enabled (true) by default. If deletion protection is enabled, you must first disable it before you can delete the ledger using the QLDB API or the AWS Command Line Interface (AWS CLI). You can disable it by calling the UpdateLedger operation to set the flag to false. The QLDB console disables deletion protection for you when you use it to delete a ledger.
    */
  var DeletionProtection: js.UndefOr[typings.awsDashSdk.clientsQldbMod.DeletionProtection] = js.undefined
  /**
    * The name of the ledger.
    */
  var Name: js.UndefOr[LedgerName] = js.undefined
  /**
    * The current status of the ledger.
    */
  var State: js.UndefOr[LedgerState] = js.undefined
}

object UpdateLedgerResponse {
  @scala.inline
  def apply(
    Arn: Arn = null,
    CreationDateTime: Timestamp = null,
    DeletionProtection: js.UndefOr[DeletionProtection] = js.undefined,
    Name: LedgerName = null,
    State: LedgerState = null
  ): UpdateLedgerResponse = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn)
    if (CreationDateTime != null) __obj.updateDynamic("CreationDateTime")(CreationDateTime)
    if (!js.isUndefined(DeletionProtection)) __obj.updateDynamic("DeletionProtection")(DeletionProtection)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateLedgerResponse]
  }
}

