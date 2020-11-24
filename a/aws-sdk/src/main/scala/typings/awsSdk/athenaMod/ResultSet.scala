package typings.awsSdk.athenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResultSet extends js.Object {
  
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
  implicit class ResultSetOps[Self <: ResultSet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setResultSetMetadata(value: ResultSetMetadata): Self = this.set("ResultSetMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResultSetMetadata: Self = this.set("ResultSetMetadata", js.undefined)
    
    @scala.inline
    def setRowsVarargs(value: Row*): Self = this.set("Rows", js.Array(value :_*))
    
    @scala.inline
    def setRows(value: RowList): Self = this.set("Rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRows: Self = this.set("Rows", js.undefined)
  }
}
