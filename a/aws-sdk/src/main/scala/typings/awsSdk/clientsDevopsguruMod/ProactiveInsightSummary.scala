package typings.awsSdk.clientsDevopsguruMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProactiveInsightSummary extends StObject {
  
  /**
    * The Amazon Resource Names (ARNs) of the Amazon Web Services resources that generated this insight.
    */
  var AssociatedResourceArns: js.UndefOr[typings.awsSdk.clientsDevopsguruMod.AssociatedResourceArns] = js.undefined
  
  /**
    * The ID of the proactive insight. 
    */
  var Id: js.UndefOr[InsightId] = js.undefined
  
  var InsightTimeRange: js.UndefOr[typings.awsSdk.clientsDevopsguruMod.InsightTimeRange] = js.undefined
  
  /**
    * The name of the proactive insight. 
    */
  var Name: js.UndefOr[InsightName] = js.undefined
  
  var PredictionTimeRange: js.UndefOr[typings.awsSdk.clientsDevopsguruMod.PredictionTimeRange] = js.undefined
  
  var ResourceCollection: js.UndefOr[typings.awsSdk.clientsDevopsguruMod.ResourceCollection] = js.undefined
  
  /**
    * A collection of the names of Amazon Web Services services.
    */
  var ServiceCollection: js.UndefOr[typings.awsSdk.clientsDevopsguruMod.ServiceCollection] = js.undefined
  
  /**
    * The severity of the insight. For more information, see Understanding insight severities in the Amazon DevOps Guru User Guide.
    */
  var Severity: js.UndefOr[InsightSeverity] = js.undefined
  
  /**
    * The status of the proactive insight. 
    */
  var Status: js.UndefOr[InsightStatus] = js.undefined
}
object ProactiveInsightSummary {
  
  inline def apply(): ProactiveInsightSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProactiveInsightSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProactiveInsightSummary] (val x: Self) extends AnyVal {
    
    inline def setAssociatedResourceArns(value: AssociatedResourceArns): Self = StObject.set(x, "AssociatedResourceArns", value.asInstanceOf[js.Any])
    
    inline def setAssociatedResourceArnsUndefined: Self = StObject.set(x, "AssociatedResourceArns", js.undefined)
    
    inline def setAssociatedResourceArnsVarargs(value: ResourceArn*): Self = StObject.set(x, "AssociatedResourceArns", js.Array(value*))
    
    inline def setId(value: InsightId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setInsightTimeRange(value: InsightTimeRange): Self = StObject.set(x, "InsightTimeRange", value.asInstanceOf[js.Any])
    
    inline def setInsightTimeRangeUndefined: Self = StObject.set(x, "InsightTimeRange", js.undefined)
    
    inline def setName(value: InsightName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setPredictionTimeRange(value: PredictionTimeRange): Self = StObject.set(x, "PredictionTimeRange", value.asInstanceOf[js.Any])
    
    inline def setPredictionTimeRangeUndefined: Self = StObject.set(x, "PredictionTimeRange", js.undefined)
    
    inline def setResourceCollection(value: ResourceCollection): Self = StObject.set(x, "ResourceCollection", value.asInstanceOf[js.Any])
    
    inline def setResourceCollectionUndefined: Self = StObject.set(x, "ResourceCollection", js.undefined)
    
    inline def setServiceCollection(value: ServiceCollection): Self = StObject.set(x, "ServiceCollection", value.asInstanceOf[js.Any])
    
    inline def setServiceCollectionUndefined: Self = StObject.set(x, "ServiceCollection", js.undefined)
    
    inline def setSeverity(value: InsightSeverity): Self = StObject.set(x, "Severity", value.asInstanceOf[js.Any])
    
    inline def setSeverityUndefined: Self = StObject.set(x, "Severity", js.undefined)
    
    inline def setStatus(value: InsightStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
