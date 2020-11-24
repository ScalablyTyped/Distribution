package typings.angularCore.updateRecorderMod

import typings.typescript.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateRecorder extends js.Object {
  
  def commitUpdate(): Unit = js.native
  
  def updateNode(node: Node, newText: String): Unit = js.native
}
object UpdateRecorder {
  
  @scala.inline
  def apply(commitUpdate: () => Unit, updateNode: (Node, String) => Unit): UpdateRecorder = {
    val __obj = js.Dynamic.literal(commitUpdate = js.Any.fromFunction0(commitUpdate), updateNode = js.Any.fromFunction2(updateNode))
    __obj.asInstanceOf[UpdateRecorder]
  }
  
  @scala.inline
  implicit class UpdateRecorderOps[Self <: UpdateRecorder] (val x: Self) extends AnyVal {
    
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
    def setCommitUpdate(value: () => Unit): Self = this.set("commitUpdate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUpdateNode(value: (Node, String) => Unit): Self = this.set("updateNode", js.Any.fromFunction2(value))
  }
}
