package typings.aliApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFileList extends js.Object {
  var fileList: js.Array[AnonApFilePath]
}

object AnonFileList {
  @scala.inline
  def apply(fileList: js.Array[AnonApFilePath]): AnonFileList = {
    val __obj = js.Dynamic.literal(fileList = fileList.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFileList]
  }
}

