package typings.antDesignReactNative

import typings.antDesignReactNative.mod.Carousel
import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ant-design/react-native/lib/carousel/demo/basic", JSImport.Namespace)
@js.native
object carouselDemoBasicMod extends js.Object {
  
  @js.native
  trait BasicCarouselExample
    extends Component[js.Any, js.Any, js.Any] {
    
    var carousel: Null | Carousel = js.native
    
    def onHorizontalSelectedIndexChange(index: Double): Unit = js.native
    
    def onVerticalSelectedIndexChange(index: Double): Unit = js.native
  }
  
  @js.native
  class default protected () extends BasicCarouselExample {
    def this(props: js.Any) = this()
  }
}
