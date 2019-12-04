package typings.antdDashMobileDashRn

import typings.antdDashMobileDashRn.libActivityDashIndicatorDemoBasicDotNativeMod.ActivityIndicatorExample
import typings.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd-mobile-rn/lib/activity-indicator/demo/basic.native", JSImport.Namespace)
@js.native
object libActivityDashIndicatorDemoBasicDotNativeMod extends js.Object {
  @js.native
  trait ActivityIndicatorExample
    extends Component[js.Any, js.Any, js.Any] {
    var closeTimer: js.Any = js.native
    @JSName("componentWillUnmount")
    def componentWillUnmount_MActivityIndicatorExample(): Unit = js.native
    def loadingToast(): Unit = js.native
  }
  
  @js.native
  class default protected () extends ActivityIndicatorExample {
    def this(props: js.Any) = this()
  }
  
}

