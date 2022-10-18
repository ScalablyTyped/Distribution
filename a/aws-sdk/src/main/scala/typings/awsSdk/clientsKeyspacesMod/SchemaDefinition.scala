package typings.awsSdk.clientsKeyspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDefinition extends StObject {
  
  /**
    * The regular columns of the table.
    */
  var allColumns: ColumnDefinitionList
  
  /**
    * The columns that are part of the clustering key of the table.
    */
  var clusteringKeys: js.UndefOr[ClusteringKeyList] = js.undefined
  
  /**
    * The columns that are part of the partition key of the table .
    */
  var partitionKeys: PartitionKeyList
  
  /**
    * The columns that have been defined as STATIC. Static columns store values that are shared by all rows in the same partition.
    */
  var staticColumns: js.UndefOr[StaticColumnList] = js.undefined
}
object SchemaDefinition {
  
  inline def apply(allColumns: ColumnDefinitionList, partitionKeys: PartitionKeyList): SchemaDefinition = {
    val __obj = js.Dynamic.literal(allColumns = allColumns.asInstanceOf[js.Any], partitionKeys = partitionKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDefinition]
  }
  
  extension [Self <: SchemaDefinition](x: Self) {
    
    inline def setAllColumns(value: ColumnDefinitionList): Self = StObject.set(x, "allColumns", value.asInstanceOf[js.Any])
    
    inline def setAllColumnsVarargs(value: ColumnDefinition*): Self = StObject.set(x, "allColumns", js.Array(value*))
    
    inline def setClusteringKeys(value: ClusteringKeyList): Self = StObject.set(x, "clusteringKeys", value.asInstanceOf[js.Any])
    
    inline def setClusteringKeysUndefined: Self = StObject.set(x, "clusteringKeys", js.undefined)
    
    inline def setClusteringKeysVarargs(value: ClusteringKey*): Self = StObject.set(x, "clusteringKeys", js.Array(value*))
    
    inline def setPartitionKeys(value: PartitionKeyList): Self = StObject.set(x, "partitionKeys", value.asInstanceOf[js.Any])
    
    inline def setPartitionKeysVarargs(value: PartitionKey*): Self = StObject.set(x, "partitionKeys", js.Array(value*))
    
    inline def setStaticColumns(value: StaticColumnList): Self = StObject.set(x, "staticColumns", value.asInstanceOf[js.Any])
    
    inline def setStaticColumnsUndefined: Self = StObject.set(x, "staticColumns", js.undefined)
    
    inline def setStaticColumnsVarargs(value: StaticColumn*): Self = StObject.set(x, "staticColumns", js.Array(value*))
  }
}
