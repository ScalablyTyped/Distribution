package typings.activexDashScripting.ScriptingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Drive Object */
@JSGlobal("Scripting.Drive")
@js.native
class Drive protected () extends js.Object {
  /** Get available space */
  val AvailableSpace: Double = js.native
  /** Drive letter */
  val DriveLetter: String = js.native
  /** Drive type */
  val DriveType: DriveTypeConst = js.native
  /** Filesystem type */
  val FileSystem: String = js.native
  /** Get drive free space */
  val FreeSpace: Double = js.native
  /** Check if disk is available */
  val IsReady: Boolean = js.native
  /** Path */
  val Path: String = js.native
  /** Root folder */
  val RootFolder: Folder = js.native
  var `Scripting.Drive_typekey`: Drive = js.native
  /** Serial number */
  val SerialNumber: Double = js.native
  /** Share name */
  val ShareName: String = js.native
  /** Get total drive size */
  val TotalSize: Double = js.native
  /** Name of volume */
  var VolumeName: String = js.native
}

