package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This interface extends the base {@link XStorage} interface. */
trait XStorage2 extends XStorage {
  /**
    * allows to get readonly copy of a child encrypted stream with encryption data.
    *
    * If storage does not allow any encryption this method will always throw {@link com.sun.star.packages.NoEncryptionException} .
    *
    * The stream is open in readonly mode so the {@link com.sun.star.io.XStream.getOutputStream()} method will return an empty reference.
    *
    * This method allows to specify encryption data for the child stream explicitly.
    * @param sStreamName the name of the substream that should be copied
    * @param aEncryptionData this parameter allowes to specify an encryption data for the stream, the encryption data must be correct, otherwise an exception
    * @throws com::sun::star::embed::InvalidStorageException this storage is in invalid state for any reason
    * @throws com::sun::star::lang::IllegalArgumentException one of provided arguments is illegal
    * @throws com::sun::star::packages::NoEncryptionException the stream is not encrypted
    * @throws com::sun::star::packages::WrongPasswordException the provided encryption data is wrong
    * @throws com::sun::star::io::IOException in case of io errors during stream opening
    * @throws com::sun::star::embed::StorageWrappedTargetException wraps other exceptions
    */
  def cloneEncryptedStream(
    sStreamName: java.lang.String,
    aEncryptionData: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.NamedValue]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XStream
  /**
    * allows to get access to a child encrypted stream with EncryptionData.
    *
    * If storage does not allow any encryption this method will always throw {@link com.sun.star.packages.NoEncryptionException} .
    *
    * In case the stream is open in readonly mode the {@link com.sun.star.io.XStream.getOutputStream()} method will return an empty reference.
    * @param sStreamName the name of the substream that should be open
    * @param nOpenMode a mode the stream should be open in, can be a combination of {@link ElementModes} values
    * @param aEncryptionData this parameter allowes to specify an encryption data to decrypt the stream, the encryption data must be correct, otherwise an exc
    * @throws com::sun::star::embed::InvalidStorageException this storage is in invalid state for any reason
    * @throws com::sun::star::lang::IllegalArgumentException one of provided arguments is illegal
    * @throws com::sun::star::packages::NoEncryptionException the stream is not encrypted
    * @throws com::sun::star::packages::WrongPasswordException the provided encryption data is wrong
    * @throws com::sun::star::io::IOException in case of io errors during stream opening
    * @throws com::sun::star::embed::StorageWrappedTargetException wraps other exceptions
    */
  def openEncryptedStream(
    sStreamName: java.lang.String,
    nOpenMode: scala.Double,
    aEncryptionData: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.NamedValue]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XStream
}

