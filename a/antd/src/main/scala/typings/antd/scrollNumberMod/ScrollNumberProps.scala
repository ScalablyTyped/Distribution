package typings.antd.scrollNumberMod

import typings.react.mod.CSSProperties
import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScrollNumberProps extends js.Object {
  var className: js.UndefOr[String] = js.native
  var component: js.UndefOr[String] = js.native
  var count: js.UndefOr[String | Double | Null] = js.native
  var displayComponent: js.UndefOr[ReactElement] = js.native
  var onAnimated: js.UndefOr[js.Function] = js.native
  var prefixCls: js.UndefOr[String] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var title: js.UndefOr[String | Double | Null] = js.native
}

object ScrollNumberProps {
  @scala.inline
  def apply(): ScrollNumberProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScrollNumberProps]
  }
  @scala.inline
  implicit class ScrollNumberPropsOps[Self <: ScrollNumberProps] (val x: Self) extends AnyVal {
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
    def setComponent(value: String): Self = this.set("component", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponent: Self = this.set("component", js.undefined)
    @scala.inline
    def setCount(value: String | Double): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    @scala.inline
    def setCountNull: Self = this.set("count", null)
    @scala.inline
    def setDisplayComponent(value: ReactElement): Self = this.set("displayComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayComponent: Self = this.set("displayComponent", js.undefined)
    @scala.inline
    def setOnAnimated(value: js.Function): Self = this.set("onAnimated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnAnimated: Self = this.set("onAnimated", js.undefined)
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setTitle(value: String | Double): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setTitleNull: Self = this.set("title", null)
  }
  
}

