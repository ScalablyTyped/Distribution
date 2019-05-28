package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofsystem extends js.Object {
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

object Typeofsystem {
  @scala.inline
  def apply(
    commonFileExt: () => java.lang.String,
    commonFileName: (java.lang.String, java.lang.String) => java.lang.String,
    commonFileType: () => java.lang.String,
    directoryPath: () => java.lang.String,
    fileExt: java.lang.String => java.lang.String,
    fileName: (java.lang.String, java.lang.String) => java.lang.String,
    filePath: () => java.lang.String,
    fileType: () => java.lang.String,
    mimeType: () => java.lang.String,
    semver: () => java.lang.String
  ): Typeofsystem = {
    val __obj = js.Dynamic.literal(commonFileExt = js.Any.fromFunction0(commonFileExt), commonFileName = js.Any.fromFunction2(commonFileName), commonFileType = js.Any.fromFunction0(commonFileType), directoryPath = js.Any.fromFunction0(directoryPath), fileExt = js.Any.fromFunction1(fileExt), fileName = js.Any.fromFunction2(fileName), filePath = js.Any.fromFunction0(filePath), fileType = js.Any.fromFunction0(fileType), mimeType = js.Any.fromFunction0(mimeType), semver = js.Any.fromFunction0(semver))
  
    __obj.asInstanceOf[Typeofsystem]
  }
}

