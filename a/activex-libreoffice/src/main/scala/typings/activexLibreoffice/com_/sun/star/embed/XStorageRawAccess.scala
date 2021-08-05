package typings.activexLibreoffice.com_.sun.star.embed

import typings.activexLibreoffice.com_.sun.star.io.XInputStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This interface represents main storage functionality. */
trait XStorageRawAccess extends StObject {
  
  /**
    * allows to get a plain raw stream representing a package stream.
    *
    * This method returns a stream from the package as it is stored there, without any decompression/description and etc. This method can be helpful to
    * check file consistency, for example by signing.
    * @param sStreamName the name of the substream that should be open
    * @returns the raw representation of encrypted stream with all the data required to copy the stream without information loss
    * @throws com::sun::star::embed::InvalidStorageException this storage is in invalid state for any reason
    * @throws com::sun::star::lang::IllegalArgumentException one of provided arguments is illegal
    * @throws com::sun::star::container::NoSuchElementException there is no element with specified name
    * @throws com::sun::star::io::IOException in case of io errors during stream opening
    * @throws com::sun::star::embed::StorageWrappedTargetException wraps other exceptions
    */
  def getPlainRawStreamElement(sStreamName: String): XInputStream
  
  /**
    * allows to get a raw stream representing encrypted stream with header.
    *
    * This method allows to transport encrypted streams without decryption. Mainly this method is introduced to allow to copy one encrypted storage stream
    * to another without decryption. It is not recommended to use this method outside of storage implementation since different storages implementation
    * could have different encryption format. If the method is used outside of storage implementation the user code is responsible to get sure that the raw
    * format of source and target storages is the same.
    *
    * The difference of this method from the previous one is that it handles only encrypted streams. The contents of returned by these methods streams can
    * differ for the same entry, since this method can add additional data into the stream to allow successful insertion.
    * @param sStreamName the name of the substream that should be open
    * @throws com::sun::star::embed::InvalidStorageException this storage is in invalid state for any reason
    * @throws com::sun::star::lang::IllegalArgumentException one of provided arguments is illegal
    * @throws com::sun::star::packages::NoEncryptionException the stream is not an encrypted one
    * @throws com::sun::star::container::NoSuchElementException there is no element with specified name
    * @throws com::sun::star::io::IOException in case of io errors during stream opening
    * @throws com::sun::star::embed::StorageWrappedTargetException wraps other exceptions
    */
  def getRawEncrStreamElement(sStreamName: String): XInputStream
  
  /**
    * allows to insert a raw stream representing encrypted stream with header.
    *
    * This method allows to insert a stream retrieved by {@link XStorageRawAccess.getRawEncrStreamElement()} into a storage.
    *
    * This method allows to transport encrypted streams without decryption. Mainly this method is introduced to allow to copy one encrypted storage stream
    * to another without decryption. It is not recommended to use this method outside of storage implementation since different storages implementation
    * could have different encryption format.
    * @param sStreamName the name of the substream that should be open
    * @param xInStream a raw stream representing encrypted stream
    * @throws com::sun::star::embed::InvalidStorageException this storage is in invalid state for any reason
    * @throws com::sun::star::lang::IllegalArgumentException one of provided arguments is illegal
    * @throws com::sun::star::packages::NoRawFormatException the stream is not one of raw package stream format
    * @throws com::sun::star::container::ElementExistException an element with specified name already exists
    * @throws com::sun::star::io::IOException in case of io errors during stream opening
    * @throws com::sun::star::embed::StorageWrappedTargetException wraps other exceptions
    */
  def insertRawEncrStreamElement(sStreamName: String, xInStream: XInputStream): Unit
}
object XStorageRawAccess {
  
  inline def apply(
    getPlainRawStreamElement: String => XInputStream,
    getRawEncrStreamElement: String => XInputStream,
    insertRawEncrStreamElement: (String, XInputStream) => Unit
  ): XStorageRawAccess = {
    val __obj = js.Dynamic.literal(getPlainRawStreamElement = js.Any.fromFunction1(getPlainRawStreamElement), getRawEncrStreamElement = js.Any.fromFunction1(getRawEncrStreamElement), insertRawEncrStreamElement = js.Any.fromFunction2(insertRawEncrStreamElement))
    __obj.asInstanceOf[XStorageRawAccess]
  }
  
  extension [Self <: XStorageRawAccess](x: Self) {
    
    inline def setGetPlainRawStreamElement(value: String => XInputStream): Self = StObject.set(x, "getPlainRawStreamElement", js.Any.fromFunction1(value))
    
    inline def setGetRawEncrStreamElement(value: String => XInputStream): Self = StObject.set(x, "getRawEncrStreamElement", js.Any.fromFunction1(value))
    
    inline def setInsertRawEncrStreamElement(value: (String, XInputStream) => Unit): Self = StObject.set(x, "insertRawEncrStreamElement", js.Any.fromFunction2(value))
  }
}
