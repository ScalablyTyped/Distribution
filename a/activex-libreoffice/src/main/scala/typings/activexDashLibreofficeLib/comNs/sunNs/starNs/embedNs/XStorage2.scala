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
    ElementNames: activexDashInteropLib.SafeArray[java.lang.String],
    ElementType: activexDashLibreofficeLib.`type`,
    acquire: js.Function0[scala.Unit],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    cloneEncryptedStream: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.NamedValue], 
      activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XStream
    ],
    cloneEncryptedStreamElement: js.Function2[
      java.lang.String, 
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XStream
    ],
    cloneStreamElement: js.Function1[java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XStream],
    copyElementTo: js.Function3[java.lang.String, XStorage, java.lang.String, scala.Unit],
    copyLastCommitTo: js.Function1[XStorage, scala.Unit],
    copyStorageElementLastCommitTo: js.Function2[java.lang.String, XStorage, scala.Unit],
    copyToStorage: js.Function1[XStorage, scala.Unit],
    dispose: js.Function0[scala.Unit],
    getByName: js.Function1[java.lang.String, js.Any],
    getElementNames: js.Function0[activexDashInteropLib.SafeArray[java.lang.String]],
    getElementType: js.Function0[activexDashLibreofficeLib.`type`],
    hasByName: js.Function1[java.lang.String, scala.Boolean],
    hasElements: js.Function0[scala.Boolean],
    isStorageElement: js.Function1[java.lang.String, scala.Boolean],
    isStreamElement: js.Function1[java.lang.String, scala.Boolean],
    moveElementTo: js.Function3[java.lang.String, XStorage, java.lang.String, scala.Unit],
    openEncryptedStream: js.Function3[
      java.lang.String, 
      scala.Double, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.NamedValue], 
      activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XStream
    ],
    openEncryptedStreamElement: js.Function3[
      java.lang.String, 
      scala.Double, 
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XStream
    ],
    openStorageElement: js.Function2[java.lang.String, scala.Double, XStorage],
    openStreamElement: js.Function2[
      java.lang.String, 
      scala.Double, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XStream
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeElement: js.Function1[java.lang.String, scala.Unit],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    renameElement: js.Function2[java.lang.String, java.lang.String, scala.Unit]
  ): XStorage2 = {
    val __obj = js.Dynamic.literal(ElementNames = ElementNames, ElementType = ElementType, acquire = acquire, addEventListener = addEventListener, cloneEncryptedStream = cloneEncryptedStream, cloneEncryptedStreamElement = cloneEncryptedStreamElement, cloneStreamElement = cloneStreamElement, copyElementTo = copyElementTo, copyLastCommitTo = copyLastCommitTo, copyStorageElementLastCommitTo = copyStorageElementLastCommitTo, copyToStorage = copyToStorage, dispose = dispose, getByName = getByName, getElementNames = getElementNames, getElementType = getElementType, hasByName = hasByName, hasElements = hasElements, isStorageElement = isStorageElement, isStreamElement = isStreamElement, moveElementTo = moveElementTo, openEncryptedStream = openEncryptedStream, openEncryptedStreamElement = openEncryptedStreamElement, openStorageElement = openStorageElement, openStreamElement = openStreamElement, queryInterface = queryInterface, release = release, removeElement = removeElement, removeEventListener = removeEventListener, renameElement = renameElement)
  
    __obj.asInstanceOf[XStorage2]
  }
}

