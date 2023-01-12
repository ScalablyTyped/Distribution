package typings.awsSdk.clientsLakeformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableWithColumnsResource extends StObject {
  
  /**
    * The identifier for the Data Catalog. By default, it is the account ID of the caller.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
  
  /**
    * The list of column names for the table. At least one of ColumnNames or ColumnWildcard is required.
    */
  var ColumnNames: js.UndefOr[typings.awsSdk.clientsLakeformationMod.ColumnNames] = js.undefined
  
  /**
    * A wildcard specified by a ColumnWildcard object. At least one of ColumnNames or ColumnWildcard is required.
    */
  var ColumnWildcard: js.UndefOr[typings.awsSdk.clientsLakeformationMod.ColumnWildcard] = js.undefined
  
  /**
    * The name of the database for the table with columns resource. Unique to the Data Catalog. A database is a set of associated table definitions organized into a logical group. You can Grant and Revoke database privileges to a principal. 
    */
  var DatabaseName: NameString
  
  /**
    * The name of the table resource. A table is a metadata definition that represents your data. You can Grant and Revoke table privileges to a principal. 
    */
  var Name: NameString
}
object TableWithColumnsResource {
  
  inline def apply(DatabaseName: NameString, Name: NameString): TableWithColumnsResource = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableWithColumnsResource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TableWithColumnsResource] (val x: Self) extends AnyVal {
    
    inline def setCatalogId(value: CatalogIdString): Self = StObject.set(x, "CatalogId", value.asInstanceOf[js.Any])
    
    inline def setCatalogIdUndefined: Self = StObject.set(x, "CatalogId", js.undefined)
    
    inline def setColumnNames(value: ColumnNames): Self = StObject.set(x, "ColumnNames", value.asInstanceOf[js.Any])
    
    inline def setColumnNamesUndefined: Self = StObject.set(x, "ColumnNames", js.undefined)
    
    inline def setColumnNamesVarargs(value: NameString*): Self = StObject.set(x, "ColumnNames", js.Array(value*))
    
    inline def setColumnWildcard(value: ColumnWildcard): Self = StObject.set(x, "ColumnWildcard", value.asInstanceOf[js.Any])
    
    inline def setColumnWildcardUndefined: Self = StObject.set(x, "ColumnWildcard", js.undefined)
    
    inline def setDatabaseName(value: NameString): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
    
    inline def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
