package typings.antdMobileRn

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDrawerDemoBasicDotnativeMod {
  
  @JSImport("antd-mobile-rn/lib/drawer/demo/basic.native", JSImport.Default)
  @js.native
  open class default () extends DrawerExample
  
  @js.native
  trait DrawerExample extends Component[Any, Any, Any] {
    
    var drawer: Any = js.native
    
    def onOpenChange(isOpen: Any): Unit = js.native
  }
}
