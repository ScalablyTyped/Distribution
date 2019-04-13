package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetClassifiersRequest extends js.Object {
  /**
    * Size of the list to return (optional).
    */
  var MaxResults: js.UndefOr[PageSize] = js.undefined
  /**
    * An optional continuation token.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
}

object GetClassifiersRequest {
  @scala.inline
  def apply(MaxResults: js.UndefOr[PageSize] = js.undefined, NextToken: Token = null): GetClassifiersRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[GetClassifiersRequest]
  }
}

