package typings.algoliasearch

import typings.algoliasearch.mod.SearchForFacetValues.Parameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonParams extends js.Object {
  var indexName: String
  var params: Parameters
}

object AnonParams {
  @scala.inline
  def apply(indexName: String, params: Parameters): AnonParams = {
    val __obj = js.Dynamic.literal(indexName = indexName.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonParams]
  }
}

