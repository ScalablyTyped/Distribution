package typings.antDesignReactNative

import typings.antDesignReactNative.anon.Target
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCheckboxDemoBasicMod {
  
  @JSImport("@ant-design/react-native/lib/checkbox/demo/basic", JSImport.Default)
  @js.native
  open class default protected () extends BasicCheckboxExample {
    def this(props: Any, context: Any) = this()
  }
  
  @js.native
  trait BasicCheckboxExample extends Component[Any, Any, Any] {
    
    def onChange(e: Target): Unit = js.native
    
    def onChange2(e: Target): Unit = js.native
    
    def toggleChecked(): Unit = js.native
    
    def toggleDisable(): Unit = js.native
  }
}
