package typings.antdMobile

import org.scalablytyped.runtime.Instantiable0
import typings.antdMobile.antdMobileStrings._empty
import typings.antdMobile.antdMobileStrings.android
import typings.antdMobile.antdMobileStrings.bottom
import typings.antdMobile.antdMobileStrings.down
import typings.antdMobile.antdMobileStrings.empty
import typings.antdMobile.antdMobileStrings.horizontal
import typings.antdMobile.antdMobileStrings.ios
import typings.antdMobile.antdMobileStrings.middle
import typings.antdMobile.antdMobileStrings.top
import typings.antdMobile.antdMobileStrings.up
import typings.antdMobile.listPropsTypeMod.ListItemPropsType
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.std.HTMLDivElement
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listItemMod {
  
  @JSImport("antd-mobile/lib/list/ListItem", JSImport.Default)
  @js.native
  class default protected () extends ListItem {
    def this(props: ListItemProps) = this()
  }
  object default {
    
    @JSImport("antd-mobile/lib/list/ListItem", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("antd-mobile/lib/list/ListItem", "default.Brief")
    @js.native
    class Brief ()
      extends typings.antdMobile.listItemMod.Brief
    /* static member */
    /* was `typeof Brief` */
    @JSImport("antd-mobile/lib/list/ListItem", "default.Brief")
    @js.native
    def Brief: Instantiable0[typings.antdMobile.listItemMod.Brief] = js.native
    inline def Brief_=(x: Instantiable0[typings.antdMobile.listItemMod.Brief]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Brief")(x.asInstanceOf[js.Any])
    
    /* static member */
    /* Inlined std.Partial<antd-mobile.antd-mobile/lib/list/ListItem.ListItemProps> */
    object defaultProps {
      
      @JSImport("antd-mobile/lib/list/ListItem", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("antd-mobile/lib/list/ListItem", "default.defaultProps.activeStyle")
      @js.native
      def activeStyle: js.UndefOr[CSSProperties] = js.native
      inline def activeStyle_=(x: js.UndefOr[CSSProperties]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("activeStyle")(x.asInstanceOf[js.Any])
      
      @JSImport("antd-mobile/lib/list/ListItem", "default.defaultProps.align")
      @js.native
      def align: js.UndefOr[top | middle | bottom] = js.native
      inline def align_=(x: js.UndefOr[top | middle | bottom]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("align")(x.asInstanceOf[js.Any])
      
      @JSImport("antd-mobile/lib/list/ListItem", "default.defaultProps.arrow")
      @js.native
      def arrow: js.UndefOr[horizontal | down | up | empty | _empty] = js.native
      inline def arrow_=(x: js.UndefOr[horizontal | down | up | empty | _empty]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("arrow")(x.asInstanceOf[js.Any])
      
      @JSImport("antd-mobile/lib/list/ListItem", "default.defaultProps.className")
      @js.native
      def className: js.UndefOr[String] = js.native
      inline def className_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
      
      @JSImport("antd-mobile/lib/list/ListItem", "default.defaultProps.disabled")
      @js.native
      def disabled: js.UndefOr[Boolean] = js.native
      inline def disabled_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disabled")(x.asInstanceOf[js.Any])
      
      @JSImport("antd-mobile/lib/list/ListItem", "default.defaultProps.error")
      @js.native
      def error: js.UndefOr[Boolean] = js.native
      inline def error_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("error")(x.asInstanceOf[js.Any])
      
      @JSImport("antd-mobile/lib/list/ListItem", "default.defaultProps.extra")
      @js.native
      def extra: js.UndefOr[ReactNode] = js.native
      inline def extra_=(x: js.UndefOr[ReactNode]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extra")(x.asInstanceOf[js.Any])
      
      @JSImport("antd-mobile/lib/list/ListItem", "default.defaultProps.multipleLine")
      @js.native
      def multipleLine: js.UndefOr[Boolean] = js.native
      inline def multipleLine_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("multipleLine")(x.asInstanceOf[js.Any])
      
      @JSImport("antd-mobile/lib/list/ListItem", "default.defaultProps.onClick")
      @js.native
      def onClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
      inline def onClick_=(x: js.UndefOr[MouseEventHandler[HTMLDivElement]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onClick")(x.asInstanceOf[js.Any])
      
      @JSImport("antd-mobile/lib/list/ListItem", "default.defaultProps.platform")
      @js.native
      def platform: js.UndefOr[android | ios] = js.native
      inline def platform_=(x: js.UndefOr[android | ios]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("platform")(x.asInstanceOf[js.Any])
      
      @JSImport("antd-mobile/lib/list/ListItem", "default.defaultProps.prefixCls")
      @js.native
      def prefixCls: js.UndefOr[String] = js.native
      inline def prefixCls_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(x.asInstanceOf[js.Any])
      
      @JSImport("antd-mobile/lib/list/ListItem", "default.defaultProps.role")
      @js.native
      def role: js.UndefOr[String] = js.native
      inline def role_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("role")(x.asInstanceOf[js.Any])
      
      @JSImport("antd-mobile/lib/list/ListItem", "default.defaultProps.style")
      @js.native
      def style: js.UndefOr[CSSProperties] = js.native
      inline def style_=(x: js.UndefOr[CSSProperties]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("style")(x.asInstanceOf[js.Any])
      
      @JSImport("antd-mobile/lib/list/ListItem", "default.defaultProps.thumb")
      @js.native
      def thumb: js.UndefOr[ReactNode | Null] = js.native
      inline def thumb_=(x: js.UndefOr[ReactNode | Null]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("thumb")(x.asInstanceOf[js.Any])
      
      @JSImport("antd-mobile/lib/list/ListItem", "default.defaultProps.wrap")
      @js.native
      def wrap: js.UndefOr[Boolean] = js.native
      inline def wrap_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("wrap")(x.asInstanceOf[js.Any])
    }
  }
  
  @JSImport("antd-mobile/lib/list/ListItem", "Brief")
  @js.native
  class Brief protected ()
    extends Component[BriefProps, js.Any, js.Any] {
    def this(props: BriefProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: BriefProps, context: js.Any) = this()
  }
  
  trait BriefProps
    extends StObject
       with typings.antdMobile.listPropsTypeMod.BriefProps {
    
    var className: js.UndefOr[String] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var role: js.UndefOr[String] = js.undefined
  }
  object BriefProps {
    
    inline def apply(): BriefProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BriefProps]
    }
    
    extension [Self <: BriefProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    }
  }
  
  @js.native
  trait ListItem
    extends Component[ListItemProps, js.Any, js.Any] {
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MListItem(): Unit = js.native
    
    var debounceTimeout: js.Any = js.native
    
    def onClick(ev: typings.react.mod.MouseEvent[HTMLDivElement, MouseEvent]): Unit = js.native
  }
  
  trait ListItemProps
    extends StObject
       with ListItemPropsType {
    
    var className: js.UndefOr[String] = js.undefined
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var role: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object ListItemProps {
    
    inline def apply(): ListItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListItemProps]
    }
    
    extension [Self <: ListItemProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setOnClick(value: typings.react.mod.MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
