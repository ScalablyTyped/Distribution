package typings.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PriorityConfiguration extends StObject {
  
  /**
    * The prioritization order to use for fleet locations, when the PriorityOrder property includes LOCATION. Locations are identified by Amazon Web Services Region codes such as us-west-2. Each location can only be listed once. 
    */
  var LocationOrder: js.UndefOr[LocationList] = js.undefined
  
  /**
    * The recommended sequence to use when prioritizing where to place new game sessions. Each type can only be listed once.    LATENCY -- FleetIQ prioritizes locations where the average player latency (provided in each game session request) is lowest.     COST -- FleetIQ prioritizes destinations with the lowest current hosting costs. Cost is evaluated based on the location, instance type, and fleet type (Spot or On-Demand) for each destination in the queue.    DESTINATION -- FleetIQ prioritizes based on the order that destinations are listed in the queue configuration.    LOCATION -- FleetIQ prioritizes based on the provided order of locations, as defined in LocationOrder.   
    */
  var PriorityOrder: js.UndefOr[PriorityTypeList] = js.undefined
}
object PriorityConfiguration {
  
  inline def apply(): PriorityConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PriorityConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PriorityConfiguration] (val x: Self) extends AnyVal {
    
    inline def setLocationOrder(value: LocationList): Self = StObject.set(x, "LocationOrder", value.asInstanceOf[js.Any])
    
    inline def setLocationOrderUndefined: Self = StObject.set(x, "LocationOrder", js.undefined)
    
    inline def setLocationOrderVarargs(value: LocationStringModel*): Self = StObject.set(x, "LocationOrder", js.Array(value*))
    
    inline def setPriorityOrder(value: PriorityTypeList): Self = StObject.set(x, "PriorityOrder", value.asInstanceOf[js.Any])
    
    inline def setPriorityOrderUndefined: Self = StObject.set(x, "PriorityOrder", js.undefined)
    
    inline def setPriorityOrderVarargs(value: PriorityType*): Self = StObject.set(x, "PriorityOrder", js.Array(value*))
  }
}
