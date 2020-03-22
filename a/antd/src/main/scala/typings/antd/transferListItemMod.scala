package typings.antd

import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/transfer/ListItem", JSImport.Namespace)
@js.native
object transferListItemMod extends js.Object {
  @js.native
  trait ListItem
    extends Component[js.Any, js.Any, js.Any] {
    @JSName("shouldComponentUpdate")
    def shouldComponentUpdate_MListItem(args: js.Any*): js.Any = js.native
  }
  
  @js.native
  class default () extends ListItem
  
}

