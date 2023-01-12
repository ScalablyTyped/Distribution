package typings.awsSdk.clientsResiliencehubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppAssessment extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the application. The format for this ARN is: arn:partition:resiliencehub:region:account:app/app-id. For more information about ARNs, see  Amazon Resource Names (ARNs) in the AWS General Reference.
    */
  var appArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The version of the application.
    */
  var appVersion: js.UndefOr[EntityVersion] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the assessment. The format for this ARN is: arn:partition:resiliencehub:region:account:app-assessment/app-id. For more information about ARNs, see  Amazon Resource Names (ARNs) in the AWS General Reference.
    */
  var assessmentArn: Arn
  
  /**
    * The name of the assessment.
    */
  var assessmentName: js.UndefOr[EntityName] = js.undefined
  
  /**
    * The current status of the assessment for the resiliency policy.
    */
  var assessmentStatus: AssessmentStatus
  
  /**
    * The application compliance against the resiliency policy.
    */
  var compliance: js.UndefOr[AssessmentCompliance] = js.undefined
  
  /**
    * The current status of the compliance for the resiliency policy.
    */
  var complianceStatus: js.UndefOr[ComplianceStatus] = js.undefined
  
  /**
    * The cost for the application.
    */
  var cost: js.UndefOr[Cost] = js.undefined
  
  /**
    * The end time for the action.
    */
  var endTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The entity that invoked the assessment.
    */
  var invoker: AssessmentInvoker
  
  /**
    * Error or warning message from the assessment execution
    */
  var message: js.UndefOr[String500] = js.undefined
  
  /**
    * The resiliency policy.
    */
  var policy: js.UndefOr[ResiliencyPolicy] = js.undefined
  
  /**
    * The current resiliency score for the application.
    */
  var resiliencyScore: js.UndefOr[ResiliencyScore] = js.undefined
  
  /**
    *  A resource error object containing a list of errors retrieving an application's resources. 
    */
  var resourceErrorsDetails: js.UndefOr[ResourceErrorsDetails] = js.undefined
  
  /**
    * The starting time for the action.
    */
  var startTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The tags assigned to the resource. A tag is a label that you assign to an Amazon Web Services resource. Each tag consists of a key/value pair.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}
object AppAssessment {
  
  inline def apply(assessmentArn: Arn, assessmentStatus: AssessmentStatus, invoker: AssessmentInvoker): AppAssessment = {
    val __obj = js.Dynamic.literal(assessmentArn = assessmentArn.asInstanceOf[js.Any], assessmentStatus = assessmentStatus.asInstanceOf[js.Any], invoker = invoker.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppAssessment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppAssessment] (val x: Self) extends AnyVal {
    
    inline def setAppArn(value: Arn): Self = StObject.set(x, "appArn", value.asInstanceOf[js.Any])
    
    inline def setAppArnUndefined: Self = StObject.set(x, "appArn", js.undefined)
    
    inline def setAppVersion(value: EntityVersion): Self = StObject.set(x, "appVersion", value.asInstanceOf[js.Any])
    
    inline def setAppVersionUndefined: Self = StObject.set(x, "appVersion", js.undefined)
    
    inline def setAssessmentArn(value: Arn): Self = StObject.set(x, "assessmentArn", value.asInstanceOf[js.Any])
    
    inline def setAssessmentName(value: EntityName): Self = StObject.set(x, "assessmentName", value.asInstanceOf[js.Any])
    
    inline def setAssessmentNameUndefined: Self = StObject.set(x, "assessmentName", js.undefined)
    
    inline def setAssessmentStatus(value: AssessmentStatus): Self = StObject.set(x, "assessmentStatus", value.asInstanceOf[js.Any])
    
    inline def setCompliance(value: AssessmentCompliance): Self = StObject.set(x, "compliance", value.asInstanceOf[js.Any])
    
    inline def setComplianceStatus(value: ComplianceStatus): Self = StObject.set(x, "complianceStatus", value.asInstanceOf[js.Any])
    
    inline def setComplianceStatusUndefined: Self = StObject.set(x, "complianceStatus", js.undefined)
    
    inline def setComplianceUndefined: Self = StObject.set(x, "compliance", js.undefined)
    
    inline def setCost(value: Cost): Self = StObject.set(x, "cost", value.asInstanceOf[js.Any])
    
    inline def setCostUndefined: Self = StObject.set(x, "cost", js.undefined)
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setInvoker(value: AssessmentInvoker): Self = StObject.set(x, "invoker", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String500): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setPolicy(value: ResiliencyPolicy): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
    
    inline def setResiliencyScore(value: ResiliencyScore): Self = StObject.set(x, "resiliencyScore", value.asInstanceOf[js.Any])
    
    inline def setResiliencyScoreUndefined: Self = StObject.set(x, "resiliencyScore", js.undefined)
    
    inline def setResourceErrorsDetails(value: ResourceErrorsDetails): Self = StObject.set(x, "resourceErrorsDetails", value.asInstanceOf[js.Any])
    
    inline def setResourceErrorsDetailsUndefined: Self = StObject.set(x, "resourceErrorsDetails", js.undefined)
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
