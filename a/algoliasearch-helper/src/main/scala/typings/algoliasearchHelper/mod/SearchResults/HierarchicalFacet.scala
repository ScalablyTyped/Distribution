package typings.algoliasearchHelper.mod.SearchResults

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
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], isRefined = isRefined.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HierarchicalFacet]
  }
}

