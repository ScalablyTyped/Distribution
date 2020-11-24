package typings.atlaskitTree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TreeItemMutation extends js.Object {
  
  var children: js.UndefOr[js.Array[ItemId]] = js.native
  
  var data: js.UndefOr[TreeItemData] = js.native
  
  var hasChildren: js.UndefOr[Boolean] = js.native
  
  var id: js.UndefOr[ItemId] = js.native
  
  var isChildrenLoading: js.UndefOr[Boolean] = js.native
  
  var isExpanded: js.UndefOr[Boolean] = js.native
}
object TreeItemMutation {
  
  @scala.inline
  def apply(): TreeItemMutation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreeItemMutation]
  }
  
  @scala.inline
  implicit class TreeItemMutationOps[Self <: TreeItemMutation] (val x: Self) extends AnyVal {
    
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
    def setChildrenVarargs(value: ItemId*): Self = this.set("children", js.Array(value :_*))
    
    @scala.inline
    def setChildren(value: js.Array[ItemId]): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setData(value: TreeItemData): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setHasChildren(value: Boolean): Self = this.set("hasChildren", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasChildren: Self = this.set("hasChildren", js.undefined)
    
    @scala.inline
    def setId(value: ItemId): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setIsChildrenLoading(value: Boolean): Self = this.set("isChildrenLoading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsChildrenLoading: Self = this.set("isChildrenLoading", js.undefined)
    
    @scala.inline
    def setIsExpanded(value: Boolean): Self = this.set("isExpanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsExpanded: Self = this.set("isExpanded", js.undefined)
  }
}
