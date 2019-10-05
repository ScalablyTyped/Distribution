package typings.awsDashSdk.clientsDlmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Schedule extends js.Object {
  /**
    * Copy all user-defined tags on a source volume to snapshots of the volume created by this policy.
    */
  var CopyTags: js.UndefOr[typings.awsDashSdk.clientsDlmMod.CopyTags] = js.undefined
  /**
    * The create rule.
    */
  var CreateRule: js.UndefOr[typings.awsDashSdk.clientsDlmMod.CreateRule] = js.undefined
  /**
    * The name of the schedule.
    */
  var Name: js.UndefOr[ScheduleName] = js.undefined
  /**
    * The retain rule.
    */
  var RetainRule: js.UndefOr[typings.awsDashSdk.clientsDlmMod.RetainRule] = js.undefined
  /**
    * The tags to apply to policy-created resources. These user-defined tags are in addition to the AWS-added lifecycle tags.
    */
  var TagsToAdd: js.UndefOr[TagsToAddList] = js.undefined
  /**
    * A collection of key/value pairs with values determined dynamically when the policy is executed. Keys may be any valid Amazon EC2 tag key. Values must be in one of the two following formats: $(instance-id) or $(timestamp). Variable tags are only valid for EBS Snapshot Management – Instance policies.
    */
  var VariableTags: js.UndefOr[VariableTagsList] = js.undefined
}

object Schedule {
  @scala.inline
  def apply(
    CopyTags: js.UndefOr[Boolean] = js.undefined,
    CreateRule: CreateRule = null,
    Name: ScheduleName = null,
    RetainRule: RetainRule = null,
    TagsToAdd: TagsToAddList = null,
    VariableTags: VariableTagsList = null
  ): Schedule = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(CopyTags)) __obj.updateDynamic("CopyTags")(CopyTags)
    if (CreateRule != null) __obj.updateDynamic("CreateRule")(CreateRule)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (RetainRule != null) __obj.updateDynamic("RetainRule")(RetainRule)
    if (TagsToAdd != null) __obj.updateDynamic("TagsToAdd")(TagsToAdd)
    if (VariableTags != null) __obj.updateDynamic("VariableTags")(VariableTags)
    __obj.asInstanceOf[Schedule]
  }
}

