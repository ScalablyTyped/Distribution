package typings.antdMobileRn

import typings.antdMobileRn.antdMobileRnStrings.Popover
import typings.antdMobileRn.antdMobileRnStrings.`Popover example`
import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd-mobile-rn/lib/popover/demo/basic.native", JSImport.Namespace)
@js.native
object popoverDemoBasicNativeMod extends js.Object {
  @js.native
  trait PopoverExample
    extends Component[js.Any, js.Any, js.Any] {
    def onSelect(value: js.Any): Unit = js.native
  }
  
  @js.native
  class default protected () extends PopoverExample {
    def this(props: js.Any) = this()
  }
  
  val description: `Popover example` = js.native
  val title: Popover = js.native
}

