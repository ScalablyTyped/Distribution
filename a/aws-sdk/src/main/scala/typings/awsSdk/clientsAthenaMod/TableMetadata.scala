package typings.awsSdk.clientsAthenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableMetadata extends StObject {
  
  /**
    * A list of the columns in the table.
    */
  var Columns: js.UndefOr[ColumnList] = js.undefined
  
  /**
    * The time that the table was created.
    */
  var CreateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The last time the table was accessed.
    */
  var LastAccessTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the table.
    */
  var Name: NameString
  
  /**
    * A set of custom key/value pairs for table properties.
    */
  var Parameters: js.UndefOr[ParametersMap] = js.undefined
  
  /**
    * A list of the partition keys in the table.
    */
  var PartitionKeys: js.UndefOr[ColumnList] = js.undefined
  
  /**
    * The type of table. In Athena, only EXTERNAL_TABLE is supported.
    */
  var TableType: js.UndefOr[TableTypeString] = js.undefined
}
object TableMetadata {
  
  inline def apply(Name: NameString): TableMetadata = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TableMetadata] (val x: Self) extends AnyVal {
    
    inline def setColumns(value: ColumnList): Self = StObject.set(x, "Columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsUndefined: Self = StObject.set(x, "Columns", js.undefined)
    
    inline def setColumnsVarargs(value: Column*): Self = StObject.set(x, "Columns", js.Array(value*))
    
    inline def setCreateTime(value: js.Date): Self = StObject.set(x, "CreateTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "CreateTime", js.undefined)
    
    inline def setLastAccessTime(value: js.Date): Self = StObject.set(x, "LastAccessTime", value.asInstanceOf[js.Any])
    
    inline def setLastAccessTimeUndefined: Self = StObject.set(x, "LastAccessTime", js.undefined)
    
    inline def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setParameters(value: ParametersMap): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "Parameters", js.undefined)
    
    inline def setPartitionKeys(value: ColumnList): Self = StObject.set(x, "PartitionKeys", value.asInstanceOf[js.Any])
    
    inline def setPartitionKeysUndefined: Self = StObject.set(x, "PartitionKeys", js.undefined)
    
    inline def setPartitionKeysVarargs(value: Column*): Self = StObject.set(x, "PartitionKeys", js.Array(value*))
    
    inline def setTableType(value: TableTypeString): Self = StObject.set(x, "TableType", value.asInstanceOf[js.Any])
    
    inline def setTableTypeUndefined: Self = StObject.set(x, "TableType", js.undefined)
  }
}
