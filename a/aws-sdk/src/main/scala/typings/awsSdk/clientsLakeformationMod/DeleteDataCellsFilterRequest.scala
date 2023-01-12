package typings.awsSdk.clientsLakeformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDataCellsFilterRequest extends StObject {
  
  /**
    * A database in the Glue Data Catalog.
    */
  var DatabaseName: js.UndefOr[NameString] = js.undefined
  
  /**
    * The name given by the user to the data filter cell.
    */
  var Name: js.UndefOr[NameString] = js.undefined
  
  /**
    * The ID of the catalog to which the table belongs.
    */
  var TableCatalogId: js.UndefOr[CatalogIdString] = js.undefined
  
  /**
    * A table in the database.
    */
  var TableName: js.UndefOr[NameString] = js.undefined
}
object DeleteDataCellsFilterRequest {
  
  inline def apply(): DeleteDataCellsFilterRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteDataCellsFilterRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteDataCellsFilterRequest] (val x: Self) extends AnyVal {
    
    inline def setDatabaseName(value: NameString): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
    
    inline def setDatabaseNameUndefined: Self = StObject.set(x, "DatabaseName", js.undefined)
    
    inline def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setTableCatalogId(value: CatalogIdString): Self = StObject.set(x, "TableCatalogId", value.asInstanceOf[js.Any])
    
    inline def setTableCatalogIdUndefined: Self = StObject.set(x, "TableCatalogId", js.undefined)
    
    inline def setTableName(value: NameString): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    
    inline def setTableNameUndefined: Self = StObject.set(x, "TableName", js.undefined)
  }
}
