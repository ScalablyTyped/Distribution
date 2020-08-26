package typings.antd.uploadInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UploadState[T] extends js.Object {
  var dragState: String = js.native
  var fileList: js.Array[UploadFile[T]] = js.native
}

object UploadState {
  @scala.inline
  def apply[T](dragState: String, fileList: js.Array[UploadFile[T]]): UploadState[T] = {
    val __obj = js.Dynamic.literal(dragState = dragState.asInstanceOf[js.Any], fileList = fileList.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadState[T]]
  }
  @scala.inline
  implicit class UploadStateOps[Self <: UploadState[_], T] (val x: Self with UploadState[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDragState(value: String): Self = this.set("dragState", value.asInstanceOf[js.Any])
    @scala.inline
    def setFileListVarargs(value: UploadFile[T]*): Self = this.set("fileList", js.Array(value :_*))
    @scala.inline
    def setFileList(value: js.Array[UploadFile[T]]): Self = this.set("fileList", value.asInstanceOf[js.Any])
  }
  
}

