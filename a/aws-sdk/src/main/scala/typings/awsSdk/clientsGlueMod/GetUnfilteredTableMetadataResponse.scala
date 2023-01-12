package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetUnfilteredTableMetadataResponse extends StObject {
  
  var AuthorizedColumns: js.UndefOr[NameStringList] = js.undefined
  
  var CellFilters: js.UndefOr[ColumnRowFilterList] = js.undefined
  
  var IsRegisteredWithLakeFormation: js.UndefOr[Boolean] = js.undefined
  
  var Table: js.UndefOr[typings.awsSdk.clientsGlueMod.Table] = js.undefined
}
object GetUnfilteredTableMetadataResponse {
  
  inline def apply(): GetUnfilteredTableMetadataResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetUnfilteredTableMetadataResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetUnfilteredTableMetadataResponse] (val x: Self) extends AnyVal {
    
    inline def setAuthorizedColumns(value: NameStringList): Self = StObject.set(x, "AuthorizedColumns", value.asInstanceOf[js.Any])
    
    inline def setAuthorizedColumnsUndefined: Self = StObject.set(x, "AuthorizedColumns", js.undefined)
    
    inline def setAuthorizedColumnsVarargs(value: NameString*): Self = StObject.set(x, "AuthorizedColumns", js.Array(value*))
    
    inline def setCellFilters(value: ColumnRowFilterList): Self = StObject.set(x, "CellFilters", value.asInstanceOf[js.Any])
    
    inline def setCellFiltersUndefined: Self = StObject.set(x, "CellFilters", js.undefined)
    
    inline def setCellFiltersVarargs(value: ColumnRowFilter*): Self = StObject.set(x, "CellFilters", js.Array(value*))
    
    inline def setIsRegisteredWithLakeFormation(value: Boolean): Self = StObject.set(x, "IsRegisteredWithLakeFormation", value.asInstanceOf[js.Any])
    
    inline def setIsRegisteredWithLakeFormationUndefined: Self = StObject.set(x, "IsRegisteredWithLakeFormation", js.undefined)
    
    inline def setTable(value: Table): Self = StObject.set(x, "Table", value.asInstanceOf[js.Any])
    
    inline def setTableUndefined: Self = StObject.set(x, "Table", js.undefined)
  }
}
