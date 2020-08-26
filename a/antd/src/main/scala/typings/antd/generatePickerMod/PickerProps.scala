package typings.antd.generatePickerMod

import typings.antd.antdStrings.date
import typings.antd.antdStrings.time
import typings.rcPicker.interfaceMod.PickerMode
import typings.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.antd.generatePickerMod.PickerBaseProps[DateType]
  - typings.antd.generatePickerMod.PickerDateProps[DateType]
  - typings.antd.generatePickerMod.PickerTimeProps[DateType]
*/
trait PickerProps[DateType] extends js.Object

object PickerProps {
  @scala.inline
  def PickerBaseProps[DateType](picker: Exclude[PickerMode, date | time]): PickerProps[DateType] = {
    val __obj = js.Dynamic.literal(picker = picker.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickerProps[DateType]]
  }
  @scala.inline
  def PickerDateProps[DateType](): PickerProps[DateType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickerProps[DateType]]
  }
  @scala.inline
  def PickerTimeProps[DateType](picker: time): PickerProps[DateType] = {
    val __obj = js.Dynamic.literal(picker = picker.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickerProps[DateType]]
  }
}

