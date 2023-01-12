package typings.awsSdk.clientsDatabrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataCatalogInputDefinition extends StObject {
  
  /**
    * The unique identifier of the Amazon Web Services account that holds the Data Catalog that stores the data.
    */
  var CatalogId: js.UndefOr[typings.awsSdk.clientsDatabrewMod.CatalogId] = js.undefined
  
  /**
    * The name of a database in the Data Catalog.
    */
  var DatabaseName: typings.awsSdk.clientsDatabrewMod.DatabaseName
  
  /**
    * The name of a database table in the Data Catalog. This table corresponds to a DataBrew dataset.
    */
  var TableName: typings.awsSdk.clientsDatabrewMod.TableName
  
  /**
    * Represents an Amazon location where DataBrew can store intermediate results.
    */
  var TempDirectory: js.UndefOr[S3Location] = js.undefined
}
object DataCatalogInputDefinition {
  
  inline def apply(DatabaseName: DatabaseName, TableName: TableName): DataCatalogInputDefinition = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataCatalogInputDefinition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataCatalogInputDefinition] (val x: Self) extends AnyVal {
    
    inline def setCatalogId(value: CatalogId): Self = StObject.set(x, "CatalogId", value.asInstanceOf[js.Any])
    
    inline def setCatalogIdUndefined: Self = StObject.set(x, "CatalogId", js.undefined)
    
    inline def setDatabaseName(value: DatabaseName): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
    
    inline def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    
    inline def setTempDirectory(value: S3Location): Self = StObject.set(x, "TempDirectory", value.asInstanceOf[js.Any])
    
    inline def setTempDirectoryUndefined: Self = StObject.set(x, "TempDirectory", js.undefined)
  }
}
