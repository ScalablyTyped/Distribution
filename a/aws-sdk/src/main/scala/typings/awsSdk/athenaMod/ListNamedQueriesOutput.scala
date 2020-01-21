package typings.awsSdk.athenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListNamedQueriesOutput extends js.Object {
  /**
    * The list of unique query IDs.
    */
  var NamedQueryIds: js.UndefOr[NamedQueryIdList] = js.native
  /**
    * A token to be used by the next request if this request is truncated.
    */
  var NextToken: js.UndefOr[Token] = js.native
}

object ListNamedQueriesOutput {
  @scala.inline
  def apply(NamedQueryIds: NamedQueryIdList = null, NextToken: Token = null): ListNamedQueriesOutput = {
    val __obj = js.Dynamic.literal()
    if (NamedQueryIds != null) __obj.updateDynamic("NamedQueryIds")(NamedQueryIds.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListNamedQueriesOutput]
  }
}

