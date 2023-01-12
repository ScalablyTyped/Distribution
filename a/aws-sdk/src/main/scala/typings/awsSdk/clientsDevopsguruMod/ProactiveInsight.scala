package typings.awsSdk.clientsDevopsguruMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProactiveInsight extends StObject {
  
  /**
    * Describes the proactive insight.
    */
  var Description: js.UndefOr[InsightDescription] = js.undefined
  
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
    * The severity of the insight. For more information, see Understanding insight severities in the Amazon DevOps Guru User Guide.
    */
  var Severity: js.UndefOr[InsightSeverity] = js.undefined
  
  /**
    *  The ID of the Amazon Web Services System Manager OpsItem created for this insight. You must enable the creation of OpstItems insights before they are created for each insight. 
    */
  var SsmOpsItemId: js.UndefOr[typings.awsSdk.clientsDevopsguruMod.SsmOpsItemId] = js.undefined
  
  /**
    * The status of the proactive insight. 
    */
  var Status: js.UndefOr[InsightStatus] = js.undefined
}
object ProactiveInsight {
  
  inline def apply(): ProactiveInsight = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProactiveInsight]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProactiveInsight] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: InsightDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
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
    
    inline def setSeverity(value: InsightSeverity): Self = StObject.set(x, "Severity", value.asInstanceOf[js.Any])
    
    inline def setSeverityUndefined: Self = StObject.set(x, "Severity", js.undefined)
    
    inline def setSsmOpsItemId(value: SsmOpsItemId): Self = StObject.set(x, "SsmOpsItemId", value.asInstanceOf[js.Any])
    
    inline def setSsmOpsItemIdUndefined: Self = StObject.set(x, "SsmOpsItemId", js.undefined)
    
    inline def setStatus(value: InsightStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
