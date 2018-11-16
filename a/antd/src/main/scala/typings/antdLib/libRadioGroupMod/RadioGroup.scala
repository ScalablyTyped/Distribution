package typings
package antdLib.libRadioGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RadioGroup
  extends reactLib.reactMod.Component[
      antdLib.libRadioInterfaceMod.RadioGroupProps, 
      antdLib.libRadioInterfaceMod.RadioGroupState, 
      js.Any
    ] {
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MRadioGroup(nextProps: antdLib.libRadioInterfaceMod.RadioGroupProps): scala.Unit = js.native
  def getChildContext(): antdLib.Anon_RadioGroupAnonValueOnChange = js.native
  def onRadioChange(ev: antdLib.libRadioInterfaceMod.RadioChangeEvent): scala.Unit = js.native
  @JSName("shouldComponentUpdate")
  def shouldComponentUpdate_MRadioGroup(
    nextProps: antdLib.libRadioInterfaceMod.RadioGroupProps,
    nextState: antdLib.libRadioInterfaceMod.RadioGroupState
  ): scala.Boolean = js.native
}

