package typings.antdMobile

import typings.react.mod.ReactNode
import typings.rmcTabs.modelsMod.Models.TabData
import typings.rmcTabs.propsTypeMod.PropsType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabsPropsTypeMod {
  
  trait TabsProps
    extends StObject
       with PropsType {
    
    /** render for replace the tab of tabbar. */
    var renderTab: js.UndefOr[js.Function1[/* tab */ TabData, ReactNode]] = js.undefined
  }
  object TabsProps {
    
    @scala.inline
    def apply(tabs: js.Array[TabData]): TabsProps = {
      val __obj = js.Dynamic.literal(tabs = tabs.asInstanceOf[js.Any])
      __obj.asInstanceOf[TabsProps]
    }
    
    @scala.inline
    implicit class TabsPropsMutableBuilder[Self <: TabsProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRenderTab(value: /* tab */ TabData => ReactNode): Self = StObject.set(x, "renderTab", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderTabUndefined: Self = StObject.set(x, "renderTab", js.undefined)
    }
  }
}
