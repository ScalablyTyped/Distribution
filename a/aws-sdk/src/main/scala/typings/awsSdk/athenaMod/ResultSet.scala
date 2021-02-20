package typings.awsSdk.athenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResultSet extends StObject {
  
  /**
    * The metadata that describes the column structure and data types of a table of query results.
    */
  var ResultSetMetadata: js.UndefOr[typings.awsSdk.athenaMod.ResultSetMetadata] = js.native
  
  /**
    * The rows in the table.
    */
  var Rows: js.UndefOr[RowList] = js.native
}
object ResultSet {
  
  @scala.inline
  def apply(): ResultSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResultSet]
  }
  
  @scala.inline
  implicit class ResultSetMutableBuilder[Self <: ResultSet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResultSetMetadata(value: ResultSetMetadata): Self = StObject.set(x, "ResultSetMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultSetMetadataUndefined: Self = StObject.set(x, "ResultSetMetadata", js.undefined)
    
    @scala.inline
    def setRows(value: RowList): Self = StObject.set(x, "Rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsUndefined: Self = StObject.set(x, "Rows", js.undefined)
    
    @scala.inline
    def setRowsVarargs(value: Row*): Self = StObject.set(x, "Rows", js.Array(value :_*))
  }
}
