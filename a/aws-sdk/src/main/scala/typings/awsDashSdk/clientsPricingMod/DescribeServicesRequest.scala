package typings.awsDashSdk.clientsPricingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeServicesRequest extends js.Object {
  /**
    * The format version that you want the response to be in. Valid values are: aws_v1 
    */
  var FormatVersion: js.UndefOr[String] = js.native
  /**
    * The maximum number of results that you want returned in the response.
    */
  var MaxResults: js.UndefOr[BoxedInteger] = js.native
  /**
    * The pagination token that indicates the next set of results that you want to retrieve.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * The code for the service whose information you want to retrieve, such as AmazonEC2. You can use the ServiceCode to filter the results in a GetProducts call. To retrieve a list of all services, leave this blank.
    */
  var ServiceCode: js.UndefOr[String] = js.native
}

object DescribeServicesRequest {
  @scala.inline
  def apply(
    FormatVersion: String = null,
    MaxResults: Int | Double = null,
    NextToken: String = null,
    ServiceCode: String = null
  ): DescribeServicesRequest = {
    val __obj = js.Dynamic.literal()
    if (FormatVersion != null) __obj.updateDynamic("FormatVersion")(FormatVersion.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (ServiceCode != null) __obj.updateDynamic("ServiceCode")(ServiceCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeServicesRequest]
  }
}

