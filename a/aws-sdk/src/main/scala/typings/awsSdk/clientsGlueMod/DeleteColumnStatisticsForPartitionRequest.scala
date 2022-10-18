package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteColumnStatisticsForPartitionRequest extends StObject {
  
  /**
    * The ID of the Data Catalog where the partitions in question reside. If none is supplied, the Amazon Web Services account ID is used by default.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
  
  /**
    * Name of the column.
    */
  var ColumnName: NameString
  
  /**
    * The name of the catalog database where the partitions reside.
    */
  var DatabaseName: NameString
  
  /**
    * A list of partition values identifying the partition.
    */
  var PartitionValues: ValueStringList
  
  /**
    * The name of the partitions' table.
    */
  var TableName: NameString
}
object DeleteColumnStatisticsForPartitionRequest {
  
  inline def apply(
    ColumnName: NameString,
    DatabaseName: NameString,
    PartitionValues: ValueStringList,
    TableName: NameString
  ): DeleteColumnStatisticsForPartitionRequest = {
    val __obj = js.Dynamic.literal(ColumnName = ColumnName.asInstanceOf[js.Any], DatabaseName = DatabaseName.asInstanceOf[js.Any], PartitionValues = PartitionValues.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteColumnStatisticsForPartitionRequest]
  }
  
  extension [Self <: DeleteColumnStatisticsForPartitionRequest](x: Self) {
    
    inline def setCatalogId(value: CatalogIdString): Self = StObject.set(x, "CatalogId", value.asInstanceOf[js.Any])
    
    inline def setCatalogIdUndefined: Self = StObject.set(x, "CatalogId", js.undefined)
    
    inline def setColumnName(value: NameString): Self = StObject.set(x, "ColumnName", value.asInstanceOf[js.Any])
    
    inline def setDatabaseName(value: NameString): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
    
    inline def setPartitionValues(value: ValueStringList): Self = StObject.set(x, "PartitionValues", value.asInstanceOf[js.Any])
    
    inline def setPartitionValuesVarargs(value: ValueString*): Self = StObject.set(x, "PartitionValues", js.Array(value*))
    
    inline def setTableName(value: NameString): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
  }
}
