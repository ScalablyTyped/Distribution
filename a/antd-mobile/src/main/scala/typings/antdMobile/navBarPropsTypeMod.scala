package typings.antdMobile

import typings.antdMobile.antdMobileStrings.dark
import typings.antdMobile.antdMobileStrings.light
import typings.react.mod.HTMLProps
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object navBarPropsTypeMod {
  
  @js.native
  trait NavBarProps extends HTMLProps[HTMLDivElement] {
    
    var icon: js.UndefOr[ReactNode] = js.native
    
    var leftContent: js.UndefOr[ReactNode] = js.native
    
    var mode: js.UndefOr[dark | light] = js.native
    
    var onLeftClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var rightContent: js.UndefOr[ReactNode] = js.native
  }
  object NavBarProps {
    
    @scala.inline
    def apply(): NavBarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NavBarProps]
    }
    
    @scala.inline
    implicit class NavBarPropsMutableBuilder[Self <: NavBarProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIcon(value: ReactNode): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setLeftContent(value: ReactNode): Self = StObject.set(x, "leftContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftContentUndefined: Self = StObject.set(x, "leftContent", js.undefined)
      
      @scala.inline
      def setMode(value: dark | light): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setOnLeftClick(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onLeftClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLeftClickUndefined: Self = StObject.set(x, "onLeftClick", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setRightContent(value: ReactNode): Self = StObject.set(x, "rightContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightContentUndefined: Self = StObject.set(x, "rightContent", js.undefined)
    }
  }
}
