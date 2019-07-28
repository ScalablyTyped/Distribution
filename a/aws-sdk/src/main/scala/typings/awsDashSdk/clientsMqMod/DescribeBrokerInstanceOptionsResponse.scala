package typings.awsDashSdk.clientsMqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeBrokerInstanceOptionsResponse extends js.Object {
  /**
    * List of available broker instance options.
    */
  var BrokerInstanceOptions: js.UndefOr[__listOfBrokerInstanceOption] = js.undefined
  /**
    * Required. The maximum number of instance options that can be returned per page (20 by default). This value must be an integer from 5 to 100.
    */
  var MaxResults: js.UndefOr[__integerMin5Max100] = js.undefined
  /**
    * The token that specifies the next page of results Amazon MQ should return. To request the first page, leave nextToken empty.
    */
  var NextToken: js.UndefOr[__string] = js.undefined
}

object DescribeBrokerInstanceOptionsResponse {
  @scala.inline
  def apply(
    BrokerInstanceOptions: __listOfBrokerInstanceOption = null,
    MaxResults: js.UndefOr[__integerMin5Max100] = js.undefined,
    NextToken: __string = null
  ): DescribeBrokerInstanceOptionsResponse = {
    val __obj = js.Dynamic.literal()
    if (BrokerInstanceOptions != null) __obj.updateDynamic("BrokerInstanceOptions")(BrokerInstanceOptions)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeBrokerInstanceOptionsResponse]
  }
}

