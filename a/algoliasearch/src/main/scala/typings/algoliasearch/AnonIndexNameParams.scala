package typings.algoliasearch

import typings.algoliasearch.mod.SearchForFacetValues.Parameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIndexNameParams extends js.Object {
  var indexName: String
  var params: Parameters
}

object AnonIndexNameParams {
  @scala.inline
  def apply(indexName: String, params: Parameters): AnonIndexNameParams = {
    val __obj = js.Dynamic.literal(indexName = indexName.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonIndexNameParams]
  }
}

