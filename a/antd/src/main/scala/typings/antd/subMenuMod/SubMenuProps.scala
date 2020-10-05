package typings.antd.subMenuMod

import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubMenuProps extends js.Object {
  var className: js.UndefOr[String] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var icon: js.UndefOr[ReactNode] = js.native
  var level: js.UndefOr[Double] = js.native
  var onTitleClick: js.UndefOr[js.Function1[/* e */ TitleEventEntity, Unit]] = js.native
  var onTitleMouseEnter: js.UndefOr[js.Function1[/* e */ TitleEventEntity, Unit]] = js.native
  var onTitleMouseLeave: js.UndefOr[js.Function1[/* e */ TitleEventEntity, Unit]] = js.native
  var popupClassName: js.UndefOr[String] = js.native
  var popupOffset: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  var rootPrefixCls: js.UndefOr[String] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var title: js.UndefOr[ReactNode] = js.native
}

object SubMenuProps {
  @scala.inline
  def apply(): SubMenuProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubMenuProps]
  }
  @scala.inline
  implicit class SubMenuPropsOps[Self <: SubMenuProps] (val x: Self) extends AnyVal {
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
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setIcon(value: ReactNode): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setLevel(value: Double): Self = this.set("level", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
    @scala.inline
    def setOnTitleClick(value: /* e */ TitleEventEntity => Unit): Self = this.set("onTitleClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnTitleClick: Self = this.set("onTitleClick", js.undefined)
    @scala.inline
    def setOnTitleMouseEnter(value: /* e */ TitleEventEntity => Unit): Self = this.set("onTitleMouseEnter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnTitleMouseEnter: Self = this.set("onTitleMouseEnter", js.undefined)
    @scala.inline
    def setOnTitleMouseLeave(value: /* e */ TitleEventEntity => Unit): Self = this.set("onTitleMouseLeave", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnTitleMouseLeave: Self = this.set("onTitleMouseLeave", js.undefined)
    @scala.inline
    def setPopupClassName(value: String): Self = this.set("popupClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePopupClassName: Self = this.set("popupClassName", js.undefined)
    @scala.inline
    def setPopupOffset(value: js.Tuple2[Double, Double]): Self = this.set("popupOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePopupOffset: Self = this.set("popupOffset", js.undefined)
    @scala.inline
    def setRootPrefixCls(value: String): Self = this.set("rootPrefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRootPrefixCls: Self = this.set("rootPrefixCls", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setTitle(value: ReactNode): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

