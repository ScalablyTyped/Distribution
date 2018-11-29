package typings
package antdLib.libCheckboxCheckboxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Checkbox
  extends reactLib.reactMod.Component[CheckboxProps, js.Object, js.Object] {
  var rcCheckbox: js.Any = js.native
  def blur(): scala.Unit = js.native
  def focus(): scala.Unit = js.native
  def saveCheckbox(node: js.Any): scala.Unit = js.native
  @JSName("shouldComponentUpdate")
  def shouldComponentUpdate_MCheckbox(
    nextProps: CheckboxProps,
    nextState: js.Object,
    nextContext: antdLib.libCheckboxGroupMod.CheckboxGroupContext
  ): scala.Boolean = js.native
}

