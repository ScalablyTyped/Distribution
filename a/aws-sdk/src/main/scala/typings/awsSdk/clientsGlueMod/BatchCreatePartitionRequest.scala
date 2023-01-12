package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchCreatePartitionRequest extends StObject {
  
  /**
    * The ID of the catalog in which the partition is to be created. Currently, this should be the Amazon Web Services account ID.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
  
  /**
    * The name of the metadata database in which the partition is to be created.
    */
  var DatabaseName: NameString
  
  /**
    * A list of PartitionInput structures that define the partitions to be created.
    */
  var PartitionInputList: typings.awsSdk.clientsGlueMod.PartitionInputList
  
  /**
    * The name of the metadata table in which the partition is to be created.
    */
  var TableName: NameString
}
object BatchCreatePartitionRequest {
  
  inline def apply(DatabaseName: NameString, PartitionInputList: PartitionInputList, TableName: NameString): BatchCreatePartitionRequest = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName.asInstanceOf[js.Any], PartitionInputList = PartitionInputList.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchCreatePartitionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchCreatePartitionRequest] (val x: Self) extends AnyVal {
    
    inline def setCatalogId(value: CatalogIdString): Self = StObject.set(x, "CatalogId", value.asInstanceOf[js.Any])
    
    inline def setCatalogIdUndefined: Self = StObject.set(x, "CatalogId", js.undefined)
    
    inline def setDatabaseName(value: NameString): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
    
    inline def setPartitionInputList(value: PartitionInputList): Self = StObject.set(x, "PartitionInputList", value.asInstanceOf[js.Any])
    
    inline def setPartitionInputListVarargs(value: PartitionInput*): Self = StObject.set(x, "PartitionInputList", js.Array(value*))
    
    inline def setTableName(value: NameString): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
  }
}
