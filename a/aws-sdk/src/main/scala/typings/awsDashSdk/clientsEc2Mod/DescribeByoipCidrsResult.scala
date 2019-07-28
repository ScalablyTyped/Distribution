package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeByoipCidrsResult extends js.Object {
  /**
    * Information about your address ranges.
    */
  var ByoipCidrs: js.UndefOr[ByoipCidrSet] = js.undefined
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}

object DescribeByoipCidrsResult {
  @scala.inline
  def apply(ByoipCidrs: ByoipCidrSet = null, NextToken: String = null): DescribeByoipCidrsResult = {
    val __obj = js.Dynamic.literal()
    if (ByoipCidrs != null) __obj.updateDynamic("ByoipCidrs")(ByoipCidrs)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeByoipCidrsResult]
  }
}

