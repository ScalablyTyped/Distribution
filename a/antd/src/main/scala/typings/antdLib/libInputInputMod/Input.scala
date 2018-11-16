package typings
package antdLib.libInputInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Input
  extends reactLib.reactMod.Component[InputProps, js.Any, js.Any] {
  var input: reactLib.HTMLInputElement = js.native
  def blur(): scala.Unit = js.native
  def focus(): scala.Unit = js.native
  def getInputClassName(): js.Any = js.native
  def handleKeyDown(e: reactLib.reactMod.ReactNs.KeyboardEvent[reactLib.HTMLInputElement]): scala.Unit = js.native
  def renderInput(): reactLib.reactMod.ReactNs.ReactElement[_] = js.native
  def renderLabeledIcon(children: reactLib.reactMod.ReactNs.ReactElement[_]): reactLib.reactMod.ReactNs.ReactElement[_] = js.native
  def renderLabeledInput(children: reactLib.reactMod.ReactNs.ReactElement[_]): reactLib.reactMod.ReactNs.ReactElement[_] = js.native
  def saveInput(node: reactLib.HTMLInputElement): scala.Unit = js.native
  def select(): scala.Unit = js.native
}

