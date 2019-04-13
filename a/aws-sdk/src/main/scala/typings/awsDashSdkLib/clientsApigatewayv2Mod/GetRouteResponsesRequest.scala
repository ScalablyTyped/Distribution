package typings
package awsDashSdkLib.clientsApigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRouteResponsesRequest extends js.Object {
  /**
    * The API identifier.
    */
  var ApiId: __string
  /**
    * The maximum number of elements to be returned for this resource.
    */
  var MaxResults: js.UndefOr[__string] = js.undefined
  /**
    * The next page of elements from this collection. Not valid for the last element of
    the collection.
    */
  var NextToken: js.UndefOr[__string] = js.undefined
  /**
    * The route ID.
    */
  var RouteId: __string
}

object GetRouteResponsesRequest {
  @scala.inline
  def apply(ApiId: __string, RouteId: __string, MaxResults: __string = null, NextToken: __string = null): GetRouteResponsesRequest = {
    val __obj = js.Dynamic.literal(ApiId = ApiId, RouteId = RouteId)
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[GetRouteResponsesRequest]
  }
}

