package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateCustomMetricResponse extends StObject {
  
  /**
    *  The creation date of the custom metric in milliseconds since epoch. 
    */
  var creationDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  A friendly name in the console for the custom metric 
    */
  var displayName: js.UndefOr[CustomMetricDisplayName] = js.undefined
  
  /**
    *  The time the custom metric was last modified in milliseconds since epoch. 
    */
  var lastModifiedDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  The Amazon Resource Number (ARN) of the custom metric. 
    */
  var metricArn: js.UndefOr[CustomMetricArn] = js.undefined
  
  /**
    *  The name of the custom metric. 
    */
  var metricName: js.UndefOr[MetricName] = js.undefined
  
  /**
    *  The type of the custom metric.   The type number only takes a single metric value as an input, but while submitting the metrics value in the DeviceMetrics report, it must be passed as an array with a single value. 
    */
  var metricType: js.UndefOr[CustomMetricType] = js.undefined
}
object UpdateCustomMetricResponse {
  
  inline def apply(): UpdateCustomMetricResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateCustomMetricResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateCustomMetricResponse] (val x: Self) extends AnyVal {
    
    inline def setCreationDate(value: js.Date): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "creationDate", js.undefined)
    
    inline def setDisplayName(value: CustomMetricDisplayName): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setLastModifiedDate(value: js.Date): Self = StObject.set(x, "lastModifiedDate", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedDateUndefined: Self = StObject.set(x, "lastModifiedDate", js.undefined)
    
    inline def setMetricArn(value: CustomMetricArn): Self = StObject.set(x, "metricArn", value.asInstanceOf[js.Any])
    
    inline def setMetricArnUndefined: Self = StObject.set(x, "metricArn", js.undefined)
    
    inline def setMetricName(value: MetricName): Self = StObject.set(x, "metricName", value.asInstanceOf[js.Any])
    
    inline def setMetricNameUndefined: Self = StObject.set(x, "metricName", js.undefined)
    
    inline def setMetricType(value: CustomMetricType): Self = StObject.set(x, "metricType", value.asInstanceOf[js.Any])
    
    inline def setMetricTypeUndefined: Self = StObject.set(x, "metricType", js.undefined)
  }
}
