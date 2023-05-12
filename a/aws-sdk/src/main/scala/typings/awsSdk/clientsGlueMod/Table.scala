package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Table extends StObject {
  
  /**
    * The ID of the Data Catalog in which the table resides.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
  
  /**
    * The time when the table definition was created in the Data Catalog.
    */
  var CreateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The person or entity who created the table.
    */
  var CreatedBy: js.UndefOr[NameString] = js.undefined
  
  /**
    * The name of the database where the table metadata resides. For Hive compatibility, this must be all lowercase.
    */
  var DatabaseName: js.UndefOr[NameString] = js.undefined
  
  /**
    * A description of the table.
    */
  var Description: js.UndefOr[DescriptionString] = js.undefined
  
  /**
    * A FederatedTable structure that references an entity outside the Glue Data Catalog.
    */
  var FederatedTable: js.UndefOr[typings.awsSdk.clientsGlueMod.FederatedTable] = js.undefined
  
  /**
    * Indicates whether the table has been registered with Lake Formation.
    */
  var IsRegisteredWithLakeFormation: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The last time that the table was accessed. This is usually taken from HDFS, and might not be reliable.
    */
  var LastAccessTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The last time that column statistics were computed for this table.
    */
  var LastAnalyzedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The table name. For Hive compatibility, this must be entirely lowercase.
    */
  var Name: NameString
  
  /**
    * The owner of the table.
    */
  var Owner: js.UndefOr[NameString] = js.undefined
  
  /**
    * These key-value pairs define properties associated with the table.
    */
  var Parameters: js.UndefOr[ParametersMap] = js.undefined
  
  /**
    * A list of columns by which the table is partitioned. Only primitive types are supported as partition keys. When you create a table used by Amazon Athena, and you do not specify any partitionKeys, you must at least set the value of partitionKeys to an empty list. For example:  "PartitionKeys": [] 
    */
  var PartitionKeys: js.UndefOr[ColumnList] = js.undefined
  
  /**
    * The retention time for this table.
    */
  var Retention: js.UndefOr[NonNegativeInteger] = js.undefined
  
  /**
    * A storage descriptor containing information about the physical storage of this table.
    */
  var StorageDescriptor: js.UndefOr[typings.awsSdk.clientsGlueMod.StorageDescriptor] = js.undefined
  
  /**
    * The type of this table. Glue will create tables with the EXTERNAL_TABLE type. Other services, such as Athena, may create tables with additional table types.  Glue related table types:  EXTERNAL_TABLE  Hive compatible attribute - indicates a non-Hive managed table.  GOVERNED  Used by Lake Formation. The Glue Data Catalog understands GOVERNED.  
    */
  var TableType: js.UndefOr[TableTypeString] = js.undefined
  
  /**
    * A TableIdentifier structure that describes a target table for resource linking.
    */
  var TargetTable: js.UndefOr[TableIdentifier] = js.undefined
  
  /**
    * The last time that the table was updated.
    */
  var UpdateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The ID of the table version.
    */
  var VersionId: js.UndefOr[VersionString] = js.undefined
  
  /**
    * Included for Apache Hive compatibility. Not used in the normal course of Glue operations.
    */
  var ViewExpandedText: js.UndefOr[ViewTextString] = js.undefined
  
  /**
    * Included for Apache Hive compatibility. Not used in the normal course of Glue operations. If the table is a VIRTUAL_VIEW, certain Athena configuration encoded in base64.
    */
  var ViewOriginalText: js.UndefOr[ViewTextString] = js.undefined
}
object Table {
  
