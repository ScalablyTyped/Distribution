package typings.awsSdk.clientsForecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteExplainabilityRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the Explainability resource to delete.
    */
  var ExplainabilityArn: Arn
}
object DeleteExplainabilityRequest {
  
  inline def apply(ExplainabilityArn: Arn): DeleteExplainabilityRequest = {
    val __obj = js.Dynamic.literal(ExplainabilityArn = ExplainabilityArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteExplainabilityRequest]
  }
  
  extension [Self <: DeleteExplainabilityRequest](x: Self) {
    
    inline def setExplainabilityArn(value: Arn): Self = StObject.set(x, "ExplainabilityArn", value.asInstanceOf[js.Any])
  }
}
