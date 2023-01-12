package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataCatalogConfig extends StObject {
  
  /**
    * The name of the Glue table catalog.
    */
  var Catalog: typings.awsSdk.clientsSagemakerMod.Catalog
  
  /**
    * The name of the Glue table database.
    */
  var Database: typings.awsSdk.clientsSagemakerMod.Database
  
  /**
    * The name of the Glue table.
    */
  var TableName: typings.awsSdk.clientsSagemakerMod.TableName
}
object DataCatalogConfig {
  
  inline def apply(Catalog: Catalog, Database: Database, TableName: TableName): DataCatalogConfig = {
    val __obj = js.Dynamic.literal(Catalog = Catalog.asInstanceOf[js.Any], Database = Database.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataCatalogConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataCatalogConfig] (val x: Self) extends AnyVal {
    
    inline def setCatalog(value: Catalog): Self = StObject.set(x, "Catalog", value.asInstanceOf[js.Any])
    
    inline def setDatabase(value: Database): Self = StObject.set(x, "Database", value.asInstanceOf[js.Any])
    
    inline def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
  }
}
