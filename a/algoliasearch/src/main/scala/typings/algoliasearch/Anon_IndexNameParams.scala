package typings.algoliasearch

import typings.algoliasearch.algoliasearchMod.SearchForFacetValues.Parameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IndexNameParams extends js.Object {
  var indexName: String
  var params: Parameters
}

object Anon_IndexNameParams {
  @scala.inline
  def apply(indexName: String, params: Parameters): Anon_IndexNameParams = {
    val __obj = js.Dynamic.literal(indexName = indexName.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_IndexNameParams]
  }
}

