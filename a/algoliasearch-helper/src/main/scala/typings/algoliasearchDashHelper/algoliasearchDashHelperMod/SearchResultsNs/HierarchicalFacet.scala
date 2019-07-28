package typings.algoliasearchDashHelper.algoliasearchDashHelperMod.SearchResultsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HierarchicalFacet extends js.Object {
  var count: Double
  var data: js.Array[HierarchicalFacet]
  var isRefined: Boolean
  var name: String
  var path: String
}

object HierarchicalFacet {
  @scala.inline
  def apply(count: Double, data: js.Array[HierarchicalFacet], isRefined: Boolean, name: String, path: String): HierarchicalFacet = {
    val __obj = js.Dynamic.literal(count = count, data = data, isRefined = isRefined, name = name, path = path)
  
    __obj.asInstanceOf[HierarchicalFacet]
  }
}

