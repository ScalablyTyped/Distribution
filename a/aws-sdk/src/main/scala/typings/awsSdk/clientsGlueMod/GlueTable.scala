package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlueTable extends StObject {
  
  /**
    * A unique identifier for the Glue Data Catalog.
    */
  var CatalogId: js.UndefOr[NameString] = js.undefined
  
  /**
    * The name of the connection to the Glue Data Catalog.
    */
  var ConnectionName: js.UndefOr[NameString] = js.undefined
  
  /**
    * A database name in the Glue Data Catalog.
    */
  var DatabaseName: NameString
  
  /**
    * A table name in the Glue Data Catalog.
    */
  var TableName: NameString
}
object GlueTable {
  
  inline def apply(DatabaseName: NameString, TableName: NameString): GlueTable = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlueTable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GlueTable] (val x: Self) extends AnyVal {
    
    inline def setCatalogId(value: NameString): Self = StObject.set(x, "CatalogId", value.asInstanceOf[js.Any])
    
    inline def setCatalogIdUndefined: Self = StObject.set(x, "CatalogId", js.undefined)
    
    inline def setConnectionName(value: NameString): Self = StObject.set(x, "ConnectionName", value.asInstanceOf[js.Any])
    
    inline def setConnectionNameUndefined: Self = StObject.set(x, "ConnectionName", js.undefined)
    
    inline def setDatabaseName(value: NameString): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
    
    inline def setTableName(value: NameString): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
  }
}
