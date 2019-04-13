package typings
package awsDashSdkLib.clientsPricingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeServicesRequest extends js.Object {
  /**
    * The format version that you want the response to be in. Valid values are: aws_v1 
    */
  var FormatVersion: js.UndefOr[String] = js.undefined
  /**
    * The maximum number of results that you want returned in the response.
    */
  var MaxResults: js.UndefOr[BoxedInteger] = js.undefined
  /**
    * The pagination token that indicates the next set of results that you want to retrieve.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  /**
    * The code for the service whose information you want to retrieve, such as AmazonEC2. You can use the ServiceCode to filter the results in a GetProducts call. To retrieve a list of all services, leave this blank.
    */
  var ServiceCode: js.UndefOr[String] = js.undefined
}

object DescribeServicesRequest {
  @scala.inline
  def apply(
    FormatVersion: String = null,
    MaxResults: js.UndefOr[BoxedInteger] = js.undefined,
    NextToken: String = null,
    ServiceCode: String = null
  ): DescribeServicesRequest = {
    val __obj = js.Dynamic.literal()
    if (FormatVersion != null) __obj.updateDynamic("FormatVersion")(FormatVersion)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (ServiceCode != null) __obj.updateDynamic("ServiceCode")(ServiceCode)
    __obj.asInstanceOf[DescribeServicesRequest]
  }
}

