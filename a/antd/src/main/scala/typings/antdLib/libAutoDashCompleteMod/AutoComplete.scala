package typings
package antdLib.libAutoDashCompleteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoComplete
  extends reactLib.reactMod.Component[AutoCompleteProps, js.Object, js.Any] {
  var select: js.Any = js.native
  def blur(): scala.Unit = js.native
  def focus(): scala.Unit = js.native
  def getInputElement(): reactLib.reactMod.Global.JSXNs.Element = js.native
  def renderAutoComplete(hasGetPrefixCls: antdLib.libConfigDashProviderMod.ConfigConsumerProps): reactLib.reactMod.Global.JSXNs.Element = js.native
  def saveSelect(node: js.Any): scala.Unit = js.native
}

