package typings.adone

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofsystem extends js.Object {
  def commonFileExt(): String
  def commonFileName(ext: String, `type`: String): String
  def commonFileType(): String
  def directoryPath(): String
  def fileExt(mimeType: String): String
  def fileName(ext: String, `type`: String): String
  def filePath(): String
  def fileType(): String
  def mimeType(): String
  def semver(): String
}

object Typeofsystem {
  @scala.inline
  def apply(
    commonFileExt: () => String,
    commonFileName: (String, String) => String,
    commonFileType: () => String,
    directoryPath: () => String,
    fileExt: String => String,
    fileName: (String, String) => String,
    filePath: () => String,
    fileType: () => String,
    mimeType: () => String,
    semver: () => String
  ): Typeofsystem = {
    val __obj = js.Dynamic.literal(commonFileExt = js.Any.fromFunction0(commonFileExt), commonFileName = js.Any.fromFunction2(commonFileName), commonFileType = js.Any.fromFunction0(commonFileType), directoryPath = js.Any.fromFunction0(directoryPath), fileExt = js.Any.fromFunction1(fileExt), fileName = js.Any.fromFunction2(fileName), filePath = js.Any.fromFunction0(filePath), fileType = js.Any.fromFunction0(fileType), mimeType = js.Any.fromFunction0(mimeType), semver = js.Any.fromFunction0(semver))
  
    __obj.asInstanceOf[Typeofsystem]
  }
}

