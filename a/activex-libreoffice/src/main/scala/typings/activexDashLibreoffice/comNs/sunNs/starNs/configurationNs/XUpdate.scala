package typings.activexDashLibreoffice.comNs.sunNs.starNs.configurationNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XUpdate extends js.Object {
  def insertExtensionXcsFile(shared: Boolean, fileUri: String): Unit
  def insertExtensionXcuFile(shared: Boolean, fileUri: String): Unit
  def insertModificationXcuFile(fileUri: String, includedPaths: SeqEquiv[String], excludedPaths: SeqEquiv[String]): Unit
  def removeExtensionXcuFile(fileUri: String): Unit
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
}

