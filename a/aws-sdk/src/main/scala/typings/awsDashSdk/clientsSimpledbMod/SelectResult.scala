package typings.awsDashSdk.clientsSimpledbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectResult extends js.Object {
  /**
    * A list of items that match the select expression.
    */
  var Items: js.UndefOr[ItemList] = js.native
  /**
    * An opaque token indicating that more items than MaxNumberOfItems were matched, the response size exceeded 1 megabyte, or the execution time exceeded 5 seconds.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object SelectResult {
  @scala.inline
  def apply(Items: ItemList = null, NextToken: String = null): SelectResult = {
    val __obj = js.Dynamic.literal()
    if (Items != null) __obj.updateDynamic("Items")(Items.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectResult]
  }
}

