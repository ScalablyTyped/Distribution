package typings.atAntDashDesignReactDashNative

import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.ListView
import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.`ListView Example`
import typings.react.reactMod.Component
import typings.react.reactMod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ant-design/react-native/lib/list-view/demo/basic", JSImport.Namespace)
@js.native
object libListDashViewDemoBasicMod extends js.Object {
  @js.native
  trait BasicListExample
    extends Component[js.Any, js.Any, js.Any] {
    @JSName("state")
    var state_BasicListExample: Anon_Layout = js.native
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
    def sleep(time: js.Any): js.Promise[js.Object] = js.native
  }
  
  @js.native
  class default () extends BasicListExample
  
  val description: `ListView Example` = js.native
  val title: ListView = js.native
}

