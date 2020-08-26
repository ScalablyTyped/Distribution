package typings.appBuilderLib.bundledToolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToolInfo extends js.Object {
  var env: js.UndefOr[js.Any] = js.native
  var path: String = js.native
}

object ToolInfo {
  @scala.inline
  def apply(path: String): ToolInfo = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToolInfo]
  }
  @scala.inline
  implicit class ToolInfoOps[Self <: ToolInfo] (val x: Self) extends AnyVal {
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
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnv(value: js.Any): Self = this.set("env", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnv: Self = this.set("env", js.undefined)
  }
  
}

