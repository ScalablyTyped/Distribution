package typings.activexLibreoffice.com_.sun.star.embed

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.io.XInputStream
import typings.activexLibreoffice.com_.sun.star.io.XStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a temporary interface that is introduced to temporarily optimize the document storing process. PLEASE DO NOT USE IT, it might change in any
  * time and will be deprecated soon! Another solution will be introduced as final one.
  */
@js.native
trait XOptimizedStorage extends js.Object {
  
  /**
    * allows to switch storage persistence to the provided URL. The caller is responsible to be sure that the file referenced by the URL contains the same
    * contents as the stream the storage is based currently. Thus using of this method is very dangerous and should be avoided when possible. It is
    * applicable only for root storages.
    */
  def attachToURL(sURL: String, bReadOnly: Boolean): Unit = js.native
  
  /** allows to copy storage element directly, not guarantied to work. */
  def copyElementDirectlyTo(sSourceName: String, xTargetStorage: XOptimizedStorage, sTargetName: String): Unit = js.native
  
  /**
    * fills the provided stream with the last flushed version of data from the child stream of the storage.
    * @param sStreamName the name of the substream that should be copied
    * @param xTargetStream the target stream where the data must be copied to
    * @throws com::sun::star::embed::InvalidStorageException this storage is in invalid state for any reason
    * @throws com::sun::star::lang::IllegalArgumentException one of provided arguments is illegal
    * @throws com::sun::star::packages::WrongPasswordException the provided password is wrong
    * @throws com::sun::star::io::IOException in case of io errors during stream opening
    * @throws com::sun::star::embed::StorageWrappedTargetException wraps other exceptions
    */
  def copyStreamElementData(sStreamName: String, xTargetStream: XStream): Unit = js.native
  
  /**
    * allows to get property of the child element with the specified name. The implementation of the method might allow to access only subset of the
    * supported by element properties.
    */
  def getElementPropertyValue(sElementName: String, sPropertyName: String): js.Any = js.native
  
  /** allows to insert a raw stream representing non-encrypted stream with header. */
  def insertRawNonEncrStreamElementDirect(sStreamName: String, xInStream: XInputStream): Unit = js.native
  
  /** allows to insert a stream to the storage directly. The stream must stay alive till the storage is committed. */
  def insertStreamElementDirect(sStreamName: String, xInStream: XInputStream, aProperties: SeqEquiv[PropertyValue]): Unit = js.native
  
  /**
    * allows to switch storage persistence to the provided stream. The stream will be filled by the storage. If an empty reference is provided, the storage
    * will create a temporary stream to switch to itself. It is applicable only for root storages.
    */
  def writeAndAttachToStream(xStream: XStream): Unit = js.native
}
object XOptimizedStorage {
  
  @scala.inline
  def apply(
    attachToURL: (String, Boolean) => Unit,
    copyElementDirectlyTo: (String, XOptimizedStorage, String) => Unit,
    copyStreamElementData: (String, XStream) => Unit,
    getElementPropertyValue: (String, String) => js.Any,
    insertRawNonEncrStreamElementDirect: (String, XInputStream) => Unit,
    insertStreamElementDirect: (String, XInputStream, SeqEquiv[PropertyValue]) => Unit,
    writeAndAttachToStream: XStream => Unit
  ): XOptimizedStorage = {
    val __obj = js.Dynamic.literal(attachToURL = js.Any.fromFunction2(attachToURL), copyElementDirectlyTo = js.Any.fromFunction3(copyElementDirectlyTo), copyStreamElementData = js.Any.fromFunction2(copyStreamElementData), getElementPropertyValue = js.Any.fromFunction2(getElementPropertyValue), insertRawNonEncrStreamElementDirect = js.Any.fromFunction2(insertRawNonEncrStreamElementDirect), insertStreamElementDirect = js.Any.fromFunction3(insertStreamElementDirect), writeAndAttachToStream = js.Any.fromFunction1(writeAndAttachToStream))
    __obj.asInstanceOf[XOptimizedStorage]
  }
  
  @scala.inline
  implicit class XOptimizedStorageOps[Self <: XOptimizedStorage] (val x: Self) extends AnyVal {
    
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
    def setAttachToURL(value: (String, Boolean) => Unit): Self = this.set("attachToURL", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCopyElementDirectlyTo(value: (String, XOptimizedStorage, String) => Unit): Self = this.set("copyElementDirectlyTo", js.Any.fromFunction3(value))
    
    @scala.inline
    def setCopyStreamElementData(value: (String, XStream) => Unit): Self = this.set("copyStreamElementData", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetElementPropertyValue(value: (String, String) => js.Any): Self = this.set("getElementPropertyValue", js.Any.fromFunction2(value))
    
    @scala.inline
    def setInsertRawNonEncrStreamElementDirect(value: (String, XInputStream) => Unit): Self = this.set("insertRawNonEncrStreamElementDirect", js.Any.fromFunction2(value))
    
    @scala.inline
    def setInsertStreamElementDirect(value: (String, XInputStream, SeqEquiv[PropertyValue]) => Unit): Self = this.set("insertStreamElementDirect", js.Any.fromFunction3(value))
    
    @scala.inline
    def setWriteAndAttachToStream(value: XStream => Unit): Self = this.set("writeAndAttachToStream", js.Any.fromFunction1(value))
  }
}
