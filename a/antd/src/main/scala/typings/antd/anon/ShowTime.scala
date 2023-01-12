package typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShowTime[DateType, DisabledTime] extends StObject {
  
  var showTime: DefaultValue[DateType, DisabledTime]
}
object ShowTime {
  
  inline def apply[DateType, DisabledTime](showTime: DefaultValue[DateType, DisabledTime]): ShowTime[DateType, DisabledTime] = {
    val __obj = js.Dynamic.literal(showTime = showTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShowTime[DateType, DisabledTime]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShowTime[?, ?], DateType, DisabledTime] (val x: Self & (ShowTime[DateType, DisabledTime])) extends AnyVal {
    
    inline def setShowTime(value: DefaultValue[DateType, DisabledTime]): Self = StObject.set(x, "showTime", value.asInstanceOf[js.Any])
  }
}
