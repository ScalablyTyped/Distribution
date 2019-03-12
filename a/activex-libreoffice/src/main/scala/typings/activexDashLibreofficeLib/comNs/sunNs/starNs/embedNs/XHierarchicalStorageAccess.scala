package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interface allows hierarchical access to storage tree.
  *
  * Currently only streams can be opened using this interface.
  *
  * The hierarchical access can not be mixed with a normal access. Thus when in a storage a stream with a path "a/b/c" is accessed using hierarchical
  * access, another stream "a/b/d" can also be opened with hierarchical access ( if it is still not opened ), but the substorage "a" can not be opened (
  * it is locked by hierarchical access ).
  */
trait XHierarchicalStorageAccess extends js.Object {
  /**
    * allows to get access to a child encrypted stream with password using hierarchical path.
    *
    * If storage does not allow any encryption this method will always throw {@link com.sun.star.packages.NoEncryptionException} .
    *
    * In case the stream is open in readonly mode the {@link com.sun.star.io.XStream.getOutputStream()} method will return an empty reference.
    * @param sStreamName the path to the substream that should be open
    * @param nOpenMode a mode the stream should be open in, can be a combination of {@link ElementModes} values
    * @param sPassword this parameter allows to specify a reading password for the stream, the password must be a correct one, otherwise an exception will be
    * @throws com::sun::star::embed::InvalidStorageException this storage is in invalid state for any reason
    * @throws com::sun::star::lang::IllegalArgumentException one of provided arguments is illegal
    * @throws com::sun::star::packages::NoEncryptionException the stream is not encrypted
    * @throws com::sun::star::packages::WrongPasswordException the provided password is wrong
    * @throws com::sun::star::io::IOException in case of io errors during stream opening
    * @throws com::sun::star::embed::StorageWrappedTargetException wraps other exceptions
    */
  def openEncryptedStreamElementByHierarchicalName(sStreamName: java.lang.String, nOpenMode: scala.Double, sPassword: java.lang.String): XExtendedStorageStream
  /**
    * allows to get access to a child stream of the storage, using hierarchical path.
    *
    * In case the stream is open in readonly mode the {@link com.sun.star.io.XStream.getOutputStream()} method will return an empty reference.
    * @param sStreamPath the path to the substream that should be open
    * @param nOpenMode a mode the stream should be open in, can be a combination of {@link ElementModes} values
    * @throws com::sun::star::embed::InvalidStorageException this storage is in invalid state for any reason
    * @throws com::sun::star::lang::IllegalArgumentException one of provided arguments is illegal
    * @throws com::sun::star::packages::WrongPasswordException the provided password is wrong
    * @throws com::sun::star::io::IOException in case of io errors during stream opening
    * @throws com::sun::star::embed::StorageWrappedTargetException wraps other exceptions
    */
  def openStreamElementByHierarchicalName(sStreamPath: java.lang.String, nOpenMode: scala.Double): XExtendedStorageStream
  /**
    * removes a stream specified by hierarchical name from a storage.
    * @param sElementPath the path to the element to remove
    * @throws com::sun::star::embed::InvalidStorageException this storage is in invalid state for any reason
    * @throws com::sun::star::lang::IllegalArgumentException an illegal argument is provided
    * @throws com::sun::star::container::NoSuchElementException there is no element with such name
    * @throws com::sun::star::io::IOException in case of io errors during removing
    * @throws com::sun::star::embed::StorageWrappedTargetException wraps other exceptions
    */
  def removeStreamElementByHierarchicalName(sElementPath: java.lang.String): scala.Unit
}

object XHierarchicalStorageAccess {
  @scala.inline
  def apply(
    openEncryptedStreamElementByHierarchicalName: (java.lang.String, scala.Double, java.lang.String) => XExtendedStorageStream,
    openStreamElementByHierarchicalName: (java.lang.String, scala.Double) => XExtendedStorageStream,
    removeStreamElementByHierarchicalName: java.lang.String => scala.Unit
  ): XHierarchicalStorageAccess = {
    val __obj = js.Dynamic.literal(openEncryptedStreamElementByHierarchicalName = js.Any.fromFunction3(openEncryptedStreamElementByHierarchicalName), openStreamElementByHierarchicalName = js.Any.fromFunction2(openStreamElementByHierarchicalName), removeStreamElementByHierarchicalName = js.Any.fromFunction1(removeStreamElementByHierarchicalName))
  
    __obj.asInstanceOf[XHierarchicalStorageAccess]
  }
}

