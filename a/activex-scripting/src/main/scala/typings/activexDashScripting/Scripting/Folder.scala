package typings.activexDashScripting.Scripting

import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Folder object */
@JSGlobal("Scripting.Folder")
@js.native
class Folder protected () extends js.Object {
  /** Folder attributes */
  var Attributes: FileAttribute = js.native
  /** Date folder was created */
  val DateCreated: VarDate = js.native
  /** Date folder was last accessed */
  val DateLastAccessed: VarDate = js.native
  /** Date folder was last modified */
  val DateLastModified: VarDate = js.native
  /** Get drive that contains folder */
  val Drive: typings.activexDashScripting.Scripting.Drive = js.native
  /** Get files collection */
  @JSName("Files")
  val Files_Original: Files = js.native
  /** True if folder is root */
  val IsRootFolder: Boolean = js.native
  /** Get name of folder */
  var Name: String = js.native
  /** Get parent folder */
  val ParentFolder: Folder = js.native
  /** Path to folder */
  val Path: String = js.native
  @JSName("Scripting.Folder_typekey")
  var ScriptingDotFolder_typekey: Folder = js.native
  /** Short name */
  val ShortName: String = js.native
  /** Short path */
  val ShortPath: String = js.native
  /** Sum of files and subfolders */
  val Size: Double = js.native
  /** Get folders collection */
  @JSName("SubFolders")
  val SubFolders_Original: Folders = js.native
  /** Type description */
  val Type: String = js.native
  /**
    * Copy this folder
    * @param boolean [OverWriteFiles=true]
    */
  def Copy(Destination: String): Unit = js.native
  def Copy(Destination: String, OverWriteFiles: Boolean): Unit = js.native
  /**
    * Create a file as a TextStream
    * @param boolean [Overwrite=true]
    * @param boolean [Unicode=false]
    */
  def CreateTextFile(FileName: String): TextStream = js.native
  def CreateTextFile(FileName: String, Overwrite: Boolean): TextStream = js.native
  def CreateTextFile(FileName: String, Overwrite: Boolean, Unicode: Boolean): TextStream = js.native
  /**
    * Delete this folder
    * @param boolean [Force=false] Pass `true` to delete the folder even if the read-only attribute set
    */
  def Delete(): Unit = js.native
  def Delete(Force: Boolean): Unit = js.native
  /** Get file */
  /** Get files collection */
  def Files(Key: String): File = js.native
  /** Move this folder */
  def Move(Destination: String): Unit = js.native
  /** Get folder in collection using the folder's name */
  /** Get folders collection */
  def SubFolders(Key: String): Folder = js.native
}

