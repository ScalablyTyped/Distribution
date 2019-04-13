package typings
package awsDashSdkLib.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Scope extends js.Object {
  /**
    * The ID of the only AWS resource that you want to trigger an evaluation for the rule. If you specify a resource ID, you must specify one resource type for ComplianceResourceTypes.
    */
  var ComplianceResourceId: js.UndefOr[BaseResourceId] = js.undefined
  /**
    * The resource types of only those AWS resources that you want to trigger an evaluation for the rule. You can only specify one type if you also specify a resource ID for ComplianceResourceId.
    */
  var ComplianceResourceTypes: js.UndefOr[ComplianceResourceTypes] = js.undefined
  /**
    * The tag key that is applied to only those AWS resources that you want to trigger an evaluation for the rule.
    */
  var TagKey: js.UndefOr[StringWithCharLimit128] = js.undefined
  /**
    * The tag value applied to only those AWS resources that you want to trigger an evaluation for the rule. If you specify a value for TagValue, you must also specify a value for TagKey.
    */
  var TagValue: js.UndefOr[StringWithCharLimit256] = js.undefined
}

object Scope {
  @scala.inline
  def apply(
    ComplianceResourceId: BaseResourceId = null,
    ComplianceResourceTypes: ComplianceResourceTypes = null,
    TagKey: StringWithCharLimit128 = null,
    TagValue: StringWithCharLimit256 = null
  ): Scope = {
    val __obj = js.Dynamic.literal()
    if (ComplianceResourceId != null) __obj.updateDynamic("ComplianceResourceId")(ComplianceResourceId)
    if (ComplianceResourceTypes != null) __obj.updateDynamic("ComplianceResourceTypes")(ComplianceResourceTypes)
    if (TagKey != null) __obj.updateDynamic("TagKey")(TagKey)
    if (TagValue != null) __obj.updateDynamic("TagValue")(TagValue)
    __obj.asInstanceOf[Scope]
  }
}

