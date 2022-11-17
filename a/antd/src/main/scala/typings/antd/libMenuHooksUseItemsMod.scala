package typings.antd

import typings.rcMenu.anon.DomEvent
import typings.rcMenu.esInterfaceMod.MenuClickEventHandler
import typings.rcMenu.esInterfaceMod.MenuHoverEventHandler
import typings.rcMenu.esInterfaceMod.MenuInfo
import typings.rcMenu.esInterfaceMod.MenuTitleInfo
import typings.rcMenu.esInterfaceMod.RenderIconInfo
import typings.rcMenu.esInterfaceMod.RenderIconType
import typings.react.mod.CSSProperties
import typings.react.mod.Key
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMenuHooksUseItemsMod {
  
  @JSImport("antd/lib/menu/hooks/useItems", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): js.UndefOr[js.Array[Element | Null]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.UndefOr[js.Array[Element | Null]]]
  inline def default(items: js.Array[ItemType]): js.UndefOr[js.Array[Element | Null]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(items.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Array[Element | Null]]]
  
  type ItemType = MenuItemType | SubMenuType | MenuItemGroupType | MenuDividerType | Null
  
  trait MenuDividerType
    extends StObject
       with typings.rcMenu.esInterfaceMod.MenuDividerType {
    
    var dashed: js.UndefOr[Boolean] = js.undefined
    
    var key: js.UndefOr[Key] = js.undefined
  }
  object MenuDividerType {
    
    inline def apply(): MenuDividerType = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("divider")
      __obj.asInstanceOf[MenuDividerType]
    }
    
    extension [Self <: MenuDividerType](x: Self) {
      
      inline def setDashed(value: Boolean): Self = StObject.set(x, "dashed", value.asInstanceOf[js.Any])
      
      inline def setDashedUndefined: Self = StObject.set(x, "dashed", js.undefined)
      
      inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    }
  }
  
  /* Inlined parent std.Omit<rc-menu.rc-menu/es/interface.MenuItemGroupType, 'children'> */
  trait MenuItemGroupType extends StObject {
    
    var children: js.UndefOr[js.Array[ItemType]] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var key: js.UndefOr[Key] = js.undefined
    
    var label: js.UndefOr[ReactNode] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var `type`: "group"
  }
  object MenuItemGroupType {
    
    inline def apply(): MenuItemGroupType = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("group")
      __obj.asInstanceOf[MenuItemGroupType]
    }
    
    extension [Self <: MenuItemGroupType](x: Self) {
      
      inline def setChildren(value: js.Array[ItemType]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: ItemType*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setLabel(value: ReactNode): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setType(value: "group"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait MenuItemType
    extends StObject
       with typings.rcMenu.esInterfaceMod.MenuItemType {
    
    var danger: js.UndefOr[Boolean] = js.undefined
    
    var icon: js.UndefOr[ReactNode] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
  }
  object MenuItemType {
    
    inline def apply(key: Key): MenuItemType = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[MenuItemType]
    }
    
    extension [Self <: MenuItemType](x: Self) {
      
      inline def setDanger(value: Boolean): Self = StObject.set(x, "danger", value.asInstanceOf[js.Any])
      
      inline def setDangerUndefined: Self = StObject.set(x, "danger", js.undefined)
      
      inline def setIcon(value: ReactNode): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  /* Inlined parent std.Omit<rc-menu.rc-menu/es/interface.SubMenuType, 'children'> */
  trait SubMenuType extends StObject {
    
    var children: js.Array[ItemType]
    
    var className: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var expandIcon: js.UndefOr[RenderIconType] = js.undefined
    
    var icon: js.UndefOr[ReactNode] = js.undefined
    
    var itemIcon: js.UndefOr[RenderIconType] = js.undefined
    
    var key: String
    
    var label: js.UndefOr[ReactNode] = js.undefined
    
    var onClick: js.UndefOr[MenuClickEventHandler] = js.undefined
    
    var onMouseEnter: js.UndefOr[MenuHoverEventHandler] = js.undefined
    
    var onMouseLeave: js.UndefOr[MenuHoverEventHandler] = js.undefined
    
    var onTitleClick: js.UndefOr[js.Function1[/* info */ MenuTitleInfo, Unit]] = js.undefined
    
    var onTitleMouseEnter: js.UndefOr[MenuHoverEventHandler] = js.undefined
    
    var onTitleMouseLeave: js.UndefOr[MenuHoverEventHandler] = js.undefined
    
    var popupClassName: js.UndefOr[String] = js.undefined
    
    var popupOffset: js.UndefOr[js.Array[Double]] = js.undefined
    
    var rootClassName: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var theme: js.UndefOr["dark" | "light"] = js.undefined
  }
  object SubMenuType {
    
    inline def apply(children: js.Array[ItemType], key: String): SubMenuType = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[SubMenuType]
    }
    
    extension [Self <: SubMenuType](x: Self) {
      
      inline def setChildren(value: js.Array[ItemType]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: ItemType*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setExpandIcon(value: RenderIconType): Self = StObject.set(x, "expandIcon", value.asInstanceOf[js.Any])
      
      inline def setExpandIconFunction1(value: /* props */ RenderIconInfo => ReactNode): Self = StObject.set(x, "expandIcon", js.Any.fromFunction1(value))
      
      inline def setExpandIconUndefined: Self = StObject.set(x, "expandIcon", js.undefined)
      
      inline def setIcon(value: ReactNode): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setItemIcon(value: RenderIconType): Self = StObject.set(x, "itemIcon", value.asInstanceOf[js.Any])
      
      inline def setItemIconFunction1(value: /* props */ RenderIconInfo => ReactNode): Self = StObject.set(x, "itemIcon", js.Any.fromFunction1(value))
      
      inline def setItemIconUndefined: Self = StObject.set(x, "itemIcon", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: ReactNode): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setOnClick(value: /* info */ MenuInfo => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnMouseEnter(value: /* info */ DomEvent => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      inline def setOnMouseLeave(value: /* info */ DomEvent => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      inline def setOnTitleClick(value: /* info */ MenuTitleInfo => Unit): Self = StObject.set(x, "onTitleClick", js.Any.fromFunction1(value))
      
      inline def setOnTitleClickUndefined: Self = StObject.set(x, "onTitleClick", js.undefined)
      
      inline def setOnTitleMouseEnter(value: /* info */ DomEvent => Unit): Self = StObject.set(x, "onTitleMouseEnter", js.Any.fromFunction1(value))
      
      inline def setOnTitleMouseEnterUndefined: Self = StObject.set(x, "onTitleMouseEnter", js.undefined)
      
      inline def setOnTitleMouseLeave(value: /* info */ DomEvent => Unit): Self = StObject.set(x, "onTitleMouseLeave", js.Any.fromFunction1(value))
      
      inline def setOnTitleMouseLeaveUndefined: Self = StObject.set(x, "onTitleMouseLeave", js.undefined)
      
      inline def setPopupClassName(value: String): Self = StObject.set(x, "popupClassName", value.asInstanceOf[js.Any])
      
      inline def setPopupClassNameUndefined: Self = StObject.set(x, "popupClassName", js.undefined)
      
      inline def setPopupOffset(value: js.Array[Double]): Self = StObject.set(x, "popupOffset", value.asInstanceOf[js.Any])
      
      inline def setPopupOffsetUndefined: Self = StObject.set(x, "popupOffset", js.undefined)
      
      inline def setPopupOffsetVarargs(value: Double*): Self = StObject.set(x, "popupOffset", js.Array(value*))
      
      inline def setRootClassName(value: String): Self = StObject.set(x, "rootClassName", value.asInstanceOf[js.Any])
      
      inline def setRootClassNameUndefined: Self = StObject.set(x, "rootClassName", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTheme(value: "dark" | "light"): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
}
