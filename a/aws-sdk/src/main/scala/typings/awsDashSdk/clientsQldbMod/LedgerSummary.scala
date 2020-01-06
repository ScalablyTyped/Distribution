package typings.awsDashSdk.clientsQldbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LedgerSummary extends js.Object {
  /**
    * The date and time, in epoch time format, when the ledger was created. (Epoch time format is the number of seconds elapsed since 12:00:00 AM January 1, 1970 UTC.)
    */
  var CreationDateTime: js.UndefOr[Timestamp] = js.native
  /**
    * The name of the ledger.
    */
  var Name: js.UndefOr[LedgerName] = js.native
  /**
    * The current status of the ledger.
    */
  var State: js.UndefOr[LedgerState] = js.native
}

object LedgerSummary {
  @scala.inline
  def apply(CreationDateTime: Timestamp = null, Name: LedgerName = null, State: LedgerState = null): LedgerSummary = {
    val __obj = js.Dynamic.literal()
    if (CreationDateTime != null) __obj.updateDynamic("CreationDateTime")(CreationDateTime.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    __obj.asInstanceOf[LedgerSummary]
  }
}

