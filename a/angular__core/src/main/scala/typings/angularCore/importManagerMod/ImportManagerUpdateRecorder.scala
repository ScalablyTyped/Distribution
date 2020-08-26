package typings.angularCore.importManagerMod

import typings.typescript.mod.NamedImports
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImportManagerUpdateRecorder extends js.Object {
  def addNewImport(start: Double, importText: String): Unit = js.native
  def updateExistingImport(namedBindings: NamedImports, newNamedBindings: String): Unit = js.native
}

object ImportManagerUpdateRecorder {
  @scala.inline
  def apply(addNewImport: (Double, String) => Unit, updateExistingImport: (NamedImports, String) => Unit): ImportManagerUpdateRecorder = {
    val __obj = js.Dynamic.literal(addNewImport = js.Any.fromFunction2(addNewImport), updateExistingImport = js.Any.fromFunction2(updateExistingImport))
    __obj.asInstanceOf[ImportManagerUpdateRecorder]
  }
  @scala.inline
  implicit class ImportManagerUpdateRecorderOps[Self <: ImportManagerUpdateRecorder] (val x: Self) extends AnyVal {
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
    def setAddNewImport(value: (Double, String) => Unit): Self = this.set("addNewImport", js.Any.fromFunction2(value))
    @scala.inline
    def setUpdateExistingImport(value: (NamedImports, String) => Unit): Self = this.set("updateExistingImport", js.Any.fromFunction2(value))
  }
  
}

