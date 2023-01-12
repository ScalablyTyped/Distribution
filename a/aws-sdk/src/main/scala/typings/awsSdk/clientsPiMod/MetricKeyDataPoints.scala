package typings.awsSdk.clientsPiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetricKeyDataPoints extends StObject {
  
  /**
    * An array of timestamp-value pairs, representing measurements over a period of time.
    */
  var DataPoints: js.UndefOr[DataPointsList] = js.undefined
  
  /**
    * The dimensions to which the data points apply.
    */
  var Key: js.UndefOr[ResponseResourceMetricKey] = js.undefined
}
object MetricKeyDataPoints {
  
  inline def apply(): MetricKeyDataPoints = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricKeyDataPoints]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MetricKeyDataPoints] (val x: Self) extends AnyVal {
    
    inline def setDataPoints(value: DataPointsList): Self = StObject.set(x, "DataPoints", value.asInstanceOf[js.Any])
    
    inline def setDataPointsUndefined: Self = StObject.set(x, "DataPoints", js.undefined)
    
    inline def setDataPointsVarargs(value: DataPoint*): Self = StObject.set(x, "DataPoints", js.Array(value*))
    
    inline def setKey(value: ResponseResourceMetricKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
  }
}
