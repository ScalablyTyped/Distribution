package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.io.XInputStream
import typings.activexLibreoffice.com_.sun.star.io.XOutputStream
import typings.activexLibreoffice.com_.sun.star.io.XStream
import typings.activexLibreoffice.com_.sun.star.task.XInteractionHandler
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.activexLibreoffice.com_.sun.star.util.DateTime
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This is the basic interface to read data from a stream. */
@js.native
trait XSimpleFileAccess extends XInterface {
  
  /**
    * Copies a file
    * @param SourceURL URL of the file to be copied
    * @param DestURL URL of the location the file should be copied to
    * @see move
    */
  def copy(SourceURL: String, DestURL: String): Unit = js.native
  
  /**
    * Creates a new Folder
    * @param NewFolderURL URL describing the location of the new folder
    */
  def createFolder(NewFolderURL: String): Unit = js.native
  
  /**
    * Checks if a file exists
    * @param FileURL URL to be checked
    * @returns true, if the File exists, false otherwise
    */
  def exists(FileURL: String): Boolean = js.native
  
  /**
    * Returns the content type of a file.
    * @param FileURL URL of the file
    * @returns {@link Content} type of the file
    * @see XContent.getContentType
    */
  def getContentType(FileURL: String): String = js.native
  
  /**
    * Returns the last modified date for the file
    * @param FileURL URL of the file
    * @returns Last modified date for the file
    */
  def getDateTimeModified(FileURL: String): DateTime = js.native
  
  /**
    * Returns the contents of a folder
    * @param FolderURL URL of the folder
    * @param bIncludeFolders true: Subfolders are included, false: No subfolders
    * @returns The content of a folder, each file as one string in a string sequence
    */
  def getFolderContents(FolderURL: String, bIncludeFolders: Boolean): SafeArray[String] = js.native
  
  /**
    * Returns the size of a file.
    * @param FileURL URL of the file
    * @returns Size of the file in bytes
    */
  def getSize(FileURL: String): Double = js.native
  
  /**
    * Checks if an URL represents a folder
    * @param FileURL URL to be checked
    * @returns true, if the given URL represents a folder, otherwise false
    */
  def isFolder(FileURL: String): Boolean = js.native
  
  /**
    * Checks if a file is "read only"
    * @param FileURL URL to be checked
    * @returns true, if the given File is "read only", false otherwise
    */
  def isReadOnly(FileURL: String): Boolean = js.native
  
  /**
    * Removes a file. If the URL represents a folder, the folder will be removed, even if it's not empty.
    * @param FileURL File/folder to be removed
    * @see move
    */
  def kill(FileURL: String): Unit = js.native
  
  /**
    * Moves a file
    * @param SourceURL URL of the file to be moved
    * @param DestURL URL of the location the file should be moved to
    * @see move
    */
  def move(SourceURL: String, DestURL: String): Unit = js.native
  
  /**
    * Opens file to read
    * @param FileURL File to open
    * @returns An XInputStream, if the file can be opened for reading
    */
  def openFileRead(FileURL: String): XInputStream = js.native
  
  /**
    * Opens file to read and write
    * @param FileURL File to open
    * @returns An XStream, if the file can be opened for reading and writing
    * @throws UnsupportedDataSinkException the file cannot be opened for random write access. Some resources do not allow random write access. To write data fo
    */
  def openFileReadWrite(FileURL: String): XStream = js.native
  
  /**
    * Opens file to write.
    * @param FileURL File to open
    * @returns An XOutputStream, if the file can be opened for writing
    * @throws UnsupportedDataSinkException the file cannot be opened for random write access. Some resources do not allow random write access. To write data fo
    */
  def openFileWrite(FileURL: String): XOutputStream = js.native
  
  /**
    * Sets an interaction handler to be used for further operations.
    *
    * A default interaction handler is available as service {@link com.sun.star.task.InteractionHandler} . The documentation of this service also contains
    * further information about the interaction handler concept.
    * @param Handler The interaction handler to be set
    * @see com.sun.star.task.InteractionHandler
    */
  def setInteractionHandler(Handler: XInteractionHandler): Unit = js.native
  
  /**
    * Sets the "read only" of a file according to the boolean parameter, if the actual process has the right to do so.
    * @param FileURL URL of the file
    * @param bReadOnly true; "read only" flag will be set, false; "read only" flag will be reset
    */
  def setReadOnly(FileURL: String, bReadOnly: Boolean): Unit = js.native
}
object XSimpleFileAccess {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    copy: (String, String) => Unit,
    createFolder: String => Unit,
    exists: String => Boolean,
    getContentType: String => String,
    getDateTimeModified: String => DateTime,
    getFolderContents: (String, Boolean) => SafeArray[String],
    getSize: String => Double,
    isFolder: String => Boolean,
    isReadOnly: String => Boolean,
    kill: String => Unit,
    move: (String, String) => Unit,
    openFileRead: String => XInputStream,
    openFileReadWrite: String => XStream,
    openFileWrite: String => XOutputStream,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setInteractionHandler: XInteractionHandler => Unit,
    setReadOnly: (String, Boolean) => Unit
  ): XSimpleFileAccess = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), copy = js.Any.fromFunction2(copy), createFolder = js.Any.fromFunction1(createFolder), exists = js.Any.fromFunction1(exists), getContentType = js.Any.fromFunction1(getContentType), getDateTimeModified = js.Any.fromFunction1(getDateTimeModified), getFolderContents = js.Any.fromFunction2(getFolderContents), getSize = js.Any.fromFunction1(getSize), isFolder = js.Any.fromFunction1(isFolder), isReadOnly = js.Any.fromFunction1(isReadOnly), kill = js.Any.fromFunction1(kill), move = js.Any.fromFunction2(move), openFileRead = js.Any.fromFunction1(openFileRead), openFileReadWrite = js.Any.fromFunction1(openFileReadWrite), openFileWrite = js.Any.fromFunction1(openFileWrite), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setInteractionHandler = js.Any.fromFunction1(setInteractionHandler), setReadOnly = js.Any.fromFunction2(setReadOnly))
    __obj.asInstanceOf[XSimpleFileAccess]
  }
  
  @scala.inline
  implicit class XSimpleFileAccessOps[Self <: XSimpleFileAccess] (val x: Self) extends AnyVal {
    
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
    def setCopy(value: (String, String) => Unit): Self = this.set("copy", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCreateFolder(value: String => Unit): Self = this.set("createFolder", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExists(value: String => Boolean): Self = this.set("exists", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetContentType(value: String => String): Self = this.set("getContentType", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetDateTimeModified(value: String => DateTime): Self = this.set("getDateTimeModified", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetFolderContents(value: (String, Boolean) => SafeArray[String]): Self = this.set("getFolderContents", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetSize(value: String => Double): Self = this.set("getSize", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsFolder(value: String => Boolean): Self = this.set("isFolder", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsReadOnly(value: String => Boolean): Self = this.set("isReadOnly", js.Any.fromFunction1(value))
    
    @scala.inline
    def setKill(value: String => Unit): Self = this.set("kill", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMove(value: (String, String) => Unit): Self = this.set("move", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOpenFileRead(value: String => XInputStream): Self = this.set("openFileRead", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOpenFileReadWrite(value: String => XStream): Self = this.set("openFileReadWrite", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOpenFileWrite(value: String => XOutputStream): Self = this.set("openFileWrite", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetInteractionHandler(value: XInteractionHandler => Unit): Self = this.set("setInteractionHandler", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetReadOnly(value: (String, Boolean) => Unit): Self = this.set("setReadOnly", js.Any.fromFunction2(value))
  }
}
