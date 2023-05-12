package typings.awsSdk.clientsIottwinmakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecuteQueryResponse extends StObject {
  
  /**
    * A list of ColumnDescription objects.
    */
  var columnDescriptions: js.UndefOr[ColumnDescriptions] = js.undefined
  
  /**
    * The string that specifies the next page of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * Represents a single row in the query results.
    */
  var rows: js.UndefOr[Rows] = js.undefined
}
object ExecuteQueryResponse {
  
  inline def apply(): ExecuteQueryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecuteQueryResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExecuteQueryResponse] (val x: Self) extends AnyVal {
    
    inline def setColumnDescriptions(value: ColumnDescriptions): Self = StObject.set(x, "columnDescriptions", value.asInstanceOf[js.Any])
    
    inline def setColumnDescriptionsUndefined: Self = StObject.set(x, "columnDescriptions", js.undefined)
    
    inline def setColumnDescriptionsVarargs(value: ColumnDescription*): Self = StObject.set(x, "columnDescriptions", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setRows(value: Rows): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    inline def setRowsVarargs(value: Row*): Self = StObject.set(x, "rows", js.Array(value*))
  }
}
