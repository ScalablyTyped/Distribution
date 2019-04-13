package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeInstanceAssociationsStatusResult extends js.Object {
  /**
    * Status information about the association.
    */
  var InstanceAssociationStatusInfos: js.UndefOr[InstanceAssociationStatusInfos] = js.undefined
  /**
    * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
}

object DescribeInstanceAssociationsStatusResult {
  @scala.inline
  def apply(InstanceAssociationStatusInfos: InstanceAssociationStatusInfos = null, NextToken: NextToken = null): DescribeInstanceAssociationsStatusResult = {
    val __obj = js.Dynamic.literal()
    if (InstanceAssociationStatusInfos != null) __obj.updateDynamic("InstanceAssociationStatusInfos")(InstanceAssociationStatusInfos)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeInstanceAssociationsStatusResult]
  }
}

