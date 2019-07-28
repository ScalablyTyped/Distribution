package typings.algoliasearch.algoliasearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BrowseResponse extends js.Object {
  var cursor: js.UndefOr[String] = js.undefined
  var hits: js.Array[js.Object]
  var params: String
  var processingTimeMS: Double
  var query: String
}

object BrowseResponse {
  @scala.inline
  def apply(
    hits: js.Array[js.Object],
    params: String,
    processingTimeMS: Double,
    query: String,
    cursor: String = null
  ): BrowseResponse = {
    val __obj = js.Dynamic.literal(hits = hits, params = params, processingTimeMS = processingTimeMS, query = query)
    if (cursor != null) __obj.updateDynamic("cursor")(cursor)
    __obj.asInstanceOf[BrowseResponse]
  }
}

