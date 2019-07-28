package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrganizationCustomRuleMetadata extends js.Object {
  var Description: js.UndefOr[StringWithCharLimit256Min0] = js.undefined
  var InputParameters: js.UndefOr[StringWithCharLimit2048] = js.undefined
  var LambdaFunctionArn: StringWithCharLimit256
  var MaximumExecutionFrequency: js.UndefOr[typings.awsDashSdk.clientsConfigserviceMod.MaximumExecutionFrequency] = js.undefined
  var OrganizationConfigRuleTriggerTypes: typings.awsDashSdk.clientsConfigserviceMod.OrganizationConfigRuleTriggerTypes
  var ResourceIdScope: js.UndefOr[StringWithCharLimit768] = js.undefined
  var ResourceTypesScope: js.UndefOr[typings.awsDashSdk.clientsConfigserviceMod.ResourceTypesScope] = js.undefined
  var TagKeyScope: js.UndefOr[StringWithCharLimit128] = js.undefined
  var TagValueScope: js.UndefOr[StringWithCharLimit256] = js.undefined
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
    val __obj = js.Dynamic.literal(LambdaFunctionArn = LambdaFunctionArn, OrganizationConfigRuleTriggerTypes = OrganizationConfigRuleTriggerTypes)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (InputParameters != null) __obj.updateDynamic("InputParameters")(InputParameters)
    if (MaximumExecutionFrequency != null) __obj.updateDynamic("MaximumExecutionFrequency")(MaximumExecutionFrequency.asInstanceOf[js.Any])
    if (ResourceIdScope != null) __obj.updateDynamic("ResourceIdScope")(ResourceIdScope)
    if (ResourceTypesScope != null) __obj.updateDynamic("ResourceTypesScope")(ResourceTypesScope)
    if (TagKeyScope != null) __obj.updateDynamic("TagKeyScope")(TagKeyScope)
    if (TagValueScope != null) __obj.updateDynamic("TagValueScope")(TagValueScope)
    __obj.asInstanceOf[OrganizationCustomRuleMetadata]
  }
}

