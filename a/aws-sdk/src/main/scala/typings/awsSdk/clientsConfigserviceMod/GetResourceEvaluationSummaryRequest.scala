package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResourceEvaluationSummaryRequest extends StObject {
  
  /**
    * The unique ResourceEvaluationId of Amazon Web Services resource execution for which you want to retrieve the evaluation summary.
    */
  var ResourceEvaluationId: typings.awsSdk.clientsConfigserviceMod.ResourceEvaluationId
}
object GetResourceEvaluationSummaryRequest {
  
  inline def apply(ResourceEvaluationId: ResourceEvaluationId): GetResourceEvaluationSummaryRequest = {
    val __obj = js.Dynamic.literal(ResourceEvaluationId = ResourceEvaluationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResourceEvaluationSummaryRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResourceEvaluationSummaryRequest] (val x: Self) extends AnyVal {
    
    inline def setResourceEvaluationId(value: ResourceEvaluationId): Self = StObject.set(x, "ResourceEvaluationId", value.asInstanceOf[js.Any])
  }
}
