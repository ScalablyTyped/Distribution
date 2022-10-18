package typings.awsSdk.clientsHoneycodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchDeleteTableRowsResult extends StObject {
  
  /**
    *  The list of row ids in the request that could not be deleted from the table. Each element in this list contains one row id from the request that could not be deleted along with the reason why that item could not be deleted. 
    */
  var failedBatchItems: js.UndefOr[FailedBatchItems] = js.undefined
  
  /**
    * The updated workbook cursor after deleting the rows from the table.
    */
  var workbookCursor: WorkbookCursor
}
object BatchDeleteTableRowsResult {
  
  inline def apply(workbookCursor: WorkbookCursor): BatchDeleteTableRowsResult = {
    val __obj = js.Dynamic.literal(workbookCursor = workbookCursor.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDeleteTableRowsResult]
  }
  
  extension [Self <: BatchDeleteTableRowsResult](x: Self) {
    
    inline def setFailedBatchItems(value: FailedBatchItems): Self = StObject.set(x, "failedBatchItems", value.asInstanceOf[js.Any])
    
    inline def setFailedBatchItemsUndefined: Self = StObject.set(x, "failedBatchItems", js.undefined)
    
    inline def setFailedBatchItemsVarargs(value: FailedBatchItem*): Self = StObject.set(x, "failedBatchItems", js.Array(value*))
    
    inline def setWorkbookCursor(value: WorkbookCursor): Self = StObject.set(x, "workbookCursor", value.asInstanceOf[js.Any])
  }
}
