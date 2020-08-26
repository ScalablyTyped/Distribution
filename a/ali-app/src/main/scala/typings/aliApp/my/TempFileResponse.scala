package typings.aliApp.my

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TempFileResponse extends js.Object {
  /** 文件的临时路径 */
  var apFilePath: String = js.native
}

object TempFileResponse {
  @scala.inline
  def apply(apFilePath: String): TempFileResponse = {
    val __obj = js.Dynamic.literal(apFilePath = apFilePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[TempFileResponse]
  }
  @scala.inline
  implicit class TempFileResponseOps[Self <: TempFileResponse] (val x: Self) extends AnyVal {
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
    def setApFilePath(value: String): Self = this.set("apFilePath", value.asInstanceOf[js.Any])
  }
  
}

