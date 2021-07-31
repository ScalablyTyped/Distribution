package typings.antDesignReactNative

import typings.antDesignReactNative.anon.Data
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iconDemoBasicMod {
  
  @JSImport("@ant-design/react-native/lib/icon/demo/basic", JSImport.Default)
  @js.native
  class default () extends IConDemo
  
  @JSImport("@ant-design/react-native/lib/icon/demo/basic", "description")
  @js.native
  val description: /* "Icon Example" */ String = js.native
  
  @JSImport("@ant-design/react-native/lib/icon/demo/basic", "title")
  @js.native
  val title: /* "Icon" */ String = js.native
  
  @js.native
  trait IConDemo
    extends Component[js.Any, js.Any, js.Any] {
    
    @JSName("state")
    var state_IConDemo: Data = js.native
  }
}
