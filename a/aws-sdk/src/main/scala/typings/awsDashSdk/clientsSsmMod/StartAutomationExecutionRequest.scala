package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartAutomationExecutionRequest extends js.Object {
  /**
    * User-provided idempotency token. The token must be unique, is case insensitive, enforces the UUID format, and can't be reused.
    */
  var ClientToken: js.UndefOr[IdempotencyToken] = js.undefined
  /**
    * The name of the Automation document to use for this execution.
    */
  var DocumentName: DocumentARN
  /**
    * The version of the Automation document to use for this execution.
    */
  var DocumentVersion: js.UndefOr[typings.awsDashSdk.clientsSsmMod.DocumentVersion] = js.undefined
  /**
    * The maximum number of targets allowed to run this task in parallel. You can specify a number, such as 10, or a percentage, such as 10%. The default value is 10.
    */
  var MaxConcurrency: js.UndefOr[typings.awsDashSdk.clientsSsmMod.MaxConcurrency] = js.undefined
  /**
    * The number of errors that are allowed before the system stops running the automation on additional targets. You can specify either an absolute number of errors, for example 10, or a percentage of the target set, for example 10%. If you specify 3, for example, the system stops running the automation when the fourth error is received. If you specify 0, then the system stops running the automation on additional targets after the first error result is returned. If you run an automation on 50 resources and set max-errors to 10%, then the system stops running the automation on additional targets when the sixth error is received. Executions that are already running an automation when max-errors is reached are allowed to complete, but some of these executions may fail as well. If you need to ensure that there won't be more than max-errors failed executions, set max-concurrency to 1 so the executions proceed one at a time.
    */
  var MaxErrors: js.UndefOr[typings.awsDashSdk.clientsSsmMod.MaxErrors] = js.undefined
  /**
    * The execution mode of the automation. Valid modes include the following: Auto and Interactive. The default mode is Auto.
    */
  var Mode: js.UndefOr[ExecutionMode] = js.undefined
  /**
    * A key-value map of execution parameters, which match the declared parameters in the Automation document.
    */
  var Parameters: js.UndefOr[AutomationParameterMap] = js.undefined
  /**
    * A location is a combination of AWS Regions and/or AWS accounts where you want to run the Automation. Use this action to start an Automation in multiple Regions and multiple accounts. For more information, see Executing Automations in Multiple AWS Regions and Accounts in the AWS Systems Manager User Guide. 
    */
  var TargetLocations: js.UndefOr[typings.awsDashSdk.clientsSsmMod.TargetLocations] = js.undefined
  /**
    * A key-value mapping of document parameters to target resources. Both Targets and TargetMaps cannot be specified together.
    */
  var TargetMaps: js.UndefOr[typings.awsDashSdk.clientsSsmMod.TargetMaps] = js.undefined
  /**
    * The name of the parameter used as the target resource for the rate-controlled execution. Required if you specify targets.
    */
  var TargetParameterName: js.UndefOr[AutomationParameterKey] = js.undefined
  /**
    * A key-value mapping to target resources. Required if you specify TargetParameterName.
    */
  var Targets: js.UndefOr[typings.awsDashSdk.clientsSsmMod.Targets] = js.undefined
}

object StartAutomationExecutionRequest {
  @scala.inline
  def apply(
    DocumentName: DocumentARN,
    ClientToken: IdempotencyToken = null,
    DocumentVersion: DocumentVersion = null,
    MaxConcurrency: MaxConcurrency = null,
    MaxErrors: MaxErrors = null,
    Mode: ExecutionMode = null,
    Parameters: AutomationParameterMap = null,
    TargetLocations: TargetLocations = null,
    TargetMaps: TargetMaps = null,
    TargetParameterName: AutomationParameterKey = null,
    Targets: Targets = null
  ): StartAutomationExecutionRequest = {
    val __obj = js.Dynamic.literal(DocumentName = DocumentName)
    if (ClientToken != null) __obj.updateDynamic("ClientToken")(ClientToken)
    if (DocumentVersion != null) __obj.updateDynamic("DocumentVersion")(DocumentVersion)
    if (MaxConcurrency != null) __obj.updateDynamic("MaxConcurrency")(MaxConcurrency)
    if (MaxErrors != null) __obj.updateDynamic("MaxErrors")(MaxErrors)
    if (Mode != null) __obj.updateDynamic("Mode")(Mode.asInstanceOf[js.Any])
    if (Parameters != null) __obj.updateDynamic("Parameters")(Parameters)
    if (TargetLocations != null) __obj.updateDynamic("TargetLocations")(TargetLocations)
    if (TargetMaps != null) __obj.updateDynamic("TargetMaps")(TargetMaps)
    if (TargetParameterName != null) __obj.updateDynamic("TargetParameterName")(TargetParameterName)
    if (Targets != null) __obj.updateDynamic("Targets")(Targets)
    __obj.asInstanceOf[StartAutomationExecutionRequest]
  }
}

