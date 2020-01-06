package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeRemediationExceptionsResponse extends js.Object {
  /**
    * The nextToken string returned in a previous request that you use to request the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * Returns a list of remediation exception objects.
    */
  var RemediationExceptions: js.UndefOr[typings.awsDashSdk.clientsConfigserviceMod.RemediationExceptions] = js.native
}

object DescribeRemediationExceptionsResponse {
  @scala.inline
  def apply(NextToken: String = null, RemediationExceptions: RemediationExceptions = null): DescribeRemediationExceptionsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (RemediationExceptions != null) __obj.updateDynamic("RemediationExceptions")(RemediationExceptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeRemediationExceptionsResponse]
  }
}

