package typings.antd.spaceMod

import typings.antd.antdStrings.baseline
import typings.antd.antdStrings.center
import typings.antd.antdStrings.end
import typings.antd.antdStrings.horizontal
import typings.antd.antdStrings.start
import typings.antd.antdStrings.vertical
import typings.antd.sizeContextMod.SizeType
import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpaceProps extends js.Object {
  var align: js.UndefOr[start | end | center | baseline] = js.native
  var className: js.UndefOr[String] = js.native
  var direction: js.UndefOr[horizontal | vertical] = js.native
  var prefixCls: js.UndefOr[String] = js.native
  var size: js.UndefOr[SizeType | Double] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
}

object SpaceProps {
  @scala.inline
  def apply(): SpaceProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpaceProps]
  }
  @scala.inline
  implicit class SpacePropsOps[Self <: SpaceProps] (val x: Self) extends AnyVal {
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
    def setAlign(value: start | end | center | baseline): Self = this.set("align", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setDirection(value: horizontal | vertical): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
    @scala.inline
    def setSize(value: SizeType | Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

