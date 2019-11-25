package typings.algoliasearch

import typings.algoliasearch.algoliasearchMod.QueryParameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IndexName extends js.Object {
  var indexName: String
  var params: QueryParameters
  var query: String
}

object Anon_IndexName {
  @scala.inline
  def apply(indexName: String, params: QueryParameters, query: String): Anon_IndexName = {
    val __obj = js.Dynamic.literal(indexName = indexName.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_IndexName]
  }
}

