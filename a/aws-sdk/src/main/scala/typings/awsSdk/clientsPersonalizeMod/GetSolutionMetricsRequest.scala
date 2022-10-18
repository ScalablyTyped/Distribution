package typings.awsSdk.clientsPersonalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSolutionMetricsRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the solution version for which to get metrics.
    */
  var solutionVersionArn: Arn
}
object GetSolutionMetricsRequest {
  
  inline def apply(solutionVersionArn: Arn): GetSolutionMetricsRequest = {
    val __obj = js.Dynamic.literal(solutionVersionArn = solutionVersionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSolutionMetricsRequest]
  }
  
  extension [Self <: GetSolutionMetricsRequest](x: Self) {
    
    inline def setSolutionVersionArn(value: Arn): Self = StObject.set(x, "solutionVersionArn", value.asInstanceOf[js.Any])
  }
}
