package typings.activexScripting.Scripting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Drive Object */
trait Drive extends js.Object {
  /** Get available space */
  val AvailableSpace: Double
  /** Drive letter */
  val DriveLetter: String
  /** Drive type */
  val DriveType: DriveTypeConst
  /** Filesystem type */
  val FileSystem: String
  /** Get drive free space */
  val FreeSpace: Double
  /** Check if disk is available */
  val IsReady: Boolean
  /** Path */
  val Path: String
  /** Root folder */
  val RootFolder: Folder
  @JSName("Scripting.Drive_typekey")
  var ScriptingDotDrive_typekey: Drive
  /** Serial number */
  val SerialNumber: Double
  /** Share name */
  val ShareName: String
  /** Get total drive size */
  val TotalSize: Double
  /** Name of volume */
  var VolumeName: String
}

object Drive {
  @scala.inline
  def apply(
    AvailableSpace: Double,
    DriveLetter: String,
    DriveType: DriveTypeConst,
    FileSystem: String,
    FreeSpace: Double,
    IsReady: Boolean,
    Path: String,
    RootFolder: Folder,
    ScriptingDotDrive_typekey: Drive,
    SerialNumber: Double,
    ShareName: String,
    TotalSize: Double,
    VolumeName: String
  ): Drive = {
    val __obj = js.Dynamic.literal(AvailableSpace = AvailableSpace.asInstanceOf[js.Any], DriveLetter = DriveLetter.asInstanceOf[js.Any], DriveType = DriveType.asInstanceOf[js.Any], FileSystem = FileSystem.asInstanceOf[js.Any], FreeSpace = FreeSpace.asInstanceOf[js.Any], IsReady = IsReady.asInstanceOf[js.Any], Path = Path.asInstanceOf[js.Any], RootFolder = RootFolder.asInstanceOf[js.Any], SerialNumber = SerialNumber.asInstanceOf[js.Any], ShareName = ShareName.asInstanceOf[js.Any], TotalSize = TotalSize.asInstanceOf[js.Any], VolumeName = VolumeName.asInstanceOf[js.Any])
    __obj.updateDynamic("Scripting.Drive_typekey")(ScriptingDotDrive_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Drive]
  }
}

