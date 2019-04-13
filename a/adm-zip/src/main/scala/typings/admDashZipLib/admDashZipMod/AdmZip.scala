package typings
package admDashZipLib.admDashZipMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdmZip extends js.Object {
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
  def addFile(entryName: java.lang.String, data: nodeLib.Buffer): scala.Unit = js.native
  def addFile(entryName: java.lang.String, data: nodeLib.Buffer, comment: java.lang.String): scala.Unit = js.native
  def addFile(entryName: java.lang.String, data: nodeLib.Buffer, comment: java.lang.String, attr: scala.Double): scala.Unit = js.native
  /**
    * Adds a file from the disk to the archive.
    * @param localPath Path to a file on disk.
    * @param zipPath Path to a directory in the archive. Defaults to the empty
    *   string.
    * @param zipName Name for the file.
    */
  def addLocalFile(localPath: java.lang.String): scala.Unit = js.native
  def addLocalFile(localPath: java.lang.String, zipPath: java.lang.String): scala.Unit = js.native
  def addLocalFile(localPath: java.lang.String, zipPath: java.lang.String, zipName: java.lang.String): scala.Unit = js.native
  /**
    * Adds a local directory and all its nested files and directories to the
    * archive.
    * @param localPath Path to a folder on disk.
    * @param zipPath Path to a folder in the archive. Default: `""`.
    * @param filter RegExp or Function if files match will be included.
    */
  def addLocalFolder(localPath: java.lang.String): scala.Unit = js.native
  def addLocalFolder(localPath: java.lang.String, zipPath: java.lang.String): scala.Unit = js.native
  def addLocalFolder(
    localPath: java.lang.String,
    zipPath: java.lang.String,
    filter: js.Function1[/* filename */ java.lang.String, scala.Boolean]
  ): scala.Unit = js.native
  def addLocalFolder(localPath: java.lang.String, zipPath: java.lang.String, filter: stdLib.RegExp): scala.Unit = js.native
  /**
    * Adds a comment to the zip. The zip must be rewritten after
    * adding the comment.
    * @param comment Content of the comment.
    */
  def addZipComment(comment: java.lang.String): scala.Unit = js.native
  def addZipEntryComment(entry: IZipEntry, comment: java.lang.String): scala.Unit = js.native
  /**
    * Adds a comment to a specified file or `IZipEntry`. The zip must be rewritten after
    * adding the comment.
    * The comment cannot exceed 65535 characters in length.
    * @param entry The full path of the entry or a `IZipEntry` object.
    * @param comment The comment to add to the entry.
    */
  def addZipEntryComment(entry: java.lang.String, comment: java.lang.String): scala.Unit = js.native
  def deleteFile(entry: IZipEntry): scala.Unit = js.native
  /**
    * Remove the entry from the file or the entry and all its nested directories
    * and files if the given entry is a directory.
    * @param entry The full path of the entry or a `IZipEntry` object.
    */
  def deleteFile(entry: java.lang.String): scala.Unit = js.native
  /**
    * Extracts the entire archive to the given location.
    * @param targetPath Target location.
    * @param overwrite If the file already exists at the target path, the file
    *   will be overwriten if this is `true`. Default: `false`.
    */
  def extractAllTo(targetPath: java.lang.String): scala.Unit = js.native
  def extractAllTo(targetPath: java.lang.String, overwrite: scala.Boolean): scala.Unit = js.native
  /**
    * Extracts the entire archive to the given location.
    * @param targetPath Target location.
    * @param overwrite If the file already exists at the target path, the file
    *   will be overwriten if this is `true`. Default: `false`.
    * @param callback The callback function will be called after extraction.
    */
  def extractAllToAsync(targetPath: java.lang.String): scala.Unit = js.native
  def extractAllToAsync(targetPath: java.lang.String, overwrite: scala.Boolean): scala.Unit = js.native
  def extractAllToAsync(
    targetPath: java.lang.String,
    overwrite: scala.Boolean,
    callback: js.Function1[/* error */ stdLib.Error, scala.Unit]
  ): scala.Unit = js.native
  def extractEntryTo(entryPath: IZipEntry, targetPath: java.lang.String): scala.Boolean = js.native
  def extractEntryTo(entryPath: IZipEntry, targetPath: java.lang.String, maintainEntryPath: scala.Boolean): scala.Boolean = js.native
  def extractEntryTo(
    entryPath: IZipEntry,
    targetPath: java.lang.String,
    maintainEntryPath: scala.Boolean,
    overwrite: scala.Boolean
  ): scala.Boolean = js.native
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
  def extractEntryTo(entryPath: java.lang.String, targetPath: java.lang.String): scala.Boolean = js.native
  def extractEntryTo(entryPath: java.lang.String, targetPath: java.lang.String, maintainEntryPath: scala.Boolean): scala.Boolean = js.native
  def extractEntryTo(
    entryPath: java.lang.String,
    targetPath: java.lang.String,
    maintainEntryPath: scala.Boolean,
    overwrite: scala.Boolean
  ): scala.Boolean = js.native
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
  def getEntry(name: java.lang.String): IZipEntry = js.native
  /**
    * @return The zip comment.
    */
  def getZipComment(): java.lang.String = js.native
  def getZipEntryComment(entry: IZipEntry): java.lang.String = js.native
  /**
    * Returns the comment of the specified entry.
    * @param entry The full path of the entry or a `IZipEntry` object.
    * @return The comment of the specified entry.
    */
  def getZipEntryComment(entry: java.lang.String): java.lang.String = js.native
  def readAsText(fileName: IZipEntry): java.lang.String = js.native
  def readAsText(fileName: IZipEntry, encoding: java.lang.String): java.lang.String = js.native
  /**
    * Extracts the given entry from the archive and returns the content as
    * plain text in the given encoding.
    * @param entry The full path of the entry or a `IZipEntry` object.
    * @param encoding If no encoding is specified `"utf8"` is used.
    */
  def readAsText(fileName: java.lang.String): java.lang.String = js.native
  def readAsText(fileName: java.lang.String, encoding: java.lang.String): java.lang.String = js.native
  def readAsTextAsync(fileName: IZipEntry, callback: js.Function1[/* data */ java.lang.String, _]): scala.Unit = js.native
  def readAsTextAsync(
    fileName: IZipEntry,
    callback: js.Function1[/* data */ java.lang.String, _],
    encoding: java.lang.String
  ): scala.Unit = js.native
  /**
    * Asynchronous `readAsText`.
    * @param entry The full path of the entry or a `IZipEntry` object.
    * @param callback Called with the resulting string.
    * @param encoding If no encoding is specified `"utf8"` is used.
    */
  def readAsTextAsync(fileName: java.lang.String, callback: js.Function1[/* data */ java.lang.String, _]): scala.Unit = js.native
  def readAsTextAsync(
    fileName: java.lang.String,
    callback: js.Function1[/* data */ java.lang.String, _],
    encoding: java.lang.String
  ): scala.Unit = js.native
  def readFile(entry: IZipEntry): nodeLib.Buffer | scala.Null = js.native
  /**
    * Extracts the given entry from the archive and returns the content.
    * @param entry The full path of the entry or a `IZipEntry` object.
    * @return `Buffer` or `null` in case of error.
    */
  def readFile(entry: java.lang.String): nodeLib.Buffer | scala.Null = js.native
  def readFileAsync(
    entry: IZipEntry,
    callback: js.Function2[/* data */ nodeLib.Buffer | scala.Null, /* err */ java.lang.String, _]
  ): scala.Unit = js.native
  /**
    * Asynchronous `readFile`.
    * @param entry The full path of the entry or a `IZipEntry` object.
    * @param callback Called with a `Buffer` or `null` in case of error.
    */
  def readFileAsync(
    entry: java.lang.String,
    callback: js.Function2[/* data */ nodeLib.Buffer | scala.Null, /* err */ java.lang.String, _]
  ): scala.Unit = js.native
  /**
    * Returns the content of the entire zip file.
    */
  def toBuffer(): nodeLib.Buffer = js.native
  def updateFile(entry: IZipEntry, content: nodeLib.Buffer): scala.Unit = js.native
  /**
    * Updates the content of an existing entry inside the archive. The zip
    * must be rewritten after updating the content.
    * @param entry The full path of the entry or a `IZipEntry` object.
    * @param content The entry's new contents.
    */
  def updateFile(entry: java.lang.String, content: nodeLib.Buffer): scala.Unit = js.native
  /**
    * Writes the newly created zip file to disk at the specified location or
    * if a zip was opened and no `targetFileName` is provided, it will
    * overwrite the opened zip.
    */
  def writeZip(): scala.Unit = js.native
  def writeZip(targetFileName: java.lang.String): scala.Unit = js.native
  def writeZip(
    targetFileName: java.lang.String,
    callback: js.Function1[/* error */ stdLib.Error | scala.Null, scala.Unit]
  ): scala.Unit = js.native
}

