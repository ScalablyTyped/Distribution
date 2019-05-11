package typings
package antdLib.esRadioGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RadioGroup
  extends reactLib.reactMod.Component[
      antdLib.esRadioInterfaceMod.RadioGroupProps, 
      antdLib.esRadioInterfaceMod.RadioGroupState, 
      js.Any
    ] {
  def getChildContext(): antdLib.Anon_RadioGroupAnonDisabledEv = js.native
  def onRadioChange(ev: antdLib.esRadioInterfaceMod.RadioChangeEvent): scala.Unit = js.native
  def renderGroup(hasGetPrefixCls: antdLib.esConfigDashProviderMod.ConfigConsumerProps): reactLib.reactMod.Global.JSXNs.Element = js.native
  @JSName("shouldComponentUpdate")
  def shouldComponentUpdate_MRadioGroup(
    nextProps: antdLib.esRadioInterfaceMod.RadioGroupProps,
    nextState: antdLib.esRadioInterfaceMod.RadioGroupState
  ): scala.Boolean = js.native
}

