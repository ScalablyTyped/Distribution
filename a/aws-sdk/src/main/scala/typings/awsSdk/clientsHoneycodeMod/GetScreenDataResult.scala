package typings.awsSdk.clientsHoneycodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetScreenDataResult extends StObject {
  
  /**
    *  Provides the pagination token to load the next page if there are more results matching the request. If a pagination token is not present in the response, it means that all data matching the query has been loaded. 
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * A map of all the rows on the screen keyed by block name.
    */
  var results: ResultSetMap
  
  /**
    *  Indicates the cursor of the workbook at which the data returned by this workbook is read. Workbook cursor keeps increasing with every update and the increments are not sequential. 
    */
  var workbookCursor: WorkbookCursor
}
object GetScreenDataResult {
  
  inline def apply(results: ResultSetMap, workbookCursor: WorkbookCursor): GetScreenDataResult = {
    val __obj = js.Dynamic.literal(results = results.asInstanceOf[js.Any], workbookCursor = workbookCursor.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetScreenDataResult]
  }
  
  extension [Self <: GetScreenDataResult](x: Self) {
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setResults(value: ResultSetMap): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setWorkbookCursor(value: WorkbookCursor): Self = StObject.set(x, "workbookCursor", value.asInstanceOf[js.Any])
  }
}
