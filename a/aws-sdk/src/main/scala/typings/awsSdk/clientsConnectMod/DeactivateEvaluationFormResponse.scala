package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeactivateEvaluationFormResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) for the evaluation form resource.
    */
  var EvaluationFormArn: ARN
  
  /**
    * The unique identifier for the evaluation form.
    */
  var EvaluationFormId: ResourceId
  
  /**
    * The version of the deactivated evaluation form resource.
    */
  var EvaluationFormVersion: VersionNumber
}
object DeactivateEvaluationFormResponse {
  
  inline def apply(EvaluationFormArn: ARN, EvaluationFormId: ResourceId, EvaluationFormVersion: VersionNumber): DeactivateEvaluationFormResponse = {
    val __obj = js.Dynamic.literal(EvaluationFormArn = EvaluationFormArn.asInstanceOf[js.Any], EvaluationFormId = EvaluationFormId.asInstanceOf[js.Any], EvaluationFormVersion = EvaluationFormVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeactivateEvaluationFormResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeactivateEvaluationFormResponse] (val x: Self) extends AnyVal {
    
    inline def setEvaluationFormArn(value: ARN): Self = StObject.set(x, "EvaluationFormArn", value.asInstanceOf[js.Any])
    
    inline def setEvaluationFormId(value: ResourceId): Self = StObject.set(x, "EvaluationFormId", value.asInstanceOf[js.Any])
    
    inline def setEvaluationFormVersion(value: VersionNumber): Self = StObject.set(x, "EvaluationFormVersion", value.asInstanceOf[js.Any])
  }
}
