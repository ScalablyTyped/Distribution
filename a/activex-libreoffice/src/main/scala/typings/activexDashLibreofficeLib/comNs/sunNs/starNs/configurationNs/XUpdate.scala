package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XUpdate extends js.Object {
  def insertExtensionXcsFile(shared: scala.Boolean, fileUri: java.lang.String): scala.Unit
  def insertExtensionXcuFile(shared: scala.Boolean, fileUri: java.lang.String): scala.Unit
  def insertModificationXcuFile(
    fileUri: java.lang.String,
    includedPaths: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String],
    excludedPaths: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String]
  ): scala.Unit
  def removeExtensionXcuFile(fileUri: java.lang.String): scala.Unit
}

object XUpdate {
  @scala.inline
  def apply(
    insertExtensionXcsFile: (scala.Boolean, java.lang.String) => scala.Unit,
    insertExtensionXcuFile: (scala.Boolean, java.lang.String) => scala.Unit,
    insertModificationXcuFile: (java.lang.String, activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String]) => scala.Unit,
    removeExtensionXcuFile: java.lang.String => scala.Unit
  ): XUpdate = {
    val __obj = js.Dynamic.literal(insertExtensionXcsFile = js.Any.fromFunction2(insertExtensionXcsFile), insertExtensionXcuFile = js.Any.fromFunction2(insertExtensionXcuFile), insertModificationXcuFile = js.Any.fromFunction3(insertModificationXcuFile), removeExtensionXcuFile = js.Any.fromFunction1(removeExtensionXcuFile))
  
    __obj.asInstanceOf[XUpdate]
  }
}

