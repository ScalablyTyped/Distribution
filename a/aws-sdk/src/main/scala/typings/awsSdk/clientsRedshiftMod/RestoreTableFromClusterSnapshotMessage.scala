package typings.awsSdk.clientsRedshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RestoreTableFromClusterSnapshotMessage extends StObject {
  
  /**
    * The identifier of the Amazon Redshift cluster to restore the table to.
    */
  var ClusterIdentifier: String
  
  /**
    * Indicates whether name identifiers for database, schema, and table are case sensitive. If true, the names are case sensitive. If false (default), the names are not case sensitive.
    */
  var EnableCaseSensitiveIdentifier: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * The name of the table to create as a result of the current request.
    */
  var NewTableName: String
  
  /**
    * The identifier of the snapshot to restore the table from. This snapshot must have been created from the Amazon Redshift cluster specified by the ClusterIdentifier parameter.
    */
  var SnapshotIdentifier: String
  
  /**
    * The name of the source database that contains the table to restore from.
    */
  var SourceDatabaseName: String
  
  /**
    * The name of the source schema that contains the table to restore from. If you do not specify a SourceSchemaName value, the default is public.
    */
  var SourceSchemaName: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the source table to restore from.
    */
  var SourceTableName: String
  
  /**
    * The name of the database to restore the table to.
    */
  var TargetDatabaseName: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the schema to restore the table to.
    */
  var TargetSchemaName: js.UndefOr[String] = js.undefined
}
object RestoreTableFromClusterSnapshotMessage {
  
  inline def apply(
    ClusterIdentifier: String,
    NewTableName: String,
    SnapshotIdentifier: String,
    SourceDatabaseName: String,
    SourceTableName: String
  ): RestoreTableFromClusterSnapshotMessage = {
    val __obj = js.Dynamic.literal(ClusterIdentifier = ClusterIdentifier.asInstanceOf[js.Any], NewTableName = NewTableName.asInstanceOf[js.Any], SnapshotIdentifier = SnapshotIdentifier.asInstanceOf[js.Any], SourceDatabaseName = SourceDatabaseName.asInstanceOf[js.Any], SourceTableName = SourceTableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestoreTableFromClusterSnapshotMessage]
  }
  
  extension [Self <: RestoreTableFromClusterSnapshotMessage](x: Self) {
    
    inline def setClusterIdentifier(value: String): Self = StObject.set(x, "ClusterIdentifier", value.asInstanceOf[js.Any])
    
    inline def setEnableCaseSensitiveIdentifier(value: BooleanOptional): Self = StObject.set(x, "EnableCaseSensitiveIdentifier", value.asInstanceOf[js.Any])
    
    inline def setEnableCaseSensitiveIdentifierUndefined: Self = StObject.set(x, "EnableCaseSensitiveIdentifier", js.undefined)
    
    inline def setNewTableName(value: String): Self = StObject.set(x, "NewTableName", value.asInstanceOf[js.Any])
    
    inline def setSnapshotIdentifier(value: String): Self = StObject.set(x, "SnapshotIdentifier", value.asInstanceOf[js.Any])
    
    inline def setSourceDatabaseName(value: String): Self = StObject.set(x, "SourceDatabaseName", value.asInstanceOf[js.Any])
    
    inline def setSourceSchemaName(value: String): Self = StObject.set(x, "SourceSchemaName", value.asInstanceOf[js.Any])
    
    inline def setSourceSchemaNameUndefined: Self = StObject.set(x, "SourceSchemaName", js.undefined)
    
    inline def setSourceTableName(value: String): Self = StObject.set(x, "SourceTableName", value.asInstanceOf[js.Any])
    
    inline def setTargetDatabaseName(value: String): Self = StObject.set(x, "TargetDatabaseName", value.asInstanceOf[js.Any])
    
    inline def setTargetDatabaseNameUndefined: Self = StObject.set(x, "TargetDatabaseName", js.undefined)
    
    inline def setTargetSchemaName(value: String): Self = StObject.set(x, "TargetSchemaName", value.asInstanceOf[js.Any])
    
    inline def setTargetSchemaNameUndefined: Self = StObject.set(x, "TargetSchemaName", js.undefined)
  }
}
