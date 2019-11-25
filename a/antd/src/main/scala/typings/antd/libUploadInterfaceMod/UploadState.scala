package typings.antd.libUploadInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadState extends js.Object {
  var dragState: String
  var fileList: js.Array[UploadFile[_]]
}

object UploadState {
  @scala.inline
  def apply(dragState: String, fileList: js.Array[UploadFile[_]]): UploadState = {
    val __obj = js.Dynamic.literal(dragState = dragState.asInstanceOf[js.Any], fileList = fileList.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UploadState]
  }
}

