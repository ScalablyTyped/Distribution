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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object navBarPropsTypeMod {
  
  trait NavBarProps
    extends StObject
       with HTMLProps[HTMLDivElement] {
    
    var icon: js.UndefOr[ReactNode] = js.undefined
    
    var leftContent: js.UndefOr[ReactNode] = js.undefined
    
    var mode: js.UndefOr[dark | light] = js.undefined
    
    var onLeftClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var rightContent: js.UndefOr[ReactNode] = js.undefined
  }
  object NavBarProps {
    
    inline def apply(): NavBarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NavBarProps]
    }
    
    extension [Self <: NavBarProps](x: Self) {
      
      inline def setIcon(value: ReactNode): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setLeftContent(value: ReactNode): Self = StObject.set(x, "leftContent", value.asInstanceOf[js.Any])
      
      inline def setLeftContentUndefined: Self = StObject.set(x, "leftContent", js.undefined)
      
      inline def setMode(value: dark | light): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setOnLeftClick(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onLeftClick", js.Any.fromFunction1(value))
      
      inline def setOnLeftClickUndefined: Self = StObject.set(x, "onLeftClick", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setRightContent(value: ReactNode): Self = StObject.set(x, "rightContent", value.asInstanceOf[js.Any])
      
      inline def setRightContentUndefined: Self = StObject.set(x, "rightContent", js.undefined)
    }
  }
}
