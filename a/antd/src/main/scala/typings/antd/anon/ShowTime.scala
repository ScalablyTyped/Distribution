package typings.antd.anon

import typings.rcPicker.timePanelMod.SharedTimeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShowTime[DateType] extends StObject {
  
  var showTime: SharedTimeProps[DateType]
}
object ShowTime {
  
  inline def apply[DateType](showTime: SharedTimeProps[DateType]): ShowTime[DateType] = {
    val __obj = js.Dynamic.literal(showTime = showTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShowTime[DateType]]
  }
  
  extension [Self <: ShowTime[?], DateType](x: Self & ShowTime[DateType]) {
    
    inline def setShowTime(value: SharedTimeProps[DateType]): Self = StObject.set(x, "showTime", value.asInstanceOf[js.Any])
  }
}
