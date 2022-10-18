package typings.antdMobileRn

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPopoverDemoBasicDotnativeMod {
  
  @JSImport("antd-mobile-rn/lib/popover/demo/basic.native", JSImport.Default)
  @js.native
  open class default protected () extends PopoverExample {
    def this(props: Any) = this()
  }
  
  @JSImport("antd-mobile-rn/lib/popover/demo/basic.native", "description")
  @js.native
  val description: /* "Popover example" */ String = js.native
  
  @JSImport("antd-mobile-rn/lib/popover/demo/basic.native", "title")
  @js.native
  val title: /* "Popover" */ String = js.native
  
  @js.native
  trait PopoverExample extends Component[Any, Any, Any] {
    
    def onSelect(value: Any): Unit = js.native
  }
}
