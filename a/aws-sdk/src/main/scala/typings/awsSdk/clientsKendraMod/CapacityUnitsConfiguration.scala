package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CapacityUnitsConfiguration extends StObject {
  
  /**
    * The amount of extra query capacity for an index and GetQuerySuggestions capacity. A single extra capacity unit for an index provides 0.1 queries per second or approximately 8,000 queries per day. You can add up to 100 extra capacity units.  GetQuerySuggestions capacity is five times the provisioned query capacity for an index, or the base capacity of 2.5 calls per second, whichever is higher. For example, the base capacity for an index is 0.1 queries per second, and GetQuerySuggestions capacity has a base of 2.5 calls per second. If you add another 0.1 queries per second to total 0.2 queries per second for an index, the GetQuerySuggestions capacity is 2.5 calls per second (higher than five times 0.2 queries per second).
    */
  var QueryCapacityUnits: QueryCapacityUnit
  
  /**
    * The amount of extra storage capacity for an index. A single capacity unit provides 30 GB of storage space or 100,000 documents, whichever is reached first. You can add up to 100 extra capacity units.
    */
  var StorageCapacityUnits: StorageCapacityUnit
}
object CapacityUnitsConfiguration {
  
  inline def apply(QueryCapacityUnits: QueryCapacityUnit, StorageCapacityUnits: StorageCapacityUnit): CapacityUnitsConfiguration = {
    val __obj = js.Dynamic.literal(QueryCapacityUnits = QueryCapacityUnits.asInstanceOf[js.Any], StorageCapacityUnits = StorageCapacityUnits.asInstanceOf[js.Any])
    __obj.asInstanceOf[CapacityUnitsConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CapacityUnitsConfiguration] (val x: Self) extends AnyVal {
    
    inline def setQueryCapacityUnits(value: QueryCapacityUnit): Self = StObject.set(x, "QueryCapacityUnits", value.asInstanceOf[js.Any])
    
    inline def setStorageCapacityUnits(value: StorageCapacityUnit): Self = StObject.set(x, "StorageCapacityUnits", value.asInstanceOf[js.Any])
  }
}
