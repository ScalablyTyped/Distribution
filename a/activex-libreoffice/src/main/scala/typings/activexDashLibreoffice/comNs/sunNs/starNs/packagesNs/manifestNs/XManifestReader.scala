package typings.activexDashLibreoffice.comNs.sunNs.starNs.packagesNs.manifestNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.PropertyValue
import typings.activexDashLibreoffice.comNs.sunNs.starNs.ioNs.XInputStream
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interface reads the manifest data from a file. The user must supply an XInputStream when calling {@link readManifestSequence()} to receive a
  * sequence of manifest entries. Each manifest entry is represented by a sequence of PropertyValues.
  */
trait XManifestReader extends XInterface {
  /** Supplies the {@link XManifestReader} with an XInputStream to read from, reads the data and returns it to the caller. */
  def readManifestSequence(rStream: XInputStream): SafeArray[SafeArray[PropertyValue]]
}

object XManifestReader {
  @scala.inline
  def apply(
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    readManifestSequence: XInputStream => SafeArray[SafeArray[PropertyValue]],
    release: () => Unit
  ): XManifestReader = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), readManifestSequence = js.Any.fromFunction1(readManifestSequence), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XManifestReader]
  }
}

