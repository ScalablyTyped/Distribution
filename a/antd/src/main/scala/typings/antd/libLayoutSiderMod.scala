package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.CSSProperties
import typings.react.mod.Context
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.HTMLAttributes
import typings.react.mod.ReactNode
import typings.react.mod.RefAttributes
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLayoutSiderMod extends Shortcut {
  
  @JSImport("antd/lib/layout/Sider", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[SiderProps & RefAttributes[HTMLDivElement]] = js.native
  
  @JSImport("antd/lib/layout/Sider", "SiderContext")
  @js.native
  val SiderContext: Context[SiderContextProps] = js.native
  
  object CollapseType {
    
    inline def clickTrigger: "clickTrigger" = "clickTrigger".asInstanceOf["clickTrigger"]
    
    inline def responsive: "responsive" = "responsive".asInstanceOf["responsive"]
  }
  type CollapseType = "clickTrigger" | "responsive"
  
  trait SiderContextProps extends StObject {
    
    var siderCollapsed: js.UndefOr[Boolean] = js.undefined
  }
  object SiderContextProps {
    
    inline def apply(): SiderContextProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SiderContextProps]
    }
    
    extension [Self <: SiderContextProps](x: Self) {
      
      inline def setSiderCollapsed(value: Boolean): Self = StObject.set(x, "siderCollapsed", value.asInstanceOf[js.Any])
      
      inline def setSiderCollapsedUndefined: Self = StObject.set(x, "siderCollapsed", js.undefined)
    }
  }
  
  trait SiderProps
    extends StObject
       with HTMLAttributes[HTMLDivElement] {
    
    var breakpoint: js.UndefOr["xs" | "sm" | "md" | "lg" | "xl" | "xxl"] = js.undefined
    
    var collapsed: js.UndefOr[Boolean] = js.undefined
    
    var collapsedWidth: js.UndefOr[Double | String] = js.undefined
    
    var collapsible: js.UndefOr[Boolean] = js.undefined
    
    var defaultCollapsed: js.UndefOr[Boolean] = js.undefined
    
    var onBreakpoint: js.UndefOr[js.Function1[/* broken */ Boolean, Unit]] = js.undefined
    
    var onCollapse: js.UndefOr[js.Function2[/* collapsed */ Boolean, /* type */ CollapseType, Unit]] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var reverseArrow: js.UndefOr[Boolean] = js.undefined
    
    var theme: js.UndefOr[SiderTheme] = js.undefined
    
    var trigger: js.UndefOr[ReactNode] = js.undefined
    
    var width: js.UndefOr[Double | String] = js.undefined
    
    var zeroWidthTriggerStyle: js.UndefOr[CSSProperties] = js.undefined
  }
  object SiderProps {
    
    inline def apply(): SiderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SiderProps]
    }
    
    extension [Self <: SiderProps](x: Self) {
      
      inline def setBreakpoint(value: "xs" | "sm" | "md" | "lg" | "xl" | "xxl"): Self = StObject.set(x, "breakpoint", value.asInstanceOf[js.Any])
      
      inline def setBreakpointUndefined: Self = StObject.set(x, "breakpoint", js.undefined)
      
      inline def setCollapsed(value: Boolean): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
      
      inline def setCollapsedUndefined: Self = StObject.set(x, "collapsed", js.undefined)
      
      inline def setCollapsedWidth(value: Double | String): Self = StObject.set(x, "collapsedWidth", value.asInstanceOf[js.Any])
      
      inline def setCollapsedWidthUndefined: Self = StObject.set(x, "collapsedWidth", js.undefined)
      
      inline def setCollapsible(value: Boolean): Self = StObject.set(x, "collapsible", value.asInstanceOf[js.Any])
      
      inline def setCollapsibleUndefined: Self = StObject.set(x, "collapsible", js.undefined)
      
      inline def setDefaultCollapsed(value: Boolean): Self = StObject.set(x, "defaultCollapsed", value.asInstanceOf[js.Any])
      
      inline def setDefaultCollapsedUndefined: Self = StObject.set(x, "defaultCollapsed", js.undefined)
      
      inline def setOnBreakpoint(value: /* broken */ Boolean => Unit): Self = StObject.set(x, "onBreakpoint", js.Any.fromFunction1(value))
      
      inline def setOnBreakpointUndefined: Self = StObject.set(x, "onBreakpoint", js.undefined)
      
      inline def setOnCollapse(value: (/* collapsed */ Boolean, /* type */ CollapseType) => Unit): Self = StObject.set(x, "onCollapse", js.Any.fromFunction2(value))
      
      inline def setOnCollapseUndefined: Self = StObject.set(x, "onCollapse", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setReverseArrow(value: Boolean): Self = StObject.set(x, "reverseArrow", value.asInstanceOf[js.Any])
      
      inline def setReverseArrowUndefined: Self = StObject.set(x, "reverseArrow", js.undefined)
      
      inline def setTheme(value: SiderTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setTrigger(value: ReactNode): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
      
      inline def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
      
      inline def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setZeroWidthTriggerStyle(value: CSSProperties): Self = StObject.set(x, "zeroWidthTriggerStyle", value.asInstanceOf[js.Any])
      
      inline def setZeroWidthTriggerStyleUndefined: Self = StObject.set(x, "zeroWidthTriggerStyle", js.undefined)
    }
  }
  
  trait SiderState extends StObject {
    
    var below: Boolean
    
    var collapsed: js.UndefOr[Boolean] = js.undefined
  }
  object SiderState {
    
    inline def apply(below: Boolean): SiderState = {
      val __obj = js.Dynamic.literal(below = below.asInstanceOf[js.Any])
      __obj.asInstanceOf[SiderState]
    }
    
    extension [Self <: SiderState](x: Self) {
      
      inline def setBelow(value: Boolean): Self = StObject.set(x, "below", value.asInstanceOf[js.Any])
      
      inline def setCollapsed(value: Boolean): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
      
      inline def setCollapsedUndefined: Self = StObject.set(x, "collapsed", js.undefined)
    }
  }
  
  object SiderTheme {
    
    inline def dark: "dark" = "dark".asInstanceOf["dark"]
    
    inline def light: "light" = "light".asInstanceOf["light"]
  }
  type SiderTheme = "light" | "dark"
  
  type _To = ForwardRefExoticComponent[SiderProps & RefAttributes[HTMLDivElement]]
  
  /* This means you don't have to write `default`, but can instead just say `libLayoutSiderMod.foo` */
  override def _to: ForwardRefExoticComponent[SiderProps & RefAttributes[HTMLDivElement]] = default
}
