package typings.algoliaClientSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultipleQueriesQuery extends js.Object {
  /**
    * The index name.
    */
  val indexName: String
  /**
    * The search options.
    */
  val params: js.UndefOr[SearchOptions] = js.undefined
  /**
    * The query associated with the request.
    */
  val query: js.UndefOr[String] = js.undefined
}

object MultipleQueriesQuery {
  @scala.inline
  def apply(indexName: String, params: SearchOptions = null, query: String = null): MultipleQueriesQuery = {
    val __obj = js.Dynamic.literal(indexName = indexName.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultipleQueriesQuery]
  }
}

