package typings.antd.dropdownButtonMod

import typings.antd.antdStrings.click
import typings.antd.antdStrings.contextMenu
import typings.antd.antdStrings.hover
import typings.antd.buttonButtonMod.ButtonHTMLType
import typings.antd.buttonGroupMod.ButtonGroupProps
import typings.antd.dropdownDropdownMod.Align
import typings.antd.dropdownDropdownMod.OverlayFunc
import typings.antd.dropdownDropdownMod.Placement
import typings.react.mod.CSSProperties
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.std.HTMLButtonElement
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.antd.dropdownDropdownMod.DropDownProps because var conflicts: className, prefixCls. Inlined arrow, trigger, overlay, onVisibleChange, visible, disabled, align, getPopupContainer, transitionName, placement, overlayClassName, overlayStyle, forceRender, mouseEnterDelay, mouseLeaveDelay, openClassName */ @js.native
trait DropdownButtonProps extends ButtonGroupProps {
  var align: js.UndefOr[Align] = js.native
  var arrow: js.UndefOr[Boolean] = js.native
  var buttonsRender: js.UndefOr[js.Function1[/* buttons */ js.Array[ReactNode], js.Array[ReactNode]]] = js.native
  var children: js.UndefOr[ReactNode] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var forceRender: js.UndefOr[Boolean] = js.native
  var getPopupContainer: js.UndefOr[js.Function1[/* triggerNode */ HTMLElement, HTMLElement]] = js.native
  var href: js.UndefOr[String] = js.native
  var htmlType: js.UndefOr[ButtonHTMLType] = js.native
  var icon: js.UndefOr[ReactNode] = js.native
  var mouseEnterDelay: js.UndefOr[Double] = js.native
  var mouseLeaveDelay: js.UndefOr[Double] = js.native
  var onClick: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.native
  var onVisibleChange: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.native
  var openClassName: js.UndefOr[String] = js.native
  var overlay: ReactElement | OverlayFunc = js.native
  var overlayClassName: js.UndefOr[String] = js.native
  var overlayStyle: js.UndefOr[CSSProperties] = js.native
  var placement: js.UndefOr[Placement] = js.native
  var title: js.UndefOr[String] = js.native
  var transitionName: js.UndefOr[String] = js.native
  var trigger: js.UndefOr[js.Array[click | hover | contextMenu]] = js.native
  var `type`: js.UndefOr[DropdownButtonType] = js.native
  var visible: js.UndefOr[Boolean] = js.native
}

object DropdownButtonProps {
  @scala.inline
  def apply(overlay: ReactElement | OverlayFunc): DropdownButtonProps = {
    val __obj = js.Dynamic.literal(overlay = overlay.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropdownButtonProps]
  }
  @scala.inline
  implicit class DropdownButtonPropsOps[Self <: DropdownButtonProps] (val x: Self) extends AnyVal {
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
    def setOverlayFunction0(value: () => ReactElement): Self = this.set("overlay", js.Any.fromFunction0(value))
    @scala.inline
    def setOverlay(value: ReactElement | OverlayFunc): Self = this.set("overlay", value.asInstanceOf[js.Any])
    @scala.inline
    def setAlign(value: Align): Self = this.set("align", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    @scala.inline
    def setArrow(value: Boolean): Self = this.set("arrow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArrow: Self = this.set("arrow", js.undefined)
    @scala.inline
    def setButtonsRender(value: /* buttons */ js.Array[ReactNode] => js.Array[ReactNode]): Self = this.set("buttonsRender", js.Any.fromFunction1(value))
    @scala.inline
    def deleteButtonsRender: Self = this.set("buttonsRender", js.undefined)
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setForceRender(value: Boolean): Self = this.set("forceRender", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceRender: Self = this.set("forceRender", js.undefined)
    @scala.inline
    def setGetPopupContainer(value: /* triggerNode */ HTMLElement => HTMLElement): Self = this.set("getPopupContainer", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetPopupContainer: Self = this.set("getPopupContainer", js.undefined)
    @scala.inline
    def setHref(value: String): Self = this.set("href", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHref: Self = this.set("href", js.undefined)
    @scala.inline
    def setHtmlType(value: ButtonHTMLType): Self = this.set("htmlType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHtmlType: Self = this.set("htmlType", js.undefined)
    @scala.inline
    def setIcon(value: ReactNode): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setMouseEnterDelay(value: Double): Self = this.set("mouseEnterDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMouseEnterDelay: Self = this.set("mouseEnterDelay", js.undefined)
    @scala.inline
    def setMouseLeaveDelay(value: Double): Self = this.set("mouseLeaveDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMouseLeaveDelay: Self = this.set("mouseLeaveDelay", js.undefined)
    @scala.inline
    def setOnClick(value: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setOnVisibleChange(value: /* visible */ Boolean => Unit): Self = this.set("onVisibleChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnVisibleChange: Self = this.set("onVisibleChange", js.undefined)
    @scala.inline
    def setOpenClassName(value: String): Self = this.set("openClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpenClassName: Self = this.set("openClassName", js.undefined)
    @scala.inline
    def setOverlayClassName(value: String): Self = this.set("overlayClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverlayClassName: Self = this.set("overlayClassName", js.undefined)
    @scala.inline
    def setOverlayStyle(value: CSSProperties): Self = this.set("overlayStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverlayStyle: Self = this.set("overlayStyle", js.undefined)
    @scala.inline
    def setPlacement(value: Placement): Self = this.set("placement", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlacement: Self = this.set("placement", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setTransitionName(value: String): Self = this.set("transitionName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransitionName: Self = this.set("transitionName", js.undefined)
    @scala.inline
    def setTriggerVarargs(value: (click | hover | contextMenu)*): Self = this.set("trigger", js.Array(value :_*))
    @scala.inline
    def setTrigger(value: js.Array[click | hover | contextMenu]): Self = this.set("trigger", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrigger: Self = this.set("trigger", js.undefined)
    @scala.inline
    def setType(value: DropdownButtonType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
  
}

