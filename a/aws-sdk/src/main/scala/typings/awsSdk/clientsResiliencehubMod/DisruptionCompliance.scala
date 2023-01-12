package typings.awsSdk.clientsResiliencehubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisruptionCompliance extends StObject {
  
  /**
    * The Recovery Point Objective (RPO) that is achievable, in seconds.
    */
  var achievableRpoInSecs: js.UndefOr[Seconds] = js.undefined
  
  /**
    * The Recovery Time Objective (RTO) that is achievable, in seconds
    */
  var achievableRtoInSecs: js.UndefOr[Seconds] = js.undefined
  
  /**
    * The current status of compliance for the resiliency policy.
    */
  var complianceStatus: ComplianceStatus
  
  /**
    * The current RPO, in seconds.
    */
  var currentRpoInSecs: js.UndefOr[Seconds] = js.undefined
  
  /**
    * The current RTO, in seconds.
    */
  var currentRtoInSecs: js.UndefOr[Seconds] = js.undefined
  
  /**
    * The disruption compliance message.
    */
  var message: js.UndefOr[String500] = js.undefined
  
  /**
    * The RPO description.
    */
  var rpoDescription: js.UndefOr[String500] = js.undefined
  
  /**
    * The RPO reference identifier.
    */
  var rpoReferenceId: js.UndefOr[String500] = js.undefined
  
  /**
    * The RTO description.
    */
  var rtoDescription: js.UndefOr[String500] = js.undefined
  
  /**
    * The RTO reference identifier.
    */
  var rtoReferenceId: js.UndefOr[String500] = js.undefined
}
object DisruptionCompliance {
  
  inline def apply(complianceStatus: ComplianceStatus): DisruptionCompliance = {
    val __obj = js.Dynamic.literal(complianceStatus = complianceStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisruptionCompliance]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DisruptionCompliance] (val x: Self) extends AnyVal {
    
    inline def setAchievableRpoInSecs(value: Seconds): Self = StObject.set(x, "achievableRpoInSecs", value.asInstanceOf[js.Any])
    
    inline def setAchievableRpoInSecsUndefined: Self = StObject.set(x, "achievableRpoInSecs", js.undefined)
    
    inline def setAchievableRtoInSecs(value: Seconds): Self = StObject.set(x, "achievableRtoInSecs", value.asInstanceOf[js.Any])
    
    inline def setAchievableRtoInSecsUndefined: Self = StObject.set(x, "achievableRtoInSecs", js.undefined)
    
    inline def setComplianceStatus(value: ComplianceStatus): Self = StObject.set(x, "complianceStatus", value.asInstanceOf[js.Any])
    
    inline def setCurrentRpoInSecs(value: Seconds): Self = StObject.set(x, "currentRpoInSecs", value.asInstanceOf[js.Any])
    
    inline def setCurrentRpoInSecsUndefined: Self = StObject.set(x, "currentRpoInSecs", js.undefined)
    
    inline def setCurrentRtoInSecs(value: Seconds): Self = StObject.set(x, "currentRtoInSecs", value.asInstanceOf[js.Any])
    
    inline def setCurrentRtoInSecsUndefined: Self = StObject.set(x, "currentRtoInSecs", js.undefined)
    
    inline def setMessage(value: String500): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setRpoDescription(value: String500): Self = StObject.set(x, "rpoDescription", value.asInstanceOf[js.Any])
    
    inline def setRpoDescriptionUndefined: Self = StObject.set(x, "rpoDescription", js.undefined)
    
    inline def setRpoReferenceId(value: String500): Self = StObject.set(x, "rpoReferenceId", value.asInstanceOf[js.Any])
    
    inline def setRpoReferenceIdUndefined: Self = StObject.set(x, "rpoReferenceId", js.undefined)
    
    inline def setRtoDescription(value: String500): Self = StObject.set(x, "rtoDescription", value.asInstanceOf[js.Any])
    
    inline def setRtoDescriptionUndefined: Self = StObject.set(x, "rtoDescription", js.undefined)
    
    inline def setRtoReferenceId(value: String500): Self = StObject.set(x, "rtoReferenceId", value.asInstanceOf[js.Any])
    
    inline def setRtoReferenceIdUndefined: Self = StObject.set(x, "rtoReferenceId", js.undefined)
  }
}
