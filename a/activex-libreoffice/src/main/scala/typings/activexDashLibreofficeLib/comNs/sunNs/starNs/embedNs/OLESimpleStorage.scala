package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This service provides a simple functionality to allow read/write the storages in OLE storage format. */
trait OLESimpleStorage extends XOLESimpleStorage {
  /**
    * is used to initialize the object on it's creation.
    * @param xInputStream [in] the InputStream that contains data in OLE storage format.
    * @param bNoTempCopy [in] specifies whether a temporary copy should be created during substreams opening. If the copy is not created the storage must stay
    */
  def createFromInputStream(
    xInputStream: activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream,
    bNoTempCopy: scala.Boolean
  ): scala.Unit
  /**
    * is used to initialize the object on it's creation.
    * @param xStream [in] the Stream that contains data in OLE storage format.
    * @param bNoTempCopy [in] specifies whether a temporary copy should be created during substreams opening. If the copy is not created the storage must stay
    */
  def createFromStream(xStream: activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XStream, bNoTempCopy: scala.Boolean): scala.Unit
}

