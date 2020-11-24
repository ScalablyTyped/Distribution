package typings.angularCore.missingInjectableUpdateRecorderMod

import typings.angularCore.importManagerMod.ImportManagerUpdateRecorder
import typings.typescript.mod.ClassDeclaration
import typings.typescript.mod.Decorator
import typings.typescript.mod.NamedImports
import typings.typescript.mod.ObjectLiteralExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateRecorder extends ImportManagerUpdateRecorder {
  
  def addClassDecorator(node: ClassDeclaration, text: String, className: String): Unit = js.native
  
  def commitUpdate(): Unit = js.native
  
  def replaceDecorator(node: Decorator, newText: String, className: String): Unit = js.native
  
  def updateObjectLiteral(node: ObjectLiteralExpression, newText: String): Unit = js.native
}
object UpdateRecorder {
  
  @scala.inline
  def apply(
    addClassDecorator: (ClassDeclaration, String, String) => Unit,
    addNewImport: (Double, String) => Unit,
    commitUpdate: () => Unit,
    replaceDecorator: (Decorator, String, String) => Unit,
    updateExistingImport: (NamedImports, String) => Unit,
    updateObjectLiteral: (ObjectLiteralExpression, String) => Unit
  ): UpdateRecorder = {
    val __obj = js.Dynamic.literal(addClassDecorator = js.Any.fromFunction3(addClassDecorator), addNewImport = js.Any.fromFunction2(addNewImport), commitUpdate = js.Any.fromFunction0(commitUpdate), replaceDecorator = js.Any.fromFunction3(replaceDecorator), updateExistingImport = js.Any.fromFunction2(updateExistingImport), updateObjectLiteral = js.Any.fromFunction2(updateObjectLiteral))
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
    def setAddClassDecorator(value: (ClassDeclaration, String, String) => Unit): Self = this.set("addClassDecorator", js.Any.fromFunction3(value))
    
    @scala.inline
    def setCommitUpdate(value: () => Unit): Self = this.set("commitUpdate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReplaceDecorator(value: (Decorator, String, String) => Unit): Self = this.set("replaceDecorator", js.Any.fromFunction3(value))
    
    @scala.inline
    def setUpdateObjectLiteral(value: (ObjectLiteralExpression, String) => Unit): Self = this.set("updateObjectLiteral", js.Any.fromFunction2(value))
  }
}
