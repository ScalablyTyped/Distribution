package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExplainerConfig extends StObject {
  
  /**
    * A member of ExplainerConfig that contains configuration parameters for the SageMaker Clarify explainer.
    */
  var ClarifyExplainerConfig: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ClarifyExplainerConfig] = js.undefined
}
object ExplainerConfig {
  
  inline def apply(): ExplainerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExplainerConfig]
  }
  
  extension [Self <: ExplainerConfig](x: Self) {
    
    inline def setClarifyExplainerConfig(value: ClarifyExplainerConfig): Self = StObject.set(x, "ClarifyExplainerConfig", value.asInstanceOf[js.Any])
    
    inline def setClarifyExplainerConfigUndefined: Self = StObject.set(x, "ClarifyExplainerConfig", js.undefined)
  }
}
