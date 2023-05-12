package typings.awsSdk.clientsPersonalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetricAttribution extends StObject {
  
  /**
    * The metric attribution's creation date time.
    */
  var creationDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The metric attribution's dataset group Amazon Resource Name (ARN).
    */
  var datasetGroupArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The metric attribution's failure reason.
    */
  var failureReason: js.UndefOr[FailureReason] = js.undefined
  
  /**
    * The metric attribution's last updated date time.
    */
  var lastUpdatedDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The metric attribution's Amazon Resource Name (ARN).
    */
  var metricAttributionArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The metric attribution's output configuration.
    */
  var metricsOutputConfig: js.UndefOr[MetricAttributionOutput] = js.undefined
  
  /**
    * The metric attribution's name.
    */
  var name: js.UndefOr[Name] = js.undefined
  
  /**
    * The metric attribution's status.
    */
  var status: js.UndefOr[Status] = js.undefined
}
object MetricAttribution {
  
  inline def apply(): MetricAttribution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricAttribution]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MetricAttribution] (val x: Self) extends AnyVal {
    
    inline def setCreationDateTime(value: js.Date): Self = StObject.set(x, "creationDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreationDateTimeUndefined: Self = StObject.set(x, "creationDateTime", js.undefined)
    
    inline def setDatasetGroupArn(value: Arn): Self = StObject.set(x, "datasetGroupArn", value.asInstanceOf[js.Any])
    
    inline def setDatasetGroupArnUndefined: Self = StObject.set(x, "datasetGroupArn", js.undefined)
    
    inline def setFailureReason(value: FailureReason): Self = StObject.set(x, "failureReason", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonUndefined: Self = StObject.set(x, "failureReason", js.undefined)
    
    inline def setLastUpdatedDateTime(value: js.Date): Self = StObject.set(x, "lastUpdatedDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedDateTimeUndefined: Self = StObject.set(x, "lastUpdatedDateTime", js.undefined)
    
    inline def setMetricAttributionArn(value: Arn): Self = StObject.set(x, "metricAttributionArn", value.asInstanceOf[js.Any])
    
    inline def setMetricAttributionArnUndefined: Self = StObject.set(x, "metricAttributionArn", js.undefined)
    
    inline def setMetricsOutputConfig(value: MetricAttributionOutput): Self = StObject.set(x, "metricsOutputConfig", value.asInstanceOf[js.Any])
    
    inline def setMetricsOutputConfigUndefined: Self = StObject.set(x, "metricsOutputConfig", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
