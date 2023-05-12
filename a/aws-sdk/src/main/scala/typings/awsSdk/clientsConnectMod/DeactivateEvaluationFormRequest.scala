package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeactivateEvaluationFormRequest extends StObject {
  
  /**
    * The unique identifier for the evaluation form.
    */
  var EvaluationFormId: ResourceId
  
  /**
    * A version of the evaluation form. If the version property is not provided, the latest version of the evaluation form is deactivated.
    */
  var EvaluationFormVersion: VersionNumber
  
  /**
    * The identifier of the Amazon Connect instance. You can find the instance ID in the Amazon Resource Name (ARN) of the instance.
    */
  var InstanceId: typings.awsSdk.clientsConnectMod.InstanceId
}
object DeactivateEvaluationFormRequest {
  
  inline def apply(EvaluationFormId: ResourceId, EvaluationFormVersion: VersionNumber, InstanceId: InstanceId): DeactivateEvaluationFormRequest = {
    val __obj = js.Dynamic.literal(EvaluationFormId = EvaluationFormId.asInstanceOf[js.Any], EvaluationFormVersion = EvaluationFormVersion.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeactivateEvaluationFormRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeactivateEvaluationFormRequest] (val x: Self) extends AnyVal {
    
    inline def setEvaluationFormId(value: ResourceId): Self = StObject.set(x, "EvaluationFormId", value.asInstanceOf[js.Any])
    
    inline def setEvaluationFormVersion(value: VersionNumber): Self = StObject.set(x, "EvaluationFormVersion", value.asInstanceOf[js.Any])
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
  }
}
