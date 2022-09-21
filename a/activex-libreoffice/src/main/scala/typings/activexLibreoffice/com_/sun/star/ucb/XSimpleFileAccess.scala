package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.io.XInputStream
import typings.activexLibreoffice.com_.sun.star.io.XOutputStream
import typings.activexLibreoffice.com_.sun.star.io.XStream
import typings.activexLibreoffice.com_.sun.star.task.XInteractionHandler
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.activexLibreoffice.com_.sun.star.util.DateTime
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This is the basic interface to read data from a stream. */
trait XSimpleFileAccess
  extends StObject
     with XInterface {
  
  /**
    * Copies a file
    * @param SourceURL URL of the file to be copied
    * @param DestURL URL of the location the file should be copied to
    * @see move
    */
  def copy(SourceURL: String, DestURL: String): Unit
  
  /**
    * Creates a new Folder
    * @param NewFolderURL URL describing the location of the new folder
    */
  def createFolder(NewFolderURL: String): Unit
  
  /**
    * Checks if a file exists
    * @param FileURL URL to be checked
    * @returns true, if the File exists, false otherwise
    */
  def exists(FileURL: String): Boolean
  
  /**
    * Returns the content type of a file.
    * @param FileURL URL of the file
    * @returns The {@link Content} type of the file
    * @see XContent.getContentType
    */
  def getContentType(FileURL: String): String
  
  /**
    * Returns the last modified date for the file
    * @param FileURL URL of the file
    * @returns Last modified date for the file
    */
  def getDateTimeModified(FileURL: String): DateTime
  
  /**
    * Returns the contents of a folder
    * @param FolderURL URL of the folder
    * @param bIncludeFolders true: Subfolders are included, false: No subfolders
    * @returns The content of a folder, each file as one string in a string sequence
    */
  def getFolderContents(FolderURL: String, bIncludeFolders: Boolean): SafeArray[String]
  
  /**
    * Returns the size of a file.
    * @param FileURL URL of the file
    * @returns Size of the file in bytes
    */
  def getSize(FileURL: String): Double
  
  /**
    * Checks if an URL represents a folder
    * @param FileURL URL to be checked
    * @returns true, if the given URL represents a folder, otherwise false
    */
  def isFolder(FileURL: String): Boolean
  
  /**
    * Checks if a file is "read only"
    * @param FileURL URL to be checked
    * @returns true, if the given File is "read only", false otherwise
    */
  def isReadOnly(FileURL: String): Boolean
  
  /**
    * Removes a file. If the URL represents a folder, the folder will be removed, even if it's not empty.
    * @param FileURL File/folder to be removed
    * @see move
    */
  def kill(FileURL: String): Unit
  
  /**
    * Moves a file
    * @param SourceURL URL of the file to be moved
    * @param DestURL URL of the location the file should be moved to
    * @see move
    */
  def move(SourceURL: String, DestURL: String): Unit
  
  /**
    * Opens file to read
    * @param FileURL File to open
    * @returns An XInputStream, if the file can be opened for reading
    */
  def openFileRead(FileURL: String): XInputStream
  
  /**
    * Opens file to read and write
    * @param FileURL File to open
    * @returns An XStream, if the file can be opened for reading and writing
    * @throws UnsupportedDataSinkException the file cannot be opened for random write access. Some resources do not allow random write access. To write data fo
    */
  def openFileReadWrite(FileURL: String): XStream
  
  /**
    * Opens file to write.
    * @param FileURL File to open
    * @returns An XOutputStream, if the file can be opened for writing
    * @throws UnsupportedDataSinkException the file cannot be opened for random write access. Some resources do not allow random write access. To write data fo
    */
  def openFileWrite(FileURL: String): XOutputStream
  
  /**
    * Sets an interaction handler to be used for further operations.
    *
    * A default interaction handler is available as service {@link com.sun.star.task.InteractionHandler} . The documentation of this service also contains
    * further information about the interaction handler concept.
    * @param Handler The interaction handler to be set
    * @see com.sun.star.task.InteractionHandler
    */
  def setInteractionHandler(Handler: XInteractionHandler): Unit
  
  /**
    * Sets the "read only" of a file according to the boolean parameter, if the actual process has the right to do so.
    * @param FileURL URL of the file
    * @param bReadOnly true; "read only" flag will be set, false; "read only" flag will be reset
    */
  def setReadOnly(FileURL: String, bReadOnly: Boolean): Unit
}
object XSimpleFileAccess {
  
