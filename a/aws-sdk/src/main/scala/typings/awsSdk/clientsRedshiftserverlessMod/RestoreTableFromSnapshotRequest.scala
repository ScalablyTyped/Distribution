package typings.awsSdk.clientsRedshiftserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RestoreTableFromSnapshotRequest extends StObject {
  
  /**
    * Indicates whether name identifiers for database, schema, and table are case sensitive. If true, the names are case sensitive. If false, the names are not case sensitive. The default is false.
    */
  var activateCaseSensitiveIdentifier: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The namespace of the snapshot to restore from.
    */
  var namespaceName: String
  
  /**
    * The name of the table to create from the restore operation.
    */
  var newTableName: String
  
  /**
    * The name of the snapshot to restore the table from.
    */
  var snapshotName: String
  
  /**
    * The name of the source database that contains the table being restored.
    */
  var sourceDatabaseName: String
  
  /**
    * The name of the source schema that contains the table being restored.
    */
  var sourceSchemaName: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the source table being restored.
    */
  var sourceTableName: String
  
  /**
    * The name of the database to restore the table to.
    */
  var targetDatabaseName: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the schema to restore the table to.
    */
  var targetSchemaName: js.UndefOr[String] = js.undefined
  
  /**
    * The workgroup to restore the table to.
    */
  var workgroupName: String
}
object RestoreTableFromSnapshotRequest {
  
  inline def apply(
    namespaceName: String,
    newTableName: String,
    snapshotName: String,
    sourceDatabaseName: String,
    sourceTableName: String,
    workgroupName: String
  ): RestoreTableFromSnapshotRequest = {
    val __obj = js.Dynamic.literal(namespaceName = namespaceName.asInstanceOf[js.Any], newTableName = newTableName.asInstanceOf[js.Any], snapshotName = snapshotName.asInstanceOf[js.Any], sourceDatabaseName = sourceDatabaseName.asInstanceOf[js.Any], sourceTableName = sourceTableName.asInstanceOf[js.Any], workgroupName = workgroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestoreTableFromSnapshotRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RestoreTableFromSnapshotRequest] (val x: Self) extends AnyVal {
    
    inline def setActivateCaseSensitiveIdentifier(value: Boolean): Self = StObject.set(x, "activateCaseSensitiveIdentifier", value.asInstanceOf[js.Any])
    
    inline def setActivateCaseSensitiveIdentifierUndefined: Self = StObject.set(x, "activateCaseSensitiveIdentifier", js.undefined)
    
    inline def setNamespaceName(value: String): Self = StObject.set(x, "namespaceName", value.asInstanceOf[js.Any])
    
    inline def setNewTableName(value: String): Self = StObject.set(x, "newTableName", value.asInstanceOf[js.Any])
    
    inline def setSnapshotName(value: String): Self = StObject.set(x, "snapshotName", value.asInstanceOf[js.Any])
    
    inline def setSourceDatabaseName(value: String): Self = StObject.set(x, "sourceDatabaseName", value.asInstanceOf[js.Any])
    
    inline def setSourceSchemaName(value: String): Self = StObject.set(x, "sourceSchemaName", value.asInstanceOf[js.Any])
    
    inline def setSourceSchemaNameUndefined: Self = StObject.set(x, "sourceSchemaName", js.undefined)
    
    inline def setSourceTableName(value: String): Self = StObject.set(x, "sourceTableName", value.asInstanceOf[js.Any])
    
    inline def setTargetDatabaseName(value: String): Self = StObject.set(x, "targetDatabaseName", value.asInstanceOf[js.Any])
    
    inline def setTargetDatabaseNameUndefined: Self = StObject.set(x, "targetDatabaseName", js.undefined)
    
    inline def setTargetSchemaName(value: String): Self = StObject.set(x, "targetSchemaName", value.asInstanceOf[js.Any])
    
    inline def setTargetSchemaNameUndefined: Self = StObject.set(x, "targetSchemaName", js.undefined)
    
    inline def setWorkgroupName(value: String): Self = StObject.set(x, "workgroupName", value.asInstanceOf[js.Any])
  }
}
