package typings.antd.anon

import typings.antd.generateCalendarMod.CalendarMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnChange[DateType] extends StObject {
  
  def onChange(date: DateType): Unit
  
  def onTypeChange(`type`: CalendarMode): Unit
  
  var `type`: CalendarMode
  
  var value: DateType
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
  implicit class OnChangeMutableBuilder[Self <: OnChange[?], DateType] (val x: Self & OnChange[DateType]) extends AnyVal {
    
    @scala.inline
    def setOnChange(value: DateType => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnTypeChange(value: CalendarMode => Unit): Self = StObject.set(x, "onTypeChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setType(value: CalendarMode): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: DateType): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
