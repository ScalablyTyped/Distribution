package typings.awsDashSdk.clientsMqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeBrokerEngineTypesResponse extends js.Object {
  /**
    * List of available engine types and versions.
    */
  var BrokerEngineTypes: js.UndefOr[__listOfBrokerEngineType] = js.undefined
  /**
    * Required. The maximum number of engine types that can be returned per page (20 by default). This value must be an integer from 5 to 100.
    */
  var MaxResults: js.UndefOr[__integerMin5Max100] = js.undefined
  /**
    * The token that specifies the next page of results Amazon MQ should return. To request the first page, leave nextToken empty.
    */
  var NextToken: js.UndefOr[__string] = js.undefined
}

object DescribeBrokerEngineTypesResponse {
  @scala.inline
  def apply(
    BrokerEngineTypes: __listOfBrokerEngineType = null,
    MaxResults: js.UndefOr[__integerMin5Max100] = js.undefined,
    NextToken: __string = null
  ): DescribeBrokerEngineTypesResponse = {
    val __obj = js.Dynamic.literal()
    if (BrokerEngineTypes != null) __obj.updateDynamic("BrokerEngineTypes")(BrokerEngineTypes)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeBrokerEngineTypesResponse]
  }
}

