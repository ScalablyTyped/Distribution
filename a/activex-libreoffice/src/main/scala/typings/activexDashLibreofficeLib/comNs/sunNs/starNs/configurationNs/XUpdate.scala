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
    insertExtensionXcsFile: js.Function2[scala.Boolean, java.lang.String, scala.Unit],
    insertExtensionXcuFile: js.Function2[scala.Boolean, java.lang.String, scala.Unit],
    insertModificationXcuFile: js.Function3[
      java.lang.String, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      scala.Unit
    ],
    removeExtensionXcuFile: js.Function1[java.lang.String, scala.Unit]
  ): XUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("insertExtensionXcsFile")(insertExtensionXcsFile)
    __obj.updateDynamic("insertExtensionXcuFile")(insertExtensionXcuFile)
    __obj.updateDynamic("insertModificationXcuFile")(insertModificationXcuFile)
    __obj.updateDynamic("removeExtensionXcuFile")(removeExtensionXcuFile)
    __obj.asInstanceOf[XUpdate]
  }
}

