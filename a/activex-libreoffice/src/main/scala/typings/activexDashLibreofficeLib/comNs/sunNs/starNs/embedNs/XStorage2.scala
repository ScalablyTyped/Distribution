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

object XStorage2 {
  @scala.inline
  def apply(
    ElementNames: stdLib.SafeArray[java.lang.String],
    ElementType: activexDashLibreofficeLib.`type`,
    acquire: () => scala.Unit,
    addEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    cloneEncryptedStream: (java.lang.String, activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.NamedValue]) => activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XStream,
    cloneEncryptedStreamElement: (java.lang.String, java.lang.String) => activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XStream,
    cloneStreamElement: java.lang.String => activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XStream,
    copyElementTo: (java.lang.String, XStorage, java.lang.String) => scala.Unit,
    copyLastCommitTo: XStorage => scala.Unit,
    copyStorageElementLastCommitTo: (java.lang.String, XStorage) => scala.Unit,
    copyToStorage: XStorage => scala.Unit,
    dispose: () => scala.Unit,
    getByName: java.lang.String => js.Any,
    getElementNames: () => stdLib.SafeArray[java.lang.String],
    getElementType: () => activexDashLibreofficeLib.`type`,
    hasByName: java.lang.String => scala.Boolean,
    hasElements: () => scala.Boolean,
    isStorageElement: java.lang.String => scala.Boolean,
    isStreamElement: java.lang.String => scala.Boolean,
    moveElementTo: (java.lang.String, XStorage, java.lang.String) => scala.Unit,
    openEncryptedStream: (java.lang.String, scala.Double, activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.NamedValue]) => activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XStream,
    openEncryptedStreamElement: (java.lang.String, scala.Double, java.lang.String) => activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XStream,
    openStorageElement: (java.lang.String, scala.Double) => XStorage,
    openStreamElement: (java.lang.String, scala.Double) => activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XStream,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeElement: java.lang.String => scala.Unit,
    removeEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    renameElement: (java.lang.String, java.lang.String) => scala.Unit
  ): XStorage2 = {
    val __obj = js.Dynamic.literal(ElementNames = ElementNames, ElementType = ElementType, acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), cloneEncryptedStream = js.Any.fromFunction2(cloneEncryptedStream), cloneEncryptedStreamElement = js.Any.fromFunction2(cloneEncryptedStreamElement), cloneStreamElement = js.Any.fromFunction1(cloneStreamElement), copyElementTo = js.Any.fromFunction3(copyElementTo), copyLastCommitTo = js.Any.fromFunction1(copyLastCommitTo), copyStorageElementLastCommitTo = js.Any.fromFunction2(copyStorageElementLastCommitTo), copyToStorage = js.Any.fromFunction1(copyToStorage), dispose = js.Any.fromFunction0(dispose), getByName = js.Any.fromFunction1(getByName), getElementNames = js.Any.fromFunction0(getElementNames), getElementType = js.Any.fromFunction0(getElementType), hasByName = js.Any.fromFunction1(hasByName), hasElements = js.Any.fromFunction0(hasElements), isStorageElement = js.Any.fromFunction1(isStorageElement), isStreamElement = js.Any.fromFunction1(isStreamElement), moveElementTo = js.Any.fromFunction3(moveElementTo), openEncryptedStream = js.Any.fromFunction3(openEncryptedStream), openEncryptedStreamElement = js.Any.fromFunction3(openEncryptedStreamElement), openStorageElement = js.Any.fromFunction2(openStorageElement), openStreamElement = js.Any.fromFunction2(openStreamElement), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeElement = js.Any.fromFunction1(removeElement), removeEventListener = js.Any.fromFunction1(removeEventListener), renameElement = js.Any.fromFunction2(renameElement))
  
    __obj.asInstanceOf[XStorage2]
  }
}

