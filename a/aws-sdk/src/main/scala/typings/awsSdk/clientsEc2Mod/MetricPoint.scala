package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetricPoint extends StObject {
  
  /**
    * The end date for the metric point. The ending time must be formatted as yyyy-mm-ddThh:mm:ss. For example, 2022-06-12T12:00:00.000Z.
    */
  var EndDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The start date for the metric point. The starting date for the metric point. The starting time must be formatted as yyyy-mm-ddThh:mm:ss. For example, 2022-06-10T12:00:00.000Z.
    */
  var StartDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The status of the metric point.
    */
  var Status: js.UndefOr[String] = js.undefined
  
  var Value: js.UndefOr[Float] = js.undefined
}
object MetricPoint {
  
  inline def apply(): MetricPoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricPoint]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MetricPoint] (val x: Self) extends AnyVal {
    
    inline def setEndDate(value: js.Date): Self = StObject.set(x, "EndDate", value.asInstanceOf[js.Any])
    
    inline def setEndDateUndefined: Self = StObject.set(x, "EndDate", js.undefined)
    
    inline def setStartDate(value: js.Date): Self = StObject.set(x, "StartDate", value.asInstanceOf[js.Any])
    
    inline def setStartDateUndefined: Self = StObject.set(x, "StartDate", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setValue(value: Float): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
