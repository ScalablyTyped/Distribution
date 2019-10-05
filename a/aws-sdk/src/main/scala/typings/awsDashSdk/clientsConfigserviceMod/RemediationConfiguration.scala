package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemediationConfiguration extends js.Object {
  /**
    * Amazon Resource Name (ARN) of remediation configuration.
    */
  var Arn: js.UndefOr[StringWithCharLimit1024] = js.undefined
  /**
    * The remediation is triggered automatically.
    */
  var Automatic: js.UndefOr[Boolean] = js.undefined
  /**
    * The name of the AWS Config rule.
    */
  var ConfigRuleName: typings.awsDashSdk.clientsConfigserviceMod.ConfigRuleName
  /**
    * Name of the service that owns the service linked rule, if applicable.
    */
  var CreatedByService: js.UndefOr[StringWithCharLimit1024] = js.undefined
  /**
    * An ExecutionControls object.
    */
  var ExecutionControls: js.UndefOr[typings.awsDashSdk.clientsConfigserviceMod.ExecutionControls] = js.undefined
  /**
    * The maximum number of failed attempts for auto-remediation. If you do not select a number, the default is 5. For example, if you specify MaximumAutomaticAttempts as 5 with RetryAttemptsSeconds as 50 seconds, AWS Config throws an exception after the 5th failed attempt within 50 seconds.
    */
  var MaximumAutomaticAttempts: js.UndefOr[AutoRemediationAttempts] = js.undefined
  /**
    * An object of the RemediationParameterValue.
    */
  var Parameters: js.UndefOr[RemediationParameters] = js.undefined
  /**
    * The type of a resource. 
    */
  var ResourceType: js.UndefOr[String] = js.undefined
  /**
    * Maximum time in seconds that AWS Config runs auto-remediation. If you do not select a number, the default is 60 seconds.  For example, if you specify RetryAttemptsSeconds as 50 seconds and MaximumAutomaticAttempts as 5, AWS Config will run auto-remediations 5 times within 50 seconds before throwing an exception. 
    */
  var RetryAttemptSeconds: js.UndefOr[AutoRemediationAttemptSeconds] = js.undefined
  /**
    * Target ID is the name of the public document.
    */
  var TargetId: StringWithCharLimit256
  /**
    * The type of the target. Target executes remediation. For example, SSM document.
    */
  var TargetType: RemediationTargetType
  /**
    * Version of the target. For example, version of the SSM document.
    */
  var TargetVersion: js.UndefOr[String] = js.undefined
}

object RemediationConfiguration {
  @scala.inline
  def apply(
    ConfigRuleName: ConfigRuleName,
    TargetId: StringWithCharLimit256,
    TargetType: RemediationTargetType,
    Arn: StringWithCharLimit1024 = null,
    Automatic: js.UndefOr[scala.Boolean] = js.undefined,
    CreatedByService: StringWithCharLimit1024 = null,
    ExecutionControls: ExecutionControls = null,
    MaximumAutomaticAttempts: Int | Double = null,
    Parameters: RemediationParameters = null,
    ResourceType: String = null,
    RetryAttemptSeconds: Int | Double = null,
    TargetVersion: String = null
  ): RemediationConfiguration = {
    val __obj = js.Dynamic.literal(ConfigRuleName = ConfigRuleName, TargetId = TargetId, TargetType = TargetType.asInstanceOf[js.Any])
    if (Arn != null) __obj.updateDynamic("Arn")(Arn)
    if (!js.isUndefined(Automatic)) __obj.updateDynamic("Automatic")(Automatic)
    if (CreatedByService != null) __obj.updateDynamic("CreatedByService")(CreatedByService)
    if (ExecutionControls != null) __obj.updateDynamic("ExecutionControls")(ExecutionControls)
    if (MaximumAutomaticAttempts != null) __obj.updateDynamic("MaximumAutomaticAttempts")(MaximumAutomaticAttempts.asInstanceOf[js.Any])
    if (Parameters != null) __obj.updateDynamic("Parameters")(Parameters)
    if (ResourceType != null) __obj.updateDynamic("ResourceType")(ResourceType)
    if (RetryAttemptSeconds != null) __obj.updateDynamic("RetryAttemptSeconds")(RetryAttemptSeconds.asInstanceOf[js.Any])
    if (TargetVersion != null) __obj.updateDynamic("TargetVersion")(TargetVersion)
    __obj.asInstanceOf[RemediationConfiguration]
  }
}

