package typings.antdMobileRn

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object carouselDemoBasicNativeMod {
  
  @JSImport("antd-mobile-rn/lib/carousel/demo/basic.native", JSImport.Default)
  @js.native
  class default () extends BasicCarouselExample
  
  @js.native
  trait BasicCarouselExample
    extends Component[js.Any, js.Any, js.Any] {
    
    def onHorizontalSelectedIndexChange(index: Double): Unit = js.native
    
    def onVerticalSelectedIndexChange(index: Double): Unit = js.native
  }
}
