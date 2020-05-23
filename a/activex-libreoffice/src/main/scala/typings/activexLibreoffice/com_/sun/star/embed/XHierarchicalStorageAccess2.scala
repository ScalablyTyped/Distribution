package typings.activexLibreoffice.com_.sun.star.embed

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.com_.sun.star.beans.NamedValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This interface extends {@link XHierarchicalStorageAccess} interface. */
trait XHierarchicalStorageAccess2 extends XHierarchicalStorageAccess {
  /**
    * allows to get access to a child encrypted stream with encryption data using hierarchical path.
    *
    * If storage does not allow any encryption this method will always throw {@link com.sun.star.packages.NoEncryptionException} .
    *
    * In case the stream is open in readonly mode the {@link com.sun.star.io.XStream.getOutputStream()} method will return an empty reference.
    * @param sStreamName the path to the substream that should be open
    * @param nOpenMode a mode the stream should be open in, can be a combination of {@link ElementModes} values
    * @param aEncryptionData this parameter allowes to specify an encryption data for the stream, the data must be correct, otherwise an exception will be thrown
    * @throws com::sun::star::embed::InvalidStorageException this storage is in invalid state for any reason
    * @throws com::sun::star::lang::IllegalArgumentException one of provided arguments is illegal
    * @throws com::sun::star::packages::NoEncryptionException the stream is not encrypted
    * @throws com::sun::star::packages::WrongPasswordException the provided password is wrong
    * @throws com::sun::star::io::IOException in case of io errors during stream opening
    * @throws com::sun::star::embed::StorageWrappedTargetException wraps other exceptions
    */
  def openEncryptedStreamByHierarchicalName(sStreamName: String, nOpenMode: Double, aEncryptionData: SeqEquiv[NamedValue]): XExtendedStorageStream
}

object XHierarchicalStorageAccess2 {
  @scala.inline
  def apply(
    openEncryptedStreamByHierarchicalName: (String, Double, SeqEquiv[NamedValue]) => XExtendedStorageStream,
    openEncryptedStreamElementByHierarchicalName: (String, Double, String) => XExtendedStorageStream,
    openStreamElementByHierarchicalName: (String, Double) => XExtendedStorageStream,
    removeStreamElementByHierarchicalName: String => Unit
  ): XHierarchicalStorageAccess2 = {
    val __obj = js.Dynamic.literal(openEncryptedStreamByHierarchicalName = js.Any.fromFunction3(openEncryptedStreamByHierarchicalName), openEncryptedStreamElementByHierarchicalName = js.Any.fromFunction3(openEncryptedStreamElementByHierarchicalName), openStreamElementByHierarchicalName = js.Any.fromFunction2(openStreamElementByHierarchicalName), removeStreamElementByHierarchicalName = js.Any.fromFunction1(removeStreamElementByHierarchicalName))
    __obj.asInstanceOf[XHierarchicalStorageAccess2]
  }
}

