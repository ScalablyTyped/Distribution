package typings.activexScripting.Scripting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Drive Object */
@js.native
trait Drive extends js.Object {
  
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
  
  @JSName("Scripting.Drive_typekey")
  var ScriptingDotDrive_typekey: Drive = js.native
  
  /** Serial number */
  val SerialNumber: Double = js.native
  
  /** Share name */
  val ShareName: String = js.native
  
  /** Get total drive size */
  val TotalSize: Double = js.native
  
  /** Name of volume */
  var VolumeName: String = js.native
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
  
  @scala.inline
  implicit class DriveOps[Self <: Drive] (val x: Self) extends AnyVal {
    
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
    def setAvailableSpace(value: Double): Self = this.set("AvailableSpace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDriveLetter(value: String): Self = this.set("DriveLetter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDriveType(value: DriveTypeConst): Self = this.set("DriveType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileSystem(value: String): Self = this.set("FileSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFreeSpace(value: Double): Self = this.set("FreeSpace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsReady(value: Boolean): Self = this.set("IsReady", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = this.set("Path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootFolder(value: Folder): Self = this.set("RootFolder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScriptingDotDrive_typekey(value: Drive): Self = this.set("Scripting.Drive_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSerialNumber(value: Double): Self = this.set("SerialNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShareName(value: String): Self = this.set("ShareName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalSize(value: Double): Self = this.set("TotalSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeName(value: String): Self = this.set("VolumeName", value.asInstanceOf[js.Any])
  }
}
