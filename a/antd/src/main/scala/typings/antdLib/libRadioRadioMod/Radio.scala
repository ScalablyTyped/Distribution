package typings
package antdLib.libRadioRadioMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Radio
  extends reactLib.reactMod.Component[antdLib.libRadioInterfaceMod.RadioProps, js.Object, js.Any] {
  var rcCheckbox: js.Any = js.native
  def blur(): scala.Unit = js.native
  def focus(): scala.Unit = js.native
  def renderRadio(hasGetPrefixCls: antdLib.libConfigDashProviderMod.ConfigConsumerProps): reactLib.reactMod.Global.JSXNs.Element = js.native
  def saveCheckbox(node: js.Any): scala.Unit = js.native
  @JSName("shouldComponentUpdate")
  def shouldComponentUpdate_MRadio(
    nextProps: antdLib.libRadioInterfaceMod.RadioProps,
    nextState: js.Object,
    nextContext: antdLib.libRadioInterfaceMod.RadioGroupContext
  ): scala.Boolean = js.native
}

