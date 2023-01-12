package typings.awsSdk.clientsHoneycodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpsertRowData extends StObject {
  
  /**
    *  An external identifier that represents a single item in the request that is being upserted as part of the BatchUpsertTableRows request. This can be any string that you can use to identify the item in the request. The BatchUpsertTableRows API puts the batch item id in the results to allow you to link data in the request to data in the results. 
    */
  var batchItemId: BatchItemId
  
  /**
    *  A map representing the cells to update for the matching rows or an appended row. The key is the column id of the cell and the value is the CellInput object that represents the data to set in that cell. 
    */
  var cellsToUpdate: RowDataInput
  
  /**
    *  The filter formula to use to find existing matching rows to update. The formula needs to return zero or more rows. If the formula returns 0 rows, then a new row will be appended in the target table. If the formula returns one or more rows, then the returned rows will be updated.   Note that the filter formula needs to return rows from the target table for the upsert operation to succeed. If the filter formula has a syntax error or it doesn't evaluate to zero or more rows in the target table for any one item in the input list, then the entire BatchUpsertTableRows request fails and no updates are made to the table. 
    */
  var filter: Filter
}
object UpsertRowData {
  
  inline def apply(batchItemId: BatchItemId, cellsToUpdate: RowDataInput, filter: Filter): UpsertRowData = {
    val __obj = js.Dynamic.literal(batchItemId = batchItemId.asInstanceOf[js.Any], cellsToUpdate = cellsToUpdate.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpsertRowData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpsertRowData] (val x: Self) extends AnyVal {
    
    inline def setBatchItemId(value: BatchItemId): Self = StObject.set(x, "batchItemId", value.asInstanceOf[js.Any])
    
    inline def setCellsToUpdate(value: RowDataInput): Self = StObject.set(x, "cellsToUpdate", value.asInstanceOf[js.Any])
    
    inline def setFilter(value: Filter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
  }
}
