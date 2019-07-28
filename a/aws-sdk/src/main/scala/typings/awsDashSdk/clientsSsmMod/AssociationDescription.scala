package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssociationDescription extends js.Object {
  /**
    * The association ID.
    */
  var AssociationId: js.UndefOr[typings.awsDashSdk.clientsSsmMod.AssociationId] = js.undefined
  /**
    * The association name.
    */
  var AssociationName: js.UndefOr[typings.awsDashSdk.clientsSsmMod.AssociationName] = js.undefined
  /**
    * The association version.
    */
  var AssociationVersion: js.UndefOr[typings.awsDashSdk.clientsSsmMod.AssociationVersion] = js.undefined
  /**
    * Specify the target for the association. This target is required for associations that use an Automation document and target resources by using rate controls.
    */
  var AutomationTargetParameterName: js.UndefOr[typings.awsDashSdk.clientsSsmMod.AutomationTargetParameterName] = js.undefined
  /**
    * The severity level that is assigned to the association.
    */
  var ComplianceSeverity: js.UndefOr[AssociationComplianceSeverity] = js.undefined
  /**
    * The date when the association was made.
    */
  var Date: js.UndefOr[DateTime] = js.undefined
  /**
    * The document version.
    */
  var DocumentVersion: js.UndefOr[typings.awsDashSdk.clientsSsmMod.DocumentVersion] = js.undefined
  /**
    * The ID of the instance.
    */
  var InstanceId: js.UndefOr[typings.awsDashSdk.clientsSsmMod.InstanceId] = js.undefined
  /**
    * The date on which the association was last run.
    */
  var LastExecutionDate: js.UndefOr[DateTime] = js.undefined
  /**
    * The last date on which the association was successfully run.
    */
  var LastSuccessfulExecutionDate: js.UndefOr[DateTime] = js.undefined
  /**
    * The date when the association was last updated.
    */
  var LastUpdateAssociationDate: js.UndefOr[DateTime] = js.undefined
  /**
    * The maximum number of targets allowed to run the association at the same time. You can specify a number, for example 10, or a percentage of the target set, for example 10%. The default value is 100%, which means all targets run the association at the same time. If a new instance starts and attempts to run an association while Systems Manager is running MaxConcurrency associations, the association is allowed to run. During the next association interval, the new instance will process its association within the limit specified for MaxConcurrency.
    */
  var MaxConcurrency: js.UndefOr[typings.awsDashSdk.clientsSsmMod.MaxConcurrency] = js.undefined
  /**
    * The number of errors that are allowed before the system stops sending requests to run the association on additional targets. You can specify either an absolute number of errors, for example 10, or a percentage of the target set, for example 10%. If you specify 3, for example, the system stops sending requests when the fourth error is received. If you specify 0, then the system stops sending requests after the first error is returned. If you run an association on 50 instances and set MaxError to 10%, then the system stops sending the request when the sixth error is received. Executions that are already running an association when MaxErrors is reached are allowed to complete, but some of these executions may fail as well. If you need to ensure that there won't be more than max-errors failed executions, set MaxConcurrency to 1 so that executions proceed one at a time.
    */
  var MaxErrors: js.UndefOr[typings.awsDashSdk.clientsSsmMod.MaxErrors] = js.undefined
  /**
    * The name of the Systems Manager document.
    */
  var Name: js.UndefOr[DocumentARN] = js.undefined
  /**
    * An Amazon S3 bucket where you want to store the output details of the request.
    */
  var OutputLocation: js.UndefOr[InstanceAssociationOutputLocation] = js.undefined
  /**
    * Information about the association.
    */
  var Overview: js.UndefOr[AssociationOverview] = js.undefined
  /**
    * A description of the parameters for a document. 
    */
  var Parameters: js.UndefOr[typings.awsDashSdk.clientsSsmMod.Parameters] = js.undefined
  /**
    * A cron expression that specifies a schedule when the association runs.
    */
  var ScheduleExpression: js.UndefOr[typings.awsDashSdk.clientsSsmMod.ScheduleExpression] = js.undefined
  /**
    * The association status.
    */
  var Status: js.UndefOr[AssociationStatus] = js.undefined
  /**
    * The instances targeted by the request. 
    */
  var Targets: js.UndefOr[typings.awsDashSdk.clientsSsmMod.Targets] = js.undefined
}

object AssociationDescription {
  @scala.inline
  def apply(
    AssociationId: AssociationId = null,
    AssociationName: AssociationName = null,
    AssociationVersion: AssociationVersion = null,
    AutomationTargetParameterName: AutomationTargetParameterName = null,
    ComplianceSeverity: AssociationComplianceSeverity = null,
    Date: DateTime = null,
    DocumentVersion: DocumentVersion = null,
    InstanceId: InstanceId = null,
    LastExecutionDate: DateTime = null,
    LastSuccessfulExecutionDate: DateTime = null,
    LastUpdateAssociationDate: DateTime = null,
    MaxConcurrency: MaxConcurrency = null,
    MaxErrors: MaxErrors = null,
    Name: DocumentARN = null,
    OutputLocation: InstanceAssociationOutputLocation = null,
    Overview: AssociationOverview = null,
    Parameters: Parameters = null,
    ScheduleExpression: ScheduleExpression = null,
    Status: AssociationStatus = null,
    Targets: Targets = null
  ): AssociationDescription = {
    val __obj = js.Dynamic.literal()
    if (AssociationId != null) __obj.updateDynamic("AssociationId")(AssociationId)
    if (AssociationName != null) __obj.updateDynamic("AssociationName")(AssociationName)
    if (AssociationVersion != null) __obj.updateDynamic("AssociationVersion")(AssociationVersion)
    if (AutomationTargetParameterName != null) __obj.updateDynamic("AutomationTargetParameterName")(AutomationTargetParameterName)
    if (ComplianceSeverity != null) __obj.updateDynamic("ComplianceSeverity")(ComplianceSeverity.asInstanceOf[js.Any])
    if (Date != null) __obj.updateDynamic("Date")(Date)
    if (DocumentVersion != null) __obj.updateDynamic("DocumentVersion")(DocumentVersion)
    if (InstanceId != null) __obj.updateDynamic("InstanceId")(InstanceId)
    if (LastExecutionDate != null) __obj.updateDynamic("LastExecutionDate")(LastExecutionDate)
    if (LastSuccessfulExecutionDate != null) __obj.updateDynamic("LastSuccessfulExecutionDate")(LastSuccessfulExecutionDate)
    if (LastUpdateAssociationDate != null) __obj.updateDynamic("LastUpdateAssociationDate")(LastUpdateAssociationDate)
    if (MaxConcurrency != null) __obj.updateDynamic("MaxConcurrency")(MaxConcurrency)
    if (MaxErrors != null) __obj.updateDynamic("MaxErrors")(MaxErrors)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (OutputLocation != null) __obj.updateDynamic("OutputLocation")(OutputLocation)
    if (Overview != null) __obj.updateDynamic("Overview")(Overview)
    if (Parameters != null) __obj.updateDynamic("Parameters")(Parameters)
    if (ScheduleExpression != null) __obj.updateDynamic("ScheduleExpression")(ScheduleExpression)
    if (Status != null) __obj.updateDynamic("Status")(Status)
    if (Targets != null) __obj.updateDynamic("Targets")(Targets)
    __obj.asInstanceOf[AssociationDescription]
  }
}

