package typings.antd

import typings.antd.menuContextMod.MenuContextProps
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.Context
import typings.react.mod.ReactNode
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object subMenuMod {
  
  @JSImport("antd/lib/menu/SubMenu", JSImport.Default)
  @js.native
  class default () extends SubMenu
  object default {
    
    @JSImport("antd/lib/menu/SubMenu", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("antd/lib/menu/SubMenu", "default.contextType")
    @js.native
    def contextType: Context[MenuContextProps] = js.native
    inline def contextType_=(x: Context[MenuContextProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("antd/lib/menu/SubMenu", "default.isSubMenu")
    @js.native
    def isSubMenu: Double = js.native
    inline def isSubMenu_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isSubMenu")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait SubMenu
    extends Component[SubMenuProps, js.Any, js.Any] {
    
    def renderTitle(inlineCollapsed: Boolean): js.UndefOr[js.Object | Null] = js.native
  }
  
  trait SubMenuProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var icon: js.UndefOr[ReactNode] = js.undefined
    
    var level: js.UndefOr[Double] = js.undefined
    
    var onTitleClick: js.UndefOr[js.Function1[/* e */ TitleEventEntity, Unit]] = js.undefined
    
    var onTitleMouseEnter: js.UndefOr[js.Function1[/* e */ TitleEventEntity, Unit]] = js.undefined
    
    var onTitleMouseLeave: js.UndefOr[js.Function1[/* e */ TitleEventEntity, Unit]] = js.undefined
    
    var popupClassName: js.UndefOr[String] = js.undefined
    
    var popupOffset: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
    
    var rootPrefixCls: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var title: js.UndefOr[ReactNode] = js.undefined
  }
  object SubMenuProps {
    
    inline def apply(): SubMenuProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SubMenuProps]
    }
    
    extension [Self <: SubMenuProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setIcon(value: ReactNode): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      inline def setOnTitleClick(value: /* e */ TitleEventEntity => Unit): Self = StObject.set(x, "onTitleClick", js.Any.fromFunction1(value))
      
      inline def setOnTitleClickUndefined: Self = StObject.set(x, "onTitleClick", js.undefined)
      
      inline def setOnTitleMouseEnter(value: /* e */ TitleEventEntity => Unit): Self = StObject.set(x, "onTitleMouseEnter", js.Any.fromFunction1(value))
      
      inline def setOnTitleMouseEnterUndefined: Self = StObject.set(x, "onTitleMouseEnter", js.undefined)
      
      inline def setOnTitleMouseLeave(value: /* e */ TitleEventEntity => Unit): Self = StObject.set(x, "onTitleMouseLeave", js.Any.fromFunction1(value))
      
      inline def setOnTitleMouseLeaveUndefined: Self = StObject.set(x, "onTitleMouseLeave", js.undefined)
      
      inline def setPopupClassName(value: String): Self = StObject.set(x, "popupClassName", value.asInstanceOf[js.Any])
      
      inline def setPopupClassNameUndefined: Self = StObject.set(x, "popupClassName", js.undefined)
      
      inline def setPopupOffset(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "popupOffset", value.asInstanceOf[js.Any])
      
      inline def setPopupOffsetUndefined: Self = StObject.set(x, "popupOffset", js.undefined)
      
      inline def setRootPrefixCls(value: String): Self = StObject.set(x, "rootPrefixCls", value.asInstanceOf[js.Any])
      
      inline def setRootPrefixClsUndefined: Self = StObject.set(x, "rootPrefixCls", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait TitleEventEntity extends StObject {
    
    var domEvent: Event
    
    var key: String
  }
  object TitleEventEntity {
    
    inline def apply(domEvent: Event, key: String): TitleEventEntity = {
      val __obj = js.Dynamic.literal(domEvent = domEvent.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[TitleEventEntity]
    }
    
    extension [Self <: TitleEventEntity](x: Self) {
      
      inline def setDomEvent(value: Event): Self = StObject.set(x, "domEvent", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
}
