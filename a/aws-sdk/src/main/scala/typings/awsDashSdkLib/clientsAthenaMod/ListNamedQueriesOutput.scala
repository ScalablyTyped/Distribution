package typings
package awsDashSdkLib.clientsAthenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListNamedQueriesOutput extends js.Object {
  /**
    * The list of unique query IDs.
    */
  var NamedQueryIds: js.UndefOr[NamedQueryIdList] = js.undefined
  /**
    * A token to be used by the next request if this request is truncated.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
}

object ListNamedQueriesOutput {
  @scala.inline
  def apply(NamedQueryIds: NamedQueryIdList = null, NextToken: Token = null): ListNamedQueriesOutput = {
    val __obj = js.Dynamic.literal()
    if (NamedQueryIds != null) __obj.updateDynamic("NamedQueryIds")(NamedQueryIds)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListNamedQueriesOutput]
  }
}

