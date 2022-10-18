package typings.awsSdk.clientsCostexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoverageCost extends StObject {
  
  /**
    * How much an On-Demand Instance costs.
    */
  var OnDemandCost: js.UndefOr[typings.awsSdk.clientsCostexplorerMod.OnDemandCost] = js.undefined
}
object CoverageCost {
  
  inline def apply(): CoverageCost = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CoverageCost]
  }
  
  extension [Self <: CoverageCost](x: Self) {
    
    inline def setOnDemandCost(value: OnDemandCost): Self = StObject.set(x, "OnDemandCost", value.asInstanceOf[js.Any])
    
    inline def setOnDemandCostUndefined: Self = StObject.set(x, "OnDemandCost", js.undefined)
  }
}
