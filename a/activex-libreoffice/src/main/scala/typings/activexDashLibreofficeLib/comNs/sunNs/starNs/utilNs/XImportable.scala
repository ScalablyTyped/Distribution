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

object XImportable {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    createImportDescriptor: js.Function1[
      scala.Boolean, 
      activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
    ],
    doImport: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], 
      scala.Unit
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XImportable = {
    val __obj = js.Dynamic.literal(acquire = acquire, createImportDescriptor = createImportDescriptor, doImport = doImport, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XImportable]
  }
}

