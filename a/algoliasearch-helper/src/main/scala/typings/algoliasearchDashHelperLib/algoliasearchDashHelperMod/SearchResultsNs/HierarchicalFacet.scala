package typings
package algoliasearchDashHelperLib.algoliasearchDashHelperMod.SearchResultsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HierarchicalFacet extends js.Object {
  var count: scala.Double
  var data: js.Array[HierarchicalFacet]
  var isRefined: scala.Boolean
  var name: java.lang.String
  var path: java.lang.String
}

object HierarchicalFacet {
  @scala.inline
  def apply(
    count: scala.Double,
    data: js.Array[HierarchicalFacet],
    isRefined: scala.Boolean,
    name: java.lang.String,
    path: java.lang.String
  ): HierarchicalFacet = {
    val __obj = js.Dynamic.literal(count = count, data = data, isRefined = isRefined, name = name, path = path)
  
    __obj.asInstanceOf[HierarchicalFacet]
  }
}

