package typings.awsSdk.clientsForecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateExplainabilityResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the Explainability.
    */
  var ExplainabilityArn: js.UndefOr[Arn] = js.undefined
}
object CreateExplainabilityResponse {
  
  inline def apply(): CreateExplainabilityResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateExplainabilityResponse]
  }
  
  extension [Self <: CreateExplainabilityResponse](x: Self) {
    
    inline def setExplainabilityArn(value: Arn): Self = StObject.set(x, "ExplainabilityArn", value.asInstanceOf[js.Any])
    
    inline def setExplainabilityArnUndefined: Self = StObject.set(x, "ExplainabilityArn", js.undefined)
  }
}
