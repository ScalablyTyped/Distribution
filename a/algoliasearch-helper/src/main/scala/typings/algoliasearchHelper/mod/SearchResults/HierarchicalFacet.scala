package typings.algoliasearchHelper.mod.SearchResults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HierarchicalFacet extends js.Object {
  var count: Double = js.native
  var data: js.Array[HierarchicalFacet] = js.native
  var isRefined: Boolean = js.native
  var name: String = js.native
  var path: String = js.native
}

object HierarchicalFacet {
  @scala.inline
  def apply(count: Double, data: js.Array[HierarchicalFacet], isRefined: Boolean, name: String, path: String): HierarchicalFacet = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], isRefined = isRefined.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[HierarchicalFacet]
  }
  @scala.inline
  implicit class HierarchicalFacetOps[Self <: HierarchicalFacet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataVarargs(value: HierarchicalFacet*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[HierarchicalFacet]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsRefined(value: Boolean): Self = this.set("isRefined", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
  }
  
}

