package typings
package antdLib.libCardMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/card", JSImport.Default)
@js.native
class default () extends Card

@JSImport("antd/lib/card", JSImport.Default)
@js.native
object default extends js.Object {
  @JSName("Grid")
  var Grid_Original: js.Function1[
    /* props */ antdLib.libCardGridMod.CardGridProps, 
    reactLib.reactMod.Global.JSXNs.Element
  ] = js.native
  @JSName("Meta")
  var Meta_Original: js.Function1[
    /* props */ antdLib.libCardMetaMod.CardMetaProps, 
    reactLib.reactMod.Global.JSXNs.Element
  ] = js.native
  def Grid(props: antdLib.libCardGridMod.CardGridProps): reactLib.reactMod.Global.JSXNs.Element = js.native
  def Meta(props: antdLib.libCardMetaMod.CardMetaProps): reactLib.reactMod.Global.JSXNs.Element = js.native
}

