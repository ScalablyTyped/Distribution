package typings.awsSdk.clientsRedshiftserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTableRestoreStatusResponse extends StObject {
  
  /**
    * If your initial ListTableRestoreStatus operation returns a nextToken, you can include the returned nextToken in following ListTableRestoreStatus operations. This will returns results on the next page.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * The array of returned TableRestoreStatus objects.
    */
  var tableRestoreStatuses: js.UndefOr[TableRestoreStatusList] = js.undefined
}
object ListTableRestoreStatusResponse {
  
  inline def apply(): ListTableRestoreStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTableRestoreStatusResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListTableRestoreStatusResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setTableRestoreStatuses(value: TableRestoreStatusList): Self = StObject.set(x, "tableRestoreStatuses", value.asInstanceOf[js.Any])
    
    inline def setTableRestoreStatusesUndefined: Self = StObject.set(x, "tableRestoreStatuses", js.undefined)
    
    inline def setTableRestoreStatusesVarargs(value: TableRestoreStatus*): Self = StObject.set(x, "tableRestoreStatuses", js.Array(value*))
  }
}
