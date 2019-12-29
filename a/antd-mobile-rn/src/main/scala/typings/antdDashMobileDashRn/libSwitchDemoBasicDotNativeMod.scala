package typings.antdDashMobileDashRn

import typings.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd-mobile-rn/lib/switch/demo/basic.native", JSImport.Namespace)
@js.native
object libSwitchDemoBasicDotNativeMod extends js.Object {
  @js.native
  trait SwitchExample
    extends Component[js.Any, js.Any, js.Any] {
    def onSwitchChange(value: js.Any): Unit = js.native
  }
  
  @js.native
  class default protected () extends SwitchExample {
    def this(props: js.Any) = this()
  }
  
}

