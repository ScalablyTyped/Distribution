package typings
package algoliasearchLib.algoliasearchMod.algoliasearchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BrowseResponse extends js.Object {
  var cursor: js.UndefOr[java.lang.String] = js.undefined
  var hits: js.Array[js.Object]
  var params: java.lang.String
  var processingTimeMS: scala.Double
  var query: java.lang.String
}

object BrowseResponse {
  @scala.inline
  def apply(
    hits: js.Array[js.Object],
    params: java.lang.String,
    processingTimeMS: scala.Double,
    query: java.lang.String,
    cursor: java.lang.String = null
  ): BrowseResponse = {
    val __obj = js.Dynamic.literal(hits = hits, params = params, processingTimeMS = processingTimeMS, query = query)
    if (cursor != null) __obj.updateDynamic("cursor")(cursor)
    __obj.asInstanceOf[BrowseResponse]
  }
}

