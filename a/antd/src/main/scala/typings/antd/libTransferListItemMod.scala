package typings.antd

import typings.antd.libTransferListItemMod.ListItem
import typings.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/transfer/ListItem", JSImport.Namespace)
@js.native
object libTransferListItemMod extends js.Object {
  @js.native
  trait ListItem
    extends Component[js.Any, js.Any, js.Any] {
    @JSName("shouldComponentUpdate")
    def shouldComponentUpdate_MListItem(args: js.Any*): js.Any = js.native
  }
  
  @js.native
  class default () extends ListItem
  
}

