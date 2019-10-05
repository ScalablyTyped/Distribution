package typings.awsDashSdk.clientsPricingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetAttributeValuesRequest extends js.Object {
  /**
    * The name of the attribute that you want to retrieve the values for, such as volumeType.
    */
  var AttributeName: String
  /**
    * The maximum number of results to return in response.
    */
  var MaxResults: js.UndefOr[BoxedInteger] = js.undefined
  /**
    * The pagination token that indicates the next set of results that you want to retrieve.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  /**
    * The service code for the service whose attributes you want to retrieve. For example, if you want the retrieve an EC2 attribute, use AmazonEC2.
    */
  var ServiceCode: String
}

object GetAttributeValuesRequest {
  @scala.inline
  def apply(
    AttributeName: String,
    ServiceCode: String,
    MaxResults: Int | Double = null,
    NextToken: String = null
  ): GetAttributeValuesRequest = {
    val __obj = js.Dynamic.literal(AttributeName = AttributeName, ServiceCode = ServiceCode)
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[GetAttributeValuesRequest]
  }
}

