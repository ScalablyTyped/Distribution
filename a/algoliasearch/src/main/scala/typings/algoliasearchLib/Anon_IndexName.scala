package typings
package algoliasearchLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IndexName extends js.Object {
  var indexName: java.lang.String
  var params: algoliasearchLib.algoliasearchMod.algoliasearchNs.QueryParameters
  var query: java.lang.String
}

object Anon_IndexName {
  @scala.inline
  def apply(
    indexName: java.lang.String,
    params: algoliasearchLib.algoliasearchMod.algoliasearchNs.QueryParameters,
    query: java.lang.String
  ): Anon_IndexName = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("indexName")(indexName)
    __obj.updateDynamic("params")(params)
    __obj.updateDynamic("query")(query)
    __obj.asInstanceOf[Anon_IndexName]
  }
}

