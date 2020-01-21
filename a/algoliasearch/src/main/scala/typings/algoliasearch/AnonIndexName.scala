package typings.algoliasearch

import typings.algoliasearch.mod.QueryParameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIndexName extends js.Object {
  var indexName: String
  var params: QueryParameters
  var query: String
}

object AnonIndexName {
  @scala.inline
  def apply(indexName: String, params: QueryParameters, query: String): AnonIndexName = {
    val __obj = js.Dynamic.literal(indexName = indexName.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonIndexName]
  }
}

