package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetLocation extends js.Object {
  /**
    * The AWS accounts targeted by the current Automation execution.
    */
  var Accounts: js.UndefOr[Accounts] = js.undefined
  /**
    * The Automation execution role used by the currently running Automation.
    */
  var ExecutionRoleName: js.UndefOr[ExecutionRoleName] = js.undefined
  /**
    * The AWS Regions targeted by the current Automation execution.
    */
  var Regions: js.UndefOr[Regions] = js.undefined
  /**
    * The maxium number of AWS accounts and AWS regions allowed to run the Automation concurrently 
    */
  var TargetLocationMaxConcurrency: js.UndefOr[MaxConcurrency] = js.undefined
  /**
    * The maxium number of errors allowed before the system stops queueing additional Automation executions for the currently running Automation. 
    */
  var TargetLocationMaxErrors: js.UndefOr[MaxErrors] = js.undefined
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
    if (Accounts != null) __obj.updateDynamic("Accounts")(Accounts)
    if (ExecutionRoleName != null) __obj.updateDynamic("ExecutionRoleName")(ExecutionRoleName)
    if (Regions != null) __obj.updateDynamic("Regions")(Regions)
    if (TargetLocationMaxConcurrency != null) __obj.updateDynamic("TargetLocationMaxConcurrency")(TargetLocationMaxConcurrency)
    if (TargetLocationMaxErrors != null) __obj.updateDynamic("TargetLocationMaxErrors")(TargetLocationMaxErrors)
    __obj.asInstanceOf[TargetLocation]
  }
}

