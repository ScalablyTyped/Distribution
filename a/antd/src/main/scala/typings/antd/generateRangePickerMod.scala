package typings.antd

import typings.antd.generatePickerMod.RangePickerProps
import typings.rcPicker.generateMod.GenerateConfig
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/date-picker/generatePicker/generateRangePicker", JSImport.Namespace)
@js.native
object generateRangePickerMod extends js.Object {
  def default[DateType](generateConfig: GenerateConfig[DateType]): ComponentClass[RangePickerProps[DateType], ComponentState] = js.native
}

