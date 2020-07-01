package typings.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeInstanceRefreshesAnswer extends js.Object {
  /**
    * The instance refreshes for the specified group.
    */
  var InstanceRefreshes: js.UndefOr[typings.awsSdk.autoscalingMod.InstanceRefreshes] = js.native
  /**
    * A string that indicates that the response contains more items than can be returned in a single response. To receive additional items, specify this string for the NextToken value when requesting the next set of items. This value is null when there are no more items to return.
    */
  var NextToken: js.UndefOr[XmlString] = js.native
}

object DescribeInstanceRefreshesAnswer {
  @scala.inline
  def apply(InstanceRefreshes: InstanceRefreshes = null, NextToken: XmlString = null): DescribeInstanceRefreshesAnswer = {
    val __obj = js.Dynamic.literal()
    if (InstanceRefreshes != null) __obj.updateDynamic("InstanceRefreshes")(InstanceRefreshes.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeInstanceRefreshesAnswer]
  }
}

