package typings
package activexDashScriptingLib.ScriptingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Drive Object */
@JSGlobal("Scripting.Drive")
@js.native
class Drive protected () extends js.Object {
  /** Get available space */
  val AvailableSpace: scala.Double = js.native
  /** Drive letter */
  val DriveLetter: java.lang.String = js.native
  /** Drive type */
  val DriveType: DriveTypeConst = js.native
  /** Filesystem type */
  val FileSystem: java.lang.String = js.native
  /** Get drive free space */
  val FreeSpace: scala.Double = js.native
  /** Check if disk is available */
  val IsReady: scala.Boolean = js.native
  /** Path */
  val Path: java.lang.String = js.native
  /** Root folder */
  val RootFolder: Folder = js.native
  var `Scripting.Drive_typekey`: Drive = js.native
  /** Serial number */
  val SerialNumber: scala.Double = js.native
  /** Share name */
  val ShareName: java.lang.String = js.native
  /** Get total drive size */
  val TotalSize: scala.Double = js.native
  /** Name of volume */
  var VolumeName: java.lang.String = js.native
}

