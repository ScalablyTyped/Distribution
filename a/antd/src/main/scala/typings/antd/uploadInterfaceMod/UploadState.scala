package typings.antd.uploadInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadState[T] extends js.Object {
  var dragState: String
  var fileList: js.Array[UploadFile[T]]
}

object UploadState {
  @scala.inline
  def apply[T](dragState: String, fileList: js.Array[UploadFile[T]]): UploadState[T] = {
    val __obj = js.Dynamic.literal(dragState = dragState.asInstanceOf[js.Any], fileList = fileList.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadState[T]]
  }
}

