package typings.antd.anon

import typings.antd.uploadInterfaceMod.UploadFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileList extends js.Object {
  var fileList: js.Array[UploadFile[_]]
}

object FileList {
  @scala.inline
  def apply(fileList: js.Array[UploadFile[_]]): FileList = {
    val __obj = js.Dynamic.literal(fileList = fileList.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileList]
  }
}

