package typings.antd

import typings.antd.esUploadInterfaceMod.UploadFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FileList extends js.Object {
  var fileList: js.Array[UploadFile[_]]
}

object Anon_FileList {
  @scala.inline
  def apply(fileList: js.Array[UploadFile[_]]): Anon_FileList = {
    val __obj = js.Dynamic.literal(fileList = fileList)
  
    __obj.asInstanceOf[Anon_FileList]
  }
}

