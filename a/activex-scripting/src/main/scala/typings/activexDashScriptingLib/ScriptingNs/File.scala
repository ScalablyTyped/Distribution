package typings
package activexDashScriptingLib.ScriptingNs

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
  val DateCreated: activexDashInteropLib.VarDate = js.native
  /** Date file was last accessed */
  val DateLastAccessed: activexDashInteropLib.VarDate = js.native
  /** Date file was last modified */
  val DateLastModified: activexDashInteropLib.VarDate = js.native
  /** Get drive that contains file */
  val Drive: Drive = js.native
  /** Get name of file */
  var Name: java.lang.String = js.native
  /** Get folder that contains file */
  val ParentFolder: Folder = js.native
  /** Path to the file */
  val Path: java.lang.String = js.native
  var `Scripting.File_typekey`: File = js.native
  /** Short name */
  val ShortName: java.lang.String = js.native
  /** Short path */
  val ShortPath: java.lang.String = js.native
  /** File size */
  val Size: scala.Double = js.native
  /** Type description */
  val Type: java.lang.String = js.native
  /**
    * Copy this file
    * @param boolean [OverWriteFiles=true]
    */
  def Copy(Destination: java.lang.String): scala.Unit = js.native
  def Copy(Destination: java.lang.String, OverWriteFiles: scala.Boolean): scala.Unit = js.native
  /**
    * Delete this file
    * @param boolean [Force=false] Pass `true` to delete the file even if the read-only attribute is set
    */
  def Delete(): scala.Unit = js.native
  def Delete(Force: scala.Boolean): scala.Unit = js.native
  /** Move this file */
  def Move(Destination: java.lang.String): scala.Unit = js.native
  /**
    * Open a file as a TextStream
    * @param Scripting.IOMode [IOMode=1]
    * @param Scripting.Tristate [Format=0]
    */
  def OpenAsTextStream(): TextStream = js.native
  def OpenAsTextStream(IOMode: IOMode): TextStream = js.native
  def OpenAsTextStream(IOMode: IOMode, Format: Tristate): TextStream = js.native
}

