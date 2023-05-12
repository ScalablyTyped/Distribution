package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActivateEvaluationFormResponse extends StObject {
  
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
}
object ActivateEvaluationFormResponse {
  
  inline def apply(EvaluationFormArn: ARN, EvaluationFormId: ResourceId, EvaluationFormVersion: VersionNumber): ActivateEvaluationFormResponse = {
    val __obj = js.Dynamic.literal(EvaluationFormArn = EvaluationFormArn.asInstanceOf[js.Any], EvaluationFormId = EvaluationFormId.asInstanceOf[js.Any], EvaluationFormVersion = EvaluationFormVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivateEvaluationFormResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ActivateEvaluationFormResponse] (val x: Self) extends AnyVal {
    
    inline def setEvaluationFormArn(value: ARN): Self = StObject.set(x, "EvaluationFormArn", value.asInstanceOf[js.Any])
    
    inline def setEvaluationFormId(value: ResourceId): Self = StObject.set(x, "EvaluationFormId", value.asInstanceOf[js.Any])
    
    inline def setEvaluationFormVersion(value: VersionNumber): Self = StObject.set(x, "EvaluationFormVersion", value.asInstanceOf[js.Any])
  }
}
