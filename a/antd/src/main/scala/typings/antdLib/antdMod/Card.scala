package typings
package antdLib.antdMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd", "Card")
@js.native
class Card ()
  extends antdLib.libCardMod.default

/* static members */
@JSImport("antd", "Card")
@js.native
object Card extends js.Object {
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

