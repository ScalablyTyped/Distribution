package typings.awsSdk.clientsKendrarankingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CapacityUnitsConfiguration extends StObject {
  
  /**
    * The amount of extra capacity for your rescore execution plan. A single extra capacity unit for a rescore execution plan provides 0.01 rescore requests per second. You can add up to 1000 extra capacity units.
    */
  var RescoreCapacityUnits: RescoreCapacityUnit
}
object CapacityUnitsConfiguration {
  
  inline def apply(RescoreCapacityUnits: RescoreCapacityUnit): CapacityUnitsConfiguration = {
    val __obj = js.Dynamic.literal(RescoreCapacityUnits = RescoreCapacityUnits.asInstanceOf[js.Any])
    __obj.asInstanceOf[CapacityUnitsConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CapacityUnitsConfiguration] (val x: Self) extends AnyVal {
    
    inline def setRescoreCapacityUnits(value: RescoreCapacityUnit): Self = StObject.set(x, "RescoreCapacityUnits", value.asInstanceOf[js.Any])
  }
}
