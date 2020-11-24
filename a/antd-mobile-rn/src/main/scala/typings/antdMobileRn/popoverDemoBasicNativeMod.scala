package typings.antdMobileRn

import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("antd-mobile-rn/lib/popover/demo/basic.native", JSImport.Namespace)
@js.native
object popoverDemoBasicNativeMod extends js.Object {
  
  val description: /* "Popover example" */ String = js.native
  
  val title: /* "Popover" */ String = js.native
  
  @js.native
  trait PopoverExample
    extends Component[js.Any, js.Any, js.Any] {
    
    def onSelect(value: js.Any): Unit = js.native
  }
  
  @js.native
  class default protected () extends PopoverExample {
    def this(props: js.Any) = this()
  }
}
