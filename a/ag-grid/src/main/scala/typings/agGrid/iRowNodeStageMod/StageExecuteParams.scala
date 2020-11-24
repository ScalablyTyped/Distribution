package typings.agGrid.iRowNodeStageMod

import org.scalablytyped.runtime.StringDictionary
import typings.agGrid.changedPathMod.ChangedPath
import typings.agGrid.clientSideRowModelMod.RowNodeTransaction
import typings.agGrid.rowNodeMod.RowNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StageExecuteParams extends js.Object {
  
  var changedPath: js.UndefOr[ChangedPath] = js.native
  
  var rowNode: RowNode = js.native
  
  var rowNodeOrder: js.UndefOr[StringDictionary[Double]] = js.native
  
  var rowNodeTransaction: js.UndefOr[RowNodeTransaction] = js.native
}
object StageExecuteParams {
  
  @scala.inline
  def apply(rowNode: RowNode): StageExecuteParams = {
    val __obj = js.Dynamic.literal(rowNode = rowNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[StageExecuteParams]
  }
  
  @scala.inline
  implicit class StageExecuteParamsOps[Self <: StageExecuteParams] (val x: Self) extends AnyVal {
    
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
    def setRowNode(value: RowNode): Self = this.set("rowNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangedPath(value: ChangedPath): Self = this.set("changedPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChangedPath: Self = this.set("changedPath", js.undefined)
    
    @scala.inline
    def setRowNodeOrder(value: StringDictionary[Double]): Self = this.set("rowNodeOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowNodeOrder: Self = this.set("rowNodeOrder", js.undefined)
    
    @scala.inline
    def setRowNodeTransaction(value: RowNodeTransaction): Self = this.set("rowNodeTransaction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowNodeTransaction: Self = this.set("rowNodeTransaction", js.undefined)
  }
}
