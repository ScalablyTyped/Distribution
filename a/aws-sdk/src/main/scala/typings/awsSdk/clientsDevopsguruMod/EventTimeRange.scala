package typings.awsSdk.clientsDevopsguruMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventTimeRange extends StObject {
  
  /**
    *  The time when the event started. 
    */
  var FromTime: js.Date
  
  /**
    *  The time when the event ended. 
    */
  var ToTime: js.Date
}
object EventTimeRange {
  
  inline def apply(FromTime: js.Date, ToTime: js.Date): EventTimeRange = {
    val __obj = js.Dynamic.literal(FromTime = FromTime.asInstanceOf[js.Any], ToTime = ToTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventTimeRange]
  }
  
  extension [Self <: EventTimeRange](x: Self) {
    
    inline def setFromTime(value: js.Date): Self = StObject.set(x, "FromTime", value.asInstanceOf[js.Any])
    
    inline def setToTime(value: js.Date): Self = StObject.set(x, "ToTime", value.asInstanceOf[js.Any])
  }
}
