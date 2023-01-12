package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JDBCConnectorOptions extends StObject {
  
  /**
    * Custom data type mapping that builds a mapping from a JDBC data type to an Glue data type. For example, the option "dataTypeMapping":{"FLOAT":"STRING"} maps data fields of JDBC type FLOAT into the Java String type by calling the ResultSet.getString() method of the driver, and uses it to build the Glue record. The ResultSet object is implemented by each driver, so the behavior is specific to the driver you use. Refer to the documentation for your JDBC driver to understand how the driver performs the conversions.
    */
  var DataTypeMapping: js.UndefOr[JDBCDataTypeMapping] = js.undefined
  
  /**
    * Extra condition clause to filter data from source. For example:  BillingCity='Mountain View'  When using a query instead of a table name, you should validate that the query works with the specified filterPredicate.
    */
  var FilterPredicate: js.UndefOr[EnclosedInStringProperty] = js.undefined
  
  /**
    * The name of the job bookmark keys on which to sort.
    */
  var JobBookmarkKeys: js.UndefOr[EnclosedInStringProperties] = js.undefined
  
  /**
    * Specifies an ascending or descending sort order.
    */
  var JobBookmarkKeysSortOrder: js.UndefOr[EnclosedInStringProperty] = js.undefined
  
  /**
    * The minimum value of partitionColumn that is used to decide partition stride.
    */
  var LowerBound: js.UndefOr[BoxedNonNegativeLong] = js.undefined
  
  /**
    * The number of partitions. This value, along with lowerBound (inclusive) and upperBound (exclusive), form partition strides for generated WHERE clause expressions that are used to split the partitionColumn.
    */
  var NumPartitions: js.UndefOr[BoxedNonNegativeLong] = js.undefined
  
  /**
    * The name of an integer column that is used for partitioning. This option works only when it's included with lowerBound, upperBound, and numPartitions. This option works the same way as in the Spark SQL JDBC reader.
    */
  var PartitionColumn: js.UndefOr[EnclosedInStringProperty] = js.undefined
  
  /**
    * The maximum value of partitionColumn that is used to decide partition stride.
    */
  var UpperBound: js.UndefOr[BoxedNonNegativeLong] = js.undefined
}
object JDBCConnectorOptions {
  
  inline def apply(): JDBCConnectorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JDBCConnectorOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JDBCConnectorOptions] (val x: Self) extends AnyVal {
    
    inline def setDataTypeMapping(value: JDBCDataTypeMapping): Self = StObject.set(x, "DataTypeMapping", value.asInstanceOf[js.Any])
    
    inline def setDataTypeMappingUndefined: Self = StObject.set(x, "DataTypeMapping", js.undefined)
    
    inline def setFilterPredicate(value: EnclosedInStringProperty): Self = StObject.set(x, "FilterPredicate", value.asInstanceOf[js.Any])
    
    inline def setFilterPredicateUndefined: Self = StObject.set(x, "FilterPredicate", js.undefined)
    
    inline def setJobBookmarkKeys(value: EnclosedInStringProperties): Self = StObject.set(x, "JobBookmarkKeys", value.asInstanceOf[js.Any])
    
    inline def setJobBookmarkKeysSortOrder(value: EnclosedInStringProperty): Self = StObject.set(x, "JobBookmarkKeysSortOrder", value.asInstanceOf[js.Any])
    
    inline def setJobBookmarkKeysSortOrderUndefined: Self = StObject.set(x, "JobBookmarkKeysSortOrder", js.undefined)
    
    inline def setJobBookmarkKeysUndefined: Self = StObject.set(x, "JobBookmarkKeys", js.undefined)
    
    inline def setJobBookmarkKeysVarargs(value: EnclosedInStringProperty*): Self = StObject.set(x, "JobBookmarkKeys", js.Array(value*))
    
    inline def setLowerBound(value: BoxedNonNegativeLong): Self = StObject.set(x, "LowerBound", value.asInstanceOf[js.Any])
    
    inline def setLowerBoundUndefined: Self = StObject.set(x, "LowerBound", js.undefined)
    
    inline def setNumPartitions(value: BoxedNonNegativeLong): Self = StObject.set(x, "NumPartitions", value.asInstanceOf[js.Any])
    
    inline def setNumPartitionsUndefined: Self = StObject.set(x, "NumPartitions", js.undefined)
    
    inline def setPartitionColumn(value: EnclosedInStringProperty): Self = StObject.set(x, "PartitionColumn", value.asInstanceOf[js.Any])
    
    inline def setPartitionColumnUndefined: Self = StObject.set(x, "PartitionColumn", js.undefined)
    
    inline def setUpperBound(value: BoxedNonNegativeLong): Self = StObject.set(x, "UpperBound", value.asInstanceOf[js.Any])
    
    inline def setUpperBoundUndefined: Self = StObject.set(x, "UpperBound", js.undefined)
  }
}
