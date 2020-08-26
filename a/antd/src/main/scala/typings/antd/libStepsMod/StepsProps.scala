package typings.antd.libStepsMod

import typings.antd.antdStrings.error
import typings.antd.antdStrings.finish
import typings.antd.antdStrings.horizontal
import typings.antd.antdStrings.navigation
import typings.antd.antdStrings.process
import typings.antd.antdStrings.small
import typings.antd.antdStrings.vertical
import typings.antd.antdStrings.wait
import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StepsProps extends js.Object {
  var className: js.UndefOr[String] = js.native
  var current: js.UndefOr[Double] = js.native
  var direction: js.UndefOr[horizontal | vertical] = js.native
  var iconPrefix: js.UndefOr[String] = js.native
  var initial: js.UndefOr[Double] = js.native
  var labelPlacement: js.UndefOr[horizontal | vertical] = js.native
  var onChange: js.UndefOr[js.Function1[/* current */ Double, Unit]] = js.native
  var percent: js.UndefOr[Double] = js.native
  var prefixCls: js.UndefOr[String] = js.native
  var progressDot: js.UndefOr[Boolean | js.Function] = js.native
  var size: js.UndefOr[typings.antd.antdStrings.default | small] = js.native
  var status: js.UndefOr[wait | process | finish | error] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var `type`: js.UndefOr[typings.antd.antdStrings.default | navigation] = js.native
}

object StepsProps {
  @scala.inline
  def apply(): StepsProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StepsProps]
  }
  @scala.inline
  implicit class StepsPropsOps[Self <: StepsProps] (val x: Self) extends AnyVal {
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
    def setCurrent(value: Double): Self = this.set("current", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrent: Self = this.set("current", js.undefined)
    @scala.inline
    def setDirection(value: horizontal | vertical): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    @scala.inline
    def setIconPrefix(value: String): Self = this.set("iconPrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconPrefix: Self = this.set("iconPrefix", js.undefined)
    @scala.inline
    def setInitial(value: Double): Self = this.set("initial", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitial: Self = this.set("initial", js.undefined)
    @scala.inline
    def setLabelPlacement(value: horizontal | vertical): Self = this.set("labelPlacement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelPlacement: Self = this.set("labelPlacement", js.undefined)
    @scala.inline
    def setOnChange(value: /* current */ Double => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setPercent(value: Double): Self = this.set("percent", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePercent: Self = this.set("percent", js.undefined)
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
    @scala.inline
    def setProgressDot(value: Boolean | js.Function): Self = this.set("progressDot", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgressDot: Self = this.set("progressDot", js.undefined)
    @scala.inline
    def setSize(value: typings.antd.antdStrings.default | small): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setStatus(value: wait | process | finish | error): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setType(value: typings.antd.antdStrings.default | navigation): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

