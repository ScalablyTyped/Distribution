package typings.awsSdk.clientsResiliencehubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAppRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the application. The format for this ARN is: arn:partition:resiliencehub:region:account:app/app-id. For more information about ARNs, see  Amazon Resource Names (ARNs) in the AWS General Reference.
    */
  var appArn: Arn
  
  /**
    *  Assessment execution schedule with 'Daily' or 'Disabled' values. 
    */
  var assessmentSchedule: js.UndefOr[AppAssessmentScheduleType] = js.undefined
  
  /**
    * Specifies if the resiliency policy ARN should be cleared.
    */
  var clearResiliencyPolicyArn: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * The optional description for an app.
    */
  var description: js.UndefOr[EntityDescription] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the resiliency policy. The format for this ARN is: arn:partition:resiliencehub:region:account:resiliency-policy/policy-id. For more information about ARNs, see  Amazon Resource Names (ARNs) in the AWS General Reference.
    */
  var policyArn: js.UndefOr[Arn] = js.undefined
}
object UpdateAppRequest {
  
  inline def apply(appArn: Arn): UpdateAppRequest = {
    val __obj = js.Dynamic.literal(appArn = appArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAppRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateAppRequest] (val x: Self) extends AnyVal {
    
    inline def setAppArn(value: Arn): Self = StObject.set(x, "appArn", value.asInstanceOf[js.Any])
    
    inline def setAssessmentSchedule(value: AppAssessmentScheduleType): Self = StObject.set(x, "assessmentSchedule", value.asInstanceOf[js.Any])
    
    inline def setAssessmentScheduleUndefined: Self = StObject.set(x, "assessmentSchedule", js.undefined)
    
    inline def setClearResiliencyPolicyArn(value: BooleanOptional): Self = StObject.set(x, "clearResiliencyPolicyArn", value.asInstanceOf[js.Any])
    
    inline def setClearResiliencyPolicyArnUndefined: Self = StObject.set(x, "clearResiliencyPolicyArn", js.undefined)
    
    inline def setDescription(value: EntityDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setPolicyArn(value: Arn): Self = StObject.set(x, "policyArn", value.asInstanceOf[js.Any])
    
    inline def setPolicyArnUndefined: Self = StObject.set(x, "policyArn", js.undefined)
  }
}
