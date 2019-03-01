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
    acquire: js.Function0[scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    writeManifestSequence: js.Function2[
      activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XOutputStream, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[
        activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
      ], 
      scala.Unit
    ]
  ): XManifestWriter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("writeManifestSequence")(writeManifestSequence)
    __obj.asInstanceOf[XManifestWriter]
  }
}

