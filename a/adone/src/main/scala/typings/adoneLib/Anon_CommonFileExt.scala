package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CommonFileExt extends js.Object {
  def commonFileExt(): java.lang.String
  def commonFileName(ext: java.lang.String, `type`: java.lang.String): java.lang.String
  def commonFileType(): java.lang.String
  def directoryPath(): java.lang.String
  def fileExt(mimeType: java.lang.String): java.lang.String
  def fileName(ext: java.lang.String, `type`: java.lang.String): java.lang.String
  def filePath(): java.lang.String
  def fileType(): java.lang.String
  def mimeType(): java.lang.String
  def semver(): java.lang.String
}

object Anon_CommonFileExt {
  @scala.inline
  def apply(
    commonFileExt: js.Function0[java.lang.String],
    commonFileName: js.Function2[java.lang.String, java.lang.String, java.lang.String],
    commonFileType: js.Function0[java.lang.String],
    directoryPath: js.Function0[java.lang.String],
    fileExt: js.Function1[java.lang.String, java.lang.String],
    fileName: js.Function2[java.lang.String, java.lang.String, java.lang.String],
    filePath: js.Function0[java.lang.String],
    fileType: js.Function0[java.lang.String],
    mimeType: js.Function0[java.lang.String],
    semver: js.Function0[java.lang.String]
  ): Anon_CommonFileExt = {
    val __obj = js.Dynamic.literal(commonFileExt = commonFileExt, commonFileName = commonFileName, commonFileType = commonFileType, directoryPath = directoryPath, fileExt = fileExt, fileName = fileName, filePath = filePath, fileType = fileType, mimeType = mimeType, semver = semver)
  
    __obj.asInstanceOf[Anon_CommonFileExt]
  }
}

