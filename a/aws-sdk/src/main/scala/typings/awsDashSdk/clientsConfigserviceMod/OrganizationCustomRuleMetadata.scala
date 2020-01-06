package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrganizationCustomRuleMetadata extends js.Object {
  /**
    * The description that you provide for organization config rule.
    */
  var Description: js.UndefOr[StringWithCharLimit256Min0] = js.native
  /**
    * A string, in JSON format, that is passed to organization config rule Lambda function.
    */
  var InputParameters: js.UndefOr[StringWithCharLimit2048] = js.native
  /**
    * The lambda function ARN.
    */
  var LambdaFunctionArn: StringWithCharLimit256 = js.native
  /**
    * The maximum frequency with which AWS Config runs evaluations for a rule. Your custom rule is triggered when AWS Config delivers the configuration snapshot. For more information, see ConfigSnapshotDeliveryProperties.  By default, rules with a periodic trigger are evaluated every 24 hours. To change the frequency, specify a valid value for the MaximumExecutionFrequency parameter. 
    */
  var MaximumExecutionFrequency: js.UndefOr[typings.awsDashSdk.clientsConfigserviceMod.MaximumExecutionFrequency] = js.native
  /**
    * The type of notification that triggers AWS Config to run an evaluation for a rule. You can specify the following notification types:    ConfigurationItemChangeNotification - Triggers an evaluation when AWS Config delivers a configuration item as a result of a resource change.    OversizedConfigurationItemChangeNotification - Triggers an evaluation when AWS Config delivers an oversized configuration item. AWS Config may generate this notification type when a resource changes and the notification exceeds the maximum size allowed by Amazon SNS.    ScheduledNotification - Triggers a periodic evaluation at the frequency specified for MaximumExecutionFrequency.  
    */
  var OrganizationConfigRuleTriggerTypes: typings.awsDashSdk.clientsConfigserviceMod.OrganizationConfigRuleTriggerTypes = js.native
  /**
    * The ID of the AWS resource that was evaluated.
    */
  var ResourceIdScope: js.UndefOr[StringWithCharLimit768] = js.native
  /**
    * The type of the AWS resource that was evaluated.
    */
  var ResourceTypesScope: js.UndefOr[typings.awsDashSdk.clientsConfigserviceMod.ResourceTypesScope] = js.native
  /**
    * One part of a key-value pair that make up a tag. A key is a general label that acts like a category for more specific tag values. 
    */
  var TagKeyScope: js.UndefOr[StringWithCharLimit128] = js.native
  /**
    * The optional part of a key-value pair that make up a tag. A value acts as a descriptor within a tag category (key). 
    */
  var TagValueScope: js.UndefOr[StringWithCharLimit256] = js.native
}

object OrganizationCustomRuleMetadata {
  @scala.inline
  def apply(
    LambdaFunctionArn: StringWithCharLimit256,
    OrganizationConfigRuleTriggerTypes: OrganizationConfigRuleTriggerTypes,
    Description: StringWithCharLimit256Min0 = null,
    InputParameters: StringWithCharLimit2048 = null,
    MaximumExecutionFrequency: MaximumExecutionFrequency = null,
    ResourceIdScope: StringWithCharLimit768 = null,
    ResourceTypesScope: ResourceTypesScope = null,
    TagKeyScope: StringWithCharLimit128 = null,
    TagValueScope: StringWithCharLimit256 = null
  ): OrganizationCustomRuleMetadata = {
    val __obj = js.Dynamic.literal(LambdaFunctionArn = LambdaFunctionArn.asInstanceOf[js.Any], OrganizationConfigRuleTriggerTypes = OrganizationConfigRuleTriggerTypes.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (InputParameters != null) __obj.updateDynamic("InputParameters")(InputParameters.asInstanceOf[js.Any])
    if (MaximumExecutionFrequency != null) __obj.updateDynamic("MaximumExecutionFrequency")(MaximumExecutionFrequency.asInstanceOf[js.Any])
    if (ResourceIdScope != null) __obj.updateDynamic("ResourceIdScope")(ResourceIdScope.asInstanceOf[js.Any])
    if (ResourceTypesScope != null) __obj.updateDynamic("ResourceTypesScope")(ResourceTypesScope.asInstanceOf[js.Any])
    if (TagKeyScope != null) __obj.updateDynamic("TagKeyScope")(TagKeyScope.asInstanceOf[js.Any])
    if (TagValueScope != null) __obj.updateDynamic("TagValueScope")(TagValueScope.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrganizationCustomRuleMetadata]
  }
}

