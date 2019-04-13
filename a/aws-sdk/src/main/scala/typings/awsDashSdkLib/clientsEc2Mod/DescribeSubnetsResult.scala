package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeSubnetsResult extends js.Object {
  /**
    * Information about one or more subnets.
    */
  var Subnets: js.UndefOr[SubnetList] = js.undefined
}

object DescribeSubnetsResult {
  @scala.inline
  def apply(Subnets: SubnetList = null): DescribeSubnetsResult = {
    val __obj = js.Dynamic.literal()
    if (Subnets != null) __obj.updateDynamic("Subnets")(Subnets)
    __obj.asInstanceOf[DescribeSubnetsResult]
  }
}

