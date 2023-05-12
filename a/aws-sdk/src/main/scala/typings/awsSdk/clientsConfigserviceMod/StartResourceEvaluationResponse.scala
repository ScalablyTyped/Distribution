package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartResourceEvaluationResponse extends StObject {
  
  /**
    * A unique ResourceEvaluationId that is associated with a single execution.
    */
  var ResourceEvaluationId: js.UndefOr[typings.awsSdk.clientsConfigserviceMod.ResourceEvaluationId] = js.undefined
}
object StartResourceEvaluationResponse {
  
  inline def apply(): StartResourceEvaluationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartResourceEvaluationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartResourceEvaluationResponse] (val x: Self) extends AnyVal {
    
    inline def setResourceEvaluationId(value: ResourceEvaluationId): Self = StObject.set(x, "ResourceEvaluationId", value.asInstanceOf[js.Any])
    
    inline def setResourceEvaluationIdUndefined: Self = StObject.set(x, "ResourceEvaluationId", js.undefined)
  }
}
