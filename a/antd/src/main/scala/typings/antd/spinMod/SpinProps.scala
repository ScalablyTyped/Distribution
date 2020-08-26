package typings.antd.spinMod

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpinProps extends js.Object {
  var className: js.UndefOr[String] = js.native
  var delay: js.UndefOr[Double] = js.native
  var indicator: js.UndefOr[SpinIndicator] = js.native
  var prefixCls: js.UndefOr[String] = js.native
  var size: js.UndefOr[SpinSize] = js.native
  var spinning: js.UndefOr[Boolean] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var tip: js.UndefOr[String] = js.native
  var wrapperClassName: js.UndefOr[String] = js.native
}

object SpinProps {
  @scala.inline
  def apply(): SpinProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpinProps]
  }
  @scala.inline
  implicit class SpinPropsOps[Self <: SpinProps] (val x: Self) extends AnyVal {
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
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    @scala.inline
    def setIndicator(value: SpinIndicator): Self = this.set("indicator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndicator: Self = this.set("indicator", js.undefined)
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
    @scala.inline
    def setSize(value: SpinSize): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setSpinning(value: Boolean): Self = this.set("spinning", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpinning: Self = this.set("spinning", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setTip(value: String): Self = this.set("tip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTip: Self = this.set("tip", js.undefined)
    @scala.inline
    def setWrapperClassName(value: String): Self = this.set("wrapperClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWrapperClassName: Self = this.set("wrapperClassName", js.undefined)
  }
  
}

