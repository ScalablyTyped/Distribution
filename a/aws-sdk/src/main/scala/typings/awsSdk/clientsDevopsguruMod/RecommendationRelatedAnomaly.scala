package typings.awsSdk.clientsDevopsguruMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecommendationRelatedAnomaly extends StObject {
  
  /**
    * The ID of an anomaly that generated the insight with this recommendation.
    */
  var AnomalyId: js.UndefOr[typings.awsSdk.clientsDevopsguruMod.AnomalyId] = js.undefined
  
  /**
    *  An array of objects that represent resources in which DevOps Guru detected anomalous behavior. Each object contains the name and type of the resource. 
    */
  var Resources: js.UndefOr[RecommendationRelatedAnomalyResources] = js.undefined
  
  /**
    *  Information about where the anomalous behavior related the recommendation was found. For example, details in Amazon CloudWatch metrics. 
    */
  var SourceDetails: js.UndefOr[RelatedAnomalySourceDetails] = js.undefined
}
object RecommendationRelatedAnomaly {
  
  inline def apply(): RecommendationRelatedAnomaly = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecommendationRelatedAnomaly]
  }
  
  extension [Self <: RecommendationRelatedAnomaly](x: Self) {
    
    inline def setAnomalyId(value: AnomalyId): Self = StObject.set(x, "AnomalyId", value.asInstanceOf[js.Any])
    
    inline def setAnomalyIdUndefined: Self = StObject.set(x, "AnomalyId", js.undefined)
    
    inline def setResources(value: RecommendationRelatedAnomalyResources): Self = StObject.set(x, "Resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesUndefined: Self = StObject.set(x, "Resources", js.undefined)
    
    inline def setResourcesVarargs(value: RecommendationRelatedAnomalyResource*): Self = StObject.set(x, "Resources", js.Array(value*))
    
    inline def setSourceDetails(value: RelatedAnomalySourceDetails): Self = StObject.set(x, "SourceDetails", value.asInstanceOf[js.Any])
    
    inline def setSourceDetailsUndefined: Self = StObject.set(x, "SourceDetails", js.undefined)
    
    inline def setSourceDetailsVarargs(value: RecommendationRelatedAnomalySourceDetail*): Self = StObject.set(x, "SourceDetails", js.Array(value*))
  }
}
