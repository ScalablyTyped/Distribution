package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EvaluationFormVersionSummary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the user who created the evaluation form.
    */
  var CreatedBy: ARN
  
  /**
    * The timestamp for when the evaluation form was created.
    */
  var CreatedTime: js.Date
  
  /**
    * The Amazon Resource Name (ARN) for the evaluation form resource.
    */
  var EvaluationFormArn: ARN
  
  /**
    * The unique identifier for the evaluation form.
    */
  var EvaluationFormId: ResourceId
  
  /**
    * A version of the evaluation form.
    */
  var EvaluationFormVersion: VersionNumber
  
  /**
    * The Amazon Resource Name (ARN) of the user who last updated the evaluation form.
    */
  var LastModifiedBy: ARN
  
  /**
    * The timestamp for when the evaluation form was last updated.
    */
  var LastModifiedTime: js.Date
  
  /**
    * The flag indicating whether the evaluation form is locked for changes.
    */
  var Locked: EvaluationFormVersionIsLocked
  
  /**
    * The status of the evaluation form.
    */
  var Status: EvaluationFormVersionStatus
}
object EvaluationFormVersionSummary {
  
  inline def apply(
    CreatedBy: ARN,
    CreatedTime: js.Date,
    EvaluationFormArn: ARN,
    EvaluationFormId: ResourceId,
    EvaluationFormVersion: VersionNumber,
    LastModifiedBy: ARN,
    LastModifiedTime: js.Date,
    Locked: EvaluationFormVersionIsLocked,
    Status: EvaluationFormVersionStatus
  ): EvaluationFormVersionSummary = {
    val __obj = js.Dynamic.literal(CreatedBy = CreatedBy.asInstanceOf[js.Any], CreatedTime = CreatedTime.asInstanceOf[js.Any], EvaluationFormArn = EvaluationFormArn.asInstanceOf[js.Any], EvaluationFormId = EvaluationFormId.asInstanceOf[js.Any], EvaluationFormVersion = EvaluationFormVersion.asInstanceOf[js.Any], LastModifiedBy = LastModifiedBy.asInstanceOf[js.Any], LastModifiedTime = LastModifiedTime.asInstanceOf[js.Any], Locked = Locked.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[EvaluationFormVersionSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EvaluationFormVersionSummary] (val x: Self) extends AnyVal {
    
    inline def setCreatedBy(value: ARN): Self = StObject.set(x, "CreatedBy", value.asInstanceOf[js.Any])
    
    inline def setCreatedTime(value: js.Date): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    inline def setEvaluationFormArn(value: ARN): Self = StObject.set(x, "EvaluationFormArn", value.asInstanceOf[js.Any])
    
    inline def setEvaluationFormId(value: ResourceId): Self = StObject.set(x, "EvaluationFormId", value.asInstanceOf[js.Any])
    
    inline def setEvaluationFormVersion(value: VersionNumber): Self = StObject.set(x, "EvaluationFormVersion", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedBy(value: ARN): Self = StObject.set(x, "LastModifiedBy", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setLocked(value: EvaluationFormVersionIsLocked): Self = StObject.set(x, "Locked", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: EvaluationFormVersionStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
