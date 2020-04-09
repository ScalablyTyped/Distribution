package typings.angularCore.undecoratedClassesWithDiUpdateRecorderMod

import typings.angularCore.importManagerMod.ImportManagerUpdateRecorder
import typings.typescript.mod.ClassDeclaration
import typings.typescript.mod.NamedImports
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateRecorder extends ImportManagerUpdateRecorder {
  def addClassComment(node: ClassDeclaration, text: String): Unit
  def addClassDecorator(node: ClassDeclaration, text: String): Unit
  def commitUpdate(): Unit
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
}

