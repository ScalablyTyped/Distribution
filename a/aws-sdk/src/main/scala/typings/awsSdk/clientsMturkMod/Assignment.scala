package typings.awsSdk.clientsMturkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Assignment extends StObject {
  
  /**
    *  The date and time the Worker accepted the assignment.
    */
  var AcceptTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  The Worker's answers submitted for the HIT contained in a QuestionFormAnswers document, if the Worker provides an answer. If the Worker does not provide any answers, Answer may contain a QuestionFormAnswers document, or Answer may be empty.
    */
  var Answer: js.UndefOr[String] = js.undefined
  
  /**
    *  If the Worker has submitted results and the Requester has approved the results, ApprovalTime is the date and time the Requester approved the results. This value is omitted from the assignment if the Requester has not yet approved the results.
    */
  var ApprovalTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  A unique identifier for the assignment.
    */
  var AssignmentId: js.UndefOr[EntityId] = js.undefined
  
  /**
    *  The status of the assignment.
    */
  var AssignmentStatus: js.UndefOr[typings.awsSdk.clientsMturkMod.AssignmentStatus] = js.undefined
  
  /**
    *  If results have been submitted, AutoApprovalTime is the date and time the results of the assignment results are considered Approved automatically if they have not already been explicitly approved or rejected by the Requester. This value is derived from the auto-approval delay specified by the Requester in the HIT. This value is omitted from the assignment if the Worker has not yet submitted results.
    */
  var AutoApprovalTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  The date and time of the deadline for the assignment. This value is derived from the deadline specification for the HIT and the date and time the Worker accepted the HIT.
    */
  var Deadline: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  The ID of the HIT.
    */
  var HITId: js.UndefOr[EntityId] = js.undefined
  
  /**
    *  If the Worker has submitted results and the Requester has rejected the results, RejectionTime is the date and time the Requester rejected the results.
    */
  var RejectionTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  The feedback string included with the call to the ApproveAssignment operation or the RejectAssignment operation, if the Requester approved or rejected the assignment and specified feedback.
    */
  var RequesterFeedback: js.UndefOr[String] = js.undefined
  
  /**
    *  If the Worker has submitted results, SubmitTime is the date and time the assignment was submitted. This value is omitted from the assignment if the Worker has not yet submitted results.
    */
  var SubmitTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  The ID of the Worker who accepted the HIT.
    */
  var WorkerId: js.UndefOr[CustomerId] = js.undefined
}
object Assignment {
  
  inline def apply(): Assignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Assignment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Assignment] (val x: Self) extends AnyVal {
    
    inline def setAcceptTime(value: js.Date): Self = StObject.set(x, "AcceptTime", value.asInstanceOf[js.Any])
    
    inline def setAcceptTimeUndefined: Self = StObject.set(x, "AcceptTime", js.undefined)
    
    inline def setAnswer(value: String): Self = StObject.set(x, "Answer", value.asInstanceOf[js.Any])
    
    inline def setAnswerUndefined: Self = StObject.set(x, "Answer", js.undefined)
    
    inline def setApprovalTime(value: js.Date): Self = StObject.set(x, "ApprovalTime", value.asInstanceOf[js.Any])
    
    inline def setApprovalTimeUndefined: Self = StObject.set(x, "ApprovalTime", js.undefined)
    
    inline def setAssignmentId(value: EntityId): Self = StObject.set(x, "AssignmentId", value.asInstanceOf[js.Any])
    
    inline def setAssignmentIdUndefined: Self = StObject.set(x, "AssignmentId", js.undefined)
    
    inline def setAssignmentStatus(value: AssignmentStatus): Self = StObject.set(x, "AssignmentStatus", value.asInstanceOf[js.Any])
    
    inline def setAssignmentStatusUndefined: Self = StObject.set(x, "AssignmentStatus", js.undefined)
    
    inline def setAutoApprovalTime(value: js.Date): Self = StObject.set(x, "AutoApprovalTime", value.asInstanceOf[js.Any])
    
    inline def setAutoApprovalTimeUndefined: Self = StObject.set(x, "AutoApprovalTime", js.undefined)
    
    inline def setDeadline(value: js.Date): Self = StObject.set(x, "Deadline", value.asInstanceOf[js.Any])
    
    inline def setDeadlineUndefined: Self = StObject.set(x, "Deadline", js.undefined)
    
    inline def setHITId(value: EntityId): Self = StObject.set(x, "HITId", value.asInstanceOf[js.Any])
    
    inline def setHITIdUndefined: Self = StObject.set(x, "HITId", js.undefined)
    
    inline def setRejectionTime(value: js.Date): Self = StObject.set(x, "RejectionTime", value.asInstanceOf[js.Any])
    
    inline def setRejectionTimeUndefined: Self = StObject.set(x, "RejectionTime", js.undefined)
    
    inline def setRequesterFeedback(value: String): Self = StObject.set(x, "RequesterFeedback", value.asInstanceOf[js.Any])
    
    inline def setRequesterFeedbackUndefined: Self = StObject.set(x, "RequesterFeedback", js.undefined)
    
    inline def setSubmitTime(value: js.Date): Self = StObject.set(x, "SubmitTime", value.asInstanceOf[js.Any])
    
    inline def setSubmitTimeUndefined: Self = StObject.set(x, "SubmitTime", js.undefined)
    
    inline def setWorkerId(value: CustomerId): Self = StObject.set(x, "WorkerId", value.asInstanceOf[js.Any])
    
    inline def setWorkerIdUndefined: Self = StObject.set(x, "WorkerId", js.undefined)
  }
}
