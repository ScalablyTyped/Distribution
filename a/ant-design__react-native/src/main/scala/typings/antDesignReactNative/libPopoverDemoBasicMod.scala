package typings.antDesignReactNative

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPopoverDemoBasicMod {
  
  @JSImport("@ant-design/react-native/lib/popover/demo/basic", JSImport.Default)
  @js.native
  open class default protected () extends PopoverExample {
    def this(props: Any) = this()
  }
  
  @JSImport("@ant-design/react-native/lib/popover/demo/basic", "description")
  @js.native
  val description: /* "Popover example" */ String = js.native
  
  @JSImport("@ant-design/react-native/lib/popover/demo/basic", "title")
  @js.native
  val title: /* "Popover" */ String = js.native
  
  @js.native
  trait PopoverExample extends Component[Any, Any, Any] {
    
    def onSelect(value: Any): Unit = js.native
    
    /* private */ var renderList: Any = js.native
  }
}
