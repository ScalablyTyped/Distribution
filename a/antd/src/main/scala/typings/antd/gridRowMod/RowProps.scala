package typings.antd.gridRowMod

import typings.antd.antdStrings.`space-around`
import typings.antd.antdStrings.`space-between`
import typings.antd.antdStrings.bottom
import typings.antd.antdStrings.center
import typings.antd.antdStrings.end
import typings.antd.antdStrings.middle
import typings.antd.antdStrings.start
import typings.antd.antdStrings.stretch
import typings.antd.antdStrings.top
import typings.react.mod.HTMLAttributes
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RowProps extends HTMLAttributes[HTMLDivElement] {
  var align: js.UndefOr[top | middle | bottom | stretch] = js.native
  var gutter: js.UndefOr[Gutter | (js.Tuple2[Gutter, Gutter])] = js.native
  var justify: js.UndefOr[start | end | center | `space-around` | `space-between`] = js.native
  var prefixCls: js.UndefOr[String] = js.native
}

object RowProps {
  @scala.inline
  def apply(): RowProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowProps]
  }
  @scala.inline
  implicit class RowPropsOps[Self <: RowProps] (val x: Self) extends AnyVal {
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
    def setAlign(value: top | middle | bottom | stretch): Self = this.set("align", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    @scala.inline
    def setGutter(value: Gutter | (js.Tuple2[Gutter, Gutter])): Self = this.set("gutter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGutter: Self = this.set("gutter", js.undefined)
    @scala.inline
    def setJustify(value: start | end | center | `space-around` | `space-between`): Self = this.set("justify", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJustify: Self = this.set("justify", js.undefined)
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
  }
  
}

