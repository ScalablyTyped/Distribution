package typings.awsSdk.clientsLakeformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTemporaryGluePartitionCredentialsRequest extends StObject {
  
  /**
    * A structure representing context to access a resource (column names, query ID, etc).
    */
  var AuditContext: js.UndefOr[typings.awsSdk.clientsLakeformationMod.AuditContext] = js.undefined
  
  /**
    * The time period, between 900 and 21,600 seconds, for the timeout of the temporary credentials.
    */
  var DurationSeconds: js.UndefOr[CredentialTimeoutDurationSecondInteger] = js.undefined
  
  /**
    * A list of partition values identifying a single partition.
    */
  var Partition: PartitionValueList
  
  /**
    * Filters the request based on the user having been granted a list of specified permissions on the requested resource(s).
    */
  var Permissions: js.UndefOr[PermissionList] = js.undefined
  
  /**
    * A list of supported permission types for the partition. Valid values are COLUMN_PERMISSION and CELL_FILTER_PERMISSION.
    */
  var SupportedPermissionTypes: PermissionTypeList
  
  /**
    * The ARN of the partitions' table.
    */
  var TableArn: ResourceArnString
}
object GetTemporaryGluePartitionCredentialsRequest {
  
  inline def apply(
    Partition: PartitionValueList,
    SupportedPermissionTypes: PermissionTypeList,
    TableArn: ResourceArnString
  ): GetTemporaryGluePartitionCredentialsRequest = {
    val __obj = js.Dynamic.literal(Partition = Partition.asInstanceOf[js.Any], SupportedPermissionTypes = SupportedPermissionTypes.asInstanceOf[js.Any], TableArn = TableArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTemporaryGluePartitionCredentialsRequest]
  }
  
  extension [Self <: GetTemporaryGluePartitionCredentialsRequest](x: Self) {
    
    inline def setAuditContext(value: AuditContext): Self = StObject.set(x, "AuditContext", value.asInstanceOf[js.Any])
    
    inline def setAuditContextUndefined: Self = StObject.set(x, "AuditContext", js.undefined)
    
    inline def setDurationSeconds(value: CredentialTimeoutDurationSecondInteger): Self = StObject.set(x, "DurationSeconds", value.asInstanceOf[js.Any])
    
    inline def setDurationSecondsUndefined: Self = StObject.set(x, "DurationSeconds", js.undefined)
    
    inline def setPartition(value: PartitionValueList): Self = StObject.set(x, "Partition", value.asInstanceOf[js.Any])
    
    inline def setPermissions(value: PermissionList): Self = StObject.set(x, "Permissions", value.asInstanceOf[js.Any])
    
    inline def setPermissionsUndefined: Self = StObject.set(x, "Permissions", js.undefined)
    
    inline def setPermissionsVarargs(value: Permission*): Self = StObject.set(x, "Permissions", js.Array(value*))
    
    inline def setSupportedPermissionTypes(value: PermissionTypeList): Self = StObject.set(x, "SupportedPermissionTypes", value.asInstanceOf[js.Any])
    
    inline def setSupportedPermissionTypesVarargs(value: PermissionType*): Self = StObject.set(x, "SupportedPermissionTypes", js.Array(value*))
    
    inline def setTableArn(value: ResourceArnString): Self = StObject.set(x, "TableArn", value.asInstanceOf[js.Any])
  }
}
