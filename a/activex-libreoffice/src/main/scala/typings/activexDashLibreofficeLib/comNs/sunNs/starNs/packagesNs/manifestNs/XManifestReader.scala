package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.packagesNs.manifestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interface reads the manifest data from a file. The user must supply an XInputStream when calling {@link readManifestSequence()} to receive a
  * sequence of manifest entries. Each manifest entry is represented by a sequence of PropertyValues.
  */
trait XManifestReader
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** Supplies the {@link XManifestReader} with an XInputStream to read from, reads the data and returns it to the caller. */
  def readManifestSequence(rStream: activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream): activexDashInteropLib.SafeArray[
    activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  ]
}

object XManifestReader {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    readManifestSequence: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream, 
      activexDashInteropLib.SafeArray[
        activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
      ]
    ],
    release: js.Function0[scala.Unit]
  ): XManifestReader = {
    val __obj = js.Dynamic.literal(acquire = acquire, queryInterface = queryInterface, readManifestSequence = readManifestSequence, release = release)
  
    __obj.asInstanceOf[XManifestReader]
  }
}

