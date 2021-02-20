package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.antd.dropdownDropdownMod.DropDownProps
import typings.antd.dropdownDropdownMod.OverlayFunc
import typings.react.mod.FunctionComponent
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.std.HTMLAnchorElement
import typings.std.HTMLSpanElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object breadcrumbItemMod extends Shortcut {
  
  @JSImport("antd/lib/breadcrumb/BreadcrumbItem", JSImport.Default)
  @js.native
  val default: BreadcrumbItemInterface = js.native
  
  @js.native
  trait BreadcrumbItemInterface extends FunctionComponent[BreadcrumbItemProps] {
    
    var __ANT_BREADCRUMB_ITEM: Boolean = js.native
  }
  
  @js.native
  trait BreadcrumbItemProps extends StObject {
    
    var dropdownProps: js.UndefOr[DropDownProps] = js.native
    
    var href: js.UndefOr[String] = js.native
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLAnchorElement | HTMLSpanElement]] = js.native
    
    var overlay: js.UndefOr[ReactElement | OverlayFunc] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var separator: js.UndefOr[ReactNode] = js.native
  }
  object BreadcrumbItemProps {
    
    @scala.inline
    def apply(): BreadcrumbItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BreadcrumbItemProps]
    }
    
    @scala.inline
    implicit class BreadcrumbItemPropsMutableBuilder[Self <: BreadcrumbItemProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDropdownProps(value: DropDownProps): Self = StObject.set(x, "dropdownProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropdownPropsUndefined: Self = StObject.set(x, "dropdownProps", js.undefined)
      
      @scala.inline
      def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      @scala.inline
      def setOnClick(value: MouseEvent[HTMLAnchorElement | HTMLSpanElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOverlay(value: ReactElement | OverlayFunc): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayFunction0(value: () => ReactElement): Self = StObject.set(x, "overlay", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOverlayUndefined: Self = StObject.set(x, "overlay", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setSeparator(value: ReactNode): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
    }
  }
  
  type _To = BreadcrumbItemInterface
  
  /* This means you don't have to write `default`, but can instead just say `breadcrumbItemMod.foo` */
  override def _to: BreadcrumbItemInterface = default
}
