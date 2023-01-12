package typings.awsSdk.clientsPersonalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopSolutionVersionCreationRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the solution version you want to stop creating.
    */
  var solutionVersionArn: Arn
}
object StopSolutionVersionCreationRequest {
  
  inline def apply(solutionVersionArn: Arn): StopSolutionVersionCreationRequest = {
    val __obj = js.Dynamic.literal(solutionVersionArn = solutionVersionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopSolutionVersionCreationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StopSolutionVersionCreationRequest] (val x: Self) extends AnyVal {
    
    inline def setSolutionVersionArn(value: Arn): Self = StObject.set(x, "solutionVersionArn", value.asInstanceOf[js.Any])
  }
}
