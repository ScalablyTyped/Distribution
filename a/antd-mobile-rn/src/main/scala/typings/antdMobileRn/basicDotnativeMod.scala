package typings.antdMobileRn

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object basicDotnativeMod {
  
  @JSImport("antd-mobile-rn/lib/action-sheet/demo/basic.native", JSImport.Default)
  @js.native
  class default protected () extends Test {
    def this(props: js.Any) = this()
  }
  
  @JSImport("antd-mobile-rn/lib/action-sheet/demo/basic.native", "description")
  @js.native
  val description: /* "ActionSheet example" */ String = js.native
  
  @JSImport("antd-mobile-rn/lib/action-sheet/demo/basic.native", "title")
  @js.native
  val title: /* "ActionSheet" */ String = js.native
  
  @js.native
  trait Test
    extends Component[js.Any, js.Any, js.Any] {
    
    def showActionSheet(): Unit = js.native
    
    def showShareActionSheet(): Unit = js.native
  }
}
