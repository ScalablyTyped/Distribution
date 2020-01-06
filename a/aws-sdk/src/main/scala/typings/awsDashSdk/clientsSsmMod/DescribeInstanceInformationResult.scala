package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeInstanceInformationResult extends js.Object {
  /**
    * The instance information list.
    */
  var InstanceInformationList: js.UndefOr[typings.awsDashSdk.clientsSsmMod.InstanceInformationList] = js.native
  /**
    * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty. 
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsSsmMod.NextToken] = js.native
}

object DescribeInstanceInformationResult {
  @scala.inline
  def apply(InstanceInformationList: InstanceInformationList = null, NextToken: NextToken = null): DescribeInstanceInformationResult = {
    val __obj = js.Dynamic.literal()
    if (InstanceInformationList != null) __obj.updateDynamic("InstanceInformationList")(InstanceInformationList.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeInstanceInformationResult]
  }
}

