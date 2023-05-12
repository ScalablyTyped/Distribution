package typings.awsSdk.clientsLakeformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDataCellsFilterResponse extends StObject {
  
  /**
    * A structure that describes certain columns on certain rows.
    */
  var DataCellsFilter: js.UndefOr[typings.awsSdk.clientsLakeformationMod.DataCellsFilter] = js.undefined
}
object GetDataCellsFilterResponse {
  
  inline def apply(): GetDataCellsFilterResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDataCellsFilterResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetDataCellsFilterResponse] (val x: Self) extends AnyVal {
    
    inline def setDataCellsFilter(value: DataCellsFilter): Self = StObject.set(x, "DataCellsFilter", value.asInstanceOf[js.Any])
    
    inline def setDataCellsFilterUndefined: Self = StObject.set(x, "DataCellsFilter", js.undefined)
  }
}
