package typings
package antdLib.esListItemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Item
  extends reactLib.reactMod.Component[ListItemProps, js.Any, js.Any] {
  def isFlexMode(): scala.Boolean = js.native
  def isItemContainsTextNode(): js.UndefOr[scala.Nothing] = js.native
  def renderItem(hasGetPrefixCls: antdLib.esConfigDashProviderMod.ConfigConsumerProps): reactLib.reactMod.Global.JSXNs.Element = js.native
}

