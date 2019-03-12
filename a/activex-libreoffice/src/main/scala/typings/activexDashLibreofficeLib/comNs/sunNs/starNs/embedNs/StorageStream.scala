package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a service that represents a stream that can be provided by {@link XStorage.openStreamElement()} call implemented by {@link Storage} service.
  *
  * In case a stream is open with read-write access only one instance of the stream can exist.
  */
trait StorageStream
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XStream
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
     with activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XSeekable
     with XEncryptionProtectedSource {
  /** specifies if the stream should be compressed next time it is stored. */
  var IsCompressed: scala.Boolean
  /**
    * allows to detect if the stream is encrypted.
    *
    * The property value `TRUE` means that the stream is currently encrypted. `FALSE` - the stream is not encrypted.
    *
    * If somebody sets a password explicitly by using {@link XEncryptionProtectedSource} interface the value is automatically set to `TRUE` . If the
    * interface is used to remove the encryption - the value is automatically set to `FALSE` .
    */
  var IsEncrypted: scala.Boolean
  /** allows to get and set media type of the stream. */
  var MediaType: java.lang.String
  /** allows to detect size of the stream in bytes. */
  var Size: scala.Double
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
  var UseCommonStoragePasswordEncryption: scala.Boolean
}

object StorageStream {
  @scala.inline
  def apply(
    InputStream: activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream,
    IsCompressed: scala.Boolean,
    IsEncrypted: scala.Boolean,
    Length: scala.Double,
    MediaType: java.lang.String,
    OutputStream: activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XOutputStream,
    Position: scala.Double,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    Size: scala.Double,
    UseCommonStoragePasswordEncryption: scala.Boolean,
    acquire: () => scala.Unit,
    addEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    addPropertyChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener) => scala.Unit,
    addVetoableChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener) => scala.Unit,
    dispose: () => scala.Unit,
    getInputStream: () => activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream,
    getLength: () => scala.Double,
    getOutputStream: () => activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XOutputStream,
    getPosition: () => scala.Double,
    getPropertySetInfo: () => activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    getPropertyValue: java.lang.String => js.Any,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeEncryption: () => scala.Unit,
    removeEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    removePropertyChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener) => scala.Unit,
    removeVetoableChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener) => scala.Unit,
    seek: scala.Double => scala.Unit,
    setEncryptionPassword: java.lang.String => scala.Unit,
    setPropertyValue: (java.lang.String, js.Any) => scala.Unit
  ): StorageStream = {
    val __obj = js.Dynamic.literal(InputStream = InputStream, IsCompressed = IsCompressed, IsEncrypted = IsEncrypted, Length = Length, MediaType = MediaType, OutputStream = OutputStream, Position = Position, PropertySetInfo = PropertySetInfo, Size = Size, UseCommonStoragePasswordEncryption = UseCommonStoragePasswordEncryption, acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), dispose = js.Any.fromFunction0(dispose), getInputStream = js.Any.fromFunction0(getInputStream), getLength = js.Any.fromFunction0(getLength), getOutputStream = js.Any.fromFunction0(getOutputStream), getPosition = js.Any.fromFunction0(getPosition), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEncryption = js.Any.fromFunction0(removeEncryption), removeEventListener = js.Any.fromFunction1(removeEventListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), seek = js.Any.fromFunction1(seek), setEncryptionPassword = js.Any.fromFunction1(setEncryptionPassword), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
  
    __obj.asInstanceOf[StorageStream]
  }
}

