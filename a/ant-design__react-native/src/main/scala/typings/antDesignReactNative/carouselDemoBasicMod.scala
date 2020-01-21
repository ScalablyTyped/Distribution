package typings.antDesignReactNative

import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ant-design/react-native/lib/carousel/demo/basic", JSImport.Namespace)
@js.native
object carouselDemoBasicMod extends js.Object {
  @js.native
  trait BasicCarouselExample
    extends Component[js.Any, js.Any, js.Any] {
    def onHorizontalSelectedIndexChange(index: Double): Unit = js.native
    def onVerticalSelectedIndexChange(index: Double): Unit = js.native
  }
  
  @js.native
  class default () extends BasicCarouselExample
  
}

