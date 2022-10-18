package typings.antdMobileRn

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCarouselDemoBasicDotnativeMod {
  
  @JSImport("antd-mobile-rn/lib/carousel/demo/basic.native", JSImport.Default)
  @js.native
  open class default () extends BasicCarouselExample
  
  @js.native
  trait BasicCarouselExample extends Component[Any, Any, Any] {
    
    def onHorizontalSelectedIndexChange(index: Double): Unit = js.native
    
    def onVerticalSelectedIndexChange(index: Double): Unit = js.native
  }
}
