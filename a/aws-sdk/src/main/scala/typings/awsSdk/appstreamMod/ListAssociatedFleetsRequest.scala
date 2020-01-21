package typings.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAssociatedFleetsRequest extends js.Object {
  /**
    * The pagination token to use to retrieve the next page of results for this operation. If this value is null, it retrieves the first page.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * The name of the stack.
    */
  var StackName: String = js.native
}

object ListAssociatedFleetsRequest {
  @scala.inline
  def apply(StackName: String, NextToken: String = null): ListAssociatedFleetsRequest = {
    val __obj = js.Dynamic.literal(StackName = StackName.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAssociatedFleetsRequest]
  }
}

