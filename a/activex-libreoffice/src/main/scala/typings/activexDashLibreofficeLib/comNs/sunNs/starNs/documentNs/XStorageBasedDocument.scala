package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** allows to initialize document with a storage, to store document to a storage, and to set document to be based on provided storage. */
trait XStorageBasedDocument
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** allows to get the storage the document is based on. */
  val DocumentStorage: activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XStorage
  /** allows to register a listener that will be notified when another storage is set to the document. */
  def addStorageChangeListener(xListener: XStorageChangeListener): scala.Unit
  /** allows to get the storage the document is based on. */
  def getDocumentStorage(): activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XStorage
  /** lets the document load itself using provided storage. */
  def loadFromStorage(
    xStorage: activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XStorage,
    aMediaDescriptor: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  ): scala.Unit
  /** allows to deregister the listener. */
  def removeStorageChangeListener(xListener: XStorageChangeListener): scala.Unit
  /** lets the document store itself to the provided storage. */
  def storeToStorage(
    xStorage: activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XStorage,
    aMediaDescriptor: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  ): scala.Unit
  /** allows to switch the document to the provided storage. */
  def switchToStorage(xStorage: activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XStorage): scala.Unit
}

