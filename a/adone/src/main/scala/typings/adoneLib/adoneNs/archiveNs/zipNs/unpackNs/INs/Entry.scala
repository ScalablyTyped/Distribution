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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("compressedSize")(compressedSize)
    __obj.updateDynamic("compressionMethod")(compressionMethod)
    __obj.updateDynamic("crc32")(crc32)
    __obj.updateDynamic("externalFileAttributes")(externalFileAttributes)
    __obj.updateDynamic("extraFieldLength")(extraFieldLength)
    __obj.updateDynamic("extraFields")(extraFields)
    __obj.updateDynamic("fileComment")(fileComment.asInstanceOf[js.Any])
    __obj.updateDynamic("fileCommentLength")(fileCommentLength)
    __obj.updateDynamic("fileName")(fileName.asInstanceOf[js.Any])
    __obj.updateDynamic("fileNameLength")(fileNameLength)
    __obj.updateDynamic("generalPurposeBitFlag")(generalPurposeBitFlag)
    __obj.updateDynamic("getLastModDate")(getLastModDate)
    __obj.updateDynamic("internalFileAttributes")(internalFileAttributes)
    __obj.updateDynamic("isCompressed")(isCompressed)
    __obj.updateDynamic("isEncrypted")(isEncrypted)
    __obj.updateDynamic("lastModFileDate")(lastModFileDate)
    __obj.updateDynamic("lastModFileTime")(lastModFileTime)
    __obj.updateDynamic("relativeOffsetOfLocalHeader")(relativeOffsetOfLocalHeader)
    __obj.updateDynamic("uncompressedSize")(uncompressedSize)
    __obj.updateDynamic("versionMadeBy")(versionMadeBy)
    __obj.updateDynamic("versionNeededToExtract")(versionNeededToExtract)
    __obj.asInstanceOf[Entry[StringType]]
  }
}

