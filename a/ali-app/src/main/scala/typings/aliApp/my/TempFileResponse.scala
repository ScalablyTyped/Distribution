package typings.aliApp.my

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TempFileResponse extends js.Object {
  /** 文件的临时路径 */
  var apFilePath: String
}

object TempFileResponse {
  @scala.inline
  def apply(apFilePath: String): TempFileResponse = {
    val __obj = js.Dynamic.literal(apFilePath = apFilePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[TempFileResponse]
  }
}

