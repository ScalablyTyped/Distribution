package typings.awsSdk.clientsResiliencehubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppComponentCompliance extends StObject {
  
  /**
    * The name of the application component.
    */
  var appComponentName: js.UndefOr[EntityId] = js.undefined
  
  /**
    * The compliance of the application component against the resiliency policy.
    */
  var compliance: js.UndefOr[AssessmentCompliance] = js.undefined
  
  /**
    * The cost for the application.
    */
  var cost: js.UndefOr[Cost] = js.undefined
  
  /**
    * The compliance message.
    */
  var message: js.UndefOr[String500] = js.undefined
  
  /**
    * The current resiliency score for the application.
    */
  var resiliencyScore: js.UndefOr[ResiliencyScore] = js.undefined
  
  /**
    * The status of the action.
    */
  var status: js.UndefOr[ComplianceStatus] = js.undefined
}
object AppComponentCompliance {
  
  inline def apply(): AppComponentCompliance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppComponentCompliance]
  }
  
  extension [Self <: AppComponentCompliance](x: Self) {
    
    inline def setAppComponentName(value: EntityId): Self = StObject.set(x, "appComponentName", value.asInstanceOf[js.Any])
    
    inline def setAppComponentNameUndefined: Self = StObject.set(x, "appComponentName", js.undefined)
    
    inline def setCompliance(value: AssessmentCompliance): Self = StObject.set(x, "compliance", value.asInstanceOf[js.Any])
    
    inline def setComplianceUndefined: Self = StObject.set(x, "compliance", js.undefined)
    
    inline def setCost(value: Cost): Self = StObject.set(x, "cost", value.asInstanceOf[js.Any])
    
    inline def setCostUndefined: Self = StObject.set(x, "cost", js.undefined)
    
    inline def setMessage(value: String500): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setResiliencyScore(value: ResiliencyScore): Self = StObject.set(x, "resiliencyScore", value.asInstanceOf[js.Any])
    
    inline def setResiliencyScoreUndefined: Self = StObject.set(x, "resiliencyScore", js.undefined)
    
    inline def setStatus(value: ComplianceStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
