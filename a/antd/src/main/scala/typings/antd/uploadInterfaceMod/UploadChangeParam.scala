package typings.antd.uploadInterfaceMod

import typings.antd.anon.Percent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadChangeParam[T /* <: js.Object */] extends js.Object {
  var event: js.UndefOr[Percent] = js.undefined
  var file: T
  var fileList: js.Array[UploadFile[_]]
}

object UploadChangeParam {
  @scala.inline
  def apply[T](file: T, fileList: js.Array[UploadFile[_]], event: Percent = null): UploadChangeParam[T] = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], fileList = fileList.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadChangeParam[T]]
  }
}

