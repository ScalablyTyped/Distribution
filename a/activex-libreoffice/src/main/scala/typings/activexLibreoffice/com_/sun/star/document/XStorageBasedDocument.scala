package typings.activexLibreoffice.com_.sun.star.document

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.embed.XStorage
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** allows to initialize document with a storage, to store document to a storage, and to set document to be based on provided storage. */
@js.native
trait XStorageBasedDocument extends XInterface {
  
  /** allows to get the storage the document is based on. */
  val DocumentStorage: XStorage = js.native
  
  /** allows to register a listener that will be notified when another storage is set to the document. */
  def addStorageChangeListener(xListener: XStorageChangeListener): Unit = js.native
  
  /** allows to get the storage the document is based on. */
  def getDocumentStorage(): XStorage = js.native
  
  /** lets the document load itself using provided storage. */
  def loadFromStorage(xStorage: XStorage, aMediaDescriptor: SeqEquiv[PropertyValue]): Unit = js.native
  
  /** allows to deregister the listener. */
  def removeStorageChangeListener(xListener: XStorageChangeListener): Unit = js.native
  
  /** lets the document store itself to the provided storage. */
  def storeToStorage(xStorage: XStorage, aMediaDescriptor: SeqEquiv[PropertyValue]): Unit = js.native
  
  /** allows to switch the document to the provided storage. */
  def switchToStorage(xStorage: XStorage): Unit = js.native
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
  
  @scala.inline
  implicit class XStorageBasedDocumentOps[Self <: XStorageBasedDocument] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDocumentStorage(value: XStorage): Self = this.set("DocumentStorage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddStorageChangeListener(value: XStorageChangeListener => Unit): Self = this.set("addStorageChangeListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetDocumentStorage(value: () => XStorage): Self = this.set("getDocumentStorage", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLoadFromStorage(value: (XStorage, SeqEquiv[PropertyValue]) => Unit): Self = this.set("loadFromStorage", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRemoveStorageChangeListener(value: XStorageChangeListener => Unit): Self = this.set("removeStorageChangeListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStoreToStorage(value: (XStorage, SeqEquiv[PropertyValue]) => Unit): Self = this.set("storeToStorage", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSwitchToStorage(value: XStorage => Unit): Self = this.set("switchToStorage", js.Any.fromFunction1(value))
  }
}
