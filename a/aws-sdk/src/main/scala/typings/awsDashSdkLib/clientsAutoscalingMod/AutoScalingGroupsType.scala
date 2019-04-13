package typings
package awsDashSdkLib.clientsAutoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoScalingGroupsType extends js.Object {
  /**
    * The groups.
    */
  var AutoScalingGroups: awsDashSdkLib.clientsAutoscalingMod.AutoScalingGroups
  /**
    * A string that indicates that the response contains more items than can be returned in a single response. To receive additional items, specify this string for the NextToken value when requesting the next set of items. This value is null when there are no more items to return.
    */
  var NextToken: js.UndefOr[XmlString] = js.undefined
}

object AutoScalingGroupsType {
  @scala.inline
  def apply(AutoScalingGroups: AutoScalingGroups, NextToken: XmlString = null): AutoScalingGroupsType = {
    val __obj = js.Dynamic.literal(AutoScalingGroups = AutoScalingGroups)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[AutoScalingGroupsType]
  }
}

