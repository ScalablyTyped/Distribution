package typings.antd.anon

import typings.antd.generateCalendarMod.CalendarMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnChange[DateType] extends js.Object {
  var `type`: CalendarMode = js.native
  var value: DateType = js.native
  def onChange(date: DateType): Unit = js.native
  def onTypeChange(`type`: CalendarMode): Unit = js.native
}

object OnChange {
  @scala.inline
  def apply[DateType](
    onChange: DateType => Unit,
    onTypeChange: CalendarMode => Unit,
    `type`: CalendarMode,
    value: DateType
  ): OnChange[DateType] = {
    val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction1(onChange), onTypeChange = js.Any.fromFunction1(onTypeChange), value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnChange[DateType]]
  }
  @scala.inline
  implicit class OnChangeOps[Self <: OnChange[_], DateType] (val x: Self with OnChange[DateType]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOnChange(value: DateType => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def setOnTypeChange(value: CalendarMode => Unit): Self = this.set("onTypeChange", js.Any.fromFunction1(value))
    @scala.inline
    def setType(value: CalendarMode): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: DateType): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

