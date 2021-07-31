package typings.activexLibreoffice.com_.sun.star.embed

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XNameAccess
import typings.activexLibreoffice.com_.sun.star.io.XStream
import typings.activexLibreoffice.com_.sun.star.lang.XComponent
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This interface represents main storage functionality. */
trait XStorage
  extends StObject
     with XNameAccess
     with XComponent {
  
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
  def cloneEncryptedStreamElement(sStreamName: String, sPassword: String): XStream
  
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
  def cloneStreamElement(sStreamName: String): XStream
  
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
  def copyElementTo(sElementName: String, xDest: XStorage, sNewName: String): Unit
  
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
  def copyLastCommitTo(xTargetStorage: XStorage): Unit
  
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
  def copyStorageElementLastCommitTo(sStorName: String, xTargetStorage: XStorage): Unit
  
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
  def copyToStorage(xDest: XStorage): Unit
  
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
  def isStorageElement(sElementName: String): Boolean
  
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
  def isStreamElement(sElementName: String): Boolean
  
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
  def moveElementTo(sElementName: String, xDest: XStorage, sNewName: String): Unit
  
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
  def openEncryptedStreamElement(sStreamName: String, nOpenMode: Double, sPassword: String): XStream
  
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
  def openStorageElement(sStorName: String, nOpenMode: Double): XStorage
  
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
  def openStreamElement(sStreamName: String, nOpenMode: Double): XStream
  
  /**
    * removes an element from a storage.
    * @param sElementName the name of the element to remove
    * @throws com::sun::star::embed::InvalidStorageException this storage is in invalid state for any reason
    * @throws com::sun::star::lang::IllegalArgumentException an illegal argument is provided
    * @throws com::sun::star::container::NoSuchElementException there is no element with such name
    * @throws com::sun::star::io::IOException in case of io errors during removing
    * @throws com::sun::star::embed::StorageWrappedTargetException wraps other exceptions
    */
  def removeElement(sElementName: String): Unit
  
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
  def renameElement(sElementName: String, sNewName: String): Unit
}
object XStorage {
  
  @scala.inline
  def apply(
    ElementNames: SafeArray[String],
    ElementType: `type`,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
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
    openEncryptedStreamElement: (String, Double, String) => XStream,
    openStorageElement: (String, Double) => XStorage,
    openStreamElement: (String, Double) => XStream,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeElement: String => Unit,
    removeEventListener: XEventListener => Unit,
    renameElement: (String, String) => Unit
  ): XStorage = {
    val __obj = js.Dynamic.literal(ElementNames = ElementNames.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), cloneEncryptedStreamElement = js.Any.fromFunction2(cloneEncryptedStreamElement), cloneStreamElement = js.Any.fromFunction1(cloneStreamElement), copyElementTo = js.Any.fromFunction3(copyElementTo), copyLastCommitTo = js.Any.fromFunction1(copyLastCommitTo), copyStorageElementLastCommitTo = js.Any.fromFunction2(copyStorageElementLastCommitTo), copyToStorage = js.Any.fromFunction1(copyToStorage), dispose = js.Any.fromFunction0(dispose), getByName = js.Any.fromFunction1(getByName), getElementNames = js.Any.fromFunction0(getElementNames), getElementType = js.Any.fromFunction0(getElementType), hasByName = js.Any.fromFunction1(hasByName), hasElements = js.Any.fromFunction0(hasElements), isStorageElement = js.Any.fromFunction1(isStorageElement), isStreamElement = js.Any.fromFunction1(isStreamElement), moveElementTo = js.Any.fromFunction3(moveElementTo), openEncryptedStreamElement = js.Any.fromFunction3(openEncryptedStreamElement), openStorageElement = js.Any.fromFunction2(openStorageElement), openStreamElement = js.Any.fromFunction2(openStreamElement), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeElement = js.Any.fromFunction1(removeElement), removeEventListener = js.Any.fromFunction1(removeEventListener), renameElement = js.Any.fromFunction2(renameElement))
    __obj.asInstanceOf[XStorage]
  }
  
  @scala.inline
  implicit class XStorageMutableBuilder[Self <: XStorage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloneEncryptedStreamElement(value: (String, String) => XStream): Self = StObject.set(x, "cloneEncryptedStreamElement", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCloneStreamElement(value: String => XStream): Self = StObject.set(x, "cloneStreamElement", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCopyElementTo(value: (String, XStorage, String) => Unit): Self = StObject.set(x, "copyElementTo", js.Any.fromFunction3(value))
    
    @scala.inline
    def setCopyLastCommitTo(value: XStorage => Unit): Self = StObject.set(x, "copyLastCommitTo", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCopyStorageElementLastCommitTo(value: (String, XStorage) => Unit): Self = StObject.set(x, "copyStorageElementLastCommitTo", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCopyToStorage(value: XStorage => Unit): Self = StObject.set(x, "copyToStorage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsStorageElement(value: String => Boolean): Self = StObject.set(x, "isStorageElement", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsStreamElement(value: String => Boolean): Self = StObject.set(x, "isStreamElement", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMoveElementTo(value: (String, XStorage, String) => Unit): Self = StObject.set(x, "moveElementTo", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOpenEncryptedStreamElement(value: (String, Double, String) => XStream): Self = StObject.set(x, "openEncryptedStreamElement", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOpenStorageElement(value: (String, Double) => XStorage): Self = StObject.set(x, "openStorageElement", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOpenStreamElement(value: (String, Double) => XStream): Self = StObject.set(x, "openStreamElement", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRemoveElement(value: String => Unit): Self = StObject.set(x, "removeElement", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRenameElement(value: (String, String) => Unit): Self = StObject.set(x, "renameElement", js.Any.fromFunction2(value))
  }
}
