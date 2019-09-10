package typings.awsDashSdk.clientsQldbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateLedgerRequest extends js.Object {
  /**
    * The flag that prevents a ledger from being deleted by any user. If not provided on ledger creation, this feature is enabled (true) by default. If deletion protection is enabled, you must first disable it before you can delete the ledger using the QLDB API or the AWS Command Line Interface (AWS CLI). You can disable it by calling the UpdateLedger operation to set the flag to false. The QLDB console disables deletion protection for you when you use it to delete a ledger.
    */
  var DeletionProtection: js.UndefOr[typings.awsDashSdk.clientsQldbMod.DeletionProtection] = js.undefined
  /**
    * The name of the ledger that you want to create. The name must be unique among all of your ledgers in the current AWS Region.
    */
  var Name: LedgerName
  /**
    * The permissions mode to assign to the ledger that you want to create.
    */
  var PermissionsMode: typings.awsDashSdk.clientsQldbMod.PermissionsMode
  /**
    * The key-value pairs to add as tags to the ledger that you want to create. Tag keys are case sensitive. Tag values are case sensitive and can be null.
    */
  var Tags: js.UndefOr[typings.awsDashSdk.clientsQldbMod.Tags] = js.undefined
}

object CreateLedgerRequest {
  @scala.inline
  def apply(
    Name: LedgerName,
    PermissionsMode: PermissionsMode,
    DeletionProtection: js.UndefOr[DeletionProtection] = js.undefined,
    Tags: Tags = null
  ): CreateLedgerRequest = {
    val __obj = js.Dynamic.literal(Name = Name, PermissionsMode = PermissionsMode.asInstanceOf[js.Any])
    if (!js.isUndefined(DeletionProtection)) __obj.updateDynamic("DeletionProtection")(DeletionProtection)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[CreateLedgerRequest]
  }
}

