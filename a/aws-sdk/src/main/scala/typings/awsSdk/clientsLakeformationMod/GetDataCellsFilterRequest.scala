package typings.awsSdk.clientsLakeformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDataCellsFilterRequest extends StObject {
  
  /**
    * A database in the Glue Data Catalog.
    */
  var DatabaseName: NameString
  
  /**
    * The name given by the user to the data filter cell.
    */
  var Name: NameString
  
  /**
    * The ID of the catalog to which the table belongs.
    */
  var TableCatalogId: CatalogIdString
  
  /**
    * A table in the database.
    */
  var TableName: NameString
}
object GetDataCellsFilterRequest {
  
  inline def apply(DatabaseName: NameString, Name: NameString, TableCatalogId: CatalogIdString, TableName: NameString): GetDataCellsFilterRequest = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], TableCatalogId = TableCatalogId.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDataCellsFilterRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetDataCellsFilterRequest] (val x: Self) extends AnyVal {
    
    inline def setDatabaseName(value: NameString): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
    
    inline def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setTableCatalogId(value: CatalogIdString): Self = StObject.set(x, "TableCatalogId", value.asInstanceOf[js.Any])
    
    inline def setTableName(value: NameString): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
  }
}