  inline def apply(Name: NameString): Table = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Table]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Table] (val x: Self) extends AnyVal {
    
    inline def setCatalogId(value: CatalogIdString): Self = StObject.set(x, "CatalogId", value.asInstanceOf[js.Any])
    
    inline def setCatalogIdUndefined: Self = StObject.set(x, "CatalogId", js.undefined)
    
    inline def setCreateTime(value: js.Date): Self = StObject.set(x, "CreateTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "CreateTime", js.undefined)
    
    inline def setCreatedBy(value: NameString): Self = StObject.set(x, "CreatedBy", value.asInstanceOf[js.Any])
    
    inline def setCreatedByUndefined: Self = StObject.set(x, "CreatedBy", js.undefined)
    
    inline def setDatabaseName(value: NameString): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
    
    inline def setDatabaseNameUndefined: Self = StObject.set(x, "DatabaseName", js.undefined)
    
    inline def setDescription(value: DescriptionString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setFederatedTable(value: FederatedTable): Self = StObject.set(x, "FederatedTable", value.asInstanceOf[js.Any])
    
    inline def setFederatedTableUndefined: Self = StObject.set(x, "FederatedTable", js.undefined)
    
    inline def setIsRegisteredWithLakeFormation(value: Boolean): Self = StObject.set(x, "IsRegisteredWithLakeFormation", value.asInstanceOf[js.Any])
    
    inline def setIsRegisteredWithLakeFormationUndefined: Self = StObject.set(x, "IsRegisteredWithLakeFormation", js.undefined)
    
    inline def setLastAccessTime(value: js.Date): Self = StObject.set(x, "LastAccessTime", value.asInstanceOf[js.Any])
    
    inline def setLastAccessTimeUndefined: Self = StObject.set(x, "LastAccessTime", js.undefined)
    
    inline def setLastAnalyzedTime(value: js.Date): Self = StObject.set(x, "LastAnalyzedTime", value.asInstanceOf[js.Any])
    
    inline def setLastAnalyzedTimeUndefined: Self = StObject.set(x, "LastAnalyzedTime", js.undefined)
    
    inline def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setOwner(value: NameString): Self = StObject.set(x, "Owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "Owner", js.undefined)
    
    inline def setParameters(value: ParametersMap): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "Parameters", js.undefined)
    
    inline def setPartitionKeys(value: ColumnList): Self = StObject.set(x, "PartitionKeys", value.asInstanceOf[js.Any])
    
    inline def setPartitionKeysUndefined: Self = StObject.set(x, "PartitionKeys", js.undefined)
    
    inline def setPartitionKeysVarargs(value: Column*): Self = StObject.set(x, "PartitionKeys", js.Array(value*))
    
    inline def setRetention(value: NonNegativeInteger): Self = StObject.set(x, "Retention", value.asInstanceOf[js.Any])
    
    inline def setRetentionUndefined: Self = StObject.set(x, "Retention", js.undefined)
    
    inline def setStorageDescriptor(value: StorageDescriptor): Self = StObject.set(x, "StorageDescriptor", value.asInstanceOf[js.Any])
    
    inline def setStorageDescriptorUndefined: Self = StObject.set(x, "StorageDescriptor", js.undefined)
    
    inline def setTableType(value: TableTypeString): Self = StObject.set(x, "TableType", value.asInstanceOf[js.Any])
    
    inline def setTableTypeUndefined: Self = StObject.set(x, "TableType", js.undefined)
    
    inline def setTargetTable(value: TableIdentifier): Self = StObject.set(x, "TargetTable", value.asInstanceOf[js.Any])
    
    inline def setTargetTableUndefined: Self = StObject.set(x, "TargetTable", js.undefined)
    
    inline def setUpdateTime(value: js.Date): Self = StObject.set(x, "UpdateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "UpdateTime", js.undefined)
    
    inline def setVersionId(value: VersionString): Self = StObject.set(x, "VersionId", value.asInstanceOf[js.Any])
    
    inline def setVersionIdUndefined: Self = StObject.set(x, "VersionId", js.undefined)
    
    inline def setViewExpandedText(value: ViewTextString): Self = StObject.set(x, "ViewExpandedText", value.asInstanceOf[js.Any])
    
    inline def setViewExpandedTextUndefined: Self = StObject.set(x, "ViewExpandedText", js.undefined)
    
    inline def setViewOriginalText(value: ViewTextString): Self = StObject.set(x, "ViewOriginalText", value.asInstanceOf[js.Any])
    
    inline def setViewOriginalTextUndefined: Self = StObject.set(x, "ViewOriginalText", js.undefined)
  }
}
