package typings.awsSdk.clientsDevopsguruMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartTimeRange extends StObject {
  
  /**
    *  The start time of the time range. 
    */
  var FromTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  The end time of the time range. 
    */
  var ToTime: js.UndefOr[js.Date] = js.undefined
}
object StartTimeRange {
  
  inline def apply(): StartTimeRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartTimeRange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartTimeRange] (val x: Self) extends AnyVal {
    
    inline def setFromTime(value: js.Date): Self = StObject.set(x, "FromTime", value.asInstanceOf[js.Any])
    
    inline def setFromTimeUndefined: Self = StObject.set(x, "FromTime", js.undefined)
    
    inline def setToTime(value: js.Date): Self = StObject.set(x, "ToTime", value.asInstanceOf[js.Any])
    
    inline def setToTimeUndefined: Self = StObject.set(x, "ToTime", js.undefined)
  }
}
