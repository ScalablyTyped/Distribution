package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InventoryDeletionSummary extends StObject {
  
  /**
    * Remaining number of items to delete.
    */
  var RemainingCount: js.UndefOr[typings.awsSdk.clientsSsmMod.RemainingCount] = js.undefined
  
  /**
    * A list of counts and versions for deleted items.
    */
  var SummaryItems: js.UndefOr[InventoryDeletionSummaryItems] = js.undefined
  
  /**
    * The total number of items to delete. This count doesn't change during the delete operation.
    */
  var TotalCount: js.UndefOr[typings.awsSdk.clientsSsmMod.TotalCount] = js.undefined
}
object InventoryDeletionSummary {
  
  inline def apply(): InventoryDeletionSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InventoryDeletionSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InventoryDeletionSummary] (val x: Self) extends AnyVal {
    
    inline def setRemainingCount(value: RemainingCount): Self = StObject.set(x, "RemainingCount", value.asInstanceOf[js.Any])
    
    inline def setRemainingCountUndefined: Self = StObject.set(x, "RemainingCount", js.undefined)
    
    inline def setSummaryItems(value: InventoryDeletionSummaryItems): Self = StObject.set(x, "SummaryItems", value.asInstanceOf[js.Any])
    
    inline def setSummaryItemsUndefined: Self = StObject.set(x, "SummaryItems", js.undefined)
    
    inline def setSummaryItemsVarargs(value: InventoryDeletionSummaryItem*): Self = StObject.set(x, "SummaryItems", js.Array(value*))
    
    inline def setTotalCount(value: TotalCount): Self = StObject.set(x, "TotalCount", value.asInstanceOf[js.Any])
    
    inline def setTotalCountUndefined: Self = StObject.set(x, "TotalCount", js.undefined)
  }
}
