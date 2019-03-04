package typings
package antdLib.libUploadInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadChangeParam extends js.Object {
  var event: js.UndefOr[antdLib.Anon_Percent] = js.undefined
  var file: UploadFile
  var fileList: js.Array[UploadFile]
}

object UploadChangeParam {
  @scala.inline
  def apply(file: UploadFile, fileList: js.Array[UploadFile], event: antdLib.Anon_Percent = null): UploadChangeParam = {
    val __obj = js.Dynamic.literal(file = file, fileList = fileList)
    if (event != null) __obj.updateDynamic("event")(event)
    __obj.asInstanceOf[UploadChangeParam]
  }
}

