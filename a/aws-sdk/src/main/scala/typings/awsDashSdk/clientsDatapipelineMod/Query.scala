package typings.awsDashSdk.clientsDatapipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Query extends js.Object {
  /**
    * List of selectors that define the query. An object must satisfy all of the selectors to match the query.
    */
  var selectors: js.UndefOr[SelectorList] = js.undefined
}

object Query {
  @scala.inline
  def apply(selectors: SelectorList = null): Query = {
    val __obj = js.Dynamic.literal()
    if (selectors != null) __obj.updateDynamic("selectors")(selectors)
    __obj.asInstanceOf[Query]
  }
}

