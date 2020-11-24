package typings.antDesignReactNative

import typings.antDesignReactNative.anon.Layout
import typings.react.mod.Component
import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ant-design/react-native/lib/list-view/demo/basic", JSImport.Namespace)
@js.native
object listViewDemoBasicMod extends js.Object {
  
  val description: /* "ListView Example" */ String = js.native
  
  val title: /* "ListView" */ String = js.native
  
  @js.native
  trait BasicListExample
    extends Component[js.Any, js.Any, js.Any] {
    
    def onFetch(
      page: js.UndefOr[scala.Nothing],
      startFetch: js.Function2[/* arg0 */ js.Array[String], /* arg1 */ Double, Unit],
      abortFetch: js.Function0[Unit]
    ): js.Promise[Unit] = js.native
    def onFetch(
      page: Double,
      startFetch: js.Function2[/* arg0 */ js.Array[String], /* arg1 */ Double, Unit],
      abortFetch: js.Function0[Unit]
    ): js.Promise[Unit] = js.native
    
    def renderItem(item: js.Any): Element = js.native
    
    def sleep(time: js.Any): js.Promise[_] = js.native
    
    @JSName("state")
    var state_BasicListExample: Layout = js.native
  }
  
  @js.native
  class default () extends BasicListExample
}
