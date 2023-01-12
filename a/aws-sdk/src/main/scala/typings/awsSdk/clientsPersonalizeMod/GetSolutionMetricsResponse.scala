package typings.awsSdk.clientsPersonalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSolutionMetricsResponse extends StObject {
  
  /**
    * The metrics for the solution version. For more information, see  Evaluating a solution version with metrics .
    */
  var metrics: js.UndefOr[Metrics] = js.undefined
  
  /**
    * The same solution version ARN as specified in the request.
    */
  var solutionVersionArn: js.UndefOr[Arn] = js.undefined
}
object GetSolutionMetricsResponse {
  
  inline def apply(): GetSolutionMetricsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSolutionMetricsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetSolutionMetricsResponse] (val x: Self) extends AnyVal {
    
    inline def setMetrics(value: Metrics): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    inline def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
    
    inline def setSolutionVersionArn(value: Arn): Self = StObject.set(x, "solutionVersionArn", value.asInstanceOf[js.Any])
    
    inline def setSolutionVersionArnUndefined: Self = StObject.set(x, "solutionVersionArn", js.undefined)
  }
}
