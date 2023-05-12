package typings.awsSdk.clientsRedshiftserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableRestoreStatus extends StObject {
  
  /**
    * A description of the status of the table restore request. Status values include SUCCEEDED, FAILED, CANCELED, PENDING, IN_PROGRESS.
    */
  var message: js.UndefOr[String] = js.undefined
  
  /**
    * The namespace of the table being restored from.
    */
  var namespaceName: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the table to create from the restore operation.
    */
  var newTableName: js.UndefOr[String] = js.undefined
  
  /**
    * The amount of data restored to the new table so far, in megabytes (MB).
    */
  var progressInMegaBytes: js.UndefOr[Long] = js.undefined
  
  /**
    * The time that the table restore request was made, in Universal Coordinated Time (UTC).
    */
  var requestTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the snapshot being restored from.
    */
  var snapshotName: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the source database being restored from.
    */
  var sourceDatabaseName: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the source schema being restored from.
    */
  var sourceSchemaName: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the source table being restored from.
    */
  var sourceTableName: js.UndefOr[String] = js.undefined
  
  /**
    * A value that describes the current state of the table restore request. Possible values include SUCCEEDED, FAILED, CANCELED, PENDING, IN_PROGRESS.
    */
  var status: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the RestoreTableFromSnapshot request.
    */
  var tableRestoreRequestId: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the database to restore to.
    */
  var targetDatabaseName: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the schema to restore to.
    */
  var targetSchemaName: js.UndefOr[String] = js.undefined
  
  /**
    * The total amount of data to restore to the new table, in megabytes (MB).
    */
  var totalDataInMegaBytes: js.UndefOr[Long] = js.undefined
  
  /**
    * The name of the workgroup being restored from.
    */
  var workgroupName: js.UndefOr[String] = js.undefined
}
object TableRestoreStatus {
  
  inline def apply(): TableRestoreStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableRestoreStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TableRestoreStatus] (val x: Self) extends AnyVal {
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setNamespaceName(value: String): Self = StObject.set(x, "namespaceName", value.asInstanceOf[js.Any])
    
    inline def setNamespaceNameUndefined: Self = StObject.set(x, "namespaceName", js.undefined)
    
    inline def setNewTableName(value: String): Self = StObject.set(x, "newTableName", value.asInstanceOf[js.Any])
    
    inline def setNewTableNameUndefined: Self = StObject.set(x, "newTableName", js.undefined)
    
    inline def setProgressInMegaBytes(value: Long): Self = StObject.set(x, "progressInMegaBytes", value.asInstanceOf[js.Any])
    
    inline def setProgressInMegaBytesUndefined: Self = StObject.set(x, "progressInMegaBytes", js.undefined)
    
    inline def setRequestTime(value: js.Date): Self = StObject.set(x, "requestTime", value.asInstanceOf[js.Any])
    
    inline def setRequestTimeUndefined: Self = StObject.set(x, "requestTime", js.undefined)
    
    inline def setSnapshotName(value: String): Self = StObject.set(x, "snapshotName", value.asInstanceOf[js.Any])
    
    inline def setSnapshotNameUndefined: Self = StObject.set(x, "snapshotName", js.undefined)
    
    inline def setSourceDatabaseName(value: String): Self = StObject.set(x, "sourceDatabaseName", value.asInstanceOf[js.Any])
    
    inline def setSourceDatabaseNameUndefined: Self = StObject.set(x, "sourceDatabaseName", js.undefined)
    
    inline def setSourceSchemaName(value: String): Self = StObject.set(x, "sourceSchemaName", value.asInstanceOf[js.Any])
    
    inline def setSourceSchemaNameUndefined: Self = StObject.set(x, "sourceSchemaName", js.undefined)
    
    inline def setSourceTableName(value: String): Self = StObject.set(x, "sourceTableName", value.asInstanceOf[js.Any])
    
    inline def setSourceTableNameUndefined: Self = StObject.set(x, "sourceTableName", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTableRestoreRequestId(value: String): Self = StObject.set(x, "tableRestoreRequestId", value.asInstanceOf[js.Any])
    
    inline def setTableRestoreRequestIdUndefined: Self = StObject.set(x, "tableRestoreRequestId", js.undefined)
    
    inline def setTargetDatabaseName(value: String): Self = StObject.set(x, "targetDatabaseName", value.asInstanceOf[js.Any])
    
    inline def setTargetDatabaseNameUndefined: Self = StObject.set(x, "targetDatabaseName", js.undefined)
    
    inline def setTargetSchemaName(value: String): Self = StObject.set(x, "targetSchemaName", value.asInstanceOf[js.Any])
    
    inline def setTargetSchemaNameUndefined: Self = StObject.set(x, "targetSchemaName", js.undefined)
    
    inline def setTotalDataInMegaBytes(value: Long): Self = StObject.set(x, "totalDataInMegaBytes", value.asInstanceOf[js.Any])
    
    inline def setTotalDataInMegaBytesUndefined: Self = StObject.set(x, "totalDataInMegaBytes", js.undefined)
    
    inline def setWorkgroupName(value: String): Self = StObject.set(x, "workgroupName", value.asInstanceOf[js.Any])
    
    inline def setWorkgroupNameUndefined: Self = StObject.set(x, "workgroupName", js.undefined)
  }
}
