package typings.awsSdk.clientsPersonalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TunedHPOParams extends StObject {
  
  /**
    * A list of the hyperparameter values of the best performing model.
    */
  var algorithmHyperParameters: js.UndefOr[HyperParameters] = js.undefined
}
object TunedHPOParams {
  
  inline def apply(): TunedHPOParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TunedHPOParams]
  }
  
  extension [Self <: TunedHPOParams](x: Self) {
    
    inline def setAlgorithmHyperParameters(value: HyperParameters): Self = StObject.set(x, "algorithmHyperParameters", value.asInstanceOf[js.Any])
    
    inline def setAlgorithmHyperParametersUndefined: Self = StObject.set(x, "algorithmHyperParameters", js.undefined)
  }
}
