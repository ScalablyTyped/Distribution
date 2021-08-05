package typings.antdMobileRn

import typings.antdMobileRn.anon.ActiveTextColor
import typings.antdMobileRn.anon.BottomTabBarSplitLine
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabsStyleIndexNativeMod {
  
  object default {
    
    @JSImport("antd-mobile-rn/lib/tabs/style/index.native", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile-rn/lib/tabs/style/index.native", "default.TabBar")
    @js.native
    def TabBar: ActiveTextColor = js.native
    inline def TabBar_=(x: ActiveTextColor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TabBar")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/tabs/style/index.native", "default.Tabs")
    @js.native
    def Tabs: BottomTabBarSplitLine = js.native
    inline def Tabs_=(x: BottomTabBarSplitLine): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Tabs")(x.asInstanceOf[js.Any])
  }
}
