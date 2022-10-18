package typings.awsSdk.clientsLakeformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTableStorageOptimizersRequest extends StObject {
  
  /**
    * The Catalog ID of the table.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
  
  /**
    * Name of the database where the table is present.
    */
  var DatabaseName: NameString
  
  /**
    * The number of storage optimizers to return on each call.
    */
  var MaxResults: js.UndefOr[PageSize] = js.undefined
  
  /**
    * A continuation token, if this is a continuation call.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
  
  /**
    * The specific type of storage optimizers to list. The supported value is compaction.
    */
  var StorageOptimizerType: js.UndefOr[OptimizerType] = js.undefined
  
  /**
    * Name of the table.
    */
  var TableName: NameString
}
object ListTableStorageOptimizersRequest {
  
  inline def apply(DatabaseName: NameString, TableName: NameString): ListTableStorageOptimizersRequest = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTableStorageOptimizersRequest]
  }
  
  extension [Self <: ListTableStorageOptimizersRequest](x: Self) {
    
    inline def setCatalogId(value: CatalogIdString): Self = StObject.set(x, "CatalogId", value.asInstanceOf[js.Any])
    
    inline def setCatalogIdUndefined: Self = StObject.set(x, "CatalogId", js.undefined)
    
    inline def setDatabaseName(value: NameString): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: PageSize): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setStorageOptimizerType(value: OptimizerType): Self = StObject.set(x, "StorageOptimizerType", value.asInstanceOf[js.Any])
    
    inline def setStorageOptimizerTypeUndefined: Self = StObject.set(x, "StorageOptimizerType", js.undefined)
    
    inline def setTableName(value: NameString): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
  }
}
