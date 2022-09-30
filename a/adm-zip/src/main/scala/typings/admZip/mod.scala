package typings.admZip

import typings.admZip.anon.Filter
import typings.admZip.anon.Overwrite
import typings.admZip.anon.PartialInitOptions
import typings.admZip.anon.TypeofFS
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("adm-zip", JSImport.Namespace)
  @js.native
  /**
    * @param fileNameOrRawData If provided, reads an existing archive. Otherwise creates a new, empty archive.
    * @param options Options when initializing the ZIP file
    */
  open class ^ ()
    extends StObject
       with AdmZip {
    def this(fileNameOrRawData: String) = this()
    def this(fileNameOrRawData: Buffer) = this()
    def this(fileNameOrRawData: String, options: PartialInitOptions) = this()
    def this(fileNameOrRawData: Unit, options: PartialInitOptions) = this()
    def this(fileNameOrRawData: Buffer, options: PartialInitOptions) = this()
  }
  
  @js.native
  trait AdmZip extends StObject {
    
    /**
      * Allows you to create a entry (file or directory) in the zip file.
      * If you want to create a directory the `entryName` must end in `"/"` and a `null`
      * buffer should be provided.
      * @param entryName Entry path.
      * @param content Content to add to the entry; must be a 0-length buffer
      *   for a directory.
      * @param comment Comment to add to the entry.
      * @param attr Attribute to add to the entry.
      */
    def addFile(entryName: String, content: Buffer): Unit = js.native
    def addFile(entryName: String, content: Buffer, comment: String): Unit = js.native
    def addFile(entryName: String, content: Buffer, comment: String, attr: Double): Unit = js.native
    def addFile(entryName: String, content: Buffer, comment: Unit, attr: Double): Unit = js.native
    
    /**
      * Adds a file from the disk to the archive.
      * @param localPath Path to a file on disk.
      * @param zipPath Path to a directory in the archive. Defaults to the empty
      *   string.
      * @param zipName Name for the file.
      * @param comment Comment to be attached to the file
      */
    def addLocalFile(localPath: String): Unit = js.native
    def addLocalFile(localPath: String, zipPath: String): Unit = js.native
    def addLocalFile(localPath: String, zipPath: String, zipName: String): Unit = js.native
    def addLocalFile(localPath: String, zipPath: String, zipName: String, comment: String): Unit = js.native
    def addLocalFile(localPath: String, zipPath: String, zipName: Unit, comment: String): Unit = js.native
    def addLocalFile(localPath: String, zipPath: Unit, zipName: String): Unit = js.native
    def addLocalFile(localPath: String, zipPath: Unit, zipName: String, comment: String): Unit = js.native
    def addLocalFile(localPath: String, zipPath: Unit, zipName: Unit, comment: String): Unit = js.native
    
    /**
      * Adds a local directory and all its nested files and directories to the
      * archive.
      * @param localPath Path to a folder on disk.
      * @param zipPath Path to a folder in the archive. Default: `""`.
      * @param filter RegExp or Function if files match will be included.
      */
    def addLocalFolder(localPath: String): Unit = js.native
    def addLocalFolder(localPath: String, zipPath: String): Unit = js.native
    def addLocalFolder(localPath: String, zipPath: String, filter: js.Function1[/* filename */ String, Boolean]): Unit = js.native
    def addLocalFolder(localPath: String, zipPath: String, filter: js.RegExp): Unit = js.native
    def addLocalFolder(localPath: String, zipPath: Unit, filter: js.Function1[/* filename */ String, Boolean]): Unit = js.native
    def addLocalFolder(localPath: String, zipPath: Unit, filter: js.RegExp): Unit = js.native
    
    /**
      * Asynchronous addLocalFile
      * @param localPath
      * @param callback
      * @param zipPath optional path inside zip
      * @param filter optional RegExp or Function if files match will
      *    be included.
      */
    def addLocalFolderAsync(
      localPath: String,
      callback: js.Function2[/* success */ js.UndefOr[Boolean], /* err */ js.UndefOr[String], Unit]
    ): Unit = js.native
    def addLocalFolderAsync(
      localPath: String,
      callback: js.Function2[/* success */ js.UndefOr[Boolean], /* err */ js.UndefOr[String], Unit],
      zipPath: String
    ): Unit = js.native
    def addLocalFolderAsync(
      localPath: String,
      callback: js.Function2[/* success */ js.UndefOr[Boolean], /* err */ js.UndefOr[String], Unit],
      zipPath: String,
      filter: js.Function1[/* filename */ String, Boolean]
    ): Unit = js.native
    def addLocalFolderAsync(
      localPath: String,
      callback: js.Function2[/* success */ js.UndefOr[Boolean], /* err */ js.UndefOr[String], Unit],
      zipPath: String,
      filter: js.RegExp
    ): Unit = js.native
    def addLocalFolderAsync(
      localPath: String,
      callback: js.Function2[/* success */ js.UndefOr[Boolean], /* err */ js.UndefOr[String], Unit],
      zipPath: Unit,
      filter: js.Function1[/* filename */ String, Boolean]
    ): Unit = js.native
    def addLocalFolderAsync(
      localPath: String,
      callback: js.Function2[/* success */ js.UndefOr[Boolean], /* err */ js.UndefOr[String], Unit],
      zipPath: Unit,
      filter: js.RegExp
    ): Unit = js.native
    
    /**
      *
      * @param localPath - path where files will be extracted
      * @param props - optional properties
      * @param props.zipPath - optional path inside zip
      * @param props.filter - RegExp or Function if files match will be included.
      */
    def addLocalFolderPromise(localPath: String, props: Filter): js.Promise[Unit] = js.native
    
    /**
      * Adds a comment to the zip. The zip must be rewritten after
      * adding the comment.
      * @param comment Content of the comment.
      */
    def addZipComment(comment: String): Unit = js.native
    
    /**
      * Adds a comment to a specified file or `IZipEntry`. The zip must be rewritten after
      * adding the comment.
      * The comment cannot exceed 65535 characters in length.
      * @param entry The full path of the entry or a `IZipEntry` object.
      * @param comment The comment to add to the entry.
      */
    def addZipEntryComment(entry: String, comment: String): Unit = js.native
    def addZipEntryComment(entry: IZipEntry, comment: String): Unit = js.native
    
    /**
      * Remove the entry from the file or the entry and all its nested directories
      * and files if the given entry is a directory.
      * @param entry The full path of the entry or a `IZipEntry` object.
      */
    def deleteFile(entry: String): Unit = js.native
    def deleteFile(entry: IZipEntry): Unit = js.native
    
    /**
      * Extracts the entire archive to the given location.
      * @param targetPath Target location.
      * @param overwrite If the file already exists at the target path, the file
      *   will be overwriten if this is `true`. Default: `false`.
      * @param keepOriginalPermission The file will be set as the permission from
      *   the entry if this is true. Default: `false`.
      * @param password The password for the archive
      */
    def extractAllTo(targetPath: String): Unit = js.native
    def extractAllTo(targetPath: String, overwrite: Boolean): Unit = js.native
    def extractAllTo(targetPath: String, overwrite: Boolean, keepOriginalPermission: Boolean): Unit = js.native
    def extractAllTo(targetPath: String, overwrite: Boolean, keepOriginalPermission: Boolean, password: String): Unit = js.native
    def extractAllTo(targetPath: String, overwrite: Boolean, keepOriginalPermission: Boolean, password: Buffer): Unit = js.native
    def extractAllTo(targetPath: String, overwrite: Boolean, keepOriginalPermission: Unit, password: String): Unit = js.native
    def extractAllTo(targetPath: String, overwrite: Boolean, keepOriginalPermission: Unit, password: Buffer): Unit = js.native
    def extractAllTo(targetPath: String, overwrite: Unit, keepOriginalPermission: Boolean): Unit = js.native
    def extractAllTo(targetPath: String, overwrite: Unit, keepOriginalPermission: Boolean, password: String): Unit = js.native
    def extractAllTo(targetPath: String, overwrite: Unit, keepOriginalPermission: Boolean, password: Buffer): Unit = js.native
    def extractAllTo(targetPath: String, overwrite: Unit, keepOriginalPermission: Unit, password: String): Unit = js.native
    def extractAllTo(targetPath: String, overwrite: Unit, keepOriginalPermission: Unit, password: Buffer): Unit = js.native
    
    /**
      * Extracts the entire archive to the given location.
      * @param targetPath Target location.
      * @param overwrite If the file already exists at the target path, the file
      *   will be overwriten if this is `true`. Default: `false`.
      * @param keepOriginalPermission The file will be set as the permission from
      *   the entry if this is true. Default: `false`.
      * @param callback The callback function will be called after extraction.
      */
    def extractAllToAsync(targetPath: String): Unit = js.native
    def extractAllToAsync(targetPath: String, overwrite: Boolean): Unit = js.native
    def extractAllToAsync(targetPath: String, overwrite: Boolean, keepOriginalPermission: Boolean): Unit = js.native
    def extractAllToAsync(
      targetPath: String,
      overwrite: Boolean,
      keepOriginalPermission: Boolean,
      callback: js.Function1[/* error */ js.UndefOr[js.Error], Unit]
    ): Unit = js.native
    def extractAllToAsync(
      targetPath: String,
      overwrite: Boolean,
      keepOriginalPermission: Unit,
      callback: js.Function1[/* error */ js.UndefOr[js.Error], Unit]
    ): Unit = js.native
    def extractAllToAsync(targetPath: String, overwrite: Unit, keepOriginalPermission: Boolean): Unit = js.native
    def extractAllToAsync(
      targetPath: String,
      overwrite: Unit,
      keepOriginalPermission: Boolean,
      callback: js.Function1[/* error */ js.UndefOr[js.Error], Unit]
    ): Unit = js.native
    def extractAllToAsync(
      targetPath: String,
      overwrite: Unit,
      keepOriginalPermission: Unit,
      callback: js.Function1[/* error */ js.UndefOr[js.Error], Unit]
    ): Unit = js.native
    
    /**
      * Extracts the given entry to the given `targetPath`.
      * If the entry is a directory inside the archive, the entire directory and
      * its subdirectories will be extracted.
      * @param entry The full path of the entry or a `IZipEntry` object.
      * @param targetPath Target folder where to write the file.
      * @param maintainEntryPath If maintainEntryPath is `true` and the entry is
      *   inside a folder, the entry folder will be created in `targetPath` as
      *   well. Default: `true`.
      * @param overwrite If the file already exists at the target path, the file
      *   will be overwriten if this is `true`. Default: `false`.
      * @param keepOriginalPermission The file will be set as the permission from
      *   the entry if this is true. Default: `false`.
      * @param outFileName String If set will override the filename of the
      *   extracted file (Only works if the entry is a file)
      * @return Boolean
      */
    def extractEntryTo(entryPath: String, targetPath: String): Boolean = js.native
    def extractEntryTo(entryPath: String, targetPath: String, maintainEntryPath: Boolean): Boolean = js.native
    def extractEntryTo(entryPath: String, targetPath: String, maintainEntryPath: Boolean, overwrite: Boolean): Boolean = js.native
    def extractEntryTo(
      entryPath: String,
      targetPath: String,
      maintainEntryPath: Boolean,
      overwrite: Boolean,
      keepOriginalPermission: Boolean
    ): Boolean = js.native
    def extractEntryTo(
      entryPath: String,
      targetPath: String,
      maintainEntryPath: Boolean,
      overwrite: Boolean,
      keepOriginalPermission: Boolean,
      outFileName: String
    ): Boolean = js.native
    def extractEntryTo(
      entryPath: String,
      targetPath: String,
      maintainEntryPath: Boolean,
      overwrite: Boolean,
      keepOriginalPermission: Unit,
      outFileName: String
    ): Boolean = js.native
    def extractEntryTo(
      entryPath: String,
      targetPath: String,
      maintainEntryPath: Boolean,
      overwrite: Unit,
      keepOriginalPermission: Boolean
    ): Boolean = js.native
    def extractEntryTo(
      entryPath: String,
      targetPath: String,
      maintainEntryPath: Boolean,
      overwrite: Unit,
      keepOriginalPermission: Boolean,
      outFileName: String
    ): Boolean = js.native
    def extractEntryTo(
      entryPath: String,
      targetPath: String,
      maintainEntryPath: Boolean,
      overwrite: Unit,
      keepOriginalPermission: Unit,
      outFileName: String
    ): Boolean = js.native
    def extractEntryTo(entryPath: String, targetPath: String, maintainEntryPath: Unit, overwrite: Boolean): Boolean = js.native
    def extractEntryTo(
      entryPath: String,
      targetPath: String,
      maintainEntryPath: Unit,
      overwrite: Boolean,
      keepOriginalPermission: Boolean
    ): Boolean = js.native
    def extractEntryTo(
      entryPath: String,
      targetPath: String,
      maintainEntryPath: Unit,
      overwrite: Boolean,
      keepOriginalPermission: Boolean,
      outFileName: String
    ): Boolean = js.native
    def extractEntryTo(
      entryPath: String,
      targetPath: String,
      maintainEntryPath: Unit,
      overwrite: Boolean,
      keepOriginalPermission: Unit,
      outFileName: String
    ): Boolean = js.native
    def extractEntryTo(
      entryPath: String,
      targetPath: String,
      maintainEntryPath: Unit,
      overwrite: Unit,
      keepOriginalPermission: Boolean
    ): Boolean = js.native
    def extractEntryTo(
      entryPath: String,
      targetPath: String,
      maintainEntryPath: Unit,
      overwrite: Unit,
      keepOriginalPermission: Boolean,
      outFileName: String
    ): Boolean = js.native
    def extractEntryTo(
      entryPath: String,
      targetPath: String,
      maintainEntryPath: Unit,
      overwrite: Unit,
      keepOriginalPermission: Unit,
      outFileName: String
    ): Boolean = js.native
    def extractEntryTo(entryPath: IZipEntry, targetPath: String): Boolean = js.native
    def extractEntryTo(entryPath: IZipEntry, targetPath: String, maintainEntryPath: Boolean): Boolean = js.native
    def extractEntryTo(entryPath: IZipEntry, targetPath: String, maintainEntryPath: Boolean, overwrite: Boolean): Boolean = js.native
    def extractEntryTo(
      entryPath: IZipEntry,
      targetPath: String,
      maintainEntryPath: Boolean,
      overwrite: Boolean,
      keepOriginalPermission: Boolean
    ): Boolean = js.native
    def extractEntryTo(
      entryPath: IZipEntry,
      targetPath: String,
      maintainEntryPath: Boolean,
      overwrite: Boolean,
      keepOriginalPermission: Boolean,
      outFileName: String
    ): Boolean = js.native
    def extractEntryTo(
      entryPath: IZipEntry,
      targetPath: String,
      maintainEntryPath: Boolean,
      overwrite: Boolean,
      keepOriginalPermission: Unit,
      outFileName: String
    ): Boolean = js.native
    def extractEntryTo(
      entryPath: IZipEntry,
      targetPath: String,
      maintainEntryPath: Boolean,
      overwrite: Unit,
      keepOriginalPermission: Boolean
    ): Boolean = js.native
    def extractEntryTo(
      entryPath: IZipEntry,
      targetPath: String,
      maintainEntryPath: Boolean,
      overwrite: Unit,
      keepOriginalPermission: Boolean,
      outFileName: String
    ): Boolean = js.native
    def extractEntryTo(
      entryPath: IZipEntry,
      targetPath: String,
      maintainEntryPath: Boolean,
      overwrite: Unit,
      keepOriginalPermission: Unit,
      outFileName: String
    ): Boolean = js.native
    def extractEntryTo(entryPath: IZipEntry, targetPath: String, maintainEntryPath: Unit, overwrite: Boolean): Boolean = js.native
    def extractEntryTo(
      entryPath: IZipEntry,
      targetPath: String,
      maintainEntryPath: Unit,
      overwrite: Boolean,
      keepOriginalPermission: Boolean
    ): Boolean = js.native
    def extractEntryTo(
      entryPath: IZipEntry,
      targetPath: String,
      maintainEntryPath: Unit,
      overwrite: Boolean,
      keepOriginalPermission: Boolean,
      outFileName: String
    ): Boolean = js.native
    def extractEntryTo(
      entryPath: IZipEntry,
      targetPath: String,
      maintainEntryPath: Unit,
      overwrite: Boolean,
      keepOriginalPermission: Unit,
      outFileName: String
    ): Boolean = js.native
    def extractEntryTo(
      entryPath: IZipEntry,
      targetPath: String,
      maintainEntryPath: Unit,
      overwrite: Unit,
      keepOriginalPermission: Boolean
    ): Boolean = js.native
    def extractEntryTo(
      entryPath: IZipEntry,
      targetPath: String,
      maintainEntryPath: Unit,
      overwrite: Unit,
      keepOriginalPermission: Boolean,
      outFileName: String
    ): Boolean = js.native
    def extractEntryTo(
      entryPath: IZipEntry,
      targetPath: String,
      maintainEntryPath: Unit,
      overwrite: Unit,
      keepOriginalPermission: Unit,
      outFileName: String
    ): Boolean = js.native
    
    /**
      * Loop through each entry in the ZIP
      * @param callback The callback that receives each individual entry
      */
    def forEach(callback: js.Function1[/* entry */ IZipEntry, Unit]): Unit = js.native
    
    /**
      * Returns an array of `IZipEntry` objects representing the files and folders
      * inside the archive.
      */
    def getEntries(): js.Array[IZipEntry] = js.native
    
    /**
      * Returns a `IZipEntry` object representing the file or folder specified by `name`.
      * @param name Name of the file or folder to retrieve.
      * @return The entry corresponding to the `name`.
      */
    def getEntry(name: String): IZipEntry | Null = js.native
    
    /**
      * Returns the number of entries in the ZIP
      * @return The amount of entries in the ZIP
      */
    def getEntryCount(): Double = js.native
    
    /**
      * @return The zip comment.
      */
    def getZipComment(): String = js.native
    
    /**
      * Returns the comment of the specified entry.
      * @param entry The full path of the entry or a `IZipEntry` object.
      * @return The comment of the specified entry.
      */
    def getZipEntryComment(entry: String): String = js.native
    def getZipEntryComment(entry: IZipEntry): String = js.native
    
    /**
      * Extracts the given entry from the archive and returns the content as
      * plain text in the given encoding.
      * @param entry The full path of the entry or a `IZipEntry` object.
      * @param encoding If no encoding is specified `"utf8"` is used.
      */
    def readAsText(fileName: String): String = js.native
    def readAsText(fileName: String, encoding: String): String = js.native
    def readAsText(fileName: IZipEntry): String = js.native
    def readAsText(fileName: IZipEntry, encoding: String): String = js.native
    
    /**
      * Asynchronous `readAsText`.
      * @param entry The full path of the entry or a `IZipEntry` object.
      * @param callback Called with the resulting string.
      * @param encoding If no encoding is specified `"utf8"` is used.
      */
    def readAsTextAsync(fileName: String, callback: js.Function2[/* data */ String, /* err */ String, Unit]): Unit = js.native
    def readAsTextAsync(
      fileName: String,
      callback: js.Function2[/* data */ String, /* err */ String, Unit],
      encoding: String
    ): Unit = js.native
    def readAsTextAsync(fileName: IZipEntry, callback: js.Function2[/* data */ String, /* err */ String, Unit]): Unit = js.native
    def readAsTextAsync(
      fileName: IZipEntry,
      callback: js.Function2[/* data */ String, /* err */ String, Unit],
      encoding: String
    ): Unit = js.native
    
    /**
      * Extracts the given entry from the archive and returns the content as a Buffer object
      * @param entry ZipEntry object or String with the full path of the entry
      * @param pass Password used for decrypting the file
      * @return Buffer or Null in case of error
      */
    def readFile(entry: String): Buffer | Null = js.native
    def readFile(entry: String, pass: String): Buffer | Null = js.native
    def readFile(entry: String, pass: Buffer): Buffer | Null = js.native
    def readFile(entry: IZipEntry): Buffer | Null = js.native
    def readFile(entry: IZipEntry, pass: String): Buffer | Null = js.native
    def readFile(entry: IZipEntry, pass: Buffer): Buffer | Null = js.native
    
    /**
      * Asynchronous `readFile`.
      * @param entry The full path of the entry or a `IZipEntry` object.
      * @param callback Called with a `Buffer` or `null` in case of error.
      */
    def readFileAsync(entry: String, callback: js.Function2[/* data */ Buffer | Null, /* err */ String, Unit]): Unit = js.native
    def readFileAsync(entry: IZipEntry, callback: js.Function2[/* data */ Buffer | Null, /* err */ String, Unit]): Unit = js.native
    
    /**
      * Test the archive
      * @param password The password for the archive
      */
    def test(): Boolean = js.native
    def test(password: String): Boolean = js.native
    def test(password: Buffer): Boolean = js.native
    
    /**
      * Returns the content of the entire zip file.
      */
    def toBuffer(): Buffer = js.native
    /**
      * Asynchronously returns the content of the entire zip file.
      * @param onSuccess called with the content of the zip file, once it has been generated.
      * @param onFail unused.
      * @param onItemStart called before an entry is compressed.
      * @param onItemEnd called after an entry is compressed.
      */
    def toBuffer(onSuccess: js.Function1[/* buffer */ Buffer, Unit]): Unit = js.native
    def toBuffer(onSuccess: js.Function1[/* buffer */ Buffer, Unit], onFail: js.Function1[/* repeated */ Any, Unit]): Unit = js.native
    def toBuffer(
      onSuccess: js.Function1[/* buffer */ Buffer, Unit],
      onFail: js.Function1[/* repeated */ Any, Unit],
      onItemStart: js.Function1[/* name */ String, Unit]
    ): Unit = js.native
    def toBuffer(
      onSuccess: js.Function1[/* buffer */ Buffer, Unit],
      onFail: js.Function1[/* repeated */ Any, Unit],
      onItemStart: js.Function1[/* name */ String, Unit],
      onItemEnd: js.Function1[/* name */ String, Unit]
    ): Unit = js.native
    def toBuffer(
      onSuccess: js.Function1[/* buffer */ Buffer, Unit],
      onFail: js.Function1[/* repeated */ Any, Unit],
      onItemStart: Unit,
      onItemEnd: js.Function1[/* name */ String, Unit]
    ): Unit = js.native
    def toBuffer(
      onSuccess: js.Function1[/* buffer */ Buffer, Unit],
      onFail: Unit,
      onItemStart: js.Function1[/* name */ String, Unit]
    ): Unit = js.native
    def toBuffer(
      onSuccess: js.Function1[/* buffer */ Buffer, Unit],
      onFail: Unit,
      onItemStart: js.Function1[/* name */ String, Unit],
      onItemEnd: js.Function1[/* name */ String, Unit]
    ): Unit = js.native
    def toBuffer(
      onSuccess: js.Function1[/* buffer */ Buffer, Unit],
      onFail: Unit,
      onItemStart: Unit,
      onItemEnd: js.Function1[/* name */ String, Unit]
    ): Unit = js.native
    
    /**
      * Asynchronously convert the promise to a Buffer
      */
    def toBufferPromise(): js.Promise[Buffer] = js.native
    
    /**
      * Updates the content of an existing entry inside the archive. The zip
      * must be rewritten after updating the content.
      * @param entry The full path of the entry or a `IZipEntry` object.
      * @param content The entry's new contents.
      */
    def updateFile(entry: String, content: Buffer): Unit = js.native
    def updateFile(entry: IZipEntry, content: Buffer): Unit = js.native
    
    /**
      * Writes the newly created zip file to disk at the specified location or
      * if a zip was opened and no `targetFileName` is provided, it will
      * overwrite the opened zip.
      */
    def writeZip(): Unit = js.native
    def writeZip(targetFileName: String): Unit = js.native
    def writeZip(targetFileName: String, callback: js.Function1[/* error */ js.Error | Null, Unit]): Unit = js.native
    def writeZip(targetFileName: Unit, callback: js.Function1[/* error */ js.Error | Null, Unit]): Unit = js.native
    
    /**
      * Writes the newly created zip file to disk at the specified location or
      * if a zip was opened and no `targetFileName` is provided, it will
      * overwrite the opened zip.
      */
    def writeZipPromise(): js.Promise[Boolean] = js.native
    def writeZipPromise(targetFileName: String): js.Promise[Boolean] = js.native
    def writeZipPromise(targetFileName: String, props: Overwrite): js.Promise[Boolean] = js.native
    def writeZipPromise(targetFileName: Unit, props: Overwrite): js.Promise[Boolean] = js.native
  }
  
  trait DataHeader extends StObject {
    
    var compressedSize: Double
    
    var crc: Double
    
    var extraLen: Double
    
    var flags: Double
    
    var fnameLen: Double
    
    var method: Double
    
    var size: Double
    
    var time: Double
    
    var version: Double
  }
  object DataHeader {
    
    inline def apply(
      compressedSize: Double,
      crc: Double,
      extraLen: Double,
      flags: Double,
      fnameLen: Double,
      method: Double,
      size: Double,
      time: Double,
      version: Double
    ): DataHeader = {
      val __obj = js.Dynamic.literal(compressedSize = compressedSize.asInstanceOf[js.Any], crc = crc.asInstanceOf[js.Any], extraLen = extraLen.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], fnameLen = fnameLen.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataHeader]
    }
    
    extension [Self <: DataHeader](x: Self) {
      
      inline def setCompressedSize(value: Double): Self = StObject.set(x, "compressedSize", value.asInstanceOf[js.Any])
      
      inline def setCrc(value: Double): Self = StObject.set(x, "crc", value.asInstanceOf[js.Any])
      
      inline def setExtraLen(value: Double): Self = StObject.set(x, "extraLen", value.asInstanceOf[js.Any])
      
      inline def setFlags(value: Double): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      inline def setFnameLen(value: Double): Self = StObject.set(x, "fnameLen", value.asInstanceOf[js.Any])
      
      inline def setMethod(value: Double): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait EntryHeader extends StObject {
    
    var attr: Double
    
    var commentLength: Double
    
    var compressedSize: Double
    
    var crc: Double
    
    val dataHeader: DataHeader
    
    def dataHeaderToBinary(): Buffer
    
    var diskNumStart: Double
    
    val encripted: Boolean
    
    val entryHeaderSize: Double
    
    def entryHeaderToBinary(): Buffer
    
    var extraLength: Double
    
    var fileNameLength: Double
    
    var flags: Double
    
    var inAttr: Double
    
    def loadDataHeaderFromBinary(data: Buffer): Unit
    
    def loadFromBinary(data: Buffer): Unit
    
    var made: Double
    
    var method: Double
    
    var offset: Double
    
    val realDataOffset: Double
    
    var size: Double
    
    var time: js.Date
    
    var version: Double
  }
  object EntryHeader {
    
    inline def apply(
      attr: Double,
      commentLength: Double,
      compressedSize: Double,
      crc: Double,
      dataHeader: DataHeader,
      dataHeaderToBinary: () => Buffer,
      diskNumStart: Double,
      encripted: Boolean,
      entryHeaderSize: Double,
      entryHeaderToBinary: () => Buffer,
      extraLength: Double,
      fileNameLength: Double,
      flags: Double,
      inAttr: Double,
      loadDataHeaderFromBinary: Buffer => Unit,
      loadFromBinary: Buffer => Unit,
      made: Double,
      method: Double,
      offset: Double,
      realDataOffset: Double,
      size: Double,
      time: js.Date,
      version: Double
    ): EntryHeader = {
      val __obj = js.Dynamic.literal(attr = attr.asInstanceOf[js.Any], commentLength = commentLength.asInstanceOf[js.Any], compressedSize = compressedSize.asInstanceOf[js.Any], crc = crc.asInstanceOf[js.Any], dataHeader = dataHeader.asInstanceOf[js.Any], dataHeaderToBinary = js.Any.fromFunction0(dataHeaderToBinary), diskNumStart = diskNumStart.asInstanceOf[js.Any], encripted = encripted.asInstanceOf[js.Any], entryHeaderSize = entryHeaderSize.asInstanceOf[js.Any], entryHeaderToBinary = js.Any.fromFunction0(entryHeaderToBinary), extraLength = extraLength.asInstanceOf[js.Any], fileNameLength = fileNameLength.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], inAttr = inAttr.asInstanceOf[js.Any], loadDataHeaderFromBinary = js.Any.fromFunction1(loadDataHeaderFromBinary), loadFromBinary = js.Any.fromFunction1(loadFromBinary), made = made.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], realDataOffset = realDataOffset.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[EntryHeader]
    }
    
    extension [Self <: EntryHeader](x: Self) {
      
      inline def setAttr(value: Double): Self = StObject.set(x, "attr", value.asInstanceOf[js.Any])
      
      inline def setCommentLength(value: Double): Self = StObject.set(x, "commentLength", value.asInstanceOf[js.Any])
      
      inline def setCompressedSize(value: Double): Self = StObject.set(x, "compressedSize", value.asInstanceOf[js.Any])
      
      inline def setCrc(value: Double): Self = StObject.set(x, "crc", value.asInstanceOf[js.Any])
      
      inline def setDataHeader(value: DataHeader): Self = StObject.set(x, "dataHeader", value.asInstanceOf[js.Any])
      
      inline def setDataHeaderToBinary(value: () => Buffer): Self = StObject.set(x, "dataHeaderToBinary", js.Any.fromFunction0(value))
      
      inline def setDiskNumStart(value: Double): Self = StObject.set(x, "diskNumStart", value.asInstanceOf[js.Any])
      
      inline def setEncripted(value: Boolean): Self = StObject.set(x, "encripted", value.asInstanceOf[js.Any])
      
      inline def setEntryHeaderSize(value: Double): Self = StObject.set(x, "entryHeaderSize", value.asInstanceOf[js.Any])
      
      inline def setEntryHeaderToBinary(value: () => Buffer): Self = StObject.set(x, "entryHeaderToBinary", js.Any.fromFunction0(value))
      
      inline def setExtraLength(value: Double): Self = StObject.set(x, "extraLength", value.asInstanceOf[js.Any])
      
      inline def setFileNameLength(value: Double): Self = StObject.set(x, "fileNameLength", value.asInstanceOf[js.Any])
      
      inline def setFlags(value: Double): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      inline def setInAttr(value: Double): Self = StObject.set(x, "inAttr", value.asInstanceOf[js.Any])
      
      inline def setLoadDataHeaderFromBinary(value: Buffer => Unit): Self = StObject.set(x, "loadDataHeaderFromBinary", js.Any.fromFunction1(value))
      
      inline def setLoadFromBinary(value: Buffer => Unit): Self = StObject.set(x, "loadFromBinary", js.Any.fromFunction1(value))
      
      inline def setMade(value: Double): Self = StObject.set(x, "made", value.asInstanceOf[js.Any])
      
      inline def setMethod(value: Double): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setRealDataOffset(value: Double): Self = StObject.set(x, "realDataOffset", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setTime(value: js.Date): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * The `IZipEntry` is more than a structure representing the entry inside the
    * zip file. Beside the normal attributes and headers a entry can have, the
    * class contains a reference to the part of the file where the compressed
    * data resides and decompresses it when requested. It also compresses the
    * data and creates the headers required to write in the zip file.
    */
  // disable warning about the I-prefix in interface name to prevent breaking stuff for users without a major bump
  // tslint:disable-next-line:interface-name
  @js.native
  trait IZipEntry extends StObject {
    
    var attr: Double = js.native
    
    /**
      * Entry comment.
      */
    var comment: String = js.native
    
    /**
      * Represents the full name and path of the file
      */
    var entryName: String = js.native
    
    /**
      * Extra data associated with this entry.
      */
    var extra: Buffer = js.native
    
    /**
      * Retrieve the compressed data for this entry. Note that this may trigger
      * compression if any properties were modified.
      */
    def getCompressedData(): Buffer = js.native
    
    /**
      * Asynchronously retrieve the compressed data for this entry. Note that
      * this may trigger compression if any properties were modified.
      */
    def getCompressedDataAsync(callback: js.Function1[/* data */ Buffer, Unit]): Unit = js.native
    
    /**
      * Get the decompressed data associated with this entry.
      */
    def getData(): Buffer = js.native
    
    /**
      * Asynchronously get the decompressed data associated with this entry.
      */
    def getDataAsync(callback: js.Function2[/* data */ Buffer, /* err */ String, Unit]): Unit = js.native
    
    /**
      * Get the header associated with this ZipEntry.
      */
    val header: EntryHeader = js.native
    
    /**
      * Read-Only property that indicates the type of the entry.
      */
    val isDirectory: Boolean = js.native
    
    val name: String = js.native
    
    /**
      * Returns the CEN Entry Header to be written to the output zip file, plus
      * the extra data and the entry comment.
      */
    def packHeader(): Buffer = js.native
    
    val rawEntryName: Buffer = js.native
    
    /**
      * Set the (uncompressed) data to be associated with this entry.
      */
    def setData(value: String): Unit = js.native
    def setData(value: Buffer): Unit = js.native
  }
  
  trait InitOptions extends StObject {
    
    /* file system */
    var fs: Null | TypeofFS
    
    /* Read method */
    var method: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 60 */ Any
    
    /* If true it disables files sorting */
    var noSort: Boolean
    
    /* Read entries during load (initial loading may be slower) */
    var readEntries: Boolean
  }
  object InitOptions {
    
    inline def apply(
      method: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 60 */ Any,
      noSort: Boolean,
      readEntries: Boolean
    ): InitOptions = {
      val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], noSort = noSort.asInstanceOf[js.Any], readEntries = readEntries.asInstanceOf[js.Any], fs = null)
      __obj.asInstanceOf[InitOptions]
    }
    
    extension [Self <: InitOptions](x: Self) {
      
      inline def setFs(value: TypeofFS): Self = StObject.set(x, "fs", value.asInstanceOf[js.Any])
      
      inline def setFsNull: Self = StObject.set(x, "fs", null)
      
      inline def setMethod(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 60 */ Any): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setNoSort(value: Boolean): Self = StObject.set(x, "noSort", value.asInstanceOf[js.Any])
      
      inline def setReadEntries(value: Boolean): Self = StObject.set(x, "readEntries", value.asInstanceOf[js.Any])
    }
  }
}
