package typings.awsSdk.clientsDevopsguruMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReactiveAnomalySummary extends StObject {
  
  /**
    *  An AnomalyReportedTimeRange object that specifies the time range between when the anomaly is opened and the time when it is closed. 
    */
  var AnomalyReportedTimeRange: js.UndefOr[typings.awsSdk.clientsDevopsguruMod.AnomalyReportedTimeRange] = js.undefined
  
  /**
    * The Amazon Web Services resources in which anomalous behavior was detected by DevOps Guru.
    */
  var AnomalyResources: js.UndefOr[typings.awsSdk.clientsDevopsguruMod.AnomalyResources] = js.undefined
  
  var AnomalyTimeRange: js.UndefOr[typings.awsSdk.clientsDevopsguruMod.AnomalyTimeRange] = js.undefined
  
  /**
    *  The ID of the insight that contains this anomaly. An insight is composed of related anomalies. 
    */
  var AssociatedInsightId: js.UndefOr[InsightId] = js.undefined
  
  /**
    * The ID of the causal anomaly that is associated with this reactive anomaly. The ID of a `CAUSAL` anomaly is always `NULL`.
    */
  var CausalAnomalyId: js.UndefOr[AnomalyId] = js.undefined
  
  /**
    * A description of the reactive anomaly.
    */
  var Description: js.UndefOr[AnomalyDescription] = js.undefined
  
  /**
    *  The ID of the reactive anomaly. 
    */
  var Id: js.UndefOr[AnomalyId] = js.undefined
  
  /**
    * The name of the reactive anomaly.
    */
  var Name: js.UndefOr[AnomalyName] = js.undefined
  
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
    *  The status of the reactive anomaly. 
    */
  var Status: js.UndefOr[AnomalyStatus] = js.undefined
  
  /**
    * The type of the reactive anomaly. It can be one of the following types.    CAUSAL - the anomaly can cause a new insight.    CONTEXTUAL - the anomaly contains additional information about an insight or its causal anomaly.  
    */
  var Type: js.UndefOr[AnomalyType] = js.undefined
}
object ReactiveAnomalySummary {
  
  inline def apply(): ReactiveAnomalySummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReactiveAnomalySummary]
  }
  
  extension [Self <: ReactiveAnomalySummary](x: Self) {
    
    inline def setAnomalyReportedTimeRange(value: AnomalyReportedTimeRange): Self = StObject.set(x, "AnomalyReportedTimeRange", value.asInstanceOf[js.Any])
    
    inline def setAnomalyReportedTimeRangeUndefined: Self = StObject.set(x, "AnomalyReportedTimeRange", js.undefined)
    
    inline def setAnomalyResources(value: AnomalyResources): Self = StObject.set(x, "AnomalyResources", value.asInstanceOf[js.Any])
    
    inline def setAnomalyResourcesUndefined: Self = StObject.set(x, "AnomalyResources", js.undefined)
    
    inline def setAnomalyResourcesVarargs(value: AnomalyResource*): Self = StObject.set(x, "AnomalyResources", js.Array(value*))
    
    inline def setAnomalyTimeRange(value: AnomalyTimeRange): Self = StObject.set(x, "AnomalyTimeRange", value.asInstanceOf[js.Any])
    
    inline def setAnomalyTimeRangeUndefined: Self = StObject.set(x, "AnomalyTimeRange", js.undefined)
    
    inline def setAssociatedInsightId(value: InsightId): Self = StObject.set(x, "AssociatedInsightId", value.asInstanceOf[js.Any])
    
    inline def setAssociatedInsightIdUndefined: Self = StObject.set(x, "AssociatedInsightId", js.undefined)
    
    inline def setCausalAnomalyId(value: AnomalyId): Self = StObject.set(x, "CausalAnomalyId", value.asInstanceOf[js.Any])
    
    inline def setCausalAnomalyIdUndefined: Self = StObject.set(x, "CausalAnomalyId", js.undefined)
    
    inline def setDescription(value: AnomalyDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setId(value: AnomalyId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setName(value: AnomalyName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setResourceCollection(value: ResourceCollection): Self = StObject.set(x, "ResourceCollection", value.asInstanceOf[js.Any])
    
    inline def setResourceCollectionUndefined: Self = StObject.set(x, "ResourceCollection", js.undefined)
    
    inline def setSeverity(value: AnomalySeverity): Self = StObject.set(x, "Severity", value.asInstanceOf[js.Any])
    
    inline def setSeverityUndefined: Self = StObject.set(x, "Severity", js.undefined)
    
    inline def setSourceDetails(value: AnomalySourceDetails): Self = StObject.set(x, "SourceDetails", value.asInstanceOf[js.Any])
    
    inline def setSourceDetailsUndefined: Self = StObject.set(x, "SourceDetails", js.undefined)
    
    inline def setStatus(value: AnomalyStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setType(value: AnomalyType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