  inline def apply(
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
    queryInterface: `type` => Any,
    release: () => Unit,
    setInteractionHandler: XInteractionHandler => Unit,
    setReadOnly: (String, Boolean) => Unit
  ): XSimpleFileAccess = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), copy = js.Any.fromFunction2(copy), createFolder = js.Any.fromFunction1(createFolder), exists = js.Any.fromFunction1(exists), getContentType = js.Any.fromFunction1(getContentType), getDateTimeModified = js.Any.fromFunction1(getDateTimeModified), getFolderContents = js.Any.fromFunction2(getFolderContents), getSize = js.Any.fromFunction1(getSize), isFolder = js.Any.fromFunction1(isFolder), isReadOnly = js.Any.fromFunction1(isReadOnly), kill = js.Any.fromFunction1(kill), move = js.Any.fromFunction2(move), openFileRead = js.Any.fromFunction1(openFileRead), openFileReadWrite = js.Any.fromFunction1(openFileReadWrite), openFileWrite = js.Any.fromFunction1(openFileWrite), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setInteractionHandler = js.Any.fromFunction1(setInteractionHandler), setReadOnly = js.Any.fromFunction2(setReadOnly))
    __obj.asInstanceOf[XSimpleFileAccess]
  }
  
  extension [Self <: XSimpleFileAccess](x: Self) {
    
    inline def setCopy(value: (String, String) => Unit): Self = StObject.set(x, "copy", js.Any.fromFunction2(value))
    
    inline def setCreateFolder(value: String => Unit): Self = StObject.set(x, "createFolder", js.Any.fromFunction1(value))
    
    inline def setExists(value: String => Boolean): Self = StObject.set(x, "exists", js.Any.fromFunction1(value))
    
    inline def setGetContentType(value: String => String): Self = StObject.set(x, "getContentType", js.Any.fromFunction1(value))
    
    inline def setGetDateTimeModified(value: String => DateTime): Self = StObject.set(x, "getDateTimeModified", js.Any.fromFunction1(value))
    
    inline def setGetFolderContents(value: (String, Boolean) => SafeArray[String]): Self = StObject.set(x, "getFolderContents", js.Any.fromFunction2(value))
    
    inline def setGetSize(value: String => Double): Self = StObject.set(x, "getSize", js.Any.fromFunction1(value))
    
    inline def setIsFolder(value: String => Boolean): Self = StObject.set(x, "isFolder", js.Any.fromFunction1(value))
    
    inline def setIsReadOnly(value: String => Boolean): Self = StObject.set(x, "isReadOnly", js.Any.fromFunction1(value))
    
    inline def setKill(value: String => Unit): Self = StObject.set(x, "kill", js.Any.fromFunction1(value))
    
    inline def setMove(value: (String, String) => Unit): Self = StObject.set(x, "move", js.Any.fromFunction2(value))
    
    inline def setOpenFileRead(value: String => XInputStream): Self = StObject.set(x, "openFileRead", js.Any.fromFunction1(value))
    
    inline def setOpenFileReadWrite(value: String => XStream): Self = StObject.set(x, "openFileReadWrite", js.Any.fromFunction1(value))
    
    inline def setOpenFileWrite(value: String => XOutputStream): Self = StObject.set(x, "openFileWrite", js.Any.fromFunction1(value))
    
    inline def setSetInteractionHandler(value: XInteractionHandler => Unit): Self = StObject.set(x, "setInteractionHandler", js.Any.fromFunction1(value))
    
    inline def setSetReadOnly(value: (String, Boolean) => Unit): Self = StObject.set(x, "setReadOnly", js.Any.fromFunction2(value))
  }
}
