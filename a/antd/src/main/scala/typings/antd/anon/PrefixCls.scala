package typings.antd.anon

import typings.antd.sliderMod.HandleGeneratorInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrefixCls extends js.Object {
  var info: HandleGeneratorInfo = js.native
  var prefixCls: js.UndefOr[String] = js.native
  var tooltipPrefixCls: js.UndefOr[String] = js.native
}

object PrefixCls {
  @scala.inline
  def apply(info: HandleGeneratorInfo): PrefixCls = {
    val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrefixCls]
  }
  @scala.inline
  implicit class PrefixClsOps[Self <: PrefixCls] (val x: Self) extends AnyVal {
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
    def setInfo(value: HandleGeneratorInfo): Self = this.set("info", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
    @scala.inline
    def setTooltipPrefixCls(value: String): Self = this.set("tooltipPrefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltipPrefixCls: Self = this.set("tooltipPrefixCls", js.undefined)
  }
  
}

