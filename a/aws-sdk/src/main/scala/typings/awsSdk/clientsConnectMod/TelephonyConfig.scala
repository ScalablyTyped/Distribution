package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TelephonyConfig extends StObject {
  
  /**
    * Information about traffic distributions.
    */
  var Distributions: DistributionList
}
object TelephonyConfig {
  
  inline def apply(Distributions: DistributionList): TelephonyConfig = {
    val __obj = js.Dynamic.literal(Distributions = Distributions.asInstanceOf[js.Any])
    __obj.asInstanceOf[TelephonyConfig]
  }
  
  extension [Self <: TelephonyConfig](x: Self) {
    
    inline def setDistributions(value: DistributionList): Self = StObject.set(x, "Distributions", value.asInstanceOf[js.Any])
    
    inline def setDistributionsVarargs(value: Distribution*): Self = StObject.set(x, "Distributions", js.Array(value*))
  }
}
