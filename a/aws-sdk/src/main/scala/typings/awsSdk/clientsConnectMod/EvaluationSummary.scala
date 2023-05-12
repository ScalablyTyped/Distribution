package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EvaluationSummary extends StObject {
  
  /**
    * The timestamp for when the evaluation was created.
    */
  var CreatedTime: js.Date
  
  /**
    * The Amazon Resource Name (ARN) for the contact evaluation resource.
    */
  var EvaluationArn: ARN
  
  /**
    * The unique identifier for the evaluation form.
    */
  var EvaluationFormId: ResourceId
  
  /**
    * A title of the evaluation form.
    */
  var EvaluationFormTitle: typings.awsSdk.clientsConnectMod.EvaluationFormTitle
  
  /**
    * A unique identifier for the contact evaluation.
    */
  var EvaluationId: ResourceId
  
  /**
    * The Amazon Resource Name (ARN) of the user who last updated the evaluation.
    */
  var EvaluatorArn: ARN
  
  /**
    * The timestamp for when the evaluation was last updated.
    */
  var LastModifiedTime: js.Date
  
  /**
    * The overall score of the contact evaluation.
    */
  var Score: js.UndefOr[EvaluationScore] = js.undefined
  
  /**
    * The status of the contact evaluation.
    */
  var Status: EvaluationStatus
}
object EvaluationSummary {
  
  inline def apply(
    CreatedTime: js.Date,
    EvaluationArn: ARN,
    EvaluationFormId: ResourceId,
    EvaluationFormTitle: EvaluationFormTitle,
    EvaluationId: ResourceId,
    EvaluatorArn: ARN,
    LastModifiedTime: js.Date,
    Status: EvaluationStatus
  ): EvaluationSummary = {
    val __obj = js.Dynamic.literal(CreatedTime = CreatedTime.asInstanceOf[js.Any], EvaluationArn = EvaluationArn.asInstanceOf[js.Any], EvaluationFormId = EvaluationFormId.asInstanceOf[js.Any], EvaluationFormTitle = EvaluationFormTitle.asInstanceOf[js.Any], EvaluationId = EvaluationId.asInstanceOf[js.Any], EvaluatorArn = EvaluatorArn.asInstanceOf[js.Any], LastModifiedTime = LastModifiedTime.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[EvaluationSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EvaluationSummary] (val x: Self) extends AnyVal {
    
    inline def setCreatedTime(value: js.Date): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    inline def setEvaluationArn(value: ARN): Self = StObject.set(x, "EvaluationArn", value.asInstanceOf[js.Any])
    
    inline def setEvaluationFormId(value: ResourceId): Self = StObject.set(x, "EvaluationFormId", value.asInstanceOf[js.Any])
    
    inline def setEvaluationFormTitle(value: EvaluationFormTitle): Self = StObject.set(x, "EvaluationFormTitle", value.asInstanceOf[js.Any])
    
    inline def setEvaluationId(value: ResourceId): Self = StObject.set(x, "EvaluationId", value.asInstanceOf[js.Any])
    
    inline def setEvaluatorArn(value: ARN): Self = StObject.set(x, "EvaluatorArn", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setScore(value: EvaluationScore): Self = StObject.set(x, "Score", value.asInstanceOf[js.Any])
    
    inline def setScoreUndefined: Self = StObject.set(x, "Score", js.undefined)
    
    inline def setStatus(value: EvaluationStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
