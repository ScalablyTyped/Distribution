package typings.antd

import typings.antd.uploadInterfaceMod.UploadFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFileList extends js.Object {
  var fileList: js.Array[UploadFile[_]]
}

object AnonFileList {
  @scala.inline
  def apply(fileList: js.Array[UploadFile[_]]): AnonFileList = {
    val __obj = js.Dynamic.literal(fileList = fileList.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFileList]
  }
}

