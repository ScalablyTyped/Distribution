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
    acquire: js.Function0[scala.Unit],
    addStorageChangeListener: js.Function1[XStorageChangeListener, scala.Unit],
    getDocumentStorage: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XStorage],
    loadFromStorage: js.Function2[
      activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XStorage, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], 
      scala.Unit
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeStorageChangeListener: js.Function1[XStorageChangeListener, scala.Unit],
    storeToStorage: js.Function2[
      activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XStorage, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], 
      scala.Unit
    ],
    switchToStorage: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XStorage, scala.Unit]
  ): XStorageBasedDocument = {
    val __obj = js.Dynamic.literal(DocumentStorage = DocumentStorage, acquire = acquire, addStorageChangeListener = addStorageChangeListener, getDocumentStorage = getDocumentStorage, loadFromStorage = loadFromStorage, queryInterface = queryInterface, release = release, removeStorageChangeListener = removeStorageChangeListener, storeToStorage = storeToStorage, switchToStorage = switchToStorage)
  
    __obj.asInstanceOf[XStorageBasedDocument]
  }
}

