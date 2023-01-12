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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteSolutionRequest] (val x: Self) extends AnyVal {
    
    inline def setSolutionArn(value: Arn): Self = StObject.set(x, "solutionArn", value.asInstanceOf[js.Any])
  }
}
