package typings
package awsDashSdkLib.clientsApigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetApiMappingsRequest extends js.Object {
  /**
    * The domain name.
    */
  var DomainName: __string
  /**
    * The maximum number of elements to be returned for this resource.
    */
  var MaxResults: js.UndefOr[__string] = js.undefined
  /**
    * The next page of elements from this collection. Not valid for the last element of
    the collection.
    */
  var NextToken: js.UndefOr[__string] = js.undefined
}

object GetApiMappingsRequest {
  @scala.inline
  def apply(DomainName: __string, MaxResults: __string = null, NextToken: __string = null): GetApiMappingsRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName)
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[GetApiMappingsRequest]
  }
}

