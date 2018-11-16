package typings
package admDashZipLib.admDashZipMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdmZip extends js.Object {
  /**
       * Allows you to create a entry (file or directory) in the zip file.
       * If you want to create a directory the entryName must end in / and a null
       * buffer should be provided.
       * @param entryName Entry path
       * @param content Content to add to the entry; must be a 0-length buffer
       *   for a directory.
       * @param comment Comment to add to the entry.
       * @param attr Attribute to add to the entry.
       */
  def addFile(entryName: java.lang.String, data: nodeLib.Buffer): scala.Unit = js.native
  /**
       * Allows you to create a entry (file or directory) in the zip file.
       * If you want to create a directory the entryName must end in / and a null
       * buffer should be provided.
       * @param entryName Entry path
       * @param content Content to add to the entry; must be a 0-length buffer
       *   for a directory.
       * @param comment Comment to add to the entry.
       * @param attr Attribute to add to the entry.
       */
  def addFile(entryName: java.lang.String, data: nodeLib.Buffer, comment: java.lang.String): scala.Unit = js.native
  /**
       * Allows you to create a entry (file or directory) in the zip file.
       * If you want to create a directory the entryName must end in / and a null
       * buffer should be provided.
       * @param entryName Entry path
       * @param content Content to add to the entry; must be a 0-length buffer
       *   for a directory.
       * @param comment Comment to add to the entry.
       * @param attr Attribute to add to the entry.
       */
  def addFile(entryName: java.lang.String, data: nodeLib.Buffer, comment: java.lang.String, attr: scala.Double): scala.Unit = js.native
  /**
       * Adds a file from the disk to the archive.
       * @param localPath Path to a file on disk.
       * @param zipPath Path to a directory in the archive. Defaults to the empty
       *   string.
       */
  def addLocalFile(localPath: java.lang.String): scala.Unit = js.native
  /**
       * Adds a file from the disk to the archive.
       * @param localPath Path to a file on disk.
       * @param zipPath Path to a directory in the archive. Defaults to the empty
       *   string.
       */
  def addLocalFile(localPath: java.lang.String, zipPath: java.lang.String): scala.Unit = js.native
  /**
       * Adds a local directory and all its nested files and directories to the
       * archive.
       * @param localPath Path to a folder on disk.
       * @param zipPath Path to a folder in the archive. Defaults to an empty
       *   string.
       */
  def addLocalFolder(localPath: java.lang.String): scala.Unit = js.native
  /**
       * Adds a local directory and all its nested files and directories to the
       * archive.
       * @param localPath Path to a folder on disk.
       * @param zipPath Path to a folder in the archive. Defaults to an empty
       *   string.
       */
  def addLocalFolder(localPath: java.lang.String, zipPath: java.lang.String): scala.Unit = js.native
  /**
       * Adds a comment to the zip. The zip must be rewritten after
       * adding the comment.
       * @param comment Content of the comment.
       */
  def addZipComment(comment: java.lang.String): scala.Unit = js.native
  /**
       * Adds a comment to a specified zipEntry. The zip must be rewritten after
       * adding the comment.
       * The comment cannot exceed 65535 characters in length.
       * @param entry ZipEntry object.
       * @param comment The comment to add to the entry.
       */
  def addZipEntryComment(entry: admDashZipLib.admDashZipMod.AdmZipNs.IZipEntry, comment: java.lang.String): scala.Unit = js.native
  /**
       * Adds a comment to a specified zipEntry. The zip must be rewritten after
       * adding the comment.
       * The comment cannot exceed 65535 characters in length.
       * @param entry String with the full path of the entry
       * @param comment The comment to add to the entry.
       */
  def addZipEntryComment(entry: java.lang.String, comment: java.lang.String): scala.Unit = js.native
  /**
       * Remove the entry from the file or the entry and all its nested directories
       * and files if the given entry is a directory
       * @param entry A ZipEntry object.
       */
  def deleteFile(entry: admDashZipLib.admDashZipMod.AdmZipNs.IZipEntry): scala.Unit = js.native
  /**
       * Remove the entry from the file or the entry and all its nested directories
       * and files if the given entry is a directory
       * @param entry String with the full path of the entry
       */
  def deleteFile(entry: java.lang.String): scala.Unit = js.native
  /**
       * Extracts the entire archive to the given location
       * @param targetPath Target location
       * @param overwrite If the file already exists at the target path, the file
       *   will be overwriten if this is true. Default is FALSE
       */
  def extractAllTo(targetPath: java.lang.String): scala.Unit = js.native
  /**
       * Extracts the entire archive to the given location
       * @param targetPath Target location
       * @param overwrite If the file already exists at the target path, the file
       *   will be overwriten if this is true. Default is FALSE
       */
  def extractAllTo(targetPath: java.lang.String, overwrite: scala.Boolean): scala.Unit = js.native
  /**
       * Extracts the entire archive to the given location
       * @param targetPath Target location
       * @param overwrite If the file already exists at the target path, the file
       *   will be overwriten if this is true. Default is FALSE
       * @param callback The callback function will be called afeter extraction
       */
  def extractAllToAsync(
    targetPath: java.lang.String,
    overwrite: scala.Boolean,
    callback: js.Function1[/* error */ nodeLib.Error, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Extracts the given entry to the given targetPath.
       * If the entry is a directory inside the archive, the entire directory and
       * its subdirectories will be extracted.
       * @param entry ZipEntry object
       * @param targetPath Target folder where to write the file
       * @param maintainEntryPath If maintainEntryPath is true and the entry is
       *   inside a folder, the entry folder will be created in targetPath as
       *   well. Default is TRUE
       * @param overwrite If the file already exists at the target path, the file
       *   will be overwriten if this is true. Default is FALSE
       * @return Boolean
       */
  def extractEntryTo(entryPath: admDashZipLib.admDashZipMod.AdmZipNs.IZipEntry, targetPath: java.lang.String): scala.Boolean = js.native
  /**
       * Extracts the given entry to the given targetPath.
       * If the entry is a directory inside the archive, the entire directory and
       * its subdirectories will be extracted.
       * @param entry ZipEntry object
       * @param targetPath Target folder where to write the file
       * @param maintainEntryPath If maintainEntryPath is true and the entry is
       *   inside a folder, the entry folder will be created in targetPath as
       *   well. Default is TRUE
       * @param overwrite If the file already exists at the target path, the file
       *   will be overwriten if this is true. Default is FALSE
       * @return Boolean
       */
  def extractEntryTo(
    entryPath: admDashZipLib.admDashZipMod.AdmZipNs.IZipEntry,
    targetPath: java.lang.String,
    maintainEntryPath: scala.Boolean
  ): scala.Boolean = js.native
  /**
       * Extracts the given entry to the given targetPath.
       * If the entry is a directory inside the archive, the entire directory and
       * its subdirectories will be extracted.
       * @param entry ZipEntry object
       * @param targetPath Target folder where to write the file
       * @param maintainEntryPath If maintainEntryPath is true and the entry is
       *   inside a folder, the entry folder will be created in targetPath as
       *   well. Default is TRUE
       * @param overwrite If the file already exists at the target path, the file
       *   will be overwriten if this is true. Default is FALSE
       * @return Boolean
       */
  def extractEntryTo(
    entryPath: admDashZipLib.admDashZipMod.AdmZipNs.IZipEntry,
    targetPath: java.lang.String,
    maintainEntryPath: scala.Boolean,
    overwrite: scala.Boolean
  ): scala.Boolean = js.native
  /**
       * Extracts the given entry to the given targetPath.
       * If the entry is a directory inside the archive, the entire directory and
       * its subdirectories will be extracted.
       * @param entry String with the full path of the entry
       * @param targetPath Target folder where to write the file
       * @param maintainEntryPath If maintainEntryPath is true and the entry is
       *   inside a folder, the entry folder will be created in targetPath as
       *   well. Default is TRUE
       * @param overwrite If the file already exists at the target path, the file
       *   will be overwriten if this is true. Default is FALSE
       *
       * @return Boolean
       */
  def extractEntryTo(entryPath: java.lang.String, targetPath: java.lang.String): scala.Boolean = js.native
  /**
       * Extracts the given entry to the given targetPath.
       * If the entry is a directory inside the archive, the entire directory and
       * its subdirectories will be extracted.
       * @param entry String with the full path of the entry
       * @param targetPath Target folder where to write the file
       * @param maintainEntryPath If maintainEntryPath is true and the entry is
       *   inside a folder, the entry folder will be created in targetPath as
       *   well. Default is TRUE
       * @param overwrite If the file already exists at the target path, the file
       *   will be overwriten if this is true. Default is FALSE
       *
       * @return Boolean
       */
  def extractEntryTo(entryPath: java.lang.String, targetPath: java.lang.String, maintainEntryPath: scala.Boolean): scala.Boolean = js.native
  /**
       * Extracts the given entry to the given targetPath.
       * If the entry is a directory inside the archive, the entire directory and
       * its subdirectories will be extracted.
       * @param entry String with the full path of the entry
       * @param targetPath Target folder where to write the file
       * @param maintainEntryPath If maintainEntryPath is true and the entry is
       *   inside a folder, the entry folder will be created in targetPath as
       *   well. Default is TRUE
       * @param overwrite If the file already exists at the target path, the file
       *   will be overwriten if this is true. Default is FALSE
       *
       * @return Boolean
       */
  def extractEntryTo(
    entryPath: java.lang.String,
    targetPath: java.lang.String,
    maintainEntryPath: scala.Boolean,
    overwrite: scala.Boolean
  ): scala.Boolean = js.native
  /**
       * Returns an array of ZipEntry objects representing the files and folders
       * inside the archive
       */
  def getEntries(): js.Array[admDashZipLib.admDashZipMod.AdmZipNs.IZipEntry] = js.native
  /**
       * Returns a ZipEntry object representing the file or folder specified by
       * ``name``.
       * @param name Name of the file or folder to retrieve.
       * @return ZipEntry The entry corresponding to the name.
       */
  def getEntry(name: java.lang.String): admDashZipLib.admDashZipMod.AdmZipNs.IZipEntry = js.native
  /**
       * Returns the zip comment
       * @return The zip comment.
       */
  def getZipComment(): java.lang.String = js.native
  /**
       * Returns the comment of the specified entry
       * @param entry ZipEntry object.
       * @return String The comment of the specified entry.
       */
  def getZipEntryComment(entry: admDashZipLib.admDashZipMod.AdmZipNs.IZipEntry): java.lang.String = js.native
  /**
       * Returns the comment of the specified entry.
       * @param entry String with the full path of the entry.
       * @return String The comment of the specified entry.
       */
  def getZipEntryComment(entry: java.lang.String): java.lang.String = js.native
  /**
       * Extracts the given entry from the archive and returns the content as
       * plain text in the given encoding
       * @param entry ZipEntry object
       * @param encoding Optional. If no encoding is specified utf8 is used
       * @return String
       */
  def readAsText(fileName: admDashZipLib.admDashZipMod.AdmZipNs.IZipEntry): java.lang.String = js.native
  /**
       * Extracts the given entry from the archive and returns the content as
       * plain text in the given encoding
       * @param entry ZipEntry object
       * @param encoding Optional. If no encoding is specified utf8 is used
       * @return String
       */
  def readAsText(fileName: admDashZipLib.admDashZipMod.AdmZipNs.IZipEntry, encoding: java.lang.String): java.lang.String = js.native
  /**
       * Extracts the given entry from the archive and returns the content as
       * plain text in the given encoding
       * @param entry String with the full path of the entry
       * @param encoding Optional. If no encoding is specified utf8 is used
       * @return String
       */
  def readAsText(fileName: java.lang.String): java.lang.String = js.native
  /**
       * Extracts the given entry from the archive and returns the content as
       * plain text in the given encoding
       * @param entry String with the full path of the entry
       * @param encoding Optional. If no encoding is specified utf8 is used
       * @return String
       */
  def readAsText(fileName: java.lang.String, encoding: java.lang.String): java.lang.String = js.native
  /**
       * Asynchronous readAsText
       * @param entry ZipEntry object
       * @param callback Called with the resulting string.
       * @param encoding Optional. If no encoding is specified utf8 is used
       */
  def readAsTextAsync(
    fileName: admDashZipLib.admDashZipMod.AdmZipNs.IZipEntry,
    callback: js.Function1[/* data */ java.lang.String, _]
  ): scala.Unit = js.native
  /**
       * Asynchronous readAsText
       * @param entry ZipEntry object
       * @param callback Called with the resulting string.
       * @param encoding Optional. If no encoding is specified utf8 is used
       */
  def readAsTextAsync(
    fileName: admDashZipLib.admDashZipMod.AdmZipNs.IZipEntry,
    callback: js.Function1[/* data */ java.lang.String, _],
    encoding: java.lang.String
  ): scala.Unit = js.native
  /**
       * Asynchronous readAsText
       * @param entry String with the full path of the entry
       * @param callback Called with the resulting string.
       * @param encoding Optional. If no encoding is specified utf8 is used
       */
  def readAsTextAsync(fileName: java.lang.String, callback: js.Function1[/* data */ java.lang.String, _]): scala.Unit = js.native
  /**
       * Asynchronous readAsText
       * @param entry String with the full path of the entry
       * @param callback Called with the resulting string.
       * @param encoding Optional. If no encoding is specified utf8 is used
       */
  def readAsTextAsync(
    fileName: java.lang.String,
    callback: js.Function1[/* data */ java.lang.String, _],
    encoding: java.lang.String
  ): scala.Unit = js.native
  /**
       * Extracts the given entry from the archive and returns the content as a
       * Buffer object.
       * @param entry ZipEntry object
       * @return Buffer or Null in case of error
       */
  def readFile(entry: admDashZipLib.admDashZipMod.AdmZipNs.IZipEntry): nodeLib.Buffer = js.native
  /**
       * Extracts the given entry from the archive and returns the content as a
       * Buffer object.
       * @param entry String with the full path of the entry
       * @return Buffer or Null in case of error
       */
  def readFile(entry: java.lang.String): nodeLib.Buffer = js.native
  /**
       * Asynchronous readFile
       * @param entry ZipEntry object
       * @param callback Called with a Buffer or Null in case of error
       * @return Buffer or Null in case of error
       */
  def readFileAsync(
    entry: admDashZipLib.admDashZipMod.AdmZipNs.IZipEntry,
    callback: js.Function2[/* data */ nodeLib.Buffer, /* err */ java.lang.String, _]
  ): scala.Unit = js.native
  /**
       * Asynchronous readFile
       * @param entry String with the full path of the entry
       * @param callback Called with a Buffer or Null in case of error
       */
  def readFileAsync(
    entry: java.lang.String,
    callback: js.Function2[/* data */ nodeLib.Buffer, /* err */ java.lang.String, _]
  ): scala.Unit = js.native
  /**
       * Returns the content of the entire zip file as a Buffer object
       * @return Buffer
       */
  def toBuffer(): nodeLib.Buffer = js.native
  /**
       * Updates the content of an existing entry inside the archive. The zip
       * must be rewritten after updating the content
       * @param entry ZipEntry object.
       * @param content The entry's new contents.
       */
  def updateFile(entry: admDashZipLib.admDashZipMod.AdmZipNs.IZipEntry, content: nodeLib.Buffer): scala.Unit = js.native
  /**
       * Updates the content of an existing entry inside the archive. The zip
       * must be rewritten after updating the content
       * @param entry String with the full path of the entry.
       * @param content The entry's new contents.
       */
  def updateFile(entry: java.lang.String, content: nodeLib.Buffer): scala.Unit = js.native
  /**
       * Writes the newly created zip file to disk at the specified location or
       * if a zip was opened and no ``targetFileName`` is provided, it will
       * overwrite the opened zip
       * @param targetFileName
       */
  def writeZip(): scala.Unit = js.native
  /**
       * Writes the newly created zip file to disk at the specified location or
       * if a zip was opened and no ``targetFileName`` is provided, it will
       * overwrite the opened zip
       * @param targetFileName
       */
  def writeZip(targetPath: java.lang.String): scala.Unit = js.native
}

