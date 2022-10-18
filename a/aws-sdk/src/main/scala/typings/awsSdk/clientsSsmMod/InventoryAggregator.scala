package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InventoryAggregator extends StObject {
  
  /**
    * Nested aggregators to further refine aggregation for an inventory type.
    */
  var Aggregators: js.UndefOr[InventoryAggregatorList] = js.undefined
  
  /**
    * The inventory type and attribute name for aggregation.
    */
  var Expression: js.UndefOr[InventoryAggregatorExpression] = js.undefined
  
  /**
    * A user-defined set of one or more filters on which to aggregate inventory data. Groups return a count of resources that match and don't match the specified criteria.
    */
  var Groups: js.UndefOr[InventoryGroupList] = js.undefined
}
object InventoryAggregator {
  
  inline def apply(): InventoryAggregator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InventoryAggregator]
  }
  
  extension [Self <: InventoryAggregator](x: Self) {
    
    inline def setAggregators(value: InventoryAggregatorList): Self = StObject.set(x, "Aggregators", value.asInstanceOf[js.Any])
    
    inline def setAggregatorsUndefined: Self = StObject.set(x, "Aggregators", js.undefined)
    
    inline def setAggregatorsVarargs(value: InventoryAggregator*): Self = StObject.set(x, "Aggregators", js.Array(value*))
    
    inline def setExpression(value: InventoryAggregatorExpression): Self = StObject.set(x, "Expression", value.asInstanceOf[js.Any])
    
    inline def setExpressionUndefined: Self = StObject.set(x, "Expression", js.undefined)
    
    inline def setGroups(value: InventoryGroupList): Self = StObject.set(x, "Groups", value.asInstanceOf[js.Any])
    
    inline def setGroupsUndefined: Self = StObject.set(x, "Groups", js.undefined)
    
    inline def setGroupsVarargs(value: InventoryGroup*): Self = StObject.set(x, "Groups", js.Array(value*))
  }
}
