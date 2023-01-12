package typings.awsSdk.clientsHoneycodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResultRow extends StObject {
  
  /**
    * List of all the data cells in a row.
    */
  var dataItems: DataItems
  
  /**
    * The ID for a particular row.
    */
  var rowId: js.UndefOr[RowId] = js.undefined
}
object ResultRow {
  
  inline def apply(dataItems: DataItems): ResultRow = {
    val __obj = js.Dynamic.literal(dataItems = dataItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultRow]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResultRow] (val x: Self) extends AnyVal {
    
    inline def setDataItems(value: DataItems): Self = StObject.set(x, "dataItems", value.asInstanceOf[js.Any])
    
    inline def setDataItemsVarargs(value: DataItem*): Self = StObject.set(x, "dataItems", js.Array(value*))
    
    inline def setRowId(value: RowId): Self = StObject.set(x, "rowId", value.asInstanceOf[js.Any])
    
    inline def setRowIdUndefined: Self = StObject.set(x, "rowId", js.undefined)
  }
}
