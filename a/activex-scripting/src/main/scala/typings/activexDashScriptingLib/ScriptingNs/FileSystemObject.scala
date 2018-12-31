package typings
package activexDashScriptingLib.ScriptingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FileSystem Object */
@JSGlobal("Scripting.FileSystemObject")
@js.native
class FileSystemObject protected () extends js.Object {
  /** Get drives collection */
  @JSName("Drives")
  val Drives_Original: Drives = js.native
  var `Scripting.FileSystemObject_typekey`: FileSystemObject = js.native
  /** Generate a path from an existing path and a name */
  def BuildPath(Path: java.lang.String, Name: java.lang.String): java.lang.String = js.native
  /**
    * Copy a file
    * @param boolean [OverWriteFiles=true]
    */
  def CopyFile(Source: java.lang.String, Destination: java.lang.String): scala.Unit = js.native
  def CopyFile(Source: java.lang.String, Destination: java.lang.String, OverWriteFiles: scala.Boolean): scala.Unit = js.native
  /**
    * Copy a folder
    * @param boolean [OverWriteFiles=true]
    */
  def CopyFolder(Source: java.lang.String, Destination: java.lang.String): scala.Unit = js.native
  def CopyFolder(Source: java.lang.String, Destination: java.lang.String, OverWriteFiles: scala.Boolean): scala.Unit = js.native
  /** Create a folder */
  def CreateFolder(Path: java.lang.String): Folder = js.native
  /**
    * Create a file as a TextStream
    * @param boolean [Overwrite=true]
    * @param boolean [Unicode=false]
    */
  def CreateTextFile(FileName: java.lang.String): TextStream = js.native
  def CreateTextFile(FileName: java.lang.String, Overwrite: scala.Boolean): TextStream = js.native
  def CreateTextFile(FileName: java.lang.String, Overwrite: scala.Boolean, Unicode: scala.Boolean): TextStream = js.native
  /**
    * Delete a file
    * @param boolean [Force=false] Pass `true` to also delete files with the read-only attribute set
    */
  def DeleteFile(FileSpec: java.lang.String): scala.Unit = js.native
  def DeleteFile(FileSpec: java.lang.String, Force: scala.Boolean): scala.Unit = js.native
  /**
    * Delete a folder
    * @param boolean [Force=false] Pass `true` to also delete folders with the read-only attribute set
    */
  def DeleteFolder(FolderSpec: java.lang.String): scala.Unit = js.native
  def DeleteFolder(FolderSpec: java.lang.String, Force: scala.Boolean): scala.Unit = js.native
  /** Check if a drive or a share exists */
  def DriveExists(DriveSpec: java.lang.String): scala.Boolean = js.native
  /** Get drive using the drive letter (`C`) or path (`C:\\`) */
  /** Get drives collection */
  def Drives(Key: java.lang.String): Drive = js.native
  /** Check if a file exists */
  def FileExists(FileSpec: java.lang.String): scala.Boolean = js.native
  /** Check if a path exists */
  def FolderExists(FolderSpec: java.lang.String): scala.Boolean = js.native
  /** Return the canonical representation of the path */
  def GetAbsolutePathName(Path: java.lang.String): java.lang.String = js.native
  /** Return base name from a path */
  def GetBaseName(Path: java.lang.String): java.lang.String = js.native
  /** Get drive or UNC share */
  def GetDrive(DriveSpec: java.lang.String): Drive = js.native
  /** Return drive from a path */
  def GetDriveName(Path: java.lang.String): java.lang.String = js.native
  /** Return extension from path */
  def GetExtensionName(Path: java.lang.String): java.lang.String = js.native
  /** Get file */
  def GetFile(FilePath: java.lang.String): File = js.native
  /** Return the file name from a path */
  def GetFileName(Path: java.lang.String): java.lang.String = js.native
  /** Retrieve the file version of the specified file into a string */
  def GetFileVersion(FileName: java.lang.String): java.lang.String = js.native
  /** Get folder */
  def GetFolder(FolderPath: java.lang.String): Folder = js.native
  /** Return path to the parent folder */
  def GetParentFolderName(Path: java.lang.String): java.lang.String = js.native
  /** Get location of various system folders */
  def GetSpecialFolder(SpecialFolder: SpecialFolderConst): Folder = js.native
  /**
    * Retrieve the standard input, output or error stream
    * @param boolean [Unicode=false]
    */
  def GetStandardStream(StandardStreamType: StandardStreamTypes): TextStream = js.native
  def GetStandardStream(StandardStreamType: StandardStreamTypes, Unicode: scala.Boolean): TextStream = js.native
  /** Generate name that can be used to name a temporary file */
  def GetTempName(): java.lang.String = js.native
  /** Move a file */
  def MoveFile(Source: java.lang.String, Destination: java.lang.String): scala.Unit = js.native
  /** Move a folder */
  def MoveFolder(Source: java.lang.String, Destination: java.lang.String): scala.Unit = js.native
  /**
    * Open a file as a TextStream
    * @param Scripting.IOMode [IOMode=1]
    * @param boolean [Create=false]
    * @param Scripting.Tristate [Format=0] **TristateTrue** opens the file as Unicode; **TristateFalse** opens the file as ASCII;  **TristateUseDefault** opens the file with  the system default
    */
  def OpenTextFile(FileName: java.lang.String): TextStream = js.native
  def OpenTextFile(FileName: java.lang.String, IOMode: IOMode): TextStream = js.native
  def OpenTextFile(FileName: java.lang.String, IOMode: IOMode, Create: scala.Boolean): TextStream = js.native
  def OpenTextFile(FileName: java.lang.String, IOMode: IOMode, Create: scala.Boolean, Format: Tristate): TextStream = js.native
}

