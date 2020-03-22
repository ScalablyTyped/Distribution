package typings.antd

import typings.antd.contextMod.ConfigConsumerProps
import typings.antd.tabsMod.TabsProps
import typings.react.mod.Component
import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/tabs/TabBar", JSImport.Namespace)
@js.native
object tabBarMod extends js.Object {
  @js.native
  trait TabBar
    extends Component[TabsProps, js.Object, js.Any] {
    def renderTabBar(hasDirection: ConfigConsumerProps): ReactElement = js.native
  }
  
  @js.native
  class default () extends TabBar
  
  /* static members */
  @js.native
  object default extends js.Object {
    var defaultProps: AnonAnimated = js.native
  }
  
}

