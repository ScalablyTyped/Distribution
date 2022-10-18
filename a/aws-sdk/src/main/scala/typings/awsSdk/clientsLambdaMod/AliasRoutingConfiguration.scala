package typings.awsSdk.clientsLambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AliasRoutingConfiguration extends StObject {
  
  /**
    * The second version, and the percentage of traffic that's routed to it.
    */
  var AdditionalVersionWeights: js.UndefOr[typings.awsSdk.clientsLambdaMod.AdditionalVersionWeights] = js.undefined
}
object AliasRoutingConfiguration {
  
  inline def apply(): AliasRoutingConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AliasRoutingConfiguration]
  }
  
  extension [Self <: AliasRoutingConfiguration](x: Self) {
    
    inline def setAdditionalVersionWeights(value: AdditionalVersionWeights): Self = StObject.set(x, "AdditionalVersionWeights", value.asInstanceOf[js.Any])
    
    inline def setAdditionalVersionWeightsUndefined: Self = StObject.set(x, "AdditionalVersionWeights", js.undefined)
  }
}
