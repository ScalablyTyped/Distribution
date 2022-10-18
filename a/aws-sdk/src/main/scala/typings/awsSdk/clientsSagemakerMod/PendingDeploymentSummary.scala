package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PendingDeploymentSummary extends StObject {
  
  /**
    * The name of the endpoint configuration used in the deployment. 
    */
  var EndpointConfigName: typings.awsSdk.clientsSagemakerMod.EndpointConfigName
  
  /**
    * List of PendingProductionVariantSummary objects.
    */
  var ProductionVariants: js.UndefOr[PendingProductionVariantSummaryList] = js.undefined
  
  /**
    * The start time of the deployment.
    */
  var StartTime: js.UndefOr[js.Date] = js.undefined
}
object PendingDeploymentSummary {
  
  inline def apply(EndpointConfigName: EndpointConfigName): PendingDeploymentSummary = {
    val __obj = js.Dynamic.literal(EndpointConfigName = EndpointConfigName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PendingDeploymentSummary]
  }
  
  extension [Self <: PendingDeploymentSummary](x: Self) {
    
    inline def setEndpointConfigName(value: EndpointConfigName): Self = StObject.set(x, "EndpointConfigName", value.asInstanceOf[js.Any])
    
    inline def setProductionVariants(value: PendingProductionVariantSummaryList): Self = StObject.set(x, "ProductionVariants", value.asInstanceOf[js.Any])
    
    inline def setProductionVariantsUndefined: Self = StObject.set(x, "ProductionVariants", js.undefined)
    
    inline def setProductionVariantsVarargs(value: PendingProductionVariantSummary*): Self = StObject.set(x, "ProductionVariants", js.Array(value*))
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
  }
}
