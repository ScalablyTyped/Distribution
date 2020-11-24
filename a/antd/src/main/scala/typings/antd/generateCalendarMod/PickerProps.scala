package typings.antd.generateCalendarMod

import typings.antd.antdStrings.date
import typings.antd.antdStrings.time
import typings.rcPicker.interfaceMod.PickerMode
import typings.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.antd.generateCalendarMod.PickerPanelBaseProps[DateType]
  - typings.antd.generateCalendarMod.PickerPanelDateProps[DateType]
  - typings.antd.generateCalendarMod.PickerPanelTimeProps[DateType]
*/
trait PickerProps[DateType] extends js.Object
object PickerProps {
  
  @scala.inline
  def PickerPanelBaseProps[DateType](picker: Exclude[PickerMode, date | time]): PickerProps[DateType] = {
    val __obj = js.Dynamic.literal(picker = picker.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickerProps[DateType]]
  }
  
  @scala.inline
  def PickerPanelDateProps[DateType](): PickerProps[DateType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickerProps[DateType]]
  }
  
  @scala.inline
  def PickerPanelTimeProps[DateType](picker: time): PickerProps[DateType] = {
    val __obj = js.Dynamic.literal(picker = picker.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickerProps[DateType]]
  }
}
