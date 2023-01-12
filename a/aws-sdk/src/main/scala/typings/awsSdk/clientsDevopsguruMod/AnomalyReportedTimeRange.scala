package typings.awsSdk.clientsDevopsguruMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnomalyReportedTimeRange extends StObject {
  
  /**
    *  The time when an anomaly is closed. 
    */
  var CloseTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  The time when an anomaly is opened. 
    */
  var OpenTime: js.Date
}
object AnomalyReportedTimeRange {
  
  inline def apply(OpenTime: js.Date): AnomalyReportedTimeRange = {
    val __obj = js.Dynamic.literal(OpenTime = OpenTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnomalyReportedTimeRange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnomalyReportedTimeRange] (val x: Self) extends AnyVal {
    
    inline def setCloseTime(value: js.Date): Self = StObject.set(x, "CloseTime", value.asInstanceOf[js.Any])
    
    inline def setCloseTimeUndefined: Self = StObject.set(x, "CloseTime", js.undefined)
    
    inline def setOpenTime(value: js.Date): Self = StObject.set(x, "OpenTime", value.asInstanceOf[js.Any])
  }
}
