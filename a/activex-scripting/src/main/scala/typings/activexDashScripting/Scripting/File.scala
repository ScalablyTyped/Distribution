package typings.activexDashScripting.Scripting

import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** File object */
@JSGlobal("Scripting.File")
@js.native
class File protected () extends js.Object {
  /** File attributes */
  var Attributes: FileAttribute = js.native
  /** Date file was created */
  val DateCreated: VarDate = js.native
  /** Date file was last accessed */
  val DateLastAccessed: VarDate = js.native
  /** Date file was last modified */
  val DateLastModified: VarDate = js.native
  /** Get drive that contains file */
  val Drive: typings.activexDashScripting.Scripting.Drive = js.native
  /** Get name of file */
  var Name: String = js.native
  /** Get folder that contains file */
  val ParentFolder: Folder = js.native
  /** Path to the file */
  val Path: String = js.native
  var `Scripting.File_typekey`: File = js.native
  /** Short name */
  val ShortName: String = js.native
  /** Short path */
  val ShortPath: String = js.native
  /** File size */
  val Size: Double = js.native
  /** Type description */
  val Type: String = js.native
  /**
    * Copy this file
    * @param boolean [OverWriteFiles=true]
    */
  def Copy(Destination: String): Unit = js.native
  def Copy(Destination: String, OverWriteFiles: Boolean): Unit = js.native
  /**
    * Delete this file
    * @param boolean [Force=false] Pass `true` to delete the file even if the read-only attribute is set
    */
  def Delete(): Unit = js.native
  def Delete(Force: Boolean): Unit = js.native
  /** Move this file */
  def Move(Destination: String): Unit = js.native
  /**
    * Open a file as a TextStream
    * @param Scripting.IOMode [IOMode=1]
    * @param Scripting.Tristate [Format=0]
    */
  def OpenAsTextStream(): TextStream = js.native
  def OpenAsTextStream(IOMode: IOMode): TextStream = js.native
  def OpenAsTextStream(IOMode: IOMode, Format: Tristate): TextStream = js.native
}

