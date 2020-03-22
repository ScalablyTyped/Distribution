package typings.antd

import typings.antd.generateCalendarMod.CalendarMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOnChange[DateType] extends js.Object {
  var `type`: CalendarMode
  var value: DateType
  def onChange(date: DateType): Unit
  def onTypeChange(`type`: CalendarMode): Unit
}

object AnonOnChange {
  @scala.inline
  def apply[DateType](
    onChange: DateType => Unit,
    onTypeChange: CalendarMode => Unit,
    `type`: CalendarMode,
    value: DateType
  ): AnonOnChange[DateType] = {
    val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction1(onChange), onTypeChange = js.Any.fromFunction1(onTypeChange), value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOnChange[DateType]]
  }
}

