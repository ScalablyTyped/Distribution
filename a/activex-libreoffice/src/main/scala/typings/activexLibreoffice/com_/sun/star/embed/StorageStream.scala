package typings.activexLibreoffice.com_.sun.star.embed

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typings.activexLibreoffice.com_.sun.star.io.XInputStream
import typings.activexLibreoffice.com_.sun.star.io.XOutputStream
import typings.activexLibreoffice.com_.sun.star.io.XSeekable
import typings.activexLibreoffice.com_.sun.star.io.XStream
import typings.activexLibreoffice.com_.sun.star.lang.XComponent
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a service that represents a stream that can be provided by {@link XStorage.openStreamElement()} call implemented by {@link Storage} service.
  *
  * In case a stream is open with read-write access only one instance of the stream can exist.
  */
trait StorageStream
  extends StObject
     with XStream
     with XComponent
     with XPropertySet
     with XSeekable
     with XEncryptionProtectedSource {
  
  /** specifies if the stream should be compressed next time it is stored. */
  var IsCompressed: Boolean
  
  /**
    * allows to detect if the stream is encrypted.
    *
    * The property value `TRUE` means that the stream is currently encrypted. `FALSE` - the stream is not encrypted.
    *
    * If somebody sets a password explicitly by using {@link XEncryptionProtectedSource} interface the value is automatically set to `TRUE` . If the
    * interface is used to remove the encryption - the value is automatically set to `FALSE` .
    */
  var IsEncrypted: Boolean
  
  /** allows to get and set media type of the stream. */
  var MediaType: String
  
  /** allows to detect size of the stream in bytes. */
  var Size: Double
  
  /**
    * specifies whether the stream will become encrypted next time the common storage password holder is committed.
    *
    * The property value `TRUE` means that the stream will become encrypted after the closest storage in the parent hierarchy, that has common storage
    * password, is committed. `FALSE` - the stream will not react to commit of such a storage.
    *
    * In case stream is not encrypted and the property is set to `TRUE` , the stream will stay non-encrypted until the closest storage in the parent
    * hierarchy, that has common storage password, is committed. On the commit the stream will be encrypted with the common storage password. If there is no
    * such storage in the hierarchy the stream will not be encrypted at all. Thus this property must be set very carefully.
    *
    * If somebody sets a password explicitly by using {@link XEncryptionProtectedSource} interface the value is automatically set to `FALSE` and the stream
    * becomes encrypted with specified password immediately.
    *
    * In case stream is encrypted one and the value is set to `TRUE` the stream becomes non-encrypted until the common storage password holder is committed.
    * The data about previously set password ( if any ) will be removed and the stream can be accessed as non-encrypted stream.
    */
  var UseCommonStoragePasswordEncryption: Boolean
}
object StorageStream {
  
  inline def apply(
    InputStream: XInputStream,
    IsCompressed: Boolean,
    IsEncrypted: Boolean,
    Length: Double,
    MediaType: String,
    OutputStream: XOutputStream,
    Position: Double,
    PropertySetInfo: XPropertySetInfo,
    Size: Double,
    UseCommonStoragePasswordEncryption: Boolean,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    dispose: () => Unit,
    getInputStream: () => XInputStream,
    getLength: () => Double,
    getOutputStream: () => XOutputStream,
    getPosition: () => Double,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => Any,
    queryInterface: `type` => Any,
    release: () => Unit,
    removeEncryption: () => Unit,
    removeEventListener: XEventListener => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    seek: Double => Unit,
    setEncryptionPassword: String => Unit,
    setPropertyValue: (String, Any) => Unit
  ): StorageStream = {
    val __obj = js.Dynamic.literal(InputStream = InputStream.asInstanceOf[js.Any], IsCompressed = IsCompressed.asInstanceOf[js.Any], IsEncrypted = IsEncrypted.asInstanceOf[js.Any], Length = Length.asInstanceOf[js.Any], MediaType = MediaType.asInstanceOf[js.Any], OutputStream = OutputStream.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], UseCommonStoragePasswordEncryption = UseCommonStoragePasswordEncryption.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), dispose = js.Any.fromFunction0(dispose), getInputStream = js.Any.fromFunction0(getInputStream), getLength = js.Any.fromFunction0(getLength), getOutputStream = js.Any.fromFunction0(getOutputStream), getPosition = js.Any.fromFunction0(getPosition), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEncryption = js.Any.fromFunction0(removeEncryption), removeEventListener = js.Any.fromFunction1(removeEventListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), seek = js.Any.fromFunction1(seek), setEncryptionPassword = js.Any.fromFunction1(setEncryptionPassword), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
    __obj.asInstanceOf[StorageStream]
  }
  
  extension [Self <: StorageStream](x: Self) {
    
    inline def setIsCompressed(value: Boolean): Self = StObject.set(x, "IsCompressed", value.asInstanceOf[js.Any])
    
    inline def setIsEncrypted(value: Boolean): Self = StObject.set(x, "IsEncrypted", value.asInstanceOf[js.Any])
    
    inline def setMediaType(value: String): Self = StObject.set(x, "MediaType", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "Size", value.asInstanceOf[js.Any])
    
    inline def setUseCommonStoragePasswordEncryption(value: Boolean): Self = StObject.set(x, "UseCommonStoragePasswordEncryption", value.asInstanceOf[js.Any])
  }
}
