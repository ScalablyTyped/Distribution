package typings.awsSdk.clientsPersonalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteSolutionRequest extends StObject {
  
  /**
    * The ARN of the solution to delete.
    */
  var solutionArn: Arn
}
object DeleteSolutionRequest {
  
  inline def apply(solutionArn: Arn): DeleteSolutionRequest = {
    val __obj = js.Dynamic.literal(solutionArn = solutionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSolutionRequest]
  }
  
  extension [Self <: DeleteSolutionRequest](x: Self) {
    
    inline def setSolutionArn(value: Arn): Self = StObject.set(x, "solutionArn", value.asInstanceOf[js.Any])
  }
}
