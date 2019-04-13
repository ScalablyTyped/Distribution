package typings
package awsDashSdkLib.clientsDaxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTagsRequest extends js.Object {
  /**
    * An optional token returned from a prior request. Use this token for pagination of results from this action. If this parameter is specified, the response includes only results beyond the token.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  /**
    * The name of the DAX resource to which the tags belong.
    */
  var ResourceName: String
}

object ListTagsRequest {
  @scala.inline
  def apply(ResourceName: String, NextToken: String = null): ListTagsRequest = {
    val __obj = js.Dynamic.literal(ResourceName = ResourceName)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListTagsRequest]
  }
}

