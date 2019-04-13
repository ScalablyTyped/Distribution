package typings
package awsDashSdkLib.clientsCloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeAccountLimitsOutput extends js.Object {
  /**
    * An account limit structure that contain a list of AWS CloudFormation account limits and their values.
    */
  var AccountLimits: js.UndefOr[AccountLimitList] = js.undefined
  /**
    * If the output exceeds 1 MB in size, a string that identifies the next page of limits. If no additional page exists, this value is null.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
}

object DescribeAccountLimitsOutput {
  @scala.inline
  def apply(AccountLimits: AccountLimitList = null, NextToken: NextToken = null): DescribeAccountLimitsOutput = {
    val __obj = js.Dynamic.literal()
    if (AccountLimits != null) __obj.updateDynamic("AccountLimits")(AccountLimits)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeAccountLimitsOutput]
  }
}

