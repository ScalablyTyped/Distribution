package typings.antdDashMobileDashRn

import typings.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd-mobile-rn/lib/slider/demo/basic.native", JSImport.Namespace)
@js.native
object libSliderDemoBasicDotNativeMod extends js.Object {
  @js.native
  trait BasicSliderExample
    extends Component[js.Any, js.Any, js.Any] {
    def handleChange(value: js.Any): Unit = js.native
    def minMaxChange(value: js.Any): Unit = js.native
    def onAfterChange(value: js.Any): Unit = js.native
  }
  
  @js.native
  class default protected () extends BasicSliderExample {
    def this(props: js.Any) = this()
  }
  
}

