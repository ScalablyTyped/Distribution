package typings.awsSdk.clientsHoneycodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTableColumnsResult extends StObject {
  
  /**
    *  Provides the pagination token to load the next page if there are more results matching the request. If a pagination token is not present in the response, it means that all data matching the request has been loaded. 
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    *  The list of columns in the table. 
    */
  var tableColumns: TableColumns
  
  /**
    *  Indicates the cursor of the workbook at which the data returned by this request is read. Workbook cursor keeps increasing with every update and the increments are not sequential. 
    */
  var workbookCursor: js.UndefOr[WorkbookCursor] = js.undefined
}
object ListTableColumnsResult {
  
  inline def apply(tableColumns: TableColumns): ListTableColumnsResult = {
    val __obj = js.Dynamic.literal(tableColumns = tableColumns.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTableColumnsResult]
  }
  
  extension [Self <: ListTableColumnsResult](x: Self) {
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setTableColumns(value: TableColumns): Self = StObject.set(x, "tableColumns", value.asInstanceOf[js.Any])
    
    inline def setTableColumnsVarargs(value: TableColumn*): Self = StObject.set(x, "tableColumns", js.Array(value*))
    
    inline def setWorkbookCursor(value: WorkbookCursor): Self = StObject.set(x, "workbookCursor", value.asInstanceOf[js.Any])
    
    inline def setWorkbookCursorUndefined: Self = StObject.set(x, "workbookCursor", js.undefined)
  }
}
