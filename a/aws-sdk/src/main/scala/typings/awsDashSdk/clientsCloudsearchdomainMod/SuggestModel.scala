package typings.awsDashSdk.clientsCloudsearchdomainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SuggestModel extends js.Object {
  /**
    * The number of documents that were found to match the query string.
    */
  var found: js.UndefOr[Long] = js.native
  /**
    * The query string specified in the suggest request.
    */
  var query: js.UndefOr[String] = js.native
  /**
    * The documents that match the query string.
    */
  var suggestions: js.UndefOr[Suggestions] = js.native
}

object SuggestModel {
  @scala.inline
  def apply(found: Int | scala.Double = null, query: String = null, suggestions: Suggestions = null): SuggestModel = {
    val __obj = js.Dynamic.literal()
    if (found != null) __obj.updateDynamic("found")(found.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (suggestions != null) __obj.updateDynamic("suggestions")(suggestions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuggestModel]
  }
}

