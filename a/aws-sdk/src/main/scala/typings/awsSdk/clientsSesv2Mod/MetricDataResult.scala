package typings.awsSdk.clientsSesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetricDataResult extends StObject {
  
  /**
    * The query identifier.
    */
  var Id: js.UndefOr[QueryIdentifier] = js.undefined
  
  /**
    * A list of timestamps for the metric data results.
    */
  var Timestamps: js.UndefOr[TimestampList] = js.undefined
  
  /**
    * A list of values (cumulative / sum) for the metric data results.
    */
  var Values: js.UndefOr[MetricValueList] = js.undefined
}
object MetricDataResult {
  
  inline def apply(): MetricDataResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricDataResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MetricDataResult] (val x: Self) extends AnyVal {
    
    inline def setId(value: QueryIdentifier): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setTimestamps(value: TimestampList): Self = StObject.set(x, "Timestamps", value.asInstanceOf[js.Any])
    
    inline def setTimestampsUndefined: Self = StObject.set(x, "Timestamps", js.undefined)
    
    inline def setTimestampsVarargs(value: js.Date*): Self = StObject.set(x, "Timestamps", js.Array(value*))
    
    inline def setValues(value: MetricValueList): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "Values", js.undefined)
    
    inline def setValuesVarargs(value: Counter*): Self = StObject.set(x, "Values", js.Array(value*))
  }
}
