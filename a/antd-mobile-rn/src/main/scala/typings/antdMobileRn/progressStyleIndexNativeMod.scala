package typings.antdMobileRn

import typings.antdMobileRn.anon.BackgroundColorFlex
import typings.antdMobileRn.anon.BorderBottomWidthBorderColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object progressStyleIndexNativeMod {
  
  object default {
    
    @JSImport("antd-mobile-rn/lib/progress/style/index.native", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile-rn/lib/progress/style/index.native", "default.progressBar")
    @js.native
    def progressBar: BorderBottomWidthBorderColor = js.native
    @scala.inline
    def progressBar_=(x: BorderBottomWidthBorderColor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("progressBar")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/progress/style/index.native", "default.progressOuter")
    @js.native
    def progressOuter: BackgroundColorFlex = js.native
    @scala.inline
    def progressOuter_=(x: BackgroundColorFlex): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("progressOuter")(x.asInstanceOf[js.Any])
  }
}
