package typings.awsSdk.clientsLakeformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDataCellsFilterRequest extends StObject {
  
  /**
    * A DataCellsFilter structure containing information about the data cells filter.
    */
  var TableData: DataCellsFilter
}
object UpdateDataCellsFilterRequest {
  
  inline def apply(TableData: DataCellsFilter): UpdateDataCellsFilterRequest = {
    val __obj = js.Dynamic.literal(TableData = TableData.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDataCellsFilterRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateDataCellsFilterRequest] (val x: Self) extends AnyVal {
    
    inline def setTableData(value: DataCellsFilter): Self = StObject.set(x, "TableData", value.asInstanceOf[js.Any])
  }
}
