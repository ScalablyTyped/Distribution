package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateFindingsFeedbackRequest extends StObject {
  
  /**
    * Additional feedback about the GuardDuty findings.
    */
  var Comments: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the detector associated with the findings to update feedback for.
    */
  var DetectorId: typings.awsSdk.clientsGuarddutyMod.DetectorId
  
  /**
    * The feedback for the finding.
    */
  var Feedback: typings.awsSdk.clientsGuarddutyMod.Feedback
  
  /**
    * The IDs of the findings that you want to mark as useful or not useful.
    */
  var FindingIds: typings.awsSdk.clientsGuarddutyMod.FindingIds
}
object UpdateFindingsFeedbackRequest {
  
  inline def apply(DetectorId: DetectorId, Feedback: Feedback, FindingIds: FindingIds): UpdateFindingsFeedbackRequest = {
    val __obj = js.Dynamic.literal(DetectorId = DetectorId.asInstanceOf[js.Any], Feedback = Feedback.asInstanceOf[js.Any], FindingIds = FindingIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFindingsFeedbackRequest]
  }
  
  extension [Self <: UpdateFindingsFeedbackRequest](x: Self) {
    
    inline def setComments(value: String): Self = StObject.set(x, "Comments", value.asInstanceOf[js.Any])
    
    inline def setCommentsUndefined: Self = StObject.set(x, "Comments", js.undefined)
    
    inline def setDetectorId(value: DetectorId): Self = StObject.set(x, "DetectorId", value.asInstanceOf[js.Any])
    
    inline def setFeedback(value: Feedback): Self = StObject.set(x, "Feedback", value.asInstanceOf[js.Any])
    
    inline def setFindingIds(value: FindingIds): Self = StObject.set(x, "FindingIds", value.asInstanceOf[js.Any])
    
    inline def setFindingIdsVarargs(value: FindingId*): Self = StObject.set(x, "FindingIds", js.Array(value*))
  }
}
