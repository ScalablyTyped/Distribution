package typings
package activexDashScriptingLib.ScriptingNs

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
  val DateCreated: activexDashInteropLib.VarDate = js.native
  /** Date folder was last accessed */
  val DateLastAccessed: activexDashInteropLib.VarDate = js.native
  /** Date folder was last modified */
  val DateLastModified: activexDashInteropLib.VarDate = js.native
  /** Get drive that contains folder */
  val Drive: Drive = js.native
  /** Get files collection */
  @JSName("Files")
  val Files_Original: Files = js.native
  /** True if folder is root */
  val IsRootFolder: scala.Boolean = js.native
  /** Get name of folder */
  var Name: java.lang.String = js.native
  /** Get parent folder */
  val ParentFolder: Folder = js.native
  /** Path to folder */
  val Path: java.lang.String = js.native
  var `Scripting.Folder_typekey`: Folder = js.native
  /** Short name */
  val ShortName: java.lang.String = js.native
  /** Short path */
  val ShortPath: java.lang.String = js.native
  /** Sum of files and subfolders */
  val Size: scala.Double = js.native
  /** Get folders collection */
  @JSName("SubFolders")
  val SubFolders_Original: Folders = js.native
  /** Type description */
  val Type: java.lang.String = js.native
  /**
    * Copy this folder
    * @param boolean [OverWriteFiles=true]
    */
  def Copy(Destination: java.lang.String): scala.Unit = js.native
  def Copy(Destination: java.lang.String, OverWriteFiles: scala.Boolean): scala.Unit = js.native
  /**
    * Create a file as a TextStream
    * @param boolean [Overwrite=true]
    * @param boolean [Unicode=false]
    */
  def CreateTextFile(FileName: java.lang.String): TextStream = js.native
  def CreateTextFile(FileName: java.lang.String, Overwrite: scala.Boolean): TextStream = js.native
  def CreateTextFile(FileName: java.lang.String, Overwrite: scala.Boolean, Unicode: scala.Boolean): TextStream = js.native
  /**
    * Delete this folder
    * @param boolean [Force=false] Pass `true` to delete the folder even if the read-only attribute set
    */
  def Delete(): scala.Unit = js.native
  def Delete(Force: scala.Boolean): scala.Unit = js.native
  /** Get file */
  /** Get files collection */
  def Files(Key: java.lang.String): File = js.native
  /** Move this folder */
  def Move(Destination: java.lang.String): scala.Unit = js.native
  /** Get folder in collection using the folder's name */
  /** Get folders collection */
  def SubFolders(Key: java.lang.String): Folder = js.native
}

