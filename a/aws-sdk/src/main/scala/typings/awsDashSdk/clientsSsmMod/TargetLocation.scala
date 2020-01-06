package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TargetLocation extends js.Object {
  /**
    * The AWS accounts targeted by the current Automation execution.
    */
  var Accounts: js.UndefOr[typings.awsDashSdk.clientsSsmMod.Accounts] = js.native
  /**
    * The Automation execution role used by the currently running Automation.
    */
  var ExecutionRoleName: js.UndefOr[typings.awsDashSdk.clientsSsmMod.ExecutionRoleName] = js.native
  /**
    * The AWS Regions targeted by the current Automation execution.
    */
  var Regions: js.UndefOr[typings.awsDashSdk.clientsSsmMod.Regions] = js.native
  /**
    * The maximum number of AWS accounts and AWS regions allowed to run the Automation concurrently 
    */
  var TargetLocationMaxConcurrency: js.UndefOr[MaxConcurrency] = js.native
  /**
    * The maximum number of errors allowed before the system stops queueing additional Automation executions for the currently running Automation. 
    */
  var TargetLocationMaxErrors: js.UndefOr[MaxErrors] = js.native
}

object TargetLocation {
  @scala.inline
  def apply(
    Accounts: Accounts = null,
    ExecutionRoleName: ExecutionRoleName = null,
    Regions: Regions = null,
    TargetLocationMaxConcurrency: MaxConcurrency = null,
    TargetLocationMaxErrors: MaxErrors = null
  ): TargetLocation = {
    val __obj = js.Dynamic.literal()
    if (Accounts != null) __obj.updateDynamic("Accounts")(Accounts.asInstanceOf[js.Any])
    if (ExecutionRoleName != null) __obj.updateDynamic("ExecutionRoleName")(ExecutionRoleName.asInstanceOf[js.Any])
    if (Regions != null) __obj.updateDynamic("Regions")(Regions.asInstanceOf[js.Any])
    if (TargetLocationMaxConcurrency != null) __obj.updateDynamic("TargetLocationMaxConcurrency")(TargetLocationMaxConcurrency.asInstanceOf[js.Any])
    if (TargetLocationMaxErrors != null) __obj.updateDynamic("TargetLocationMaxErrors")(TargetLocationMaxErrors.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetLocation]
  }
}

