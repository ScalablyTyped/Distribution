package typings
package awsDashSdkLib.clientsMqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeBrokerEngineTypesRequest extends js.Object {
  /**
    * Filter response by engine type.
    */
  var EngineType: js.UndefOr[__string] = js.undefined
  /**
    * The maximum number of engine types that Amazon MQ can return per page (20 by default). This value must be an integer from 5 to 100.
    */
  var MaxResults: js.UndefOr[MaxResults] = js.undefined
  /**
    * The token that specifies the next page of results Amazon MQ should return. To request the first page, leave nextToken empty.
    */
  var NextToken: js.UndefOr[__string] = js.undefined
}

object DescribeBrokerEngineTypesRequest {
  @scala.inline
  def apply(
    EngineType: __string = null,
    MaxResults: js.UndefOr[MaxResults] = js.undefined,
    NextToken: __string = null
  ): DescribeBrokerEngineTypesRequest = {
    val __obj = js.Dynamic.literal()
    if (EngineType != null) __obj.updateDynamic("EngineType")(EngineType)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeBrokerEngineTypesRequest]
  }
}

