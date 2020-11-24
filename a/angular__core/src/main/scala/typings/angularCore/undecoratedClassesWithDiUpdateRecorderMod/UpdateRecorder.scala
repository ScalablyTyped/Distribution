package typings.angularCore.undecoratedClassesWithDiUpdateRecorderMod

import typings.angularCore.importManagerMod.ImportManagerUpdateRecorder
import typings.typescript.mod.ClassDeclaration
import typings.typescript.mod.NamedImports
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateRecorder extends ImportManagerUpdateRecorder {
  
  def addClassComment(node: ClassDeclaration, text: String): Unit = js.native
  
  def addClassDecorator(node: ClassDeclaration, text: String): Unit = js.native
  
  def commitUpdate(): Unit = js.native
}
object UpdateRecorder {
  
  @scala.inline
  def apply(
    addClassComment: (ClassDeclaration, String) => Unit,
    addClassDecorator: (ClassDeclaration, String) => Unit,
    addNewImport: (Double, String) => Unit,
    commitUpdate: () => Unit,
    updateExistingImport: (NamedImports, String) => Unit
  ): UpdateRecorder = {
    val __obj = js.Dynamic.literal(addClassComment = js.Any.fromFunction2(addClassComment), addClassDecorator = js.Any.fromFunction2(addClassDecorator), addNewImport = js.Any.fromFunction2(addNewImport), commitUpdate = js.Any.fromFunction0(commitUpdate), updateExistingImport = js.Any.fromFunction2(updateExistingImport))
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
    def setAddClassComment(value: (ClassDeclaration, String) => Unit): Self = this.set("addClassComment", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAddClassDecorator(value: (ClassDeclaration, String) => Unit): Self = this.set("addClassDecorator", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCommitUpdate(value: () => Unit): Self = this.set("commitUpdate", js.Any.fromFunction0(value))
  }
}
