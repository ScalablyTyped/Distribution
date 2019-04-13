package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeActivationsResult extends js.Object {
  /**
    * A list of activations for your AWS account.
    */
  var ActivationList: js.UndefOr[ActivationList] = js.undefined
  /**
    * The token for the next set of items to return. Use this token to get the next set of results. 
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
}

object DescribeActivationsResult {
  @scala.inline
  def apply(ActivationList: ActivationList = null, NextToken: NextToken = null): DescribeActivationsResult = {
    val __obj = js.Dynamic.literal()
    if (ActivationList != null) __obj.updateDynamic("ActivationList")(ActivationList)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeActivationsResult]
  }
}

