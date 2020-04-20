package typings.angularCore.updateRecorderMod

import typings.angularCore.importManagerMod.ImportManagerUpdateRecorder
import typings.typescript.mod.ClassDeclaration
import typings.typescript.mod.Decorator
import typings.typescript.mod.NamedImports
import typings.typescript.mod.ObjectLiteralExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateRecorder extends ImportManagerUpdateRecorder {
  def addClassDecorator(node: ClassDeclaration, text: String, className: String): Unit
  def commitUpdate(): Unit
  def replaceDecorator(node: Decorator, newText: String, className: String): Unit
  def updateObjectLiteral(node: ObjectLiteralExpression, newText: String): Unit
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
}

