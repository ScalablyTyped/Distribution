package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeActivationsResult extends js.Object {
  /**
    * A list of activations for your AWS account.
    */
  var ActivationList: js.UndefOr[typings.awsDashSdk.clientsSsmMod.ActivationList] = js.native
  /**
    * The token for the next set of items to return. Use this token to get the next set of results. 
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsSsmMod.NextToken] = js.native
}

object DescribeActivationsResult {
  @scala.inline
  def apply(ActivationList: ActivationList = null, NextToken: NextToken = null): DescribeActivationsResult = {
    val __obj = js.Dynamic.literal()
    if (ActivationList != null) __obj.updateDynamic("ActivationList")(ActivationList.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeActivationsResult]
  }
}

