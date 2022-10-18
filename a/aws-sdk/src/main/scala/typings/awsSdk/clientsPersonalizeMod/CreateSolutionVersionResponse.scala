package typings.awsSdk.clientsPersonalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSolutionVersionResponse extends StObject {
  
  /**
    * The ARN of the new solution version.
    */
  var solutionVersionArn: js.UndefOr[Arn] = js.undefined
}
object CreateSolutionVersionResponse {
  
  inline def apply(): CreateSolutionVersionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSolutionVersionResponse]
  }
  
  extension [Self <: CreateSolutionVersionResponse](x: Self) {
    
    inline def setSolutionVersionArn(value: Arn): Self = StObject.set(x, "solutionVersionArn", value.asInstanceOf[js.Any])
    
    inline def setSolutionVersionArnUndefined: Self = StObject.set(x, "solutionVersionArn", js.undefined)
  }
}
