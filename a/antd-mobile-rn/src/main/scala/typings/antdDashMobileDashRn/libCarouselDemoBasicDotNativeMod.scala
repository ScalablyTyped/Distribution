package typings.antdDashMobileDashRn

import typings.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd-mobile-rn/lib/carousel/demo/basic.native", JSImport.Namespace)
@js.native
object libCarouselDemoBasicDotNativeMod extends js.Object {
  @js.native
  trait BasicCarouselExample
    extends Component[js.Any, js.Any, js.Any] {
    def onHorizontalSelectedIndexChange(index: Double): Unit = js.native
    def onVerticalSelectedIndexChange(index: Double): Unit = js.native
  }
  
  @js.native
  class default () extends BasicCarouselExample
  
}

