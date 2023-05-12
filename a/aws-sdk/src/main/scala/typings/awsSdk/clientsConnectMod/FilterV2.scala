package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterV2 extends StObject {
  
  /**
    * The key to use for filtering data. For example, QUEUE, ROUTING_PROFILE, AGENT, CHANNEL, AGENT_HIERARCHY_LEVEL_ONE, AGENT_HIERARCHY_LEVEL_TWO, AGENT_HIERARCHY_LEVEL_THREE, AGENT_HIERARCHY_LEVEL_FOUR, AGENT_HIERARCHY_LEVEL_FIVE. There must be at least 1 key and a maximum 5 keys. 
    */
  var FilterKey: js.UndefOr[ResourceArnOrId] = js.undefined
  
  /**
    * The identifiers to use for filtering data. For example, if you have a filter key of QUEUE, you would add queue IDs or ARNs in FilterValues. 
    */
  var FilterValues: js.UndefOr[FilterValueList] = js.undefined
}
object FilterV2 {
  
  inline def apply(): FilterV2 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterV2]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FilterV2] (val x: Self) extends AnyVal {
    
    inline def setFilterKey(value: ResourceArnOrId): Self = StObject.set(x, "FilterKey", value.asInstanceOf[js.Any])
    
    inline def setFilterKeyUndefined: Self = StObject.set(x, "FilterKey", js.undefined)
    
    inline def setFilterValues(value: FilterValueList): Self = StObject.set(x, "FilterValues", value.asInstanceOf[js.Any])
    
    inline def setFilterValuesUndefined: Self = StObject.set(x, "FilterValues", js.undefined)
    
    inline def setFilterValuesVarargs(value: ResourceArnOrId*): Self = StObject.set(x, "FilterValues", js.Array(value*))
  }
}
