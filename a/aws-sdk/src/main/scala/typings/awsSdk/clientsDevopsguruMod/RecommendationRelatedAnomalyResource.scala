package typings.awsSdk.clientsDevopsguruMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecommendationRelatedAnomalyResource extends StObject {
  
  /**
    *  The name of the resource. 
    */
  var Name: js.UndefOr[RecommendationRelatedAnomalyResourceName] = js.undefined
  
  /**
    *  The type of the resource. Resource types take the same form that is used by Amazon Web Services CloudFormation resource type identifiers, service-provider::service-name::data-type-name. For example, AWS::RDS::DBCluster. For more information, see Amazon Web Services resource and property types reference in the Amazon Web Services CloudFormation User Guide.
    */
  var Type: js.UndefOr[RecommendationRelatedAnomalyResourceType] = js.undefined
}
object RecommendationRelatedAnomalyResource {
  
  inline def apply(): RecommendationRelatedAnomalyResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecommendationRelatedAnomalyResource]
  }
  
  extension [Self <: RecommendationRelatedAnomalyResource](x: Self) {
    
    inline def setName(value: RecommendationRelatedAnomalyResourceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setType(value: RecommendationRelatedAnomalyResourceType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
