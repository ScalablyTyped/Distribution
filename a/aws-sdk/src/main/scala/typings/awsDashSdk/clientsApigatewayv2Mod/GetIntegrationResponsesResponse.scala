package typings.awsDashSdk.clientsApigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetIntegrationResponsesResponse extends js.Object {
  /**
    * The elements from this collection.
    */
  var Items: js.UndefOr[__listOfIntegrationResponse] = js.undefined
  /**
    * The next page of elements from this collection. Not valid for the last element of
    the collection.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsApigatewayv2Mod.NextToken] = js.undefined
}

object GetIntegrationResponsesResponse {
  @scala.inline
  def apply(Items: __listOfIntegrationResponse = null, NextToken: NextToken = null): GetIntegrationResponsesResponse = {
    val __obj = js.Dynamic.literal()
    if (Items != null) __obj.updateDynamic("Items")(Items)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[GetIntegrationResponsesResponse]
  }
}

