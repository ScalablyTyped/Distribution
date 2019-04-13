package typings
package awsDashSdkLib.clientsCloudsearchdomainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuggestModel extends js.Object {
  /**
    * The number of documents that were found to match the query string.
    */
  var found: js.UndefOr[Long] = js.undefined
  /**
    * The query string specified in the suggest request.
    */
  var query: js.UndefOr[String] = js.undefined
  /**
    * The documents that match the query string.
    */
  var suggestions: js.UndefOr[Suggestions] = js.undefined
}

object SuggestModel {
  @scala.inline
  def apply(found: js.UndefOr[Long] = js.undefined, query: String = null, suggestions: Suggestions = null): SuggestModel = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(found)) __obj.updateDynamic("found")(found)
    if (query != null) __obj.updateDynamic("query")(query)
    if (suggestions != null) __obj.updateDynamic("suggestions")(suggestions)
    __obj.asInstanceOf[SuggestModel]
  }
}

