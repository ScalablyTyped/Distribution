package typings.angularCore.importManagerMod

import typings.typescript.mod.NamedImports
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImportManagerUpdateRecorder extends js.Object {
  def addNewImport(start: Double, importText: String): Unit
  def updateExistingImport(namedBindings: NamedImports, newNamedBindings: String): Unit
}

object ImportManagerUpdateRecorder {
  @scala.inline
  def apply(addNewImport: (Double, String) => Unit, updateExistingImport: (NamedImports, String) => Unit): ImportManagerUpdateRecorder = {
    val __obj = js.Dynamic.literal(addNewImport = js.Any.fromFunction2(addNewImport), updateExistingImport = js.Any.fromFunction2(updateExistingImport))
    __obj.asInstanceOf[ImportManagerUpdateRecorder]
  }
}

