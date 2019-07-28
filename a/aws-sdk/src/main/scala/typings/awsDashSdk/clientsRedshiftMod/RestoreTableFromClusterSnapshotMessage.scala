package typings.awsDashSdk.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RestoreTableFromClusterSnapshotMessage extends js.Object {
  /**
    * The identifier of the Amazon Redshift cluster to restore the table to.
    */
  var ClusterIdentifier: String
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
  @scala.inline
  def apply(
    ClusterIdentifier: String,
    NewTableName: String,
    SnapshotIdentifier: String,
    SourceDatabaseName: String,
    SourceTableName: String,
    SourceSchemaName: String = null,
    TargetDatabaseName: String = null,
    TargetSchemaName: String = null
  ): RestoreTableFromClusterSnapshotMessage = {
    val __obj = js.Dynamic.literal(ClusterIdentifier = ClusterIdentifier, NewTableName = NewTableName, SnapshotIdentifier = SnapshotIdentifier, SourceDatabaseName = SourceDatabaseName, SourceTableName = SourceTableName)
    if (SourceSchemaName != null) __obj.updateDynamic("SourceSchemaName")(SourceSchemaName)
    if (TargetDatabaseName != null) __obj.updateDynamic("TargetDatabaseName")(TargetDatabaseName)
    if (TargetSchemaName != null) __obj.updateDynamic("TargetSchemaName")(TargetSchemaName)
    __obj.asInstanceOf[RestoreTableFromClusterSnapshotMessage]
  }
}

