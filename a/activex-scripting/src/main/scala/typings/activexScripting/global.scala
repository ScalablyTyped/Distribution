package typings.activexScripting

import typings.activexScripting.Scripting.DriveTypeConst
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Scripting {
    
    /** Drive Object */
    @JSGlobal("Scripting.Drive")
    @js.native
    class Drive protected ()
      extends StObject
         with typings.activexScripting.Scripting.Drive {
      
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
      var ScriptingDotDrive_typekey: typings.activexScripting.Scripting.Drive = js.native
      
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
      var VolumeName: String = js.native
    }
    
    /** File object */
    @JSGlobal("Scripting.File")
    @js.native
    class File protected ()
      extends StObject
         with typings.activexScripting.Scripting.File
    
    /** FileSystem Object */
    @JSGlobal("Scripting.FileSystemObject")
    @js.native
    class FileSystemObject protected ()
      extends StObject
         with typings.activexScripting.Scripting.FileSystemObject
    
    /** Folder object */
    @JSGlobal("Scripting.Folder")
    @js.native
    class Folder protected ()
      extends StObject
         with typings.activexScripting.Scripting.Folder
    
    /** TextStream object */
    @JSGlobal("Scripting.TextStream")
    @js.native
    class TextStream protected ()
      extends StObject
         with typings.activexScripting.Scripting.TextStream
  }
}
