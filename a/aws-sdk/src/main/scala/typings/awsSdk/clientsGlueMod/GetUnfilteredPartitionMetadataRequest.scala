package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetUnfilteredPartitionMetadataRequest extends StObject {
  
  /**
    * A structure containing Lake Formation audit context information.
    */
  var AuditContext: js.UndefOr[typings.awsSdk.clientsGlueMod.AuditContext] = js.undefined
  
  /**
    * The catalog ID where the partition resides.
    */
  var CatalogId: CatalogIdString
  
  /**
    * (Required) Specifies the name of a database that contains the partition.
    */
  var DatabaseName: NameString
  
  /**
    * (Required) A list of partition key values.
    */
  var PartitionValues: ValueStringList
  
  /**
    * (Required) A list of supported permission types. 
    */
  var SupportedPermissionTypes: PermissionTypeList
  
  /**
    * (Required) Specifies the name of a table that contains the partition.
    */
  var TableName: NameString
}
object GetUnfilteredPartitionMetadataRequest {
  
  inline def apply(
    CatalogId: CatalogIdString,
    DatabaseName: NameString,
    PartitionValues: ValueStringList,
    SupportedPermissionTypes: PermissionTypeList,
    TableName: NameString
  ): GetUnfilteredPartitionMetadataRequest = {
    val __obj = js.Dynamic.literal(CatalogId = CatalogId.asInstanceOf[js.Any], DatabaseName = DatabaseName.asInstanceOf[js.Any], PartitionValues = PartitionValues.asInstanceOf[js.Any], SupportedPermissionTypes = SupportedPermissionTypes.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetUnfilteredPartitionMetadataRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetUnfilteredPartitionMetadataRequest] (val x: Self) extends AnyVal {
    
    inline def setAuditContext(value: AuditContext): Self = StObject.set(x, "AuditContext", value.asInstanceOf[js.Any])
    
    inline def setAuditContextUndefined: Self = StObject.set(x, "AuditContext", js.undefined)
    
    inline def setCatalogId(value: CatalogIdString): Self = StObject.set(x, "CatalogId", value.asInstanceOf[js.Any])
    
    inline def setDatabaseName(value: NameString): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
    
    inline def setPartitionValues(value: ValueStringList): Self = StObject.set(x, "PartitionValues", value.asInstanceOf[js.Any])
    
    inline def setPartitionValuesVarargs(value: ValueString*): Self = StObject.set(x, "PartitionValues", js.Array(value*))
    
    inline def setSupportedPermissionTypes(value: PermissionTypeList): Self = StObject.set(x, "SupportedPermissionTypes", value.asInstanceOf[js.Any])
    
    inline def setSupportedPermissionTypesVarargs(value: PermissionType*): Self = StObject.set(x, "SupportedPermissionTypes", js.Array(value*))
    
    inline def setTableName(value: NameString): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
  }
}
