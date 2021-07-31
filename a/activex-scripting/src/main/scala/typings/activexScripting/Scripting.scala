package typings.activexScripting

import typings.activexScripting.activexScriptingNumbers.`-1`
import typings.activexScripting.activexScriptingNumbers.`-2`
import typings.activexScripting.activexScriptingNumbers.`0`
import typings.activexScripting.activexScriptingNumbers.`1024`
import typings.activexScripting.activexScriptingNumbers.`16`
import typings.activexScripting.activexScriptingNumbers.`1`
import typings.activexScripting.activexScriptingNumbers.`2048`
import typings.activexScripting.activexScriptingNumbers.`2`
import typings.activexScripting.activexScriptingNumbers.`32`
import typings.activexScripting.activexScriptingNumbers.`3`
import typings.activexScripting.activexScriptingNumbers.`4`
import typings.activexScripting.activexScriptingNumbers.`5`
import typings.activexScripting.activexScriptingNumbers.`8`
import typings.std.SafeArray
import typings.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Scripting {
  
  // tslint:disable-next-line:no-const-enum
  /* Rewritten from type alias, can be one of: 
    - typings.activexScripting.activexScriptingNumbers.`0`
    - typings.activexScripting.activexScriptingNumbers.`2`
    - typings.activexScripting.activexScriptingNumbers.`1`
  */
  trait CompareMethod extends StObject
  object CompareMethod {
    
    @scala.inline
    def BinaryCompare: `0` = 0.asInstanceOf[`0`]
    
    @scala.inline
    def DatabaseCompare: `2` = 2.asInstanceOf[`2`]
    
    @scala.inline
    def TextCompare: `1` = 1.asInstanceOf[`1`]
  }
  
  /** Scripting.Dictionary */
  @js.native
  trait Dictionary[TKey, TItem] extends StObject {
    
    /** Set or get the item for a given key */
    def apply(Key: TKey): TItem = js.native
    
    /** Add a new key and item to the dictionary. */
    def Add(Key: TKey, Item: TItem): Unit = js.native
    
    /** Set or get the string comparison method. */
    var CompareMode: CompareMethod = js.native
    
    /** Get the number of items in the dictionary. */
    val Count: Double = js.native
    
    /** Determine if a given key is in the dictionary. */
    def Exists(Key: TKey): Boolean = js.native
    
    def HashVal(Key: TKey): js.Any = js.native
    
    /** Set or get the item for a given key */
    def Item(Key: TKey): TItem = js.native
    
    /** Get an array containing all items in the dictionary. */
    def Items(): SafeArray[TItem] = js.native
    
    /** Change a key to a different key. */
    def Key(Key: TKey): TKey = js.native
    
    /** Get an array containing all keys in the dictionary. */
    def Keys(): SafeArray[TKey] = js.native
    
    /** Remove a given key from the dictionary. */
    def Remove(Key: TKey): Unit = js.native
    
    /** Remove all information from the dictionary. */
    def RemoveAll(): Unit = js.native
  }
  
  /** Drive Object */
  trait Drive extends StObject {
    
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
    
    @scala.inline
    implicit class DriveMutableBuilder[Self <: Drive] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAvailableSpace(value: Double): Self = StObject.set(x, "AvailableSpace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDriveLetter(value: String): Self = StObject.set(x, "DriveLetter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDriveType(value: DriveTypeConst): Self = StObject.set(x, "DriveType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileSystem(value: String): Self = StObject.set(x, "FileSystem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFreeSpace(value: Double): Self = StObject.set(x, "FreeSpace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsReady(value: Boolean): Self = StObject.set(x, "IsReady", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "Path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootFolder(value: Folder): Self = StObject.set(x, "RootFolder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScriptingDotDrive_typekey(value: Drive): Self = StObject.set(x, "Scripting.Drive_typekey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSerialNumber(value: Double): Self = StObject.set(x, "SerialNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShareName(value: String): Self = StObject.set(x, "ShareName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalSize(value: Double): Self = StObject.set(x, "TotalSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVolumeName(value: String): Self = StObject.set(x, "VolumeName", value.asInstanceOf[js.Any])
    }
  }
  
  // tslint:disable-next-line:no-const-enum
  /* Rewritten from type alias, can be one of: 
    - typings.activexScripting.activexScriptingNumbers.`4`
    - typings.activexScripting.activexScriptingNumbers.`2`
    - typings.activexScripting.activexScriptingNumbers.`5`
    - typings.activexScripting.activexScriptingNumbers.`3`
    - typings.activexScripting.activexScriptingNumbers.`1`
    - typings.activexScripting.activexScriptingNumbers.`0`
  */
  trait DriveTypeConst extends StObject
  object DriveTypeConst {
    
    @scala.inline
    def CDRom: `4` = 4.asInstanceOf[`4`]
    
    @scala.inline
    def Fixed: `2` = 2.asInstanceOf[`2`]
    
    @scala.inline
    def RamDisk: `5` = 5.asInstanceOf[`5`]
    
    @scala.inline
    def Remote: `3` = 3.asInstanceOf[`3`]
    
    @scala.inline
    def Removable: `1` = 1.asInstanceOf[`1`]
    
    @scala.inline
    def UnknownType: `0` = 0.asInstanceOf[`0`]
  }
  
  /** Collection of drives associated with drive letters */
  @js.native
  trait Drives extends StObject {
    
    /** Get drive using the drive letter (`C`) or path (`C:\\`) */
    def apply(Key: String): Drive = js.native
    
    /** Number of drives */
    val Count: Double = js.native
    
    /** Get drive using the drive letter (`C`) or path (`C:\\`) */
    def Item(Key: String): Drive = js.native
  }
  
  /** Script Encoder Object */
  @js.native
  trait Encoder extends StObject {
    
    /** Call the Encoder determined by szExt, passing bstrStreamIn and optional arguments */
    def apply(szExt: String, bstrStreamIn: String, cFlags: Double, bstrDefaultLang: String): String = js.native
    
    /** Call the Encoder determined by szExt, passing bstrStreamIn and optional arguments */
    def EncodeScriptFile(szExt: String, bstrStreamIn: String, cFlags: Double, bstrDefaultLang: String): String = js.native
  }
  
  /** File object */
  @js.native
  trait File extends StObject {
    
    /** File attributes */
    var Attributes: FileAttribute = js.native
    
    /**
      * Copy this file
      * @param boolean [OverWriteFiles=true]
      */
    def Copy(Destination: String): Unit = js.native
    def Copy(Destination: String, OverWriteFiles: Boolean): Unit = js.native
    
    /** Date file was created */
    val DateCreated: VarDate = js.native
    
    /** Date file was last accessed */
    val DateLastAccessed: VarDate = js.native
    
    /** Date file was last modified */
    val DateLastModified: VarDate = js.native
    
    /**
      * Delete this file
      * @param boolean [Force=false] Pass `true` to delete the file even if the read-only attribute is set
      */
    def Delete(): Unit = js.native
    def Delete(Force: Boolean): Unit = js.native
    
    /** Get drive that contains file */
    val Drive: typings.activexScripting.Scripting.Drive = js.native
    
    /** Move this file */
    def Move(Destination: String): Unit = js.native
    
    /** Get name of file */
    var Name: String = js.native
    
    /**
      * Open a file as a TextStream
      * @param Scripting.IOMode [IOMode=1]
      * @param Scripting.Tristate [Format=0]
      */
    def OpenAsTextStream(): TextStream = js.native
    def OpenAsTextStream(IOMode: Unit, Format: Tristate): TextStream = js.native
    def OpenAsTextStream(IOMode: IOMode): TextStream = js.native
    def OpenAsTextStream(IOMode: IOMode, Format: Tristate): TextStream = js.native
    
    /** Get folder that contains file */
    val ParentFolder: Folder = js.native
    
    /** Path to the file */
    val Path: String = js.native
    
    @JSName("Scripting.File_typekey")
    var ScriptingDotFile_typekey: File = js.native
    
    /** Short name */
    val ShortName: String = js.native
    
    /** Short path */
    val ShortPath: String = js.native
    
    /** File size */
    val Size: Double = js.native
    
    /** Type description */
    val Type: String = js.native
  }
  
  // tslint:disable-next-line:no-const-enum
  /* Rewritten from type alias, can be one of: 
    - typings.activexScripting.activexScriptingNumbers.`1024`
    - typings.activexScripting.activexScriptingNumbers.`32`
    - typings.activexScripting.activexScriptingNumbers.`2048`
    - typings.activexScripting.activexScriptingNumbers.`16`
    - typings.activexScripting.activexScriptingNumbers.`2`
    - typings.activexScripting.activexScriptingNumbers.`0`
    - typings.activexScripting.activexScriptingNumbers.`1`
    - typings.activexScripting.activexScriptingNumbers.`4`
    - typings.activexScripting.activexScriptingNumbers.`8`
  */
  trait FileAttribute extends StObject
  object FileAttribute {
    
    @scala.inline
    def Alias: `1024` = 1024.asInstanceOf[`1024`]
    
    @scala.inline
    def Archive: `32` = 32.asInstanceOf[`32`]
    
    @scala.inline
    def Compressed: `2048` = 2048.asInstanceOf[`2048`]
    
    @scala.inline
    def Directory: `16` = 16.asInstanceOf[`16`]
    
    @scala.inline
    def Hidden: `2` = 2.asInstanceOf[`2`]
    
    @scala.inline
    def Normal: `0` = 0.asInstanceOf[`0`]
    
    @scala.inline
    def ReadOnly: `1` = 1.asInstanceOf[`1`]
    
    @scala.inline
    def System: `4` = 4.asInstanceOf[`4`]
    
    @scala.inline
    def Volume: `8` = 8.asInstanceOf[`8`]
  }
  
  /** FileSystem Object */
  @js.native
  trait FileSystemObject extends StObject {
    
    /** Generate a path from an existing path and a name */
    def BuildPath(Path: String, Name: String): String = js.native
    
    /**
      * Copy a file
      * @param boolean [OverWriteFiles=true]
      */
    def CopyFile(Source: String, Destination: String): Unit = js.native
    def CopyFile(Source: String, Destination: String, OverWriteFiles: Boolean): Unit = js.native
    
    /**
      * Copy a folder
      * @param boolean [OverWriteFiles=true]
      */
    def CopyFolder(Source: String, Destination: String): Unit = js.native
    def CopyFolder(Source: String, Destination: String, OverWriteFiles: Boolean): Unit = js.native
    
    /** Create a folder */
    def CreateFolder(Path: String): Folder = js.native
    
    /**
      * Create a file as a TextStream
      * @param boolean [Overwrite=true]
      * @param boolean [Unicode=false]
      */
    def CreateTextFile(FileName: String): TextStream = js.native
    def CreateTextFile(FileName: String, Overwrite: Boolean): TextStream = js.native
    def CreateTextFile(FileName: String, Overwrite: Boolean, Unicode: Boolean): TextStream = js.native
    def CreateTextFile(FileName: String, Overwrite: Unit, Unicode: Boolean): TextStream = js.native
    
    /**
      * Delete a file
      * @param boolean [Force=false] Pass `true` to also delete files with the read-only attribute set
      */
    def DeleteFile(FileSpec: String): Unit = js.native
    def DeleteFile(FileSpec: String, Force: Boolean): Unit = js.native
    
    /**
      * Delete a folder
      * @param boolean [Force=false] Pass `true` to also delete folders with the read-only attribute set
      */
    def DeleteFolder(FolderSpec: String): Unit = js.native
    def DeleteFolder(FolderSpec: String, Force: Boolean): Unit = js.native
    
    /** Check if a drive or a share exists */
    def DriveExists(DriveSpec: String): Boolean = js.native
    
    /** Get drive using the drive letter (`C`) or path (`C:\\`) */
    /** Get drives collection */
    def Drives(Key: String): Drive = js.native
    /** Get drives collection */
    @JSName("Drives")
    val Drives_Original: Drives = js.native
    
    /** Check if a file exists */
    def FileExists(FileSpec: String): Boolean = js.native
    
    /** Check if a path exists */
    def FolderExists(FolderSpec: String): Boolean = js.native
    
    /** Return the canonical representation of the path */
    def GetAbsolutePathName(Path: String): String = js.native
    
    /** Return base name from a path */
    def GetBaseName(Path: String): String = js.native
    
    /** Get drive or UNC share */
    def GetDrive(DriveSpec: String): Drive = js.native
    
    /** Return drive from a path */
    def GetDriveName(Path: String): String = js.native
    
    /** Return extension from path */
    def GetExtensionName(Path: String): String = js.native
    
    /** Get file */
    def GetFile(FilePath: String): File = js.native
    
    /** Return the file name from a path */
    def GetFileName(Path: String): String = js.native
    
    /** Retrieve the file version of the specified file into a string */
    def GetFileVersion(FileName: String): String = js.native
    
    /** Get folder */
    def GetFolder(FolderPath: String): Folder = js.native
    
    /** Return path to the parent folder */
    def GetParentFolderName(Path: String): String = js.native
    
    /** Get location of various system folders */
    def GetSpecialFolder(SpecialFolder: SpecialFolderConst): Folder = js.native
    
    /**
      * Retrieve the standard input, output or error stream
      * @param boolean [Unicode=false]
      */
    def GetStandardStream(StandardStreamType: StandardStreamTypes): TextStream = js.native
    def GetStandardStream(StandardStreamType: StandardStreamTypes, Unicode: Boolean): TextStream = js.native
    
    /** Generate name that can be used to name a temporary file */
    def GetTempName(): String = js.native
    
    /** Move a file */
    def MoveFile(Source: String, Destination: String): Unit = js.native
    
    /** Move a folder */
    def MoveFolder(Source: String, Destination: String): Unit = js.native
    
    /**
      * Open a file as a TextStream
      * @param Scripting.IOMode [IOMode=1]
      * @param boolean [Create=false]
      * @param Scripting.Tristate [Format=0] **TristateTrue** opens the file as Unicode; **TristateFalse** opens the file as ASCII;  **TristateUseDefault** opens the file with  the system default
      */
    def OpenTextFile(FileName: String): TextStream = js.native
    def OpenTextFile(FileName: String, IOMode: Unit, Create: Boolean): TextStream = js.native
    def OpenTextFile(FileName: String, IOMode: Unit, Create: Boolean, Format: Tristate): TextStream = js.native
    def OpenTextFile(FileName: String, IOMode: Unit, Create: Unit, Format: Tristate): TextStream = js.native
    def OpenTextFile(FileName: String, IOMode: IOMode): TextStream = js.native
    def OpenTextFile(FileName: String, IOMode: IOMode, Create: Boolean): TextStream = js.native
    def OpenTextFile(FileName: String, IOMode: IOMode, Create: Boolean, Format: Tristate): TextStream = js.native
    def OpenTextFile(FileName: String, IOMode: IOMode, Create: Unit, Format: Tristate): TextStream = js.native
    
    @JSName("Scripting.FileSystemObject_typekey")
    var ScriptingDotFileSystemObject_typekey: FileSystemObject = js.native
  }
  
  /** Collection of files in a folder */
  @js.native
  trait Files extends StObject {
    
    /** Get file */
    def apply(Key: String): File = js.native
    
    /** Number of folders */
    val Count: Double = js.native
    
    /** Get file object using the name and extension of the file */
    def Item(Key: String): File = js.native
  }
  
  /** Folder object */
  @js.native
  trait Folder extends StObject {
    
    /** Folder attributes */
    var Attributes: FileAttribute = js.native
    
    /**
      * Copy this folder
      * @param boolean [OverWriteFiles=true]
      */
    def Copy(Destination: String): Unit = js.native
    def Copy(Destination: String, OverWriteFiles: Boolean): Unit = js.native
    
    /**
      * Create a file as a TextStream
      * @param boolean [Overwrite=true]
      * @param boolean [Unicode=false]
      */
    def CreateTextFile(FileName: String): TextStream = js.native
    def CreateTextFile(FileName: String, Overwrite: Boolean): TextStream = js.native
    def CreateTextFile(FileName: String, Overwrite: Boolean, Unicode: Boolean): TextStream = js.native
    def CreateTextFile(FileName: String, Overwrite: Unit, Unicode: Boolean): TextStream = js.native
    
    /** Date folder was created */
    val DateCreated: VarDate = js.native
    
    /** Date folder was last accessed */
    val DateLastAccessed: VarDate = js.native
    
    /** Date folder was last modified */
    val DateLastModified: VarDate = js.native
    
    /**
      * Delete this folder
      * @param boolean [Force=false] Pass `true` to delete the folder even if the read-only attribute set
      */
    def Delete(): Unit = js.native
    def Delete(Force: Boolean): Unit = js.native
    
    /** Get drive that contains folder */
    val Drive: typings.activexScripting.Scripting.Drive = js.native
    
    /** Get file */
    /** Get files collection */
    def Files(Key: String): File = js.native
    /** Get files collection */
    @JSName("Files")
    val Files_Original: Files = js.native
    
    /** True if folder is root */
    val IsRootFolder: Boolean = js.native
    
    /** Move this folder */
    def Move(Destination: String): Unit = js.native
    
    /** Get name of folder */
    var Name: String = js.native
    
    /** Get parent folder */
    val ParentFolder: Folder = js.native
    
    /** Path to folder */
    val Path: String = js.native
    
    @JSName("Scripting.Folder_typekey")
    var ScriptingDotFolder_typekey: Folder = js.native
    
    /** Short name */
    val ShortName: String = js.native
    
    /** Short path */
    val ShortPath: String = js.native
    
    /** Sum of files and subfolders */
    val Size: Double = js.native
    
    /** Get folder in collection using the folder's name */
    /** Get folders collection */
    def SubFolders(Key: String): Folder = js.native
    /** Get folders collection */
    @JSName("SubFolders")
    val SubFolders_Original: Folders = js.native
    
    /** Type description */
    val Type: String = js.native
  }
  
  /** Collection of subfolders in a folder */
  @js.native
  trait Folders extends StObject {
    
    /** Get folder in collection using the folder's name */
    def apply(Key: String): Folder = js.native
    
    /** Create a new folder */
    def Add(Name: String): Folder = js.native
    
    /** Number of folders */
    val Count: Double = js.native
    
    /** Get folder in collection using the folder's name */
    def Item(Key: String): Folder = js.native
  }
  
  // tslint:disable-next-line:no-const-enum
  /* Rewritten from type alias, can be one of: 
    - typings.activexScripting.activexScriptingNumbers.`8`
    - typings.activexScripting.activexScriptingNumbers.`1`
    - typings.activexScripting.activexScriptingNumbers.`2`
  */
  trait IOMode extends StObject
  object IOMode {
    
    @scala.inline
    def ForAppending: `8` = 8.asInstanceOf[`8`]
    
    @scala.inline
    def ForReading: `1` = 1.asInstanceOf[`1`]
    
    @scala.inline
    def ForWriting: `2` = 2.asInstanceOf[`2`]
  }
  
  // tslint:disable-next-line:no-const-enum
  /* Rewritten from type alias, can be one of: 
    - typings.activexScripting.activexScriptingNumbers.`1`
    - typings.activexScripting.activexScriptingNumbers.`2`
    - typings.activexScripting.activexScriptingNumbers.`0`
  */
  trait SpecialFolderConst extends StObject
  object SpecialFolderConst {
    
    @scala.inline
    def SystemFolder: `1` = 1.asInstanceOf[`1`]
    
    @scala.inline
    def TemporaryFolder: `2` = 2.asInstanceOf[`2`]
    
    @scala.inline
    def WindowsFolder: `0` = 0.asInstanceOf[`0`]
  }
  
  // tslint:disable-next-line:no-const-enum
  /* Rewritten from type alias, can be one of: 
    - typings.activexScripting.activexScriptingNumbers.`2`
    - typings.activexScripting.activexScriptingNumbers.`0`
    - typings.activexScripting.activexScriptingNumbers.`1`
  */
  trait StandardStreamTypes extends StObject
  object StandardStreamTypes {
    
    @scala.inline
    def StdErr: `2` = 2.asInstanceOf[`2`]
    
    @scala.inline
    def StdIn: `0` = 0.asInstanceOf[`0`]
    
    @scala.inline
    def StdOut: `1` = 1.asInstanceOf[`1`]
  }
  
  /** TextStream object */
  @js.native
  trait TextStream extends StObject {
    
    /** Is the current position at the end of a line? */
    val AtEndOfLine: Boolean = js.native
    
    /** Is the current position at the end of the stream? */
    val AtEndOfStream: Boolean = js.native
    
    /** Close a text stream */
    def Close(): Unit = js.native
    
    /** Current column number */
    val Column: Double = js.native
    
    /** Current line number */
    val Line: Double = js.native
    
    /** Read a specific number of characters into a string */
    def Read(Characters: Double): String = js.native
    
    /** Read the entire stream into a string */
    def ReadAll(): String = js.native
    
    /** Read an entire line into a string */
    def ReadLine(): String = js.native
    
    @JSName("Scripting.TextStream_typekey")
    var ScriptingDotTextStream_typekey: TextStream = js.native
    
    /** Skip a specific number of characters */
    def Skip(Characters: Double): Unit = js.native
    
    /** Skip a line */
    def SkipLine(): Unit = js.native
    
    /** Write a string to the stream */
    def Write(Text: String): Unit = js.native
    
    /** Write a number of blank lines to the stream */
    def WriteBlankLines(Lines: Double): Unit = js.native
    
    /**
      * Write a string and an end of line to the stream
      * @param string [Text='']
      */
    def WriteLine(): Unit = js.native
    def WriteLine(Text: String): Unit = js.native
  }
  
  // tslint:disable-next-line:no-const-enum
  /* Rewritten from type alias, can be one of: 
    - typings.activexScripting.activexScriptingNumbers.`0`
    - typings.activexScripting.activexScriptingNumbers.`-2`
    - typings.activexScripting.activexScriptingNumbers.`-1`
  */
  trait Tristate extends StObject
  object Tristate {
    
    @scala.inline
    def TristateFalse: `0` = 0.asInstanceOf[`0`]
    
    @scala.inline
    def TristateMixed: `-2` = -2.asInstanceOf[`-2`]
    
    @scala.inline
    def TristateTrue: `-1` = -1.asInstanceOf[`-1`]
    
    @scala.inline
    def TristateUseDefault: `-2` = -2.asInstanceOf[`-2`]
  }
}
