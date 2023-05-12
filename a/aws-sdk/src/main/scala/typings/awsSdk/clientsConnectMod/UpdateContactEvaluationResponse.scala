package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateContactEvaluationResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) for the contact evaluation resource.
    */
  var EvaluationArn: ARN
  
  /**
    * A unique identifier for the contact evaluation.
    */
  var EvaluationId: ResourceId
}
object UpdateContactEvaluationResponse {
  
  inline def apply(EvaluationArn: ARN, EvaluationId: ResourceId): UpdateContactEvaluationResponse = {
    val __obj = js.Dynamic.literal(EvaluationArn = EvaluationArn.asInstanceOf[js.Any], EvaluationId = EvaluationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateContactEvaluationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateContactEvaluationResponse] (val x: Self) extends AnyVal {
    
    inline def setEvaluationArn(value: ARN): Self = StObject.set(x, "EvaluationArn", value.asInstanceOf[js.Any])
    
    inline def setEvaluationId(value: ResourceId): Self = StObject.set(x, "EvaluationId", value.asInstanceOf[js.Any])
  }
}
