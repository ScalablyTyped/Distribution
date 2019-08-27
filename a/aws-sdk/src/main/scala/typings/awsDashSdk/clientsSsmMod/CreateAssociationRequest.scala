package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateAssociationRequest extends js.Object {
  /**
    * Specify a descriptive name for the association.
    */
  var AssociationName: js.UndefOr[typings.awsDashSdk.clientsSsmMod.AssociationName] = js.undefined
  /**
    * Specify the target for the association. This target is required for associations that use an Automation document and target resources by using rate controls.
    */
  var AutomationTargetParameterName: js.UndefOr[typings.awsDashSdk.clientsSsmMod.AutomationTargetParameterName] = js.undefined
  /**
    * The severity level to assign to the association.
    */
  var ComplianceSeverity: js.UndefOr[AssociationComplianceSeverity] = js.undefined
  /**
    * The document version you want to associate with the target(s). Can be a specific version or the default version.
    */
  var DocumentVersion: js.UndefOr[typings.awsDashSdk.clientsSsmMod.DocumentVersion] = js.undefined
  /**
    * The instance ID.   InstanceId has been deprecated. To specify an instance ID for an association, use the Targets parameter. If you use the parameter InstanceId, you cannot use the parameters AssociationName, DocumentVersion, MaxErrors, MaxConcurrency, OutputLocation, or ScheduleExpression. To use these parameters, you must use the Targets parameter. 
    */
  var InstanceId: js.UndefOr[typings.awsDashSdk.clientsSsmMod.InstanceId] = js.undefined
  /**
    * The maximum number of targets allowed to run the association at the same time. You can specify a number, for example 10, or a percentage of the target set, for example 10%. The default value is 100%, which means all targets run the association at the same time. If a new instance starts and attempts to run an association while Systems Manager is running MaxConcurrency associations, the association is allowed to run. During the next association interval, the new instance will process its association within the limit specified for MaxConcurrency.
    */
  var MaxConcurrency: js.UndefOr[typings.awsDashSdk.clientsSsmMod.MaxConcurrency] = js.undefined
  /**
    * The number of errors that are allowed before the system stops sending requests to run the association on additional targets. You can specify either an absolute number of errors, for example 10, or a percentage of the target set, for example 10%. If you specify 3, for example, the system stops sending requests when the fourth error is received. If you specify 0, then the system stops sending requests after the first error is returned. If you run an association on 50 instances and set MaxError to 10%, then the system stops sending the request when the sixth error is received. Executions that are already running an association when MaxErrors is reached are allowed to complete, but some of these executions may fail as well. If you need to ensure that there won't be more than max-errors failed executions, set MaxConcurrency to 1 so that executions proceed one at a time.
    */
  var MaxErrors: js.UndefOr[typings.awsDashSdk.clientsSsmMod.MaxErrors] = js.undefined
  /**
    * The name of the SSM document that contains the configuration information for the instance. You can specify Command or Automation documents. You can specify AWS-predefined documents, documents you created, or a document that is shared with you from another account. For SSM documents that are shared with you from other AWS accounts, you must specify the complete SSM document ARN, in the following format:  arn:partition:ssm:region:account-id:document/document-name   For example:  arn:aws:ssm:us-east-2:12345678912:document/My-Shared-Document  For AWS-predefined documents and SSM documents you created in your account, you only need to specify the document name. For example, AWS-ApplyPatchBaseline or My-Document.
    */
  var Name: DocumentARN
  /**
    * An Amazon S3 bucket where you want to store the output details of the request.
    */
  var OutputLocation: js.UndefOr[InstanceAssociationOutputLocation] = js.undefined
  /**
    * The parameters for the runtime configuration of the document.
    */
  var Parameters: js.UndefOr[typings.awsDashSdk.clientsSsmMod.Parameters] = js.undefined
  /**
    * A cron expression when the association will be applied to the target(s).
    */
  var ScheduleExpression: js.UndefOr[typings.awsDashSdk.clientsSsmMod.ScheduleExpression] = js.undefined
  /**
    * The targets (either instances or tags) for the association. You must specify a value for Targets if you don't specify a value for InstanceId.
    */
  var Targets: js.UndefOr[typings.awsDashSdk.clientsSsmMod.Targets] = js.undefined
}

object CreateAssociationRequest {
  @scala.inline
  def apply(
    Name: DocumentARN,
    AssociationName: AssociationName = null,
    AutomationTargetParameterName: AutomationTargetParameterName = null,
    ComplianceSeverity: AssociationComplianceSeverity = null,
    DocumentVersion: DocumentVersion = null,
    InstanceId: InstanceId = null,
    MaxConcurrency: MaxConcurrency = null,
    MaxErrors: MaxErrors = null,
    OutputLocation: InstanceAssociationOutputLocation = null,
    Parameters: Parameters = null,
    ScheduleExpression: ScheduleExpression = null,
    Targets: Targets = null
  ): CreateAssociationRequest = {
    val __obj = js.Dynamic.literal(Name = Name)
    if (AssociationName != null) __obj.updateDynamic("AssociationName")(AssociationName)
    if (AutomationTargetParameterName != null) __obj.updateDynamic("AutomationTargetParameterName")(AutomationTargetParameterName)
    if (ComplianceSeverity != null) __obj.updateDynamic("ComplianceSeverity")(ComplianceSeverity.asInstanceOf[js.Any])
    if (DocumentVersion != null) __obj.updateDynamic("DocumentVersion")(DocumentVersion)
    if (InstanceId != null) __obj.updateDynamic("InstanceId")(InstanceId)
    if (MaxConcurrency != null) __obj.updateDynamic("MaxConcurrency")(MaxConcurrency)
    if (MaxErrors != null) __obj.updateDynamic("MaxErrors")(MaxErrors)
    if (OutputLocation != null) __obj.updateDynamic("OutputLocation")(OutputLocation)
    if (Parameters != null) __obj.updateDynamic("Parameters")(Parameters)
    if (ScheduleExpression != null) __obj.updateDynamic("ScheduleExpression")(ScheduleExpression)
    if (Targets != null) __obj.updateDynamic("Targets")(Targets)
    __obj.asInstanceOf[CreateAssociationRequest]
  }
}

