package typings.awsSdk.clientsLakeformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataCellsFilter extends StObject {
  
  /**
    * A list of column names.
    */
  var ColumnNames: js.UndefOr[typings.awsSdk.clientsLakeformationMod.ColumnNames] = js.undefined
  
  /**
    * A wildcard with exclusions. You must specify either a ColumnNames list or the ColumnWildCard. 
    */
  var ColumnWildcard: js.UndefOr[typings.awsSdk.clientsLakeformationMod.ColumnWildcard] = js.undefined
  
  /**
    * A database in the Glue Data Catalog.
    */
  var DatabaseName: NameString
  
  /**
    * The name given by the user to the data filter cell.
    */
  var Name: NameString
  
  /**
    * A PartiQL predicate.
    */
  var RowFilter: js.UndefOr[typings.awsSdk.clientsLakeformationMod.RowFilter] = js.undefined
  
  /**
    * The ID of the catalog to which the table belongs.
    */
  var TableCatalogId: CatalogIdString
  
  /**
    * A table in the database.
    */
  var TableName: NameString
}
object DataCellsFilter {
  
  inline def apply(DatabaseName: NameString, Name: NameString, TableCatalogId: CatalogIdString, TableName: NameString): DataCellsFilter = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], TableCatalogId = TableCatalogId.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataCellsFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataCellsFilter] (val x: Self) extends AnyVal {
    
    inline def setColumnNames(value: ColumnNames): Self = StObject.set(x, "ColumnNames", value.asInstanceOf[js.Any])
    
    inline def setColumnNamesUndefined: Self = StObject.set(x, "ColumnNames", js.undefined)
    
    inline def setColumnNamesVarargs(value: NameString*): Self = StObject.set(x, "ColumnNames", js.Array(value*))
    
    inline def setColumnWildcard(value: ColumnWildcard): Self = StObject.set(x, "ColumnWildcard", value.asInstanceOf[js.Any])
    
    inline def setColumnWildcardUndefined: Self = StObject.set(x, "ColumnWildcard", js.undefined)
    
    inline def setDatabaseName(value: NameString): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
    
    inline def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setRowFilter(value: RowFilter): Self = StObject.set(x, "RowFilter", value.asInstanceOf[js.Any])
    
    inline def setRowFilterUndefined: Self = StObject.set(x, "RowFilter", js.undefined)
    
    inline def setTableCatalogId(value: CatalogIdString): Self = StObject.set(x, "TableCatalogId", value.asInstanceOf[js.Any])
    
    inline def setTableName(value: NameString): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
  }
}
