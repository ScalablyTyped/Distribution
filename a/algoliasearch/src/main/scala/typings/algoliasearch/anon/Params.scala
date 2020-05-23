package typings.algoliasearch.anon

import typings.algoliasearch.mod.SearchForFacetValues.Parameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Params extends js.Object {
  var indexName: String
  var params: Parameters
}

object Params {
  @scala.inline
  def apply(indexName: String, params: Parameters): Params = {
    val __obj = js.Dynamic.literal(indexName = indexName.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[Params]
  }
}

