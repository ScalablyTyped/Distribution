package typings.awsSdk.auditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DelegationMetadata extends StObject {
  
  /**
    *  The unique identifier for the assessment. 
    */
  var assessmentId: js.UndefOr[UUID] = js.undefined
  
  /**
    *  The name of the associated assessment. 
    */
  var assessmentName: js.UndefOr[AssessmentName] = js.undefined
  
  /**
    *  Specifies the name of the control set that was delegated for review. 
    */
  var controlSetName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    *  Specifies when the delegation was created. 
    */
  var creationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  The unique identifier for the delegation. 
    */
  var id: js.UndefOr[UUID] = js.undefined
  
  /**
    *  The Amazon Resource Name (ARN) of the IAM role. 
    */
  var roleArn: js.UndefOr[IamArn] = js.undefined
  
  /**
    *  The current status of the delegation. 
    */
  var status: js.UndefOr[DelegationStatus] = js.undefined
}
object DelegationMetadata {
  
  inline def apply(): DelegationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DelegationMetadata]
  }
  
  extension [Self <: DelegationMetadata](x: Self) {
    
    inline def setAssessmentId(value: UUID): Self = StObject.set(x, "assessmentId", value.asInstanceOf[js.Any])
    
    inline def setAssessmentIdUndefined: Self = StObject.set(x, "assessmentId", js.undefined)
    
    inline def setAssessmentName(value: AssessmentName): Self = StObject.set(x, "assessmentName", value.asInstanceOf[js.Any])
    
    inline def setAssessmentNameUndefined: Self = StObject.set(x, "assessmentName", js.undefined)
    
    inline def setControlSetName(value: NonEmptyString): Self = StObject.set(x, "controlSetName", value.asInstanceOf[js.Any])
    
    inline def setControlSetNameUndefined: Self = StObject.set(x, "controlSetName", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    inline def setId(value: UUID): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setRoleArn(value: IamArn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "roleArn", js.undefined)
    
    inline def setStatus(value: DelegationStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
