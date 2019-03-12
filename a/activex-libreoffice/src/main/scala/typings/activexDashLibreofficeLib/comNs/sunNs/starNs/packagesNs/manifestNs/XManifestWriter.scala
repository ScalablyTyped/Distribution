package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.packagesNs.manifestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interface writes the manifest data to a file. The user calls {@link writeManifestSequence()} with the XOutputStream to write the data to and the
  * sequence of manifest entries to be written passed as parameters. Each manifest entry is represented by a sequence of PropertyValues.
  */
trait XManifestWriter
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** Writes the supplied sequence of manifest entries to the supplied XOutputStream */
  def writeManifestSequence(
    rStream: activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XOutputStream,
    rSequence: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
    ]
  ): scala.Unit
}

object XManifestWriter {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    writeManifestSequence: (activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XOutputStream, activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
    ]) => scala.Unit
  ): XManifestWriter = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), writeManifestSequence = js.Any.fromFunction2(writeManifestSequence))
  
    __obj.asInstanceOf[XManifestWriter]
  }
}

