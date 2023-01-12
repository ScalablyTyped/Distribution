package typings.awsSdk.clientsHoneycodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchUpdateTableRowsResult extends StObject {
  
  /**
    *  The list of batch items in the request that could not be updated in the table. Each element in this list contains one item from the request that could not be updated in the table along with the reason why that item could not be updated. 
    */
  var failedBatchItems: js.UndefOr[FailedBatchItems] = js.undefined
  
  /**
    * The updated workbook cursor after adding the new rows at the end of the table.
    */
  var workbookCursor: WorkbookCursor
}
object BatchUpdateTableRowsResult {
  
  inline def apply(workbookCursor: WorkbookCursor): BatchUpdateTableRowsResult = {
    val __obj = js.Dynamic.literal(workbookCursor = workbookCursor.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchUpdateTableRowsResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchUpdateTableRowsResult] (val x: Self) extends AnyVal {
    
    inline def setFailedBatchItems(value: FailedBatchItems): Self = StObject.set(x, "failedBatchItems", value.asInstanceOf[js.Any])
    
    inline def setFailedBatchItemsUndefined: Self = StObject.set(x, "failedBatchItems", js.undefined)
    
    inline def setFailedBatchItemsVarargs(value: FailedBatchItem*): Self = StObject.set(x, "failedBatchItems", js.Array(value*))
    
    inline def setWorkbookCursor(value: WorkbookCursor): Self = StObject.set(x, "workbookCursor", value.asInstanceOf[js.Any])
  }
}
