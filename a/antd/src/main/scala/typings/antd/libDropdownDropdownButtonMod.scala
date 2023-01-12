package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.antd.anon.Delay
import typings.antd.antdStrings.click
import typings.antd.antdStrings.contextMenu
import typings.antd.antdStrings.hover
import typings.antd.antdStrings.text_
import typings.antd.libButtonButtonGroupMod.ButtonGroupProps
import typings.antd.libButtonButtonMod.ButtonHTMLType
import typings.antd.libDropdownDropdownMod.Align
import typings.antd.libDropdownDropdownMod.DropdownArrowOptions
import typings.antd.libDropdownDropdownMod.OverlayFunc
import typings.antd.libDropdownDropdownMod.Placement
import typings.antd.libMenuMod.MenuProps
import typings.react.mod.CSSProperties
import typings.react.mod.FC
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.std.HTMLButtonElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDropdownDropdownButtonMod extends Shortcut {
  
  @JSImport("antd/lib/dropdown/dropdown-button", JSImport.Default)
  @js.native
  val default: DropdownButtonInterface = js.native
  
  type DropdownButtonInterface = FC[DropdownButtonProps]
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.antd.libDropdownDropdownMod.DropdownProps because var conflicts: children, className, prefixCls. Inlined menu, autoFocus, arrow, trigger, dropdownRender, onOpenChange, open, disabled, destroyPopupOnHide, align, getPopupContainer, transitionName, placement, overlayClassName, overlayStyle, forceRender, mouseEnterDelay, mouseLeaveDelay, openClassName, overlay, visible, onVisibleChange */ trait DropdownButtonProps
    extends StObject
       with ButtonGroupProps {
    
    var align: js.UndefOr[Align] = js.undefined
    
    var arrow: js.UndefOr[Boolean | DropdownArrowOptions] = js.undefined
    
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    var buttonsRender: js.UndefOr[js.Function1[/* buttons */ js.Array[ReactNode], js.Array[ReactNode]]] = js.undefined
    
    var danger: js.UndefOr[Boolean] = js.undefined
    
    var destroyPopupOnHide: js.UndefOr[Boolean] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var dropdownRender: js.UndefOr[js.Function1[/* originNode */ ReactNode, ReactNode]] = js.undefined
    
    var forceRender: js.UndefOr[Boolean] = js.undefined
    
    var getPopupContainer: js.UndefOr[js.Function1[/* triggerNode */ HTMLElement, HTMLElement]] = js.undefined
    
    var href: js.UndefOr[String] = js.undefined
    
    var htmlType: js.UndefOr[ButtonHTMLType] = js.undefined
    
    var icon: js.UndefOr[ReactNode] = js.undefined
    
    var loading: js.UndefOr[Boolean | Delay] = js.undefined
    
    var menu: js.UndefOr[MenuProps] = js.undefined
    
    var mouseEnterDelay: js.UndefOr[Double] = js.undefined
    
    var mouseLeaveDelay: js.UndefOr[Double] = js.undefined
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.undefined
    
    var onOpenChange: js.UndefOr[js.Function1[/* open */ Boolean, Unit]] = js.undefined
    
    /** @deprecated Please use `onOpenChange` instead */
    var onVisibleChange: js.UndefOr[js.Function1[/* open */ Boolean, Unit]] = js.undefined
    
    var open: js.UndefOr[Boolean] = js.undefined
    
    var openClassName: js.UndefOr[String] = js.undefined
    
    /** @deprecated Please use `menu` instead */
    var overlay: js.UndefOr[ReactElement | OverlayFunc] = js.undefined
    
    var overlayClassName: js.UndefOr[String] = js.undefined
    
    var overlayStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var placement: js.UndefOr[Placement] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var transitionName: js.UndefOr[String] = js.undefined
    
    var trigger: js.UndefOr[js.Array[click | hover | contextMenu]] = js.undefined
    
    var `type`: js.UndefOr[DropdownButtonType] = js.undefined
    
    /** @deprecated Please use `open` instead */
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object DropdownButtonProps {
    
    inline def apply(): DropdownButtonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DropdownButtonProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DropdownButtonProps] (val x: Self) extends AnyVal {
      
      inline def setAlign(value: Align): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setArrow(value: Boolean | DropdownArrowOptions): Self = StObject.set(x, "arrow", value.asInstanceOf[js.Any])
      
      inline def setArrowUndefined: Self = StObject.set(x, "arrow", js.undefined)
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setButtonsRender(value: /* buttons */ js.Array[ReactNode] => js.Array[ReactNode]): Self = StObject.set(x, "buttonsRender", js.Any.fromFunction1(value))
      
      inline def setButtonsRenderUndefined: Self = StObject.set(x, "buttonsRender", js.undefined)
      
      inline def setDanger(value: Boolean): Self = StObject.set(x, "danger", value.asInstanceOf[js.Any])
      
      inline def setDangerUndefined: Self = StObject.set(x, "danger", js.undefined)
      
      inline def setDestroyPopupOnHide(value: Boolean): Self = StObject.set(x, "destroyPopupOnHide", value.asInstanceOf[js.Any])
      
      inline def setDestroyPopupOnHideUndefined: Self = StObject.set(x, "destroyPopupOnHide", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setDropdownRender(value: /* originNode */ ReactNode => ReactNode): Self = StObject.set(x, "dropdownRender", js.Any.fromFunction1(value))
      
      inline def setDropdownRenderUndefined: Self = StObject.set(x, "dropdownRender", js.undefined)
      
      inline def setForceRender(value: Boolean): Self = StObject.set(x, "forceRender", value.asInstanceOf[js.Any])
      
      inline def setForceRenderUndefined: Self = StObject.set(x, "forceRender", js.undefined)
      
      inline def setGetPopupContainer(value: /* triggerNode */ HTMLElement => HTMLElement): Self = StObject.set(x, "getPopupContainer", js.Any.fromFunction1(value))
      
      inline def setGetPopupContainerUndefined: Self = StObject.set(x, "getPopupContainer", js.undefined)
      
      inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      inline def setHtmlType(value: ButtonHTMLType): Self = StObject.set(x, "htmlType", value.asInstanceOf[js.Any])
      
      inline def setHtmlTypeUndefined: Self = StObject.set(x, "htmlType", js.undefined)
      
      inline def setIcon(value: ReactNode): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setLoading(value: Boolean | Delay): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      inline def setMenu(value: MenuProps): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
      
      inline def setMenuUndefined: Self = StObject.set(x, "menu", js.undefined)
      
      inline def setMouseEnterDelay(value: Double): Self = StObject.set(x, "mouseEnterDelay", value.asInstanceOf[js.Any])
      
      inline def setMouseEnterDelayUndefined: Self = StObject.set(x, "mouseEnterDelay", js.undefined)
      
      inline def setMouseLeaveDelay(value: Double): Self = StObject.set(x, "mouseLeaveDelay", value.asInstanceOf[js.Any])
      
      inline def setMouseLeaveDelayUndefined: Self = StObject.set(x, "mouseLeaveDelay", js.undefined)
      
      inline def setOnClick(value: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnOpenChange(value: /* open */ Boolean => Unit): Self = StObject.set(x, "onOpenChange", js.Any.fromFunction1(value))
      
      inline def setOnOpenChangeUndefined: Self = StObject.set(x, "onOpenChange", js.undefined)
      
      inline def setOnVisibleChange(value: /* open */ Boolean => Unit): Self = StObject.set(x, "onVisibleChange", js.Any.fromFunction1(value))
      
      inline def setOnVisibleChangeUndefined: Self = StObject.set(x, "onVisibleChange", js.undefined)
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOpenClassName(value: String): Self = StObject.set(x, "openClassName", value.asInstanceOf[js.Any])
      
      inline def setOpenClassNameUndefined: Self = StObject.set(x, "openClassName", js.undefined)
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      inline def setOverlay(value: ReactElement | OverlayFunc): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
      
      inline def setOverlayClassName(value: String): Self = StObject.set(x, "overlayClassName", value.asInstanceOf[js.Any])
      
      inline def setOverlayClassNameUndefined: Self = StObject.set(x, "overlayClassName", js.undefined)
      
      inline def setOverlayFunction0(value: () => ReactElement): Self = StObject.set(x, "overlay", js.Any.fromFunction0(value))
      
      inline def setOverlayStyle(value: CSSProperties): Self = StObject.set(x, "overlayStyle", value.asInstanceOf[js.Any])
      
      inline def setOverlayStyleUndefined: Self = StObject.set(x, "overlayStyle", js.undefined)
      
      inline def setOverlayUndefined: Self = StObject.set(x, "overlay", js.undefined)
      
      inline def setPlacement(value: Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTransitionName(value: String): Self = StObject.set(x, "transitionName", value.asInstanceOf[js.Any])
      
      inline def setTransitionNameUndefined: Self = StObject.set(x, "transitionName", js.undefined)
      
      inline def setTrigger(value: js.Array[click | hover | contextMenu]): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
      
      inline def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
      
      inline def setTriggerVarargs(value: (click | hover | contextMenu)*): Self = StObject.set(x, "trigger", js.Array(value*))
      
      inline def setType(value: DropdownButtonType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.antd.antdStrings.default
    - typings.antd.antdStrings.primary
    - typings.antd.antdStrings.ghost
    - typings.antd.antdStrings.dashed
    - typings.antd.antdStrings.link
    - typings.antd.antdStrings.text_
  */
  trait DropdownButtonType extends StObject
  object DropdownButtonType {
    
    inline def default: typings.antd.antdStrings.default = "default".asInstanceOf[typings.antd.antdStrings.default]
    
    inline def dashed: typings.antd.antdStrings.dashed = "dashed".asInstanceOf[typings.antd.antdStrings.dashed]
    
    inline def ghost: typings.antd.antdStrings.ghost = "ghost".asInstanceOf[typings.antd.antdStrings.ghost]
    
    inline def link: typings.antd.antdStrings.link = "link".asInstanceOf[typings.antd.antdStrings.link]
    
    inline def primary: typings.antd.antdStrings.primary = "primary".asInstanceOf[typings.antd.antdStrings.primary]
    
    inline def text: text_ = "text".asInstanceOf[text_]
  }
  
  type _To = DropdownButtonInterface
  
  /* This means you don't have to write `default`, but can instead just say `libDropdownDropdownButtonMod.foo` */
  override def _to: DropdownButtonInterface = default
}
