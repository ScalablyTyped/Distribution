package typings
package algoliasearchLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IndexNameParamsQuery extends js.Object {
  var indexName: java.lang.String
  var params: algoliasearchLib.liteMod.QueryParameters
  var query: java.lang.String
}

object Anon_IndexNameParamsQuery {
  @scala.inline
  def apply(
    indexName: java.lang.String,
    params: algoliasearchLib.liteMod.QueryParameters,
    query: java.lang.String
  ): Anon_IndexNameParamsQuery = {
    val __obj = js.Dynamic.literal(indexName = indexName, params = params, query = query)
  
    __obj.asInstanceOf[Anon_IndexNameParamsQuery]
  }
}

