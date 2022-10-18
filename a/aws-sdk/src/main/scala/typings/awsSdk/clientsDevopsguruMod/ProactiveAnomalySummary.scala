package typings.awsSdk.clientsDevopsguruMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProactiveAnomalySummary extends StObject {
  
  /**
    *  An AnomalyReportedTimeRange object that specifies the time range between when the anomaly is opened and the time when it is closed. 
    */
  var AnomalyReportedTimeRange: js.UndefOr[typings.awsSdk.clientsDevopsguruMod.AnomalyReportedTimeRange] = js.undefined
  
  /**
    * Information about a resource in which DevOps Guru detected anomalous behavior.
    */
  var AnomalyResources: js.UndefOr[typings.awsSdk.clientsDevopsguruMod.AnomalyResources] = js.undefined
  
  var AnomalyTimeRange: js.UndefOr[typings.awsSdk.clientsDevopsguruMod.AnomalyTimeRange] = js.undefined
  
  /**
    *  The ID of the insight that contains this anomaly. An insight is composed of related anomalies. 
    */
  var AssociatedInsightId: js.UndefOr[InsightId] = js.undefined
  
  /**
    * The ID of the anomaly.
    */
  var Id: js.UndefOr[AnomalyId] = js.undefined
  
  /**
    *  A threshold that was exceeded by behavior in analyzed resources. Exceeding this threshold is related to the anomalous behavior that generated this anomaly. 
    */
  var Limit: js.UndefOr[AnomalyLimit] = js.undefined
  
  var PredictionTimeRange: js.UndefOr[typings.awsSdk.clientsDevopsguruMod.PredictionTimeRange] = js.undefined
  
  var ResourceCollection: js.UndefOr[typings.awsSdk.clientsDevopsguruMod.ResourceCollection] = js.undefined
  
  /**
    * The severity of the anomaly. The severity of anomalies that generate an insight determine that insight's severity. For more information, see Understanding insight severities in the Amazon DevOps Guru User Guide.
    */
  var Severity: js.UndefOr[AnomalySeverity] = js.undefined
  
  /**
    *  Details about the source of the analyzed operational data that triggered the anomaly. The one supported source is Amazon CloudWatch metrics. 
    */
  var SourceDetails: js.UndefOr[AnomalySourceDetails] = js.undefined
  
  /**
    * The metadata of the source which detects proactive anomalies.
    */
  var SourceMetadata: js.UndefOr[AnomalySourceMetadata] = js.undefined
  
  /**
    * The status of the anomaly.
    */
  var Status: js.UndefOr[AnomalyStatus] = js.undefined
  
  /**
    *  The time of the anomaly's most recent update. 
    */
  var UpdateTime: js.UndefOr[js.Date] = js.undefined
}
object ProactiveAnomalySummary {
  
  inline def apply(): ProactiveAnomalySummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProactiveAnomalySummary]
  }
  
  extension [Self <: ProactiveAnomalySummary](x: Self) {
    
    inline def setAnomalyReportedTimeRange(value: AnomalyReportedTimeRange): Self = StObject.set(x, "AnomalyReportedTimeRange", value.asInstanceOf[js.Any])
    
    inline def setAnomalyReportedTimeRangeUndefined: Self = StObject.set(x, "AnomalyReportedTimeRange", js.undefined)
    
    inline def setAnomalyResources(value: AnomalyResources): Self = StObject.set(x, "AnomalyResources", value.asInstanceOf[js.Any])
    
    inline def setAnomalyResourcesUndefined: Self = StObject.set(x, "AnomalyResources", js.undefined)
    
    inline def setAnomalyResourcesVarargs(value: AnomalyResource*): Self = StObject.set(x, "AnomalyResources", js.Array(value*))
    
    inline def setAnomalyTimeRange(value: AnomalyTimeRange): Self = StObject.set(x, "AnomalyTimeRange", value.asInstanceOf[js.Any])
    
    inline def setAnomalyTimeRangeUndefined: Self = StObject.set(x, "AnomalyTimeRange", js.undefined)
    
    inline def setAssociatedInsightId(value: InsightId): Self = StObject.set(x, "AssociatedInsightId", value.asInstanceOf[js.Any])
    
    inline def setAssociatedInsightIdUndefined: Self = StObject.set(x, "AssociatedInsightId", js.undefined)
    
    inline def setId(value: AnomalyId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setLimit(value: AnomalyLimit): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    inline def setPredictionTimeRange(value: PredictionTimeRange): Self = StObject.set(x, "PredictionTimeRange", value.asInstanceOf[js.Any])
    
    inline def setPredictionTimeRangeUndefined: Self = StObject.set(x, "PredictionTimeRange", js.undefined)
    
    inline def setResourceCollection(value: ResourceCollection): Self = StObject.set(x, "ResourceCollection", value.asInstanceOf[js.Any])
    
    inline def setResourceCollectionUndefined: Self = StObject.set(x, "ResourceCollection", js.undefined)
    
    inline def setSeverity(value: AnomalySeverity): Self = StObject.set(x, "Severity", value.asInstanceOf[js.Any])
    
    inline def setSeverityUndefined: Self = StObject.set(x, "Severity", js.undefined)
    
    inline def setSourceDetails(value: AnomalySourceDetails): Self = StObject.set(x, "SourceDetails", value.asInstanceOf[js.Any])
    
    inline def setSourceDetailsUndefined: Self = StObject.set(x, "SourceDetails", js.undefined)
    
    inline def setSourceMetadata(value: AnomalySourceMetadata): Self = StObject.set(x, "SourceMetadata", value.asInstanceOf[js.Any])
    
    inline def setSourceMetadataUndefined: Self = StObject.set(x, "SourceMetadata", js.undefined)
    
    inline def setStatus(value: AnomalyStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setUpdateTime(value: js.Date): Self = StObject.set(x, "UpdateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "UpdateTime", js.undefined)
  }
}
