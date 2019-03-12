package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.packagesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Allows to get access to the stream of a {@link PackageStream} . */
trait XDataSinkEncrSupport
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Allows to get access to the data of the {@link PackageStream} .
    *
    * In case stream is encrypted one and the key for the stream is not set, an exception must be thrown.
    * @returns the stream
    * @throws com::sun::star::packages::WrongPasswordException no key or a wrong one is set
    * @throws com::sun::star::io::IOException in case of io problems during retrieving
    */
  var DataStream: activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream
  /**
    * Allows to get access to the raw data of the stream as it is stored in the package.
    * @returns the plain raw stream as it is stored in the package
    * @throws com::sun::star::packages::NoEncryptionException the {@link PackageStream} object is not encrypted
    * @throws com::sun::star::io::IOException in case of io problems during retrieving
    */
  val PlainRawStream: activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream
  /**
    * Allows to get access to the data of the {@link PackageStream} as to raw stream. In case stream is not encrypted an exception will be thrown.
    *
    * The difference of raw stream is that it contains header for encrypted data, so an encrypted stream can be copied from one {@link PackageStream} to
    * another one without decryption.
    * @returns the raw representation of stream
    * @throws com::sun::star::packages::NoEncryptionException the {@link PackageStream} object is not encrypted
    * @throws com::sun::star::io::IOException in case of io problems during retrieving
    */
  var RawStream: activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream
  /**
    * Allows to get access to the data of the {@link PackageStream} .
    *
    * In case stream is encrypted one and the key for the stream is not set, an exception must be thrown.
    * @returns the stream
    * @throws com::sun::star::packages::WrongPasswordException no key or a wrong one is set
    * @throws com::sun::star::io::IOException in case of io problems during retrieving
    */
  def getDataStream(): activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream
  /**
    * Allows to get access to the raw data of the stream as it is stored in the package.
    * @returns the plain raw stream as it is stored in the package
    * @throws com::sun::star::packages::NoEncryptionException the {@link PackageStream} object is not encrypted
    * @throws com::sun::star::io::IOException in case of io problems during retrieving
    */
  def getPlainRawStream(): activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream
  /**
    * Allows to get access to the data of the {@link PackageStream} as to raw stream. In case stream is not encrypted an exception will be thrown.
    *
    * The difference of raw stream is that it contains header for encrypted data, so an encrypted stream can be copied from one {@link PackageStream} to
    * another one without decryption.
    * @returns the raw representation of stream
    * @throws com::sun::star::packages::NoEncryptionException the {@link PackageStream} object is not encrypted
    * @throws com::sun::star::io::IOException in case of io problems during retrieving
    */
  def getRawStream(): activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream
  /**
    * Allows to set a data stream for the {@link PackageStream} .
    *
    * In case {@link PackageStream} is marked as encrypted the data stream will be encrypted on storing.
    * @param aStream new data stream
    * @throws com::sun::star::io::IOException in case of io problems
    */
  def setDataStream(aStream: activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream): scala.Unit
  /**
    * Allows to set raw stream for the {@link PackageStream} . The {@link PackageStream} object can not be marked as encrypted one, an exception will be
    * thrown in such case.
    * @param aStream the new raw representation of stream
    * @throws com::sun::star::packages::EncryptionNotAllowedException the {@link PackageStream} object is marked as encrypted
    * @throws com::sun::star::packages::NoRawFormatException the stream is not a correct raw representation of encrypted package stream
    * @throws com::sun::star::io::IOException in case of io problems during retrieving
    */
  def setRawStream(aStream: activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream): scala.Unit
}

object XDataSinkEncrSupport {
  @scala.inline
  def apply(
    DataStream: activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream,
    PlainRawStream: activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream,
    RawStream: activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream,
    acquire: () => scala.Unit,
    getDataStream: () => activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream,
    getPlainRawStream: () => activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream,
    getRawStream: () => activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setDataStream: activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream => scala.Unit,
    setRawStream: activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream => scala.Unit
  ): XDataSinkEncrSupport = {
    val __obj = js.Dynamic.literal(DataStream = DataStream, PlainRawStream = PlainRawStream, RawStream = RawStream, acquire = js.Any.fromFunction0(acquire), getDataStream = js.Any.fromFunction0(getDataStream), getPlainRawStream = js.Any.fromFunction0(getPlainRawStream), getRawStream = js.Any.fromFunction0(getRawStream), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setDataStream = js.Any.fromFunction1(setDataStream), setRawStream = js.Any.fromFunction1(setRawStream))
  
    __obj.asInstanceOf[XDataSinkEncrSupport]
  }
}

