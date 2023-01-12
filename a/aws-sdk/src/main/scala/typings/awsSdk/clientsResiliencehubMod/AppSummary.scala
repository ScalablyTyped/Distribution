package typings.awsSdk.clientsResiliencehubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppSummary extends StObject {
  
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
    * The name of the application.
    */
  var name: EntityName
  
  /**
    * The current resiliency score for the application.
    */
  var resiliencyScore: js.UndefOr[Double] = js.undefined
  
  /**
    * The status of the application.
    */
  var status: js.UndefOr[AppStatusType] = js.undefined
}
object AppSummary {
  
  inline def apply(appArn: Arn, creationTime: js.Date, name: EntityName): AppSummary = {
    val __obj = js.Dynamic.literal(appArn = appArn.asInstanceOf[js.Any], creationTime = creationTime.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppSummary] (val x: Self) extends AnyVal {
    
    inline def setAppArn(value: Arn): Self = StObject.set(x, "appArn", value.asInstanceOf[js.Any])
    
    inline def setAssessmentSchedule(value: AppAssessmentScheduleType): Self = StObject.set(x, "assessmentSchedule", value.asInstanceOf[js.Any])
    
    inline def setAssessmentScheduleUndefined: Self = StObject.set(x, "assessmentSchedule", js.undefined)
    
    inline def setComplianceStatus(value: AppComplianceStatusType): Self = StObject.set(x, "complianceStatus", value.asInstanceOf[js.Any])
    
    inline def setComplianceStatusUndefined: Self = StObject.set(x, "complianceStatus", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: EntityDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: EntityName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setResiliencyScore(value: Double): Self = StObject.set(x, "resiliencyScore", value.asInstanceOf[js.Any])
    
    inline def setResiliencyScoreUndefined: Self = StObject.set(x, "resiliencyScore", js.undefined)
    
    inline def setStatus(value: AppStatusType): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
