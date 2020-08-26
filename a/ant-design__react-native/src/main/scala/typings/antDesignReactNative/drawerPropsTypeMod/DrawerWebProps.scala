package typings.antDesignReactNative.drawerPropsTypeMod

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DrawerWebProps extends DrawerProps {
  var className: js.UndefOr[String] = js.native
  var contentStyle: js.UndefOr[CSSProperties] = js.native
  var docked: js.UndefOr[Boolean] = js.native
  var dragHandleStyle: js.UndefOr[CSSProperties] = js.native
  var dragToggleDistance: js.UndefOr[Double] = js.native
  var overlayStyle: js.UndefOr[CSSProperties] = js.native
  var prefixCls: js.UndefOr[String] = js.native
  var sidebarStyle: js.UndefOr[CSSProperties] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var touch: js.UndefOr[Boolean] = js.native
  var transitions: js.UndefOr[Boolean] = js.native
}

object DrawerWebProps {
  @scala.inline
  def apply(): DrawerWebProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DrawerWebProps]
  }
  @scala.inline
  implicit class DrawerWebPropsOps[Self <: DrawerWebProps] (val x: Self) extends AnyVal {
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
    def setContentStyle(value: CSSProperties): Self = this.set("contentStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentStyle: Self = this.set("contentStyle", js.undefined)
    @scala.inline
    def setDocked(value: Boolean): Self = this.set("docked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocked: Self = this.set("docked", js.undefined)
    @scala.inline
    def setDragHandleStyle(value: CSSProperties): Self = this.set("dragHandleStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDragHandleStyle: Self = this.set("dragHandleStyle", js.undefined)
    @scala.inline
    def setDragToggleDistance(value: Double): Self = this.set("dragToggleDistance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDragToggleDistance: Self = this.set("dragToggleDistance", js.undefined)
    @scala.inline
    def setOverlayStyle(value: CSSProperties): Self = this.set("overlayStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverlayStyle: Self = this.set("overlayStyle", js.undefined)
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
    @scala.inline
    def setSidebarStyle(value: CSSProperties): Self = this.set("sidebarStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSidebarStyle: Self = this.set("sidebarStyle", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setTouch(value: Boolean): Self = this.set("touch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTouch: Self = this.set("touch", js.undefined)
    @scala.inline
    def setTransitions(value: Boolean): Self = this.set("transitions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransitions: Self = this.set("transitions", js.undefined)
  }
  
}

