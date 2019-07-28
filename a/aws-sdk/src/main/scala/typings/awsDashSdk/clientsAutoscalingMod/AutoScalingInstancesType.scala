package typings.awsDashSdk.clientsAutoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoScalingInstancesType extends js.Object {
  /**
    * The instances.
    */
  var AutoScalingInstances: js.UndefOr[typings.awsDashSdk.clientsAutoscalingMod.AutoScalingInstances] = js.undefined
  /**
    * A string that indicates that the response contains more items than can be returned in a single response. To receive additional items, specify this string for the NextToken value when requesting the next set of items. This value is null when there are no more items to return.
    */
  var NextToken: js.UndefOr[XmlString] = js.undefined
}

object AutoScalingInstancesType {
  @scala.inline
  def apply(AutoScalingInstances: AutoScalingInstances = null, NextToken: XmlString = null): AutoScalingInstancesType = {
    val __obj = js.Dynamic.literal()
    if (AutoScalingInstances != null) __obj.updateDynamic("AutoScalingInstances")(AutoScalingInstances)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[AutoScalingInstancesType]
  }
}

