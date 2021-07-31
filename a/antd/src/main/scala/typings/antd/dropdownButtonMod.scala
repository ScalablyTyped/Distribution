package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.antd.antdStrings.click
import typings.antd.antdStrings.contextMenu
import typings.antd.antdStrings.hover
import typings.antd.buttonButtonMod.ButtonHTMLType
import typings.antd.buttonGroupMod.ButtonGroupProps
import typings.antd.dropdownDropdownMod.Align
import typings.antd.dropdownDropdownMod.OverlayFunc
import typings.antd.dropdownDropdownMod.Placement
import typings.react.mod.CSSProperties
import typings.react.mod.FunctionComponent
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

object dropdownButtonMod extends Shortcut {
  
  @JSImport("antd/lib/dropdown/dropdown-button", JSImport.Default)
  @js.native
  val default: DropdownButtonInterface = js.native
  
  @js.native
  trait DropdownButtonInterface
    extends StObject
       with FunctionComponent[DropdownButtonProps] {
    
    var __ANT_BUTTON: Boolean = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.antd.dropdownDropdownMod.DropDownProps because var conflicts: className, prefixCls. Inlined arrow, trigger, overlay, onVisibleChange, visible, disabled, align, getPopupContainer, transitionName, placement, overlayClassName, overlayStyle, forceRender, mouseEnterDelay, mouseLeaveDelay, openClassName */ trait DropdownButtonProps
    extends StObject
       with ButtonGroupProps {
    
    var align: js.UndefOr[Align] = js.undefined
    
    var arrow: js.UndefOr[Boolean] = js.undefined
    
    var buttonsRender: js.UndefOr[js.Function1[/* buttons */ js.Array[ReactNode], js.Array[ReactNode]]] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var forceRender: js.UndefOr[Boolean] = js.undefined
    
    var getPopupContainer: js.UndefOr[js.Function1[/* triggerNode */ HTMLElement, HTMLElement]] = js.undefined
    
    var href: js.UndefOr[String] = js.undefined
    
    var htmlType: js.UndefOr[ButtonHTMLType] = js.undefined
    
    var icon: js.UndefOr[ReactNode] = js.undefined
    
    var mouseEnterDelay: js.UndefOr[Double] = js.undefined
    
    var mouseLeaveDelay: js.UndefOr[Double] = js.undefined
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.undefined
    
    var onVisibleChange: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.undefined
    
    var openClassName: js.UndefOr[String] = js.undefined
    
    var overlay: ReactElement | OverlayFunc
    
    var overlayClassName: js.UndefOr[String] = js.undefined
    
    var overlayStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var placement: js.UndefOr[Placement] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var transitionName: js.UndefOr[String] = js.undefined
    
    var trigger: js.UndefOr[js.Array[click | hover | contextMenu]] = js.undefined
    
    var `type`: js.UndefOr[DropdownButtonType] = js.undefined
    
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object DropdownButtonProps {
    
    @scala.inline
    def apply(overlay: ReactElement | OverlayFunc): DropdownButtonProps = {
      val __obj = js.Dynamic.literal(overlay = overlay.asInstanceOf[js.Any])
      __obj.asInstanceOf[DropdownButtonProps]
    }
    
    @scala.inline
    implicit class DropdownButtonPropsMutableBuilder[Self <: DropdownButtonProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlign(value: Align): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      @scala.inline
      def setArrow(value: Boolean): Self = StObject.set(x, "arrow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrowUndefined: Self = StObject.set(x, "arrow", js.undefined)
      
      @scala.inline
      def setButtonsRender(value: /* buttons */ js.Array[ReactNode] => js.Array[ReactNode]): Self = StObject.set(x, "buttonsRender", js.Any.fromFunction1(value))
      
      @scala.inline
      def setButtonsRenderUndefined: Self = StObject.set(x, "buttonsRender", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setForceRender(value: Boolean): Self = StObject.set(x, "forceRender", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceRenderUndefined: Self = StObject.set(x, "forceRender", js.undefined)
      
      @scala.inline
      def setGetPopupContainer(value: /* triggerNode */ HTMLElement => HTMLElement): Self = StObject.set(x, "getPopupContainer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetPopupContainerUndefined: Self = StObject.set(x, "getPopupContainer", js.undefined)
      
      @scala.inline
      def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      @scala.inline
      def setHtmlType(value: ButtonHTMLType): Self = StObject.set(x, "htmlType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtmlTypeUndefined: Self = StObject.set(x, "htmlType", js.undefined)
      
      @scala.inline
      def setIcon(value: ReactNode): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setMouseEnterDelay(value: Double): Self = StObject.set(x, "mouseEnterDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMouseEnterDelayUndefined: Self = StObject.set(x, "mouseEnterDelay", js.undefined)
      
      @scala.inline
      def setMouseLeaveDelay(value: Double): Self = StObject.set(x, "mouseLeaveDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMouseLeaveDelayUndefined: Self = StObject.set(x, "mouseLeaveDelay", js.undefined)
      
      @scala.inline
      def setOnClick(value: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnVisibleChange(value: /* visible */ Boolean => Unit): Self = StObject.set(x, "onVisibleChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnVisibleChangeUndefined: Self = StObject.set(x, "onVisibleChange", js.undefined)
      
      @scala.inline
      def setOpenClassName(value: String): Self = StObject.set(x, "openClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenClassNameUndefined: Self = StObject.set(x, "openClassName", js.undefined)
      
      @scala.inline
      def setOverlay(value: ReactElement | OverlayFunc): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayClassName(value: String): Self = StObject.set(x, "overlayClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayClassNameUndefined: Self = StObject.set(x, "overlayClassName", js.undefined)
      
      @scala.inline
      def setOverlayFunction0(value: () => ReactElement): Self = StObject.set(x, "overlay", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOverlayStyle(value: CSSProperties): Self = StObject.set(x, "overlayStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayStyleUndefined: Self = StObject.set(x, "overlayStyle", js.undefined)
      
      @scala.inline
      def setPlacement(value: Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setTransitionName(value: String): Self = StObject.set(x, "transitionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionNameUndefined: Self = StObject.set(x, "transitionName", js.undefined)
      
      @scala.inline
      def setTrigger(value: js.Array[click | hover | contextMenu]): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
      
      @scala.inline
      def setTriggerVarargs(value: (click | hover | contextMenu)*): Self = StObject.set(x, "trigger", js.Array(value :_*))
      
      @scala.inline
      def setType(value: DropdownButtonType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.antd.antdStrings.primary
    - typings.antd.antdStrings.ghost
    - typings.antd.antdStrings.dashed
  */
  trait DropdownButtonType extends StObject
  object DropdownButtonType {
    
    @scala.inline
    def dashed: typings.antd.antdStrings.dashed = "dashed".asInstanceOf[typings.antd.antdStrings.dashed]
    
    @scala.inline
    def ghost: typings.antd.antdStrings.ghost = "ghost".asInstanceOf[typings.antd.antdStrings.ghost]
    
    @scala.inline
    def primary: typings.antd.antdStrings.primary = "primary".asInstanceOf[typings.antd.antdStrings.primary]
  }
  
  type _To = DropdownButtonInterface
  
  /* This means you don't have to write `default`, but can instead just say `dropdownButtonMod.foo` */
  override def _to: DropdownButtonInterface = default
}
