package typings.autolinker.anchorTagBuilderMod

import typings.autolinker.autolinkerMod.TruncateConfigObj
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnchorTagBuilderCfg extends js.Object {
  var className: js.UndefOr[String] = js.native
  var newWindow: js.UndefOr[Boolean] = js.native
  var truncate: js.UndefOr[TruncateConfigObj] = js.native
}

object AnchorTagBuilderCfg {
  @scala.inline
  def apply(): AnchorTagBuilderCfg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnchorTagBuilderCfg]
  }
  @scala.inline
  implicit class AnchorTagBuilderCfgOps[Self <: AnchorTagBuilderCfg] (val x: Self) extends AnyVal {
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setNewWindow(value: Boolean): Self = this.set("newWindow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewWindow: Self = this.set("newWindow", js.undefined)
    @scala.inline
    def setTruncate(value: TruncateConfigObj): Self = this.set("truncate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTruncate: Self = this.set("truncate", js.undefined)
  }
  
}

