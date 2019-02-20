package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This interface represents main storage functionality. */
trait XStorage
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent {
  /**
    * allows to get readonly copy of a child encrypted stream with password.
    *
    * If storage does not allow any encryption this method will always throw {@link com.sun.star.packages.NoEncryptionException} .
    *
    * The stream is open in readonly mode so the {@link com.sun.star.io.XStream.getOutputStream()} method will return an empty reference.
    *
    * This method allows to specify reading password for the child stream explicitly.
    * @param sStreamName the name of the substream that should be copied
    * @param sPassword this parameter allows to specify a reading password for the stream, the password must be a correct one, otherwise an exception will be
    * @throws com::sun::star::embed::InvalidStorageException this storage is in invalid state for any reason
    * @throws com::sun::star::lang::IllegalArgumentException one of provided arguments is illegal
    * @throws com::sun::star::packages::NoEncryptionException the stream is not encrypted
    * @throws com::sun::star::packages::WrongPasswordException the provided password is wrong
    * @throws com::sun::star::io::IOException in case of io errors during stream opening
    * @throws com::sun::star::embed::StorageWrappedTargetException wraps other exceptions
    */
  def cloneEncryptedStreamElement(sStreamName: java.lang.String, sPassword: java.lang.String): activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XStream
  /**
    * allows to get readonly copy of a child stream of the storage.
    *
    * The stream is open in readonly mode so the {@link com.sun.star.io.XStream.getOutputStream()} method will return an empty reference.
    * @param sStreamName the name of the substream that should be copied
    * @throws com::sun::star::embed::InvalidStorageException this storage is in invalid state for any reason
    * @throws com::sun::star::lang::IllegalArgumentException one of provided arguments is illegal
    * @throws com::sun::star::packages::WrongPasswordException the provided password is wrong
    * @throws com::sun::star::io::IOException in case of io errors during stream opening
    * @throws com::sun::star::embed::StorageWrappedTargetException wraps other exceptions
    */
  def cloneStreamElement(sStreamName: java.lang.String): activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XStream
  /**
    * allows to copy an entry from one storage to another.
    *
    * If target element supports transacted mode it must be committed by this method after successful copying.
    * @param sElementName the name of the element in this storage
    * @param xDest a destination storage
    * @param sNewName the name of the result element in destination storage
    * @throws com::sun::star::embed::InvalidStorageException this storage is in invalid state for any reason
    * @throws com::sun::star::container::NoSuchElementException there is no specified source element in this storage
    * @throws com::sun::star::container::ElementExistException an element with specified destination name already exists in destination storage
    * @throws com::sun::star::io::IOException in case of io errors during copying
    * @throws com::sun::star::embed::StorageWrappedTargetException wraps other exceptions
    */
  def copyElementTo(sElementName: java.lang.String, xDest: XStorage, sNewName: java.lang.String): scala.Unit
  /**
    * allows to get copy of this storage at the state of its last commit.
    *
    * This method makes sense only for services implementations that allow transaction in the storage.
    * @param xTargetStorage the target storage that will be filled in with copy.
    * @throws com::sun::star::embed::InvalidStorageException this storage is in invalid state for any reason
    * @throws com::sun::star::lang::IllegalArgumentException one of provided arguments is illegal
    * @throws com::sun::star::io::IOException in case of io errors during copying
    * @throws com::sun::star::embed::StorageWrappedTargetException wraps other exceptions
    */
  def copyLastCommitTo(xTargetStorage: XStorage): scala.Unit
  /**
    * allows to get copy of a child storage at the state of its last commit.
    *
    * This method makes sense only for services implementations that allow transaction in the storage.
    * @param sStorName the name of the storage that should be copied
    * @param xTargetStorage the target storage that will be filled in with copy
    * @throws com::sun::star::embed::InvalidStorageException this storage is in invalid state for any reason
    * @throws com::sun::star::lang::IllegalArgumentException one of provided arguments is illegal
    * @throws com::sun::star::io::IOException in case of io errors during copying
    * @throws com::sun::star::embed::StorageWrappedTargetException wraps other exceptions
    */
  def copyStorageElementLastCommitTo(sStorName: java.lang.String, xTargetStorage: XStorage): scala.Unit
  /**
    * allows to copy current storage to another one
    *
    * The destination storage contents are overwritten. After the successful copying the target storage is automatically committed if it implements
    * transacted access.
    * @param xDest a destination storage this storage must be copied to.
    * @throws com::sun::star::embed::InvalidStorageException this storage is in invalid state for any reason
    * @throws com::sun::star::lang::IllegalArgumentException an illegal argument is provided
    * @throws com::sun::star::io::IOException in case of io errors during copying
    * @throws com::sun::star::embed::StorageWrappedTargetException wraps other exception acquired during copying
    */
  def copyToStorage(xDest: XStorage): scala.Unit
  /**
    * allows to check if an element is a child storage with specified name.
    *
    * In case there is no child element with such name an exception will be thrown.
    * @param sElementName the name of the element to check
    * @returns `TRUE` in case the element is a storage `FALSE` - the element is a stream
    * @throws com::sun::star::container::NoSuchElementException there is no element with such name
    * @throws com::sun::star::lang::IllegalArgumentException an illegal argument is provided
    * @throws com::sun::star::embed::InvalidStorageException this storage is in invalid state for any reason
    */
  def isStorageElement(sElementName: java.lang.String): scala.Boolean
  /**
    * allows to check if an element is a child stream with specified name.
    *
    * In case there is no child element with such name an exception will be thrown.
    * @param sElementName the name of the element to check
    * @returns `TRUE` in case the element is a stream `FALSE` - the element is a storage
    * @throws com::sun::star::container::NoSuchElementException there is no element with such name
    * @throws com::sun::star::lang::IllegalArgumentException an illegal argument is provided
    * @throws com::sun::star::embed::InvalidStorageException this storage is in invalid state for any reason
    */
  def isStreamElement(sElementName: java.lang.String): scala.Boolean
  /**
    * allows to move an entry from one storage to another.
    *
    * If target element supports transacted mode it must be committed by this method after successful moving.
    * @param sElementName the name of the element in this storage
    * @param xDest a destination storage
    * @param sNewName the name of the result element in destination storage
    * @throws com::sun::star::embed::InvalidStorageException this storage is in invalid state for any reason
    * @throws com::sun::star::container::NoSuchElementException there is no specified source element in this storage
    * @throws com::sun::star::container::ElementExistException an element with specified destination name already exists in destination storage
    * @throws com::sun::star::io::IOException in case of io errors during moving
    * @throws com::sun::star::embed::StorageWrappedTargetException wraps other exceptions
    */
  def moveElementTo(sElementName: java.lang.String, xDest: XStorage, sNewName: java.lang.String): scala.Unit
  /**
    * allows to get access to a child encrypted stream with password.
    *
    * If storage does not allow any encryption this method will always throw {@link com.sun.star.packages.NoEncryptionException} .
    *
    * In case the stream is open in readonly mode the {@link com.sun.star.io.XStream.getOutputStream()} method will return an empty reference.
    * @param sStreamName the name of the substream that should be open
    * @param nOpenMode a mode the stream should be open in, can be a combination of {@link ElementModes} values
    * @param sPassword this parameter allows to specify a reading password for the stream, the password must be a correct one, otherwise an exception will be
    * @throws com::sun::star::embed::InvalidStorageException this storage is in invalid state for any reason
    * @throws com::sun::star::lang::IllegalArgumentException one of provided arguments is illegal
    * @throws com::sun::star::packages::NoEncryptionException the stream is not encrypted
    * @throws com::sun::star::packages::WrongPasswordException the provided password is wrong
    * @throws com::sun::star::io::IOException in case of io errors during stream opening
    * @throws com::sun::star::embed::StorageWrappedTargetException wraps other exceptions
    */
  def openEncryptedStreamElement(sStreamName: java.lang.String, nOpenMode: scala.Double, sPassword: java.lang.String): activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XStream
  /**
    * allows to get access to a child storage.
    *
    * The opened substorage must support specified in "nOpenMode" access modes. It can support "read" mode in addition. But any child element can support
    * one of those modes only in case this mode is supported by parent storage.
    * @param sStorName the name of the storage that should be open
    * @param nOpenMode a mode the storage should be open in
    * @throws com::sun::star::embed::InvalidStorageException this storage is in invalid state for any reason
    * @throws com::sun::star::lang::IllegalArgumentException one of provided arguments is illegal
    * @throws com::sun::star::io::IOException in case of io errors during stream opening
    * @throws com::sun::star::embed::StorageWrappedTargetException wraps other exceptions
    */
  def openStorageElement(sStorName: java.lang.String, nOpenMode: scala.Double): XStorage
  /**
    * allows to get access to a child stream of the storage.
    *
    * In case the stream is open in readonly mode the {@link com.sun.star.io.XStream.getOutputStream()} method will return an empty reference.
    * @param sStreamName the name of the substream that should be open
    * @param nOpenMode a mode the stream should be open in, can be a combination of {@link ElementModes} values
    * @throws com::sun::star::embed::InvalidStorageException this storage is in invalid state for any reason
    * @throws com::sun::star::lang::IllegalArgumentException one of provided arguments is illegal
    * @throws com::sun::star::packages::WrongPasswordException the provided password is wrong
    * @throws com::sun::star::io::IOException in case of io errors during stream opening
    * @throws com::sun::star::embed::StorageWrappedTargetException wraps other exceptions
    */
  def openStreamElement(sStreamName: java.lang.String, nOpenMode: scala.Double): activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XStream
  /**
    * removes an element from a storage.
    * @param sElementName the name of the element to remove
    * @throws com::sun::star::embed::InvalidStorageException this storage is in invalid state for any reason
    * @throws com::sun::star::lang::IllegalArgumentException an illegal argument is provided
    * @throws com::sun::star::container::NoSuchElementException there is no element with such name
    * @throws com::sun::star::io::IOException in case of io errors during removing
    * @throws com::sun::star::embed::StorageWrappedTargetException wraps other exceptions
    */
  def removeElement(sElementName: java.lang.String): scala.Unit
  /**
    * renames an element in a storage.
    * @param sElementName the old name of the element to rename
    * @param sNewName the new name of the element to rename
    * @throws com::sun::star::embed::InvalidStorageException this storage is in invalid state for any reason
    * @throws com::sun::star::lang::IllegalArgumentException an illegal argument is provided
    * @throws com::sun::star::container::NoSuchElementException there is no element with old name in this storage
    * @throws com::sun::star::container::ElementExistException an element with new name already exists in this storage
    * @throws com::sun::star::io::IOException in case of io errors during renaming
    * @throws com::sun::star::embed::StorageWrappedTargetException wraps other exceptions
    */
  def renameElement(sElementName: java.lang.String, sNewName: java.lang.String): scala.Unit
}

