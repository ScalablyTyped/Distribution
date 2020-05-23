package typings.activexLibreoffice.com_.sun.star.document

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.embed.XStorage
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** allows to initialize document with a storage, to store document to a storage, and to set document to be based on provided storage. */
trait XStorageBasedDocument extends XInterface {
  /** allows to get the storage the document is based on. */
  val DocumentStorage: XStorage
  /** allows to register a listener that will be notified when another storage is set to the document. */
  def addStorageChangeListener(xListener: XStorageChangeListener): Unit
  /** allows to get the storage the document is based on. */
  def getDocumentStorage(): XStorage
  /** lets the document load itself using provided storage. */
  def loadFromStorage(xStorage: XStorage, aMediaDescriptor: SeqEquiv[PropertyValue]): Unit
  /** allows to deregister the listener. */
  def removeStorageChangeListener(xListener: XStorageChangeListener): Unit
  /** lets the document store itself to the provided storage. */
  def storeToStorage(xStorage: XStorage, aMediaDescriptor: SeqEquiv[PropertyValue]): Unit
  /** allows to switch the document to the provided storage. */
  def switchToStorage(xStorage: XStorage): Unit
}

object XStorageBasedDocument {
  @scala.inline
  def apply(
    DocumentStorage: XStorage,
    acquire: () => Unit,
    addStorageChangeListener: XStorageChangeListener => Unit,
    getDocumentStorage: () => XStorage,
    loadFromStorage: (XStorage, SeqEquiv[PropertyValue]) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeStorageChangeListener: XStorageChangeListener => Unit,
    storeToStorage: (XStorage, SeqEquiv[PropertyValue]) => Unit,
    switchToStorage: XStorage => Unit
  ): XStorageBasedDocument = {
    val __obj = js.Dynamic.literal(DocumentStorage = DocumentStorage.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addStorageChangeListener = js.Any.fromFunction1(addStorageChangeListener), getDocumentStorage = js.Any.fromFunction0(getDocumentStorage), loadFromStorage = js.Any.fromFunction2(loadFromStorage), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeStorageChangeListener = js.Any.fromFunction1(removeStorageChangeListener), storeToStorage = js.Any.fromFunction2(storeToStorage), switchToStorage = js.Any.fromFunction1(switchToStorage))
    __obj.asInstanceOf[XStorageBasedDocument]
  }
}

