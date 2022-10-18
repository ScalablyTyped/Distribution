package typings.awsSdk.clientsLakeformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDataCellsFilterResponse extends StObject {
  
  /**
    * A list of DataCellFilter structures.
    */
  var DataCellsFilters: js.UndefOr[DataCellsFilterList] = js.undefined
  
  /**
    * A continuation token, if not all requested data cell filters have been returned.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
}
object ListDataCellsFilterResponse {
  
  inline def apply(): ListDataCellsFilterResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDataCellsFilterResponse]
  }
  
  extension [Self <: ListDataCellsFilterResponse](x: Self) {
    
    inline def setDataCellsFilters(value: DataCellsFilterList): Self = StObject.set(x, "DataCellsFilters", value.asInstanceOf[js.Any])
    
    inline def setDataCellsFiltersUndefined: Self = StObject.set(x, "DataCellsFilters", js.undefined)
    
    inline def setDataCellsFiltersVarargs(value: DataCellsFilter*): Self = StObject.set(x, "DataCellsFilters", js.Array(value*))
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
