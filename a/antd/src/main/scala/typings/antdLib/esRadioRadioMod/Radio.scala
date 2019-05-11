package typings
package antdLib.esRadioRadioMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Radio
  extends reactLib.reactMod.Component[antdLib.esRadioInterfaceMod.RadioProps, js.Object, js.Any] {
  var rcCheckbox: js.Any = js.native
  def blur(): scala.Unit = js.native
  def focus(): scala.Unit = js.native
  def onChange(e: antdLib.esRadioInterfaceMod.RadioChangeEvent): scala.Unit = js.native
  def renderRadio(hasGetPrefixCls: antdLib.esConfigDashProviderMod.ConfigConsumerProps): reactLib.reactMod.Global.JSXNs.Element = js.native
  def saveCheckbox(node: js.Any): scala.Unit = js.native
  @JSName("shouldComponentUpdate")
  def shouldComponentUpdate_MRadio(
    nextProps: antdLib.esRadioInterfaceMod.RadioProps,
    nextState: js.Object,
    nextContext: antdLib.esRadioInterfaceMod.RadioGroupContext
  ): scala.Boolean = js.native
}

