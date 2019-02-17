package typings
package antdLib.libInputSearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Search
  extends reactLib.reactMod.Component[SearchProps, js.Any, js.Any] {
  var input: js.Any = js.native
  def blur(): scala.Unit = js.native
  def focus(): scala.Unit = js.native
  def onSearch(e: reactLib.reactMod.ReactNs.KeyboardEvent[reactLib.HTMLInputElement]): scala.Unit = js.native
  def onSearch(e: reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.MouseEvent]): scala.Unit = js.native
  def renderAddonAfter(prefixCls: java.lang.String): js.UndefOr[js.Object | scala.Null] = js.native
  def renderSearch(hasGetPrefixCls: antdLib.libConfigDashProviderMod.ConfigConsumerProps): reactLib.reactMod.Global.JSXNs.Element = js.native
  def renderSuffix(prefixCls: java.lang.String): js.UndefOr[js.Object | scala.Null] = js.native
  def saveInput(node: antdLib.libInputInputMod.default): scala.Unit = js.native
}

