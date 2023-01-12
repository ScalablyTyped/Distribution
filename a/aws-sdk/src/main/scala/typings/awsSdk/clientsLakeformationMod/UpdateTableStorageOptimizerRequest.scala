package typings.awsSdk.clientsLakeformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateTableStorageOptimizerRequest extends StObject {
  
  /**
    * The Catalog ID of the table.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
  
  /**
    * Name of the database where the table is present.
    */
  var DatabaseName: NameString
  
  /**
    * Name of the table for which to enable the storage optimizer.
    */
  var StorageOptimizerConfig: StorageOptimizerConfigMap
  
  /**
    * Name of the table for which to enable the storage optimizer.
    */
  var TableName: NameString
}
object UpdateTableStorageOptimizerRequest {
  
  inline def apply(DatabaseName: NameString, StorageOptimizerConfig: StorageOptimizerConfigMap, TableName: NameString): UpdateTableStorageOptimizerRequest = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName.asInstanceOf[js.Any], StorageOptimizerConfig = StorageOptimizerConfig.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTableStorageOptimizerRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateTableStorageOptimizerRequest] (val x: Self) extends AnyVal {
    
    inline def setCatalogId(value: CatalogIdString): Self = StObject.set(x, "CatalogId", value.asInstanceOf[js.Any])
    
    inline def setCatalogIdUndefined: Self = StObject.set(x, "CatalogId", js.undefined)
    
    inline def setDatabaseName(value: NameString): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
    
    inline def setStorageOptimizerConfig(value: StorageOptimizerConfigMap): Self = StObject.set(x, "StorageOptimizerConfig", value.asInstanceOf[js.Any])
    
    inline def setTableName(value: NameString): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
  }
}
