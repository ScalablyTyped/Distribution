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
  def getButtonOrIcon(): reactLib.reactMod.ReactNs.ReactElement[_] = js.native
  def onSearch(e: reactLib.reactMod.ReactNs.KeyboardEvent[reactLib.HTMLInputElement]): scala.Unit = js.native
  def onSearch(e: reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement]): scala.Unit = js.native
  def saveInput(node: antdLib.libInputInputMod.default): scala.Unit = js.native
}

