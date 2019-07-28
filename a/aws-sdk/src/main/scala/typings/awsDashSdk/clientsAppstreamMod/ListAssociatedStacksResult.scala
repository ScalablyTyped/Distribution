package typings.awsDashSdk.clientsAppstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListAssociatedStacksResult extends js.Object {
  /**
    * The name of the stack.
    */
  var Names: js.UndefOr[StringList] = js.undefined
  /**
    * The pagination token to use to retrieve the next page of results for this operation. If there are no more pages, this value is null.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}

object ListAssociatedStacksResult {
  @scala.inline
  def apply(Names: StringList = null, NextToken: String = null): ListAssociatedStacksResult = {
    val __obj = js.Dynamic.literal()
    if (Names != null) __obj.updateDynamic("Names")(Names)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListAssociatedStacksResult]
  }
}

