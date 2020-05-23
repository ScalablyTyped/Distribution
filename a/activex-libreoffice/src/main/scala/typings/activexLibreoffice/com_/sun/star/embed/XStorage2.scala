package typings.activexLibreoffice.com_.sun.star.embed

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.NamedValue
import typings.activexLibreoffice.com_.sun.star.io.XStream
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import typings.std.SafeArray
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
  def cloneEncryptedStream(sStreamName: String, aEncryptionData: SeqEquiv[NamedValue]): XStream
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
  def openEncryptedStream(sStreamName: String, nOpenMode: Double, aEncryptionData: SeqEquiv[NamedValue]): XStream
}

object XStorage2 {
  @scala.inline
  def apply(
    ElementNames: SafeArray[String],
    ElementType: `type`,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    cloneEncryptedStream: (String, SeqEquiv[NamedValue]) => XStream,
    cloneEncryptedStreamElement: (String, String) => XStream,
    cloneStreamElement: String => XStream,
    copyElementTo: (String, XStorage, String) => Unit,
    copyLastCommitTo: XStorage => Unit,
    copyStorageElementLastCommitTo: (String, XStorage) => Unit,
    copyToStorage: XStorage => Unit,
    dispose: () => Unit,
    getByName: String => js.Any,
    getElementNames: () => SafeArray[String],
    getElementType: () => `type`,
    hasByName: String => Boolean,
    hasElements: () => Boolean,
    isStorageElement: String => Boolean,
    isStreamElement: String => Boolean,
    moveElementTo: (String, XStorage, String) => Unit,
    openEncryptedStream: (String, Double, SeqEquiv[NamedValue]) => XStream,
    openEncryptedStreamElement: (String, Double, String) => XStream,
    openStorageElement: (String, Double) => XStorage,
    openStreamElement: (String, Double) => XStream,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeElement: String => Unit,
    removeEventListener: XEventListener => Unit,
    renameElement: (String, String) => Unit
  ): XStorage2 = {
    val __obj = js.Dynamic.literal(ElementNames = ElementNames.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), cloneEncryptedStream = js.Any.fromFunction2(cloneEncryptedStream), cloneEncryptedStreamElement = js.Any.fromFunction2(cloneEncryptedStreamElement), cloneStreamElement = js.Any.fromFunction1(cloneStreamElement), copyElementTo = js.Any.fromFunction3(copyElementTo), copyLastCommitTo = js.Any.fromFunction1(copyLastCommitTo), copyStorageElementLastCommitTo = js.Any.fromFunction2(copyStorageElementLastCommitTo), copyToStorage = js.Any.fromFunction1(copyToStorage), dispose = js.Any.fromFunction0(dispose), getByName = js.Any.fromFunction1(getByName), getElementNames = js.Any.fromFunction0(getElementNames), getElementType = js.Any.fromFunction0(getElementType), hasByName = js.Any.fromFunction1(hasByName), hasElements = js.Any.fromFunction0(hasElements), isStorageElement = js.Any.fromFunction1(isStorageElement), isStreamElement = js.Any.fromFunction1(isStreamElement), moveElementTo = js.Any.fromFunction3(moveElementTo), openEncryptedStream = js.Any.fromFunction3(openEncryptedStream), openEncryptedStreamElement = js.Any.fromFunction3(openEncryptedStreamElement), openStorageElement = js.Any.fromFunction2(openStorageElement), openStreamElement = js.Any.fromFunction2(openStreamElement), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeElement = js.Any.fromFunction1(removeElement), removeEventListener = js.Any.fromFunction1(removeEventListener), renameElement = js.Any.fromFunction2(renameElement))
    __obj.asInstanceOf[XStorage2]
  }
}

