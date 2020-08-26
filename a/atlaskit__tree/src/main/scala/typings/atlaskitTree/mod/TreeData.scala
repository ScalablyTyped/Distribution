package typings.atlaskitTree.mod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TreeData extends js.Object {
  var items: StringDictionary[TreeItem] with NumberDictionary[TreeItem] = js.native
  var rootId: ItemId = js.native
}

object TreeData {
  @scala.inline
  def apply(items: StringDictionary[TreeItem] with NumberDictionary[TreeItem], rootId: ItemId): TreeData = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], rootId = rootId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeData]
  }
  @scala.inline
  implicit class TreeDataOps[Self <: TreeData] (val x: Self) extends AnyVal {
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
    def setItems(value: StringDictionary[TreeItem] with NumberDictionary[TreeItem]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def setRootId(value: ItemId): Self = this.set("rootId", value.asInstanceOf[js.Any])
  }
  
}

