package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** makes it possible to import files into the object. */
trait XImportable
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** @returns a descriptor which contains the arguments for an import. */
  def createImportDescriptor(bEmpty: scala.Boolean): activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  /** imports data from an external database. */
  def doImport(
    aDescriptor: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  ): scala.Unit
}

