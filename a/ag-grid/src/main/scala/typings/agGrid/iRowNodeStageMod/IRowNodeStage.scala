package typings.agGrid.iRowNodeStageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IRowNodeStage extends js.Object {
  
  def execute(params: StageExecuteParams): js.Any = js.native
}
object IRowNodeStage {
  
  @scala.inline
  def apply(execute: StageExecuteParams => js.Any): IRowNodeStage = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute))
    __obj.asInstanceOf[IRowNodeStage]
  }
  
  @scala.inline
  implicit class IRowNodeStageOps[Self <: IRowNodeStage] (val x: Self) extends AnyVal {
    
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
    def setExecute(value: StageExecuteParams => js.Any): Self = this.set("execute", js.Any.fromFunction1(value))
  }
}
