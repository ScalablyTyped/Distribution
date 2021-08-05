package typings.antDesignReactNative

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object popoverDemoBasicMod {
  
  @JSImport("@ant-design/react-native/lib/popover/demo/basic", JSImport.Default)
  @js.native
  class default protected () extends PopoverExample {
    def this(props: js.Any) = this()
  }
  
  @JSImport("@ant-design/react-native/lib/popover/demo/basic", "description")
  @js.native
  val description: /* "Popover example" */ String = js.native
  
  @JSImport("@ant-design/react-native/lib/popover/demo/basic", "title")
  @js.native
  val title: /* "Popover" */ String = js.native
  
  @js.native
  trait PopoverExample
    extends Component[js.Any, js.Any, js.Any] {
    
    def onSelect(value: js.Any): Unit = js.native
    
    /* private */ var renderList: js.Any = js.native
  }
}
