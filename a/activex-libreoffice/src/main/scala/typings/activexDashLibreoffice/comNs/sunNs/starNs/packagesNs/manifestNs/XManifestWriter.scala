package typings.activexDashLibreoffice.comNs.sunNs.starNs.packagesNs.manifestNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.PropertyValue
import typings.activexDashLibreoffice.comNs.sunNs.starNs.ioNs.XOutputStream
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interface writes the manifest data to a file. The user calls {@link writeManifestSequence()} with the XOutputStream to write the data to and the
  * sequence of manifest entries to be written passed as parameters. Each manifest entry is represented by a sequence of PropertyValues.
  */
trait XManifestWriter extends XInterface {
  /** Writes the supplied sequence of manifest entries to the supplied XOutputStream */
  def writeManifestSequence(rStream: XOutputStream, rSequence: SeqEquiv[SeqEquiv[PropertyValue]]): Unit
}

object XManifestWriter {
  @scala.inline
  def apply(
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    writeManifestSequence: (XOutputStream, SeqEquiv[SeqEquiv[PropertyValue]]) => Unit
  ): XManifestWriter = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), writeManifestSequence = js.Any.fromFunction2(writeManifestSequence))
  
    __obj.asInstanceOf[XManifestWriter]
  }
}

