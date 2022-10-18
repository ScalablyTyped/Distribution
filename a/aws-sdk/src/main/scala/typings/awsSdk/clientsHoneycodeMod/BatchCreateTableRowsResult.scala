package typings.awsSdk.clientsHoneycodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchCreateTableRowsResult extends StObject {
  
  /**
    * The map of batch item id to the row id that was created for that item.
    */
  var createdRows: CreatedRowsMap
  
  /**
    *  The list of batch items in the request that could not be added to the table. Each element in this list contains one item from the request that could not be added to the table along with the reason why that item could not be added. 
    */
  var failedBatchItems: js.UndefOr[FailedBatchItems] = js.undefined
  
  /**
    * The updated workbook cursor after adding the new rows at the end of the table.
    */
  var workbookCursor: WorkbookCursor
}
object BatchCreateTableRowsResult {
  
  inline def apply(createdRows: CreatedRowsMap, workbookCursor: WorkbookCursor): BatchCreateTableRowsResult = {
    val __obj = js.Dynamic.literal(createdRows = createdRows.asInstanceOf[js.Any], workbookCursor = workbookCursor.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchCreateTableRowsResult]
  }
  
  extension [Self <: BatchCreateTableRowsResult](x: Self) {
    
    inline def setCreatedRows(value: CreatedRowsMap): Self = StObject.set(x, "createdRows", value.asInstanceOf[js.Any])
    
    inline def setFailedBatchItems(value: FailedBatchItems): Self = StObject.set(x, "failedBatchItems", value.asInstanceOf[js.Any])
    
    inline def setFailedBatchItemsUndefined: Self = StObject.set(x, "failedBatchItems", js.undefined)
    
    inline def setFailedBatchItemsVarargs(value: FailedBatchItem*): Self = StObject.set(x, "failedBatchItems", js.Array(value*))
    
    inline def setWorkbookCursor(value: WorkbookCursor): Self = StObject.set(x, "workbookCursor", value.asInstanceOf[js.Any])
  }
}
