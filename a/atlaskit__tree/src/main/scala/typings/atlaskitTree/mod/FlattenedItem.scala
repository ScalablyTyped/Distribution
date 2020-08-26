package typings.atlaskitTree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlattenedItem extends js.Object {
  var item: TreeItem = js.native
  var path: Path = js.native
}

object FlattenedItem {
  @scala.inline
  def apply(item: TreeItem, path: Path): FlattenedItem = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlattenedItem]
  }
  @scala.inline
  implicit class FlattenedItemOps[Self <: FlattenedItem] (val x: Self) extends AnyVal {
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
    def setItem(value: TreeItem): Self = this.set("item", value.asInstanceOf[js.Any])
    @scala.inline
    def setPathVarargs(value: Double*): Self = this.set("path", js.Array(value :_*))
    @scala.inline
    def setPath(value: Path): Self = this.set("path", value.asInstanceOf[js.Any])
  }
  
}

