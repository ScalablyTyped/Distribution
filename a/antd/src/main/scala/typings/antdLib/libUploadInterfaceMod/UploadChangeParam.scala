package typings
package antdLib.libUploadInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadChangeParam[T /* <: js.Object */] extends js.Object {
  var event: js.UndefOr[antdLib.Anon_Percent] = js.undefined
  var file: T
  var fileList: js.Array[UploadFile]
}

object UploadChangeParam {
  @scala.inline
  def apply[T /* <: js.Object */](file: T, fileList: js.Array[UploadFile], event: antdLib.Anon_Percent = null): UploadChangeParam[T] = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], fileList = fileList)
    if (event != null) __obj.updateDynamic("event")(event)
    __obj.asInstanceOf[UploadChangeParam[T]]
  }
}

