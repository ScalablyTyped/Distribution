package typings.awsDashSdk.clientsPricingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAttributeValuesResponse extends js.Object {
  /**
    * The list of values for an attribute. For example, Throughput Optimized HDD and Provisioned IOPS are two available values for the AmazonEC2 volumeType.
    */
  var AttributeValues: js.UndefOr[AttributeValueList] = js.native
  /**
    * The pagination token that indicates the next set of results to retrieve.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object GetAttributeValuesResponse {
  @scala.inline
  def apply(AttributeValues: AttributeValueList = null, NextToken: String = null): GetAttributeValuesResponse = {
    val __obj = js.Dynamic.literal()
    if (AttributeValues != null) __obj.updateDynamic("AttributeValues")(AttributeValues.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAttributeValuesResponse]
  }
}

