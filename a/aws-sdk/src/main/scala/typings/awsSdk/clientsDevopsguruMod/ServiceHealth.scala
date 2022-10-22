package typings.awsSdk.clientsDevopsguruMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceHealth extends StObject {
  
  /**
    *  Number of resources that DevOps Guru is monitoring in an analyzed Amazon Web Services service. 
    */
  var AnalyzedResourceCount: js.UndefOr[typings.awsSdk.clientsDevopsguruMod.AnalyzedResourceCount] = js.undefined
  
  /**
    * Represents the health of an Amazon Web Services service. This is a ServiceInsightHealth that contains the number of open proactive and reactive insights for this service.
    */
  var Insight: js.UndefOr[ServiceInsightHealth] = js.undefined
  
  /**
    * The name of the Amazon Web Services service.
    */
  var ServiceName: js.UndefOr[typings.awsSdk.clientsDevopsguruMod.ServiceName] = js.undefined
}
object ServiceHealth {
  
  inline def apply(): ServiceHealth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceHealth]
  }
  
  extension [Self <: ServiceHealth](x: Self) {
    
    inline def setAnalyzedResourceCount(value: AnalyzedResourceCount): Self = StObject.set(x, "AnalyzedResourceCount", value.asInstanceOf[js.Any])
    
    inline def setAnalyzedResourceCountUndefined: Self = StObject.set(x, "AnalyzedResourceCount", js.undefined)
    
    inline def setInsight(value: ServiceInsightHealth): Self = StObject.set(x, "Insight", value.asInstanceOf[js.Any])
    
    inline def setInsightUndefined: Self = StObject.set(x, "Insight", js.undefined)
    
    inline def setServiceName(value: ServiceName): Self = StObject.set(x, "ServiceName", value.asInstanceOf[js.Any])
    
    inline def setServiceNameUndefined: Self = StObject.set(x, "ServiceName", js.undefined)
  }
}
