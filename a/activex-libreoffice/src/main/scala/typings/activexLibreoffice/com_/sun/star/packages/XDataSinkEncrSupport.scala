package typings.activexLibreoffice.com_.sun.star.packages

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.io.XInputStream
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Allows to get access to the stream of a {@link PackageStream} . */
@js.native
trait XDataSinkEncrSupport extends XInterface {
  /**
    * Allows to get access to the data of the {@link PackageStream} .
    *
    * In case stream is encrypted one and the key for the stream is not set, an exception must be thrown.
    * @returns the stream
    * @throws com::sun::star::packages::WrongPasswordException no key or a wrong one is set
    * @throws com::sun::star::io::IOException in case of io problems during retrieving
    */
  var DataStream: XInputStream = js.native
  /**
    * Allows to get access to the raw data of the stream as it is stored in the package.
    * @returns the plain raw stream as it is stored in the package
    * @throws com::sun::star::packages::NoEncryptionException the {@link PackageStream} object is not encrypted
    * @throws com::sun::star::io::IOException in case of io problems during retrieving
    */
  val PlainRawStream: XInputStream = js.native
  /**
    * Allows to get access to the data of the {@link PackageStream} as to raw stream. In case stream is not encrypted an exception will be thrown.
    *
    * The difference of raw stream is that it contains header for encrypted data, so an encrypted stream can be copied from one {@link PackageStream} to
    * another one without decryption.
    * @returns the raw representation of stream
    * @throws com::sun::star::packages::NoEncryptionException the {@link PackageStream} object is not encrypted
    * @throws com::sun::star::io::IOException in case of io problems during retrieving
    */
  var RawStream: XInputStream = js.native
  /**
    * Allows to get access to the data of the {@link PackageStream} .
    *
    * In case stream is encrypted one and the key for the stream is not set, an exception must be thrown.
    * @returns the stream
    * @throws com::sun::star::packages::WrongPasswordException no key or a wrong one is set
    * @throws com::sun::star::io::IOException in case of io problems during retrieving
    */
  def getDataStream(): XInputStream = js.native
  /**
    * Allows to get access to the raw data of the stream as it is stored in the package.
    * @returns the plain raw stream as it is stored in the package
    * @throws com::sun::star::packages::NoEncryptionException the {@link PackageStream} object is not encrypted
    * @throws com::sun::star::io::IOException in case of io problems during retrieving
    */
  def getPlainRawStream(): XInputStream = js.native
  /**
    * Allows to get access to the data of the {@link PackageStream} as to raw stream. In case stream is not encrypted an exception will be thrown.
    *
    * The difference of raw stream is that it contains header for encrypted data, so an encrypted stream can be copied from one {@link PackageStream} to
    * another one without decryption.
    * @returns the raw representation of stream
    * @throws com::sun::star::packages::NoEncryptionException the {@link PackageStream} object is not encrypted
    * @throws com::sun::star::io::IOException in case of io problems during retrieving
    */
  def getRawStream(): XInputStream = js.native
  /**
    * Allows to set a data stream for the {@link PackageStream} .
    *
    * In case {@link PackageStream} is marked as encrypted the data stream will be encrypted on storing.
    * @param aStream new data stream
    * @throws com::sun::star::io::IOException in case of io problems
    */
  def setDataStream(aStream: XInputStream): Unit = js.native
  /**
    * Allows to set raw stream for the {@link PackageStream} . The {@link PackageStream} object can not be marked as encrypted one, an exception will be
    * thrown in such case.
    * @param aStream the new raw representation of stream
    * @throws com::sun::star::packages::EncryptionNotAllowedException the {@link PackageStream} object is marked as encrypted
    * @throws com::sun::star::packages::NoRawFormatException the stream is not a correct raw representation of encrypted package stream
    * @throws com::sun::star::io::IOException in case of io problems during retrieving
    */
  def setRawStream(aStream: XInputStream): Unit = js.native
}

object XDataSinkEncrSupport {
  @scala.inline
  def apply(
    DataStream: XInputStream,
    PlainRawStream: XInputStream,
    RawStream: XInputStream,
    acquire: () => Unit,
    getDataStream: () => XInputStream,
    getPlainRawStream: () => XInputStream,
    getRawStream: () => XInputStream,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setDataStream: XInputStream => Unit,
    setRawStream: XInputStream => Unit
  ): XDataSinkEncrSupport = {
    val __obj = js.Dynamic.literal(DataStream = DataStream.asInstanceOf[js.Any], PlainRawStream = PlainRawStream.asInstanceOf[js.Any], RawStream = RawStream.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getDataStream = js.Any.fromFunction0(getDataStream), getPlainRawStream = js.Any.fromFunction0(getPlainRawStream), getRawStream = js.Any.fromFunction0(getRawStream), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setDataStream = js.Any.fromFunction1(setDataStream), setRawStream = js.Any.fromFunction1(setRawStream))
    __obj.asInstanceOf[XDataSinkEncrSupport]
  }
  @scala.inline
  implicit class XDataSinkEncrSupportOps[Self <: XDataSinkEncrSupport] (val x: Self) extends AnyVal {
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
    def setDataStream(value: XInputStream): Self = this.set("DataStream", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlainRawStream(value: XInputStream): Self = this.set("PlainRawStream", value.asInstanceOf[js.Any])
    @scala.inline
    def setRawStream(value: XInputStream): Self = this.set("RawStream", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetDataStream(value: () => XInputStream): Self = this.set("getDataStream", js.Any.fromFunction0(value))
    @scala.inline
    def setGetPlainRawStream(value: () => XInputStream): Self = this.set("getPlainRawStream", js.Any.fromFunction0(value))
    @scala.inline
    def setGetRawStream(value: () => XInputStream): Self = this.set("getRawStream", js.Any.fromFunction0(value))
    @scala.inline
    def setSetDataStream(value: XInputStream => Unit): Self = this.set("setDataStream", js.Any.fromFunction1(value))
    @scala.inline
    def setSetRawStream(value: XInputStream => Unit): Self = this.set("setRawStream", js.Any.fromFunction1(value))
  }
  
}

