package typings.antdDashMobileDashRn

import typings.antdDashMobileDashRn.antdDashMobileDashRnStrings.ActionSheet
import typings.antdDashMobileDashRn.antdDashMobileDashRnStrings.`ActionSheet example`
import typings.antdDashMobileDashRn.libActionDashSheetDemoBasicDotNativeMod.Test
import typings.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd-mobile-rn/lib/action-sheet/demo/basic.native", JSImport.Namespace)
@js.native
object libActionDashSheetDemoBasicDotNativeMod extends js.Object {
  @js.native
  trait Test
    extends Component[js.Any, js.Any, js.Any] {
    def showActionSheet(): Unit = js.native
    def showShareActionSheet(): Unit = js.native
  }
  
  @js.native
  class default protected () extends Test {
    def this(props: js.Any) = this()
  }
  
  val description: `ActionSheet example` = js.native
  val title: ActionSheet = js.native
}

