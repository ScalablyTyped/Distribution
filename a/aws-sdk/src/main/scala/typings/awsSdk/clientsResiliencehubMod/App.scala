package typings.awsSdk.clientsResiliencehubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait App extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the application. The format for this ARN is: arn:partition:resiliencehub:region:account:app/app-id. For more information about ARNs, see  Amazon Resource Names (ARNs) in the AWS General Reference.
    */
  var appArn: Arn
  
  /**
    *  Assessment execution schedule with 'Daily' or 'Disabled' values. 
    */
  var assessmentSchedule: js.UndefOr[AppAssessmentScheduleType] = js.undefined
  
  /**
    * The current status of compliance for the resiliency policy.
    */
  var complianceStatus: js.UndefOr[AppComplianceStatusType] = js.undefined
  
  /**
    * The timestamp for when the app was created.
    */
  var creationTime: js.Date
  
  /**
    * The optional description for an app.
    */
  var description: js.UndefOr[EntityDescription] = js.undefined
  
  /**
    * The timestamp for the most recent compliance evaluation.
    */
  var lastAppComplianceEvaluationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The timestamp for the most recent resiliency score evaluation.
    */
  var lastResiliencyScoreEvaluationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name for the application.
    */
  var name: EntityName
  
  /**
    * The Amazon Resource Name (ARN) of the resiliency policy. The format for this ARN is: arn:partition:resiliencehub:region:account:resiliency-policy/policy-id. For more information about ARNs, see  Amazon Resource Names (ARNs) in the AWS General Reference.
    */
  var policyArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The current resiliency score for the application.
    */
  var resiliencyScore: js.UndefOr[Double] = js.undefined
  
  /**
    * The status of the action.
    */
  var status: js.UndefOr[AppStatusType] = js.undefined
  
  /**
    * The tags assigned to the resource. A tag is a label that you assign to an Amazon Web Services resource. Each tag consists of a key/value pair.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}
object App {
  
  inline def apply(appArn: Arn, creationTime: js.Date, name: EntityName): App = {
    val __obj = js.Dynamic.literal(appArn = appArn.asInstanceOf[js.Any], creationTime = creationTime.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[App]
  }
  
  extension [Self <: App](x: Self) {
    
    inline def setAppArn(value: Arn): Self = StObject.set(x, "appArn", value.asInstanceOf[js.Any])
    
    inline def setAssessmentSchedule(value: AppAssessmentScheduleType): Self = StObject.set(x, "assessmentSchedule", value.asInstanceOf[js.Any])
    
    inline def setAssessmentScheduleUndefined: Self = StObject.set(x, "assessmentSchedule", js.undefined)
    
    inline def setComplianceStatus(value: AppComplianceStatusType): Self = StObject.set(x, "complianceStatus", value.asInstanceOf[js.Any])
    
    inline def setComplianceStatusUndefined: Self = StObject.set(x, "complianceStatus", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: EntityDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setLastAppComplianceEvaluationTime(value: js.Date): Self = StObject.set(x, "lastAppComplianceEvaluationTime", value.asInstanceOf[js.Any])
    
    inline def setLastAppComplianceEvaluationTimeUndefined: Self = StObject.set(x, "lastAppComplianceEvaluationTime", js.undefined)
    
    inline def setLastResiliencyScoreEvaluationTime(value: js.Date): Self = StObject.set(x, "lastResiliencyScoreEvaluationTime", value.asInstanceOf[js.Any])
    
    inline def setLastResiliencyScoreEvaluationTimeUndefined: Self = StObject.set(x, "lastResiliencyScoreEvaluationTime", js.undefined)
    
    inline def setName(value: EntityName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPolicyArn(value: Arn): Self = StObject.set(x, "policyArn", value.asInstanceOf[js.Any])
    
    inline def setPolicyArnUndefined: Self = StObject.set(x, "policyArn", js.undefined)
    
    inline def setResiliencyScore(value: Double): Self = StObject.set(x, "resiliencyScore", value.asInstanceOf[js.Any])
    
    inline def setResiliencyScoreUndefined: Self = StObject.set(x, "resiliencyScore", js.undefined)
    
    inline def setStatus(value: AppStatusType): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
