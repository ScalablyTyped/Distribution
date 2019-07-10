package typings
package awsDashSdkLib.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrganizationManagedRuleMetadata extends js.Object {
  var Description: js.UndefOr[StringWithCharLimit256Min0] = js.undefined
  var InputParameters: js.UndefOr[StringWithCharLimit2048] = js.undefined
  var MaximumExecutionFrequency: js.UndefOr[MaximumExecutionFrequency] = js.undefined
  var ResourceIdScope: js.UndefOr[StringWithCharLimit768] = js.undefined
  var ResourceTypesScope: js.UndefOr[ResourceTypesScope] = js.undefined
  var RuleIdentifier: StringWithCharLimit256
  var TagKeyScope: js.UndefOr[StringWithCharLimit128] = js.undefined
  var TagValueScope: js.UndefOr[StringWithCharLimit256] = js.undefined
}

object OrganizationManagedRuleMetadata {
  @scala.inline
  def apply(
    RuleIdentifier: StringWithCharLimit256,
    Description: StringWithCharLimit256Min0 = null,
    InputParameters: StringWithCharLimit2048 = null,
    MaximumExecutionFrequency: MaximumExecutionFrequency = null,
    ResourceIdScope: StringWithCharLimit768 = null,
    ResourceTypesScope: ResourceTypesScope = null,
    TagKeyScope: StringWithCharLimit128 = null,
    TagValueScope: StringWithCharLimit256 = null
  ): OrganizationManagedRuleMetadata = {
    val __obj = js.Dynamic.literal(RuleIdentifier = RuleIdentifier)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (InputParameters != null) __obj.updateDynamic("InputParameters")(InputParameters)
    if (MaximumExecutionFrequency != null) __obj.updateDynamic("MaximumExecutionFrequency")(MaximumExecutionFrequency.asInstanceOf[js.Any])
    if (ResourceIdScope != null) __obj.updateDynamic("ResourceIdScope")(ResourceIdScope)
    if (ResourceTypesScope != null) __obj.updateDynamic("ResourceTypesScope")(ResourceTypesScope)
    if (TagKeyScope != null) __obj.updateDynamic("TagKeyScope")(TagKeyScope)
    if (TagValueScope != null) __obj.updateDynamic("TagValueScope")(TagValueScope)
    __obj.asInstanceOf[OrganizationManagedRuleMetadata]
  }
}

