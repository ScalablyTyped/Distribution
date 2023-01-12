package typings.antd.anon

import typings.antd.libCalendarGenerateCalendarMod.CalendarMode
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
  
  inline def apply[DateType](
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
  implicit open class MutableBuilder[Self <: OnChange[?], DateType] (val x: Self & OnChange[DateType]) extends AnyVal {
    
    inline def setOnChange(value: DateType => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    inline def setOnTypeChange(value: CalendarMode => Unit): Self = StObject.set(x, "onTypeChange", js.Any.fromFunction1(value))
    
    inline def setType(value: CalendarMode): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: DateType): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
