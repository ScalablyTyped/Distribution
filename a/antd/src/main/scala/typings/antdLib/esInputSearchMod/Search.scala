package typings
package antdLib.esInputSearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Search
  extends reactLib.reactMod.Component[SearchProps, js.Any, js.Any] {
  var input: js.Any = js.native
  def blur(): scala.Unit = js.native
  def focus(): scala.Unit = js.native
  def onSearch(e: reactLib.reactMod.KeyboardEvent[stdLib.HTMLInputElement]): scala.Unit = js.native
  def onSearch(e: reactLib.reactMod.MouseEvent[stdLib.HTMLElement, stdLib.MouseEvent]): scala.Unit = js.native
  def renderAddonAfter(prefixCls: java.lang.String): js.UndefOr[js.Object | scala.Null] = js.native
  def renderSearch(hasGetPrefixCls: antdLib.esConfigDashProviderMod.ConfigConsumerProps): reactLib.reactMod.Global.JSXNs.Element = js.native
  def renderSuffix(prefixCls: java.lang.String): js.UndefOr[js.Object | scala.Null] = js.native
  def saveInput(node: antdLib.esInputInputMod.default): scala.Unit = js.native
}

