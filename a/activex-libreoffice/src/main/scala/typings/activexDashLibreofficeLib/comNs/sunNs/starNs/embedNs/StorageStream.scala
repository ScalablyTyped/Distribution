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
    acquire: js.Function0[scala.Unit],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    addPropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    addVetoableChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener, 
      scala.Unit
    ],
    dispose: js.Function0[scala.Unit],
    getInputStream: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream],
    getLength: js.Function0[scala.Double],
    getOutputStream: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XOutputStream],
    getPosition: js.Function0[scala.Double],
    getPropertySetInfo: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo],
    getPropertyValue: js.Function1[java.lang.String, js.Any],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeEncryption: js.Function0[scala.Unit],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    removePropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    removeVetoableChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener, 
      scala.Unit
    ],
    seek: js.Function1[scala.Double, scala.Unit],
    setEncryptionPassword: js.Function1[java.lang.String, scala.Unit],
    setPropertyValue: js.Function2[java.lang.String, js.Any, scala.Unit]
  ): StorageStream = {
    val __obj = js.Dynamic.literal(InputStream = InputStream, IsCompressed = IsCompressed, IsEncrypted = IsEncrypted, Length = Length, MediaType = MediaType, OutputStream = OutputStream, Position = Position, PropertySetInfo = PropertySetInfo, Size = Size, UseCommonStoragePasswordEncryption = UseCommonStoragePasswordEncryption, acquire = acquire, addEventListener = addEventListener, addPropertyChangeListener = addPropertyChangeListener, addVetoableChangeListener = addVetoableChangeListener, dispose = dispose, getInputStream = getInputStream, getLength = getLength, getOutputStream = getOutputStream, getPosition = getPosition, getPropertySetInfo = getPropertySetInfo, getPropertyValue = getPropertyValue, queryInterface = queryInterface, release = release, removeEncryption = removeEncryption, removeEventListener = removeEventListener, removePropertyChangeListener = removePropertyChangeListener, removeVetoableChangeListener = removeVetoableChangeListener, seek = seek, setEncryptionPassword = setEncryptionPassword, setPropertyValue = setPropertyValue)
  
    __obj.asInstanceOf[StorageStream]
  }
}

