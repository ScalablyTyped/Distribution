package typings.awsSdk.clientsAthenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResultSet extends StObject {
  
  /**
    * The metadata that describes the column structure and data types of a table of query results.
    */
  var ResultSetMetadata: js.UndefOr[typings.awsSdk.clientsAthenaMod.ResultSetMetadata] = js.undefined
  
  /**
    * The rows in the table.
    */
  var Rows: js.UndefOr[RowList] = js.undefined
}
object ResultSet {
  
  inline def apply(): ResultSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResultSet]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResultSet] (val x: Self) extends AnyVal {
    
    inline def setResultSetMetadata(value: ResultSetMetadata): Self = StObject.set(x, "ResultSetMetadata", value.asInstanceOf[js.Any])
    
    inline def setResultSetMetadataUndefined: Self = StObject.set(x, "ResultSetMetadata", js.undefined)
    
    inline def setRows(value: RowList): Self = StObject.set(x, "Rows", value.asInstanceOf[js.Any])
    
    inline def setRowsUndefined: Self = StObject.set(x, "Rows", js.undefined)
    
    inline def setRowsVarargs(value: Row*): Self = StObject.set(x, "Rows", js.Array(value*))
  }
}
