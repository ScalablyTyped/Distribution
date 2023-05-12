package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteContactEvaluationRequest extends StObject {
  
  /**
    * A unique identifier for the contact evaluation.
    */
  var EvaluationId: ResourceId
  
  /**
    * The identifier of the Amazon Connect instance. You can find the instance ID in the Amazon Resource Name (ARN) of the instance.
    */
  var InstanceId: typings.awsSdk.clientsConnectMod.InstanceId
}
object DeleteContactEvaluationRequest {
  
  inline def apply(EvaluationId: ResourceId, InstanceId: InstanceId): DeleteContactEvaluationRequest = {
    val __obj = js.Dynamic.literal(EvaluationId = EvaluationId.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteContactEvaluationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteContactEvaluationRequest] (val x: Self) extends AnyVal {
    
    inline def setEvaluationId(value: ResourceId): Self = StObject.set(x, "EvaluationId", value.asInstanceOf[js.Any])
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
  }
}
