package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.antd.libDropdownDropdownMod.DropdownProps
import typings.antd.libDropdownDropdownMod.OverlayFunc
import typings.antd.libMenuMod.MenuProps
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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libBreadcrumbBreadcrumbItemMod extends Shortcut {
  
  @JSImport("antd/lib/breadcrumb/BreadcrumbItem", JSImport.Default)
  @js.native
  val default: BreadcrumbItemInterface = js.native
  
  @js.native
  trait BreadcrumbItemInterface
    extends StObject
       with FunctionComponent[BreadcrumbItemProps] {
    
    var __ANT_BREADCRUMB_ITEM: Boolean = js.native
  }
  
  trait BreadcrumbItemProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var dropdownProps: js.UndefOr[DropdownProps] = js.undefined
    
    var href: js.UndefOr[String] = js.undefined
    
    var menu: js.UndefOr[MenuProps] = js.undefined
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLAnchorElement | HTMLSpanElement]] = js.undefined
    
    /** @deprecated Please use `menu` instead */
    var overlay: js.UndefOr[ReactElement | OverlayFunc] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var separator: js.UndefOr[ReactNode] = js.undefined
  }
  object BreadcrumbItemProps {
    
    inline def apply(): BreadcrumbItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BreadcrumbItemProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BreadcrumbItemProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDropdownProps(value: DropdownProps): Self = StObject.set(x, "dropdownProps", value.asInstanceOf[js.Any])
      
      inline def setDropdownPropsUndefined: Self = StObject.set(x, "dropdownProps", js.undefined)
      
      inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      inline def setMenu(value: MenuProps): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
      
      inline def setMenuUndefined: Self = StObject.set(x, "menu", js.undefined)
      
      inline def setOnClick(value: MouseEvent[HTMLAnchorElement | HTMLSpanElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOverlay(value: ReactElement | OverlayFunc): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
      
      inline def setOverlayFunction0(value: () => ReactElement): Self = StObject.set(x, "overlay", js.Any.fromFunction0(value))
      
      inline def setOverlayUndefined: Self = StObject.set(x, "overlay", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setSeparator(value: ReactNode): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
    }
  }
  
  type _To = BreadcrumbItemInterface
  
  /* This means you don't have to write `default`, but can instead just say `libBreadcrumbBreadcrumbItemMod.foo` */
  override def _to: BreadcrumbItemInterface = default
}
