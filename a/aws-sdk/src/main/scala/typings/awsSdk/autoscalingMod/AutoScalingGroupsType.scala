package typings.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoScalingGroupsType extends js.Object {
  /**
    * The groups.
    */
  var AutoScalingGroups: typings.awsSdk.autoscalingMod.AutoScalingGroups = js.native
  /**
    * A string that indicates that the response contains more items than can be returned in a single response. To receive additional items, specify this string for the NextToken value when requesting the next set of items. This value is null when there are no more items to return.
    */
  var NextToken: js.UndefOr[XmlString] = js.native
}

object AutoScalingGroupsType {
  @scala.inline
  def apply(AutoScalingGroups: AutoScalingGroups, NextToken: XmlString = null): AutoScalingGroupsType = {
    val __obj = js.Dynamic.literal(AutoScalingGroups = AutoScalingGroups.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoScalingGroupsType]
  }
}

