package typings.admZip

import typings.node.Buffer
import typings.std.Error
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("adm-zip", JSImport.Namespace)
  @js.native
  /**
    * @param fileNameOrRawData If provided, reads an existing archive. Otherwise creates a new, empty archive.
    */
  class ^ ()
    extends StObject
       with AdmZip {
    def this(fileNameOrRawData: String) = this()
    def this(fileNameOrRawData: Buffer) = this()
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
    def addFile(entryName: String, data: Buffer): Unit = js.native
    def addFile(entryName: String, data: Buffer, comment: String): Unit = js.native
    def addFile(entryName: String, data: Buffer, comment: String, attr: Double): Unit = js.native
    def addFile(entryName: String, data: Buffer, comment: Unit, attr: Double): Unit = js.native
    
    /**
      * Adds a file from the disk to the archive.
      * @param localPath Path to a file on disk.
      * @param zipPath Path to a directory in the archive. Defaults to the empty
      *   string.
      * @param zipName Name for the file.
      */
    def addLocalFile(localPath: String): Unit = js.native
    def addLocalFile(localPath: String, zipPath: String): Unit = js.native
    def addLocalFile(localPath: String, zipPath: String, zipName: String): Unit = js.native
    def addLocalFile(localPath: String, zipPath: Unit, zipName: String): Unit = js.native
    
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
    def addLocalFolder(localPath: String, zipPath: String, filter: RegExp): Unit = js.native
    def addLocalFolder(localPath: String, zipPath: Unit, filter: js.Function1[/* filename */ String, Boolean]): Unit = js.native
    def addLocalFolder(localPath: String, zipPath: Unit, filter: RegExp): Unit = js.native
    
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
      */
    def extractAllTo(targetPath: String): Unit = js.native
    def extractAllTo(targetPath: String, overwrite: Boolean): Unit = js.native
    
    /**
      * Extracts the entire archive to the given location.
      * @param targetPath Target location.
      * @param overwrite If the file already exists at the target path, the file
      *   will be overwriten if this is `true`. Default: `false`.
      * @param callback The callback function will be called after extraction.
      */
    def extractAllToAsync(targetPath: String): Unit = js.native
    def extractAllToAsync(targetPath: String, overwrite: Boolean): Unit = js.native
    def extractAllToAsync(targetPath: String, overwrite: Boolean, callback: js.Function1[/* error */ Error, Unit]): Unit = js.native
    def extractAllToAsync(targetPath: String, overwrite: Unit, callback: js.Function1[/* error */ Error, Unit]): Unit = js.native
    
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
      */
    def extractEntryTo(entryPath: String, targetPath: String): Boolean = js.native
    def extractEntryTo(entryPath: String, targetPath: String, maintainEntryPath: Boolean): Boolean = js.native
    def extractEntryTo(entryPath: String, targetPath: String, maintainEntryPath: Boolean, overwrite: Boolean): Boolean = js.native
    def extractEntryTo(entryPath: String, targetPath: String, maintainEntryPath: Unit, overwrite: Boolean): Boolean = js.native
    def extractEntryTo(entryPath: IZipEntry, targetPath: String): Boolean = js.native
    def extractEntryTo(entryPath: IZipEntry, targetPath: String, maintainEntryPath: Boolean): Boolean = js.native
    def extractEntryTo(entryPath: IZipEntry, targetPath: String, maintainEntryPath: Boolean, overwrite: Boolean): Boolean = js.native
    def extractEntryTo(entryPath: IZipEntry, targetPath: String, maintainEntryPath: Unit, overwrite: Boolean): Boolean = js.native
    
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
    def getEntry(name: String): IZipEntry = js.native
    
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
    def readAsTextAsync(fileName: String, callback: js.Function1[/* data */ String, js.Any]): Unit = js.native
    def readAsTextAsync(fileName: String, callback: js.Function1[/* data */ String, js.Any], encoding: String): Unit = js.native
    def readAsTextAsync(fileName: IZipEntry, callback: js.Function1[/* data */ String, js.Any]): Unit = js.native
    def readAsTextAsync(fileName: IZipEntry, callback: js.Function1[/* data */ String, js.Any], encoding: String): Unit = js.native
    
    /**
      * Extracts the given entry from the archive and returns the content.
      * @param entry The full path of the entry or a `IZipEntry` object.
      * @return `Buffer` or `null` in case of error.
      */
    def readFile(entry: String): Buffer | Null = js.native
    def readFile(entry: IZipEntry): Buffer | Null = js.native
    
    /**
      * Asynchronous `readFile`.
      * @param entry The full path of the entry or a `IZipEntry` object.
      * @param callback Called with a `Buffer` or `null` in case of error.
      */
    def readFileAsync(entry: String, callback: js.Function2[/* data */ Buffer | Null, /* err */ String, js.Any]): Unit = js.native
    def readFileAsync(entry: IZipEntry, callback: js.Function2[/* data */ Buffer | Null, /* err */ String, js.Any]): Unit = js.native
    
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
    def toBuffer(
      onSuccess: js.Function1[/* buffer */ Buffer, Unit],
      onFail: js.Function1[/* repeated */ js.Any, Unit]
    ): Unit = js.native
    def toBuffer(
      onSuccess: js.Function1[/* buffer */ Buffer, Unit],
      onFail: js.Function1[/* repeated */ js.Any, Unit],
      onItemStart: js.Function1[/* name */ String, Unit]
    ): Unit = js.native
    def toBuffer(
      onSuccess: js.Function1[/* buffer */ Buffer, Unit],
      onFail: js.Function1[/* repeated */ js.Any, Unit],
      onItemStart: js.Function1[/* name */ String, Unit],
      onItemEnd: js.Function1[/* name */ String, Unit]
    ): Unit = js.native
    def toBuffer(
      onSuccess: js.Function1[/* buffer */ Buffer, Unit],
      onFail: js.Function1[/* repeated */ js.Any, Unit],
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
    def writeZip(targetFileName: String, callback: js.Function1[/* error */ Error | Null, Unit]): Unit = js.native
    def writeZip(targetFileName: Unit, callback: js.Function1[/* error */ Error | Null, Unit]): Unit = js.native
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
    def getDataAsync(callback: js.Function1[/* data */ Buffer, Unit]): Unit = js.native
    
    /**
      * Get the header associated with this ZipEntry.
      */
    var header: Buffer = js.native
    
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
}
