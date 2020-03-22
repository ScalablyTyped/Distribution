package typings.antd

import typings.antd.checkboxCheckboxMod.AbstractCheckboxProps
import typings.antd.radioInterfaceMod.RadioChangeEvent
import typings.react.mod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/radio/radioButton", JSImport.Namespace)
@js.native
object radioButtonMod extends js.Object {
  def default(props: RadioButtonProps): Element = js.native
  type RadioButtonProps = AbstractCheckboxProps[RadioChangeEvent]
}

