package typings.awsSdk.clientsDmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FleetAdvisorLsaAnalysisResponse extends StObject {
  
  /**
    * The ID of an LSA analysis run by a Fleet Advisor collector.
    */
  var LsaAnalysisId: js.UndefOr[String] = js.undefined
  
  /**
    * The status of an LSA analysis run by a Fleet Advisor collector.
    */
  var Status: js.UndefOr[String] = js.undefined
}
object FleetAdvisorLsaAnalysisResponse {
  
  inline def apply(): FleetAdvisorLsaAnalysisResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FleetAdvisorLsaAnalysisResponse]
  }
  
  extension [Self <: FleetAdvisorLsaAnalysisResponse](x: Self) {
    
    inline def setLsaAnalysisId(value: String): Self = StObject.set(x, "LsaAnalysisId", value.asInstanceOf[js.Any])
    
    inline def setLsaAnalysisIdUndefined: Self = StObject.set(x, "LsaAnalysisId", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
