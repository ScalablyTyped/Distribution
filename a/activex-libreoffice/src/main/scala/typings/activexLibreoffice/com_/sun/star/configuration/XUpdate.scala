package typings.activexLibreoffice.com_.sun.star.configuration

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XUpdate extends js.Object {
  def insertExtensionXcsFile(shared: Boolean, fileUri: String): Unit = js.native
  def insertExtensionXcuFile(shared: Boolean, fileUri: String): Unit = js.native
  def insertModificationXcuFile(fileUri: String, includedPaths: SeqEquiv[String], excludedPaths: SeqEquiv[String]): Unit = js.native
  def removeExtensionXcuFile(fileUri: String): Unit = js.native
}

object XUpdate {
  @scala.inline
  def apply(
    insertExtensionXcsFile: (Boolean, String) => Unit,
    insertExtensionXcuFile: (Boolean, String) => Unit,
    insertModificationXcuFile: (String, SeqEquiv[String], SeqEquiv[String]) => Unit,
    removeExtensionXcuFile: String => Unit
  ): XUpdate = {
    val __obj = js.Dynamic.literal(insertExtensionXcsFile = js.Any.fromFunction2(insertExtensionXcsFile), insertExtensionXcuFile = js.Any.fromFunction2(insertExtensionXcuFile), insertModificationXcuFile = js.Any.fromFunction3(insertModificationXcuFile), removeExtensionXcuFile = js.Any.fromFunction1(removeExtensionXcuFile))
    __obj.asInstanceOf[XUpdate]
  }
  @scala.inline
  implicit class XUpdateOps[Self <: XUpdate] (val x: Self) extends AnyVal {
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
    def setInsertExtensionXcsFile(value: (Boolean, String) => Unit): Self = this.set("insertExtensionXcsFile", js.Any.fromFunction2(value))
    @scala.inline
    def setInsertExtensionXcuFile(value: (Boolean, String) => Unit): Self = this.set("insertExtensionXcuFile", js.Any.fromFunction2(value))
    @scala.inline
    def setInsertModificationXcuFile(value: (String, SeqEquiv[String], SeqEquiv[String]) => Unit): Self = this.set("insertModificationXcuFile", js.Any.fromFunction3(value))
    @scala.inline
    def setRemoveExtensionXcuFile(value: String => Unit): Self = this.set("removeExtensionXcuFile", js.Any.fromFunction1(value))
  }
  
}

