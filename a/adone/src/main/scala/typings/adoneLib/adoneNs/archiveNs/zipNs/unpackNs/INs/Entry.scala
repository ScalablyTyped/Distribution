package typings
package adoneLib.adoneNs.archiveNs.zipNs.unpackNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Entry[StringType] extends js.Object {
  var compressedSize: scala.Double
  var compressionMethod: scala.Double
  var crc32: scala.Double
  var externalFileAttributes: scala.Double
  var extraFieldLength: scala.Double
  var extraFields: js.Array[ExtraField]
  /**
    * Comment decoded with the charset indicated by generalPurposeBitFlag & 0x800 as with the fileName
    */
  var fileComment: StringType
  var fileCommentLength: scala.Double
  /**
    * The bytes for the file name are decoded with UTF-8 if generalPurposeBitFlag & 0x800, otherwise with CP437.
    * Alternatively, this field may be populated from the Info-ZIP Unicode Path Extra Field (see extraFields).
    */
  var fileName: StringType
  var fileNameLength: scala.Double
  var generalPurposeBitFlag: scala.Double
  var internalFileAttributes: scala.Double
  var lastModFileDate: scala.Double
  var lastModFileTime: scala.Double
  var relativeOffsetOfLocalHeader: scala.Double
  var uncompressedSize: scala.Double
  var versionMadeBy: scala.Double
  var versionNeededToExtract: scala.Double
  def getLastModDate(): adoneLib.adoneNs.INs.datetimeNs.Datetime
  /**
    * Whether the entry is compressed
    */
  def isCompressed(): scala.Boolean
  /**
    * Whether this entry is encrypted with "Traditional Encryption"
    */
  def isEncrypted(): scala.Boolean
}

object Entry {
  @scala.inline
  def apply[StringType](
    compressedSize: scala.Double,
    compressionMethod: scala.Double,
    crc32: scala.Double,
    externalFileAttributes: scala.Double,
    extraFieldLength: scala.Double,
    extraFields: js.Array[ExtraField],
    fileComment: StringType,
    fileCommentLength: scala.Double,
    fileName: StringType,
    fileNameLength: scala.Double,
    generalPurposeBitFlag: scala.Double,
    getLastModDate: js.Function0[adoneLib.adoneNs.INs.datetimeNs.Datetime],
    internalFileAttributes: scala.Double,
    isCompressed: js.Function0[scala.Boolean],
    isEncrypted: js.Function0[scala.Boolean],
    lastModFileDate: scala.Double,
    lastModFileTime: scala.Double,
    relativeOffsetOfLocalHeader: scala.Double,
    uncompressedSize: scala.Double,
    versionMadeBy: scala.Double,
    versionNeededToExtract: scala.Double
  ): Entry[StringType] = {
    val __obj = js.Dynamic.literal(compressedSize = compressedSize, compressionMethod = compressionMethod, crc32 = crc32, externalFileAttributes = externalFileAttributes, extraFieldLength = extraFieldLength, extraFields = extraFields, fileComment = fileComment.asInstanceOf[js.Any], fileCommentLength = fileCommentLength, fileName = fileName.asInstanceOf[js.Any], fileNameLength = fileNameLength, generalPurposeBitFlag = generalPurposeBitFlag, getLastModDate = getLastModDate, internalFileAttributes = internalFileAttributes, isCompressed = isCompressed, isEncrypted = isEncrypted, lastModFileDate = lastModFileDate, lastModFileTime = lastModFileTime, relativeOffsetOfLocalHeader = relativeOffsetOfLocalHeader, uncompressedSize = uncompressedSize, versionMadeBy = versionMadeBy, versionNeededToExtract = versionNeededToExtract)
  
    __obj.asInstanceOf[Entry[StringType]]
  }
}

