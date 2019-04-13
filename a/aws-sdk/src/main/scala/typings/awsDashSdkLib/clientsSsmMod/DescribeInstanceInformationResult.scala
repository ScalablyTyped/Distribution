package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeInstanceInformationResult extends js.Object {
  /**
    * The instance information list.
    */
  var InstanceInformationList: js.UndefOr[InstanceInformationList] = js.undefined
  /**
    * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty. 
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
}

object DescribeInstanceInformationResult {
  @scala.inline
  def apply(InstanceInformationList: InstanceInformationList = null, NextToken: NextToken = null): DescribeInstanceInformationResult = {
    val __obj = js.Dynamic.literal()
    if (InstanceInformationList != null) __obj.updateDynamic("InstanceInformationList")(InstanceInformationList)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeInstanceInformationResult]
  }
}

