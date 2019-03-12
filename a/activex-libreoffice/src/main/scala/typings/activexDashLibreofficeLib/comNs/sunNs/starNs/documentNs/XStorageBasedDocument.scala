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

object XStorageBasedDocument {
  @scala.inline
  def apply(
    DocumentStorage: activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XStorage,
    acquire: () => scala.Unit,
    addStorageChangeListener: XStorageChangeListener => scala.Unit,
    getDocumentStorage: () => activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XStorage,
    loadFromStorage: (activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XStorage, activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]) => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeStorageChangeListener: XStorageChangeListener => scala.Unit,
    storeToStorage: (activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XStorage, activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]) => scala.Unit,
    switchToStorage: activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XStorage => scala.Unit
  ): XStorageBasedDocument = {
    val __obj = js.Dynamic.literal(DocumentStorage = DocumentStorage, acquire = js.Any.fromFunction0(acquire), addStorageChangeListener = js.Any.fromFunction1(addStorageChangeListener), getDocumentStorage = js.Any.fromFunction0(getDocumentStorage), loadFromStorage = js.Any.fromFunction2(loadFromStorage), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeStorageChangeListener = js.Any.fromFunction1(removeStorageChangeListener), storeToStorage = js.Any.fromFunction2(storeToStorage), switchToStorage = js.Any.fromFunction1(switchToStorage))
  
    __obj.asInstanceOf[XStorageBasedDocument]
  }
}

