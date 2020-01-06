package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetClassifiersRequest extends js.Object {
  /**
    * The size of the list to return (optional).
    */
  var MaxResults: js.UndefOr[PageSize] = js.native
  /**
    * An optional continuation token.
    */
  var NextToken: js.UndefOr[Token] = js.native
}

object GetClassifiersRequest {
  @scala.inline
  def apply(MaxResults: Int | Double = null, NextToken: Token = null): GetClassifiersRequest = {
    val __obj = js.Dynamic.literal()
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetClassifiersRequest]
  }
}

