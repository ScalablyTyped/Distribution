package typings.awsSdk.clientsHoneycodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchUpsertTableRowsResult extends StObject {
  
  /**
    *  The list of batch items in the request that could not be updated or appended in the table. Each element in this list contains one item from the request that could not be updated in the table along with the reason why that item could not be updated or appended. 
    */
  var failedBatchItems: js.UndefOr[FailedBatchItems] = js.undefined
  
  /**
    *  A map with the batch item id as the key and the result of the upsert operation as the value. The result of the upsert operation specifies whether existing rows were updated or a new row was appended, along with the list of row ids that were affected. 
    */
  var rows: UpsertRowsResultMap
  
  /**
    * The updated workbook cursor after updating or appending rows in the table.
    */
  var workbookCursor: WorkbookCursor
}
object BatchUpsertTableRowsResult {
  
  inline def apply(rows: UpsertRowsResultMap, workbookCursor: WorkbookCursor): BatchUpsertTableRowsResult = {
    val __obj = js.Dynamic.literal(rows = rows.asInstanceOf[js.Any], workbookCursor = workbookCursor.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchUpsertTableRowsResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchUpsertTableRowsResult] (val x: Self) extends AnyVal {
    
    inline def setFailedBatchItems(value: FailedBatchItems): Self = StObject.set(x, "failedBatchItems", value.asInstanceOf[js.Any])
    
    inline def setFailedBatchItemsUndefined: Self = StObject.set(x, "failedBatchItems", js.undefined)
    
    inline def setFailedBatchItemsVarargs(value: FailedBatchItem*): Self = StObject.set(x, "failedBatchItems", js.Array(value*))
    
    inline def setRows(value: UpsertRowsResultMap): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setWorkbookCursor(value: WorkbookCursor): Self = StObject.set(x, "workbookCursor", value.asInstanceOf[js.Any])
  }
}
