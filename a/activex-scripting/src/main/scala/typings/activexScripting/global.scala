package typings.activexScripting

import typings.activexScripting.Scripting.DriveTypeConst
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  object Scripting extends js.Object {
    /** Drive Object */
    @js.native
    class Drive protected ()
      extends typings.activexScripting.Scripting.Drive {
      /** Get available space */
      /* CompleteClass */
      override val AvailableSpace: Double = js.native
      /** Drive letter */
      /* CompleteClass */
      override val DriveLetter: String = js.native
      /** Drive type */
      /* CompleteClass */
      override val DriveType: DriveTypeConst = js.native
      /** Filesystem type */
      /* CompleteClass */
      override val FileSystem: String = js.native
      /** Get drive free space */
      /* CompleteClass */
      override val FreeSpace: Double = js.native
      /** Check if disk is available */
      /* CompleteClass */
      override val IsReady: Boolean = js.native
      /** Path */
      /* CompleteClass */
      override val Path: String = js.native
      /** Root folder */
      /* CompleteClass */
      override val RootFolder: typings.activexScripting.Scripting.Folder = js.native
      /* CompleteClass */
      @JSName("Scripting.Drive_typekey")
      override var ScriptingDotDrive_typekey: typings.activexScripting.Scripting.Drive = js.native
      /** Serial number */
      /* CompleteClass */
      override val SerialNumber: Double = js.native
      /** Share name */
      /* CompleteClass */
      override val ShareName: String = js.native
      /** Get total drive size */
      /* CompleteClass */
      override val TotalSize: Double = js.native
      /** Name of volume */
      /* CompleteClass */
      override var VolumeName: String = js.native
    }
    
    /** File object */
    @js.native
    class File protected ()
      extends typings.activexScripting.Scripting.File
    
    /** FileSystem Object */
    @js.native
    class FileSystemObject protected ()
      extends typings.activexScripting.Scripting.FileSystemObject
    
    /** Folder object */
    @js.native
    class Folder protected ()
      extends typings.activexScripting.Scripting.Folder
    
    /** TextStream object */
    @js.native
    class TextStream protected ()
      extends typings.activexScripting.Scripting.TextStream
    
  }
  
}

