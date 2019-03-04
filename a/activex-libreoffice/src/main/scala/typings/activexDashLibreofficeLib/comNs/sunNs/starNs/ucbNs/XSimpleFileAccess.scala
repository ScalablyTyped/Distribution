package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This is the basic interface to read data from a stream. */
trait XSimpleFileAccess
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Copies a file
    * @param SourceURL URL of the file to be copied
    * @param DestURL URL of the location the file should be copied to
    * @see move
    */
  def copy(SourceURL: java.lang.String, DestURL: java.lang.String): scala.Unit
  /**
    * Creates a new Folder
    * @param NewFolderURL URL describing the location of the new folder
    */
  def createFolder(NewFolderURL: java.lang.String): scala.Unit
  /**
    * Checks if a file exists
    * @param FileURL URL to be checked
    * @returns true, if the File exists, false otherwise
    */
  def exists(FileURL: java.lang.String): scala.Boolean
  /**
    * Returns the content type of a file.
    * @param FileURL URL of the file
    * @returns {@link Content} type of the file
    * @see XContent.getContentType
    */
  def getContentType(FileURL: java.lang.String): java.lang.String
  /**
    * Returns the last modified date for the file
    * @param FileURL URL of the file
    * @returns Last modified date for the file
    */
  def getDateTimeModified(FileURL: java.lang.String): activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.DateTime
  /**
    * Returns the contents of a folder
    * @param FolderURL URL of the folder
    * @param bIncludeFolders true: Subfolders are included, false: No subfolders
    * @returns The content of a folder, each file as one string in a string sequence
    */
  def getFolderContents(FolderURL: java.lang.String, bIncludeFolders: scala.Boolean): activexDashInteropLib.SafeArray[java.lang.String]
  /**
    * Returns the size of a file.
    * @param FileURL URL of the file
    * @returns Size of the file in bytes
    */
  def getSize(FileURL: java.lang.String): scala.Double
  /**
    * Checks if an URL represents a folder
    * @param FileURL URL to be checked
    * @returns true, if the given URL represents a folder, otherwise false
    */
  def isFolder(FileURL: java.lang.String): scala.Boolean
  /**
    * Checks if a file is "read only"
    * @param FileURL URL to be checked
    * @returns true, if the given File is "read only", false otherwise
    */
  def isReadOnly(FileURL: java.lang.String): scala.Boolean
  /**
    * Removes a file. If the URL represents a folder, the folder will be removed, even if it's not empty.
    * @param FileURL File/folder to be removed
    * @see move
    */
  def kill(FileURL: java.lang.String): scala.Unit
  /**
    * Moves a file
    * @param SourceURL URL of the file to be moved
    * @param DestURL URL of the location the file should be moved to
    * @see move
    */
  def move(SourceURL: java.lang.String, DestURL: java.lang.String): scala.Unit
  /**
    * Opens file to read
    * @param FileURL File to open
    * @returns An XInputStream, if the file can be opened for reading
    */
  def openFileRead(FileURL: java.lang.String): activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream
  /**
    * Opens file to read and write
    * @param FileURL File to open
    * @returns An XStream, if the file can be opened for reading and writing
    * @throws UnsupportedDataSinkException the file cannot be opened for random write access. Some resources do not allow random write access. To write data fo
    */
  def openFileReadWrite(FileURL: java.lang.String): activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XStream
  /**
    * Opens file to write.
    * @param FileURL File to open
    * @returns An XOutputStream, if the file can be opened for writing
    * @throws UnsupportedDataSinkException the file cannot be opened for random write access. Some resources do not allow random write access. To write data fo
    */
  def openFileWrite(FileURL: java.lang.String): activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XOutputStream
  /**
    * Sets an interaction handler to be used for further operations.
    *
    * A default interaction handler is available as service {@link com.sun.star.task.InteractionHandler} . The documentation of this service also contains
    * further information about the interaction handler concept.
    * @param Handler The interaction handler to be set
    * @see com.sun.star.task.InteractionHandler
    */
  def setInteractionHandler(Handler: activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.XInteractionHandler): scala.Unit
  /**
    * Sets the "read only" of a file according to the boolean parameter, if the actual process has the right to do so.
    * @param FileURL URL of the file
    * @param bReadOnly true; "read only" flag will be set, false; "read only" flag will be reset
    */
  def setReadOnly(FileURL: java.lang.String, bReadOnly: scala.Boolean): scala.Unit
}

object XSimpleFileAccess {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    copy: js.Function2[java.lang.String, java.lang.String, scala.Unit],
    createFolder: js.Function1[java.lang.String, scala.Unit],
    exists: js.Function1[java.lang.String, scala.Boolean],
    getContentType: js.Function1[java.lang.String, java.lang.String],
    getDateTimeModified: js.Function1[java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.DateTime],
    getFolderContents: js.Function2[java.lang.String, scala.Boolean, activexDashInteropLib.SafeArray[java.lang.String]],
    getSize: js.Function1[java.lang.String, scala.Double],
    isFolder: js.Function1[java.lang.String, scala.Boolean],
    isReadOnly: js.Function1[java.lang.String, scala.Boolean],
    kill: js.Function1[java.lang.String, scala.Unit],
    move: js.Function2[java.lang.String, java.lang.String, scala.Unit],
    openFileRead: js.Function1[java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream],
    openFileReadWrite: js.Function1[java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XStream],
    openFileWrite: js.Function1[java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XOutputStream],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setInteractionHandler: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.XInteractionHandler, 
      scala.Unit
    ],
    setReadOnly: js.Function2[java.lang.String, scala.Boolean, scala.Unit]
  ): XSimpleFileAccess = {
    val __obj = js.Dynamic.literal(acquire = acquire, copy = copy, createFolder = createFolder, exists = exists, getContentType = getContentType, getDateTimeModified = getDateTimeModified, getFolderContents = getFolderContents, getSize = getSize, isFolder = isFolder, isReadOnly = isReadOnly, kill = kill, move = move, openFileRead = openFileRead, openFileReadWrite = openFileReadWrite, openFileWrite = openFileWrite, queryInterface = queryInterface, release = release, setInteractionHandler = setInteractionHandler, setReadOnly = setReadOnly)
  
    __obj.asInstanceOf[XSimpleFileAccess]
  }
}

