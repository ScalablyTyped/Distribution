package typings.antdMobileRn

import typings.antdMobileRn.anon.AlignItemsPosition
import typings.antdMobileRn.anon.BackgroundColorBorderRadius
import typings.antdMobileRn.anon.BackgroundColorString
import typings.antdMobileRn.anon.Bottom
import typings.antdMobileRn.anon.MarginHorizontal
import typings.antdMobileRn.anon.Right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object carouselStyleIndexNativeMod {
  
  object default {
    
    @JSImport("antd-mobile-rn/lib/carousel/style/index.native", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile-rn/lib/carousel/style/index.native", "default.pagination")
    @js.native
    def pagination: AlignItemsPosition = js.native
    
    @JSImport("antd-mobile-rn/lib/carousel/style/index.native", "default.paginationX")
    @js.native
    def paginationX: Bottom = js.native
    @scala.inline
    def paginationX_=(x: Bottom): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("paginationX")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/carousel/style/index.native", "default.paginationY")
    @js.native
    def paginationY: Right = js.native
    @scala.inline
    def paginationY_=(x: Right): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("paginationY")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def pagination_=(x: AlignItemsPosition): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pagination")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/carousel/style/index.native", "default.pointActiveStyle")
    @js.native
    def pointActiveStyle: BackgroundColorString = js.native
    @scala.inline
    def pointActiveStyle_=(x: BackgroundColorString): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pointActiveStyle")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/carousel/style/index.native", "default.pointStyle")
    @js.native
    def pointStyle: BackgroundColorBorderRadius = js.native
    @scala.inline
    def pointStyle_=(x: BackgroundColorBorderRadius): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pointStyle")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/carousel/style/index.native", "default.spaceStyle")
    @js.native
    def spaceStyle: MarginHorizontal = js.native
    @scala.inline
    def spaceStyle_=(x: MarginHorizontal): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("spaceStyle")(x.asInstanceOf[js.Any])
  }
}
