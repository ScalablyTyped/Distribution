package typings.adone.adoneNs.archiveNs.zipNs.unpackNs.INs

import typings.adone.adoneNs.INs.datetimeNs.Datetime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Entry[StringType] extends js.Object {
  var compressedSize: Double
  var compressionMethod: Double
  var crc32: Double
  var externalFileAttributes: Double
  var extraFieldLength: Double
  var extraFields: js.Array[ExtraField]
  /**
    * Comment decoded with the charset indicated by generalPurposeBitFlag & 0x800 as with the fileName
    */
  var fileComment: StringType
  var fileCommentLength: Double
  /**
    * The bytes for the file name are decoded with UTF-8 if generalPurposeBitFlag & 0x800, otherwise with CP437.
    * Alternatively, this field may be populated from the Info-ZIP Unicode Path Extra Field (see extraFields).
    */
  var fileName: StringType
  var fileNameLength: Double
  var generalPurposeBitFlag: Double
  var internalFileAttributes: Double
  var lastModFileDate: Double
  var lastModFileTime: Double
  var relativeOffsetOfLocalHeader: Double
  var uncompressedSize: Double
  var versionMadeBy: Double
  var versionNeededToExtract: Double
  def getLastModDate(): Datetime
  /**
    * Whether the entry is compressed
    */
  def isCompressed(): Boolean
  /**
    * Whether this entry is encrypted with "Traditional Encryption"
    */
  def isEncrypted(): Boolean
}

object Entry {
  @scala.inline
  def apply[StringType](
    compressedSize: Double,
    compressionMethod: Double,
    crc32: Double,
    externalFileAttributes: Double,
    extraFieldLength: Double,
    extraFields: js.Array[ExtraField],
    fileComment: StringType,
    fileCommentLength: Double,
    fileName: StringType,
    fileNameLength: Double,
    generalPurposeBitFlag: Double,
    getLastModDate: () => Datetime,
    internalFileAttributes: Double,
    isCompressed: () => Boolean,
    isEncrypted: () => Boolean,
    lastModFileDate: Double,
    lastModFileTime: Double,
    relativeOffsetOfLocalHeader: Double,
    uncompressedSize: Double,
    versionMadeBy: Double,
    versionNeededToExtract: Double
  ): Entry[StringType] = {
    val __obj = js.Dynamic.literal(compressedSize = compressedSize, compressionMethod = compressionMethod, crc32 = crc32, externalFileAttributes = externalFileAttributes, extraFieldLength = extraFieldLength, extraFields = extraFields, fileComment = fileComment.asInstanceOf[js.Any], fileCommentLength = fileCommentLength, fileName = fileName.asInstanceOf[js.Any], fileNameLength = fileNameLength, generalPurposeBitFlag = generalPurposeBitFlag, getLastModDate = js.Any.fromFunction0(getLastModDate), internalFileAttributes = internalFileAttributes, isCompressed = js.Any.fromFunction0(isCompressed), isEncrypted = js.Any.fromFunction0(isEncrypted), lastModFileDate = lastModFileDate, lastModFileTime = lastModFileTime, relativeOffsetOfLocalHeader = relativeOffsetOfLocalHeader, uncompressedSize = uncompressedSize, versionMadeBy = versionMadeBy, versionNeededToExtract = versionNeededToExtract)
  
    __obj.asInstanceOf[Entry[StringType]]
  }
}

