package typings.awsDashSdk.clientsQldbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LedgerSummary extends js.Object {
  /**
    * The date and time, in epoch time format, when the ledger was created. (Epoch time format is the number of seconds elapsed since 12:00:00 AM January 1, 1970 UTC.)
    */
  var CreationDateTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * The name of the ledger.
    */
  var Name: js.UndefOr[LedgerName] = js.undefined
  /**
    * The current status of the ledger.
    */
  var State: js.UndefOr[LedgerState] = js.undefined
}

object LedgerSummary {
  @scala.inline
  def apply(CreationDateTime: Timestamp = null, Name: LedgerName = null, State: LedgerState = null): LedgerSummary = {
    val __obj = js.Dynamic.literal()
    if (CreationDateTime != null) __obj.updateDynamic("CreationDateTime")(CreationDateTime)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    __obj.asInstanceOf[LedgerSummary]
  }
}

