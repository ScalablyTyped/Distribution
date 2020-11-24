package typings.antd.generatePickerMod

import typings.antd.antdStrings.date
import typings.antd.antdStrings.time
import typings.rcPicker.interfaceMod.PickerMode
import typings.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.antd.generatePickerMod.RangePickerBaseProps[DateType]
  - typings.antd.generatePickerMod.RangePickerDateProps[DateType]
  - typings.antd.generatePickerMod.RangePickerTimeProps[DateType]
*/
trait RangePickerProps[DateType] extends js.Object
object RangePickerProps {
  
  @scala.inline
  def RangePickerBaseProps[DateType](picker: Exclude[PickerMode, date | time]): RangePickerProps[DateType] = {
    val __obj = js.Dynamic.literal(picker = picker.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangePickerProps[DateType]]
  }
  
  @scala.inline
  def RangePickerDateProps[DateType](): RangePickerProps[DateType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangePickerProps[DateType]]
  }
  
  @scala.inline
  def RangePickerTimeProps[DateType](picker: time): RangePickerProps[DateType] = {
    val __obj = js.Dynamic.literal(picker = picker.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangePickerProps[DateType]]
  }
}
