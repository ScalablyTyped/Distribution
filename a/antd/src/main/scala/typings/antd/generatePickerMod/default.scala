package typings.antd.generatePickerMod

import typings.antd.anon.MonthPicker
import typings.rcPicker.generateMod.GenerateConfig
import typings.react.mod.ComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/date-picker/generatePicker", JSImport.Default)
@js.native
object default extends js.Object {
  def apply[DateType](generateConfig: GenerateConfig[DateType]): (ComponentClass[PickerProps[DateType], _]) with MonthPicker[DateType] = js.native
}

