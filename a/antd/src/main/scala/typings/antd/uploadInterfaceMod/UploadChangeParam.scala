package typings.antd.uploadInterfaceMod

import typings.antd.anon.Percent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UploadChangeParam[T /* <: js.Object */] extends js.Object {
  var event: js.UndefOr[Percent] = js.native
  var file: T = js.native
  var fileList: js.Array[UploadFile[_]] = js.native
}

object UploadChangeParam {
  @scala.inline
  def apply[/* <: js.Object */ T](file: T, fileList: js.Array[UploadFile[_]]): UploadChangeParam[T] = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], fileList = fileList.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadChangeParam[T]]
  }
  @scala.inline
  implicit class UploadChangeParamOps[Self <: UploadChangeParam[_], /* <: js.Object */ T] (val x: Self with UploadChangeParam[T]) extends AnyVal {
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
    def setFile(value: T): Self = this.set("file", value.asInstanceOf[js.Any])
    @scala.inline
    def setFileListVarargs(value: UploadFile[js.Any]*): Self = this.set("fileList", js.Array(value :_*))
    @scala.inline
    def setFileList(value: js.Array[UploadFile[_]]): Self = this.set("fileList", value.asInstanceOf[js.Any])
    @scala.inline
    def setEvent(value: Percent): Self = this.set("event", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvent: Self = this.set("event", js.undefined)
  }
  
}

