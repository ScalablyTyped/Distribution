package typings.antDesignReactNative

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object drawerDemoBasicMod {
  
  @JSImport("@ant-design/react-native/lib/drawer/demo/basic", JSImport.Default)
  @js.native
  class default () extends DrawerExample
  
  @js.native
  trait DrawerExample
    extends Component[js.Any, js.Any, js.Any] {
    
    var drawer: js.Any = js.native
    
    def onOpenChange(isOpen: js.Any): Unit = js.native
  }
}
