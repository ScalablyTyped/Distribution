package typings
package awsDashSdkLib.clientsDlmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Schedule extends js.Object {
  var CopyTags: js.UndefOr[CopyTags] = js.undefined
  /**
    * The create rule.
    */
  var CreateRule: js.UndefOr[CreateRule] = js.undefined
  /**
    * The name of the schedule.
    */
  var Name: js.UndefOr[ScheduleName] = js.undefined
  /**
    * The retain rule.
    */
  var RetainRule: js.UndefOr[RetainRule] = js.undefined
  /**
    * The tags to apply to policy-created resources. These user-defined tags are in addition to the AWS-added lifecycle tags.
    */
  var TagsToAdd: js.UndefOr[TagsToAddList] = js.undefined
}

object Schedule {
  @scala.inline
  def apply(
    CopyTags: js.UndefOr[CopyTags] = js.undefined,
    CreateRule: CreateRule = null,
    Name: ScheduleName = null,
    RetainRule: RetainRule = null,
    TagsToAdd: TagsToAddList = null
  ): Schedule = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(CopyTags)) __obj.updateDynamic("CopyTags")(CopyTags)
    if (CreateRule != null) __obj.updateDynamic("CreateRule")(CreateRule)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (RetainRule != null) __obj.updateDynamic("RetainRule")(RetainRule)
    if (TagsToAdd != null) __obj.updateDynamic("TagsToAdd")(TagsToAdd)
    __obj.asInstanceOf[Schedule]
  }
}

