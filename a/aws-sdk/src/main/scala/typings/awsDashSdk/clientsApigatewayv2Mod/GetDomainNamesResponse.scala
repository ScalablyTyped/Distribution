package typings.awsDashSdk.clientsApigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDomainNamesResponse extends js.Object {
  /**
    * The elements from this collection.
    */
  var Items: js.UndefOr[__listOfDomainName] = js.undefined
  /**
    * The next page of elements from this collection. Not valid for the last element of
    the collection.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsApigatewayv2Mod.NextToken] = js.undefined
}

object GetDomainNamesResponse {
  @scala.inline
  def apply(Items: __listOfDomainName = null, NextToken: NextToken = null): GetDomainNamesResponse = {
    val __obj = js.Dynamic.literal()
    if (Items != null) __obj.updateDynamic("Items")(Items)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[GetDomainNamesResponse]
  }
}

