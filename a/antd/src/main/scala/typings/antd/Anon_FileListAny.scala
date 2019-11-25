package typings.antd

import typings.antd.libUploadInterfaceMod.UploadFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FileListAny extends js.Object {
  var fileList: js.Array[UploadFile[_]]
}

object Anon_FileListAny {
  @scala.inline
  def apply(fileList: js.Array[UploadFile[_]]): Anon_FileListAny = {
    val __obj = js.Dynamic.literal(fileList = fileList.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_FileListAny]
  }
}

