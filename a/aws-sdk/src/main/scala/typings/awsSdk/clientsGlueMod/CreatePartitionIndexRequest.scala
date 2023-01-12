package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatePartitionIndexRequest extends StObject {
  
  /**
    * The catalog ID where the table resides.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
  
  /**
    * Specifies the name of a database in which you want to create a partition index.
    */
  var DatabaseName: NameString
  
  /**
    * Specifies a PartitionIndex structure to create a partition index in an existing table.
    */
  var PartitionIndex: typings.awsSdk.clientsGlueMod.PartitionIndex
  
  /**
    * Specifies the name of a table in which you want to create a partition index.
    */
  var TableName: NameString
}
object CreatePartitionIndexRequest {
  
  inline def apply(DatabaseName: NameString, PartitionIndex: PartitionIndex, TableName: NameString): CreatePartitionIndexRequest = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName.asInstanceOf[js.Any], PartitionIndex = PartitionIndex.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePartitionIndexRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreatePartitionIndexRequest] (val x: Self) extends AnyVal {
    
    inline def setCatalogId(value: CatalogIdString): Self = StObject.set(x, "CatalogId", value.asInstanceOf[js.Any])
    
    inline def setCatalogIdUndefined: Self = StObject.set(x, "CatalogId", js.undefined)
    
    inline def setDatabaseName(value: NameString): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
    
    inline def setPartitionIndex(value: PartitionIndex): Self = StObject.set(x, "PartitionIndex", value.asInstanceOf[js.Any])
    
    inline def setTableName(value: NameString): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
  }
}
