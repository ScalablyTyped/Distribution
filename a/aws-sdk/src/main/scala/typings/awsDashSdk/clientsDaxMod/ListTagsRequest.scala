package typings.awsDashSdk.clientsDaxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTagsRequest extends js.Object {
  /**
    * An optional token returned from a prior request. Use this token for pagination of results from this action. If this parameter is specified, the response includes only results beyond the token.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * The name of the DAX resource to which the tags belong.
    */
  var ResourceName: String = js.native
}

object ListTagsRequest {
  @scala.inline
  def apply(ResourceName: String, NextToken: String = null): ListTagsRequest = {
    val __obj = js.Dynamic.literal(ResourceName = ResourceName.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsRequest]
  }
}

