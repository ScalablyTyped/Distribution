package typings
package awsDashSdkLib.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeRetentionConfigurationsRequest extends js.Object {
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response. 
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * A list of names of retention configurations for which you want details. If you do not specify a name, AWS Config returns details for all the retention configurations for that account.  Currently, AWS Config supports only one retention configuration per region in your account. 
    */
  var RetentionConfigurationNames: js.UndefOr[RetentionConfigurationNameList] = js.undefined
}

object DescribeRetentionConfigurationsRequest {
  @scala.inline
  def apply(NextToken: NextToken = null, RetentionConfigurationNames: RetentionConfigurationNameList = null): DescribeRetentionConfigurationsRequest = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (RetentionConfigurationNames != null) __obj.updateDynamic("RetentionConfigurationNames")(RetentionConfigurationNames)
    __obj.asInstanceOf[DescribeRetentionConfigurationsRequest]
  }
}

