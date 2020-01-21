package typings.awsSdk.athenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListWorkGroupsInput extends js.Object {
  /**
    * The maximum number of workgroups to return in this request.
    */
  var MaxResults: js.UndefOr[MaxWorkGroupsCount] = js.native
  /**
    * A token to be used by the next request if this request is truncated.
    */
  var NextToken: js.UndefOr[Token] = js.native
}

object ListWorkGroupsInput {
  @scala.inline
  def apply(MaxResults: Int | Double = null, NextToken: Token = null): ListWorkGroupsInput = {
    val __obj = js.Dynamic.literal()
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListWorkGroupsInput]
  }
}

