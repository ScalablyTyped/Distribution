package typings.antd.affixMod

import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AffixProps extends js.Object {
  var children: ReactNode = js.native
  var className: js.UndefOr[String] = js.native
  /** 距离窗口底部达到指定偏移量后触发 */
  var offsetBottom: js.UndefOr[Double] = js.native
  /**
    * 距离窗口顶部达到指定偏移量后触发
    */
  var offsetTop: js.UndefOr[Double] = js.native
  /** 固定状态改变时触发的回调函数 */
  var onChange: js.UndefOr[js.Function1[/* affixed */ js.UndefOr[Boolean], Unit]] = js.native
  var prefixCls: js.UndefOr[String] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  /** 设置 Affix 需要监听其滚动事件的元素，值为一个返回对应 DOM 元素的函数 */
  var target: js.UndefOr[js.Function0[Window | HTMLElement | Null]] = js.native
}

object AffixProps {
  @scala.inline
  def apply(): AffixProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AffixProps]
  }
  @scala.inline
  implicit class AffixPropsOps[Self <: AffixProps] (val x: Self) extends AnyVal {
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
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setOffsetBottom(value: Double): Self = this.set("offsetBottom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffsetBottom: Self = this.set("offsetBottom", js.undefined)
    @scala.inline
    def setOffsetTop(value: Double): Self = this.set("offsetTop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffsetTop: Self = this.set("offsetTop", js.undefined)
    @scala.inline
    def setOnChange(value: /* affixed */ js.UndefOr[Boolean] => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setTarget(value: () => Window | HTMLElement | Null): Self = this.set("target", js.Any.fromFunction0(value))
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
  }
  
}

