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

