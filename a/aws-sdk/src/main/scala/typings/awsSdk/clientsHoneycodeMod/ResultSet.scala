package typings.awsSdk.clientsHoneycodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResultSet extends StObject {
  
  /**
    *  List of headers for all the data cells in the block. The header identifies the name and default format of the data cell. Data cells appear in the same order in all rows as defined in the header. The names and formats are not repeated in the rows. If a particular row does not have a value for a data cell, a blank value is used.   For example, a task list that displays the task name, due date and assigned person might have headers [ { "name": "Task Name"}, {"name": "Due Date", "format": "DATE"}, {"name": "Assigned", "format": "CONTACT"} ]. Every row in the result will have the task name as the first item, due date as the second item and assigned person as the third item. If a particular task does not have a due date, that row will still have a blank value in the second element and the assigned person will still be in the third element. 
    */
  var headers: ResultHeader
  
  /**
    *  List of rows returned by the request. Each row has a row Id and a list of data cells in that row. The data cells will be present in the same order as they are defined in the header. 
    */
  var rows: ResultRows
}
object ResultSet {
  
  inline def apply(headers: ResultHeader, rows: ResultRows): ResultSet = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultSet]
  }
  
  extension [Self <: ResultSet](x: Self) {
    
    inline def setHeaders(value: ResultHeader): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersVarargs(value: ColumnMetadata*): Self = StObject.set(x, "headers", js.Array(value*))
    
    inline def setRows(value: ResultRows): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsVarargs(value: ResultRow*): Self = StObject.set(x, "rows", js.Array(value*))
  }
}
