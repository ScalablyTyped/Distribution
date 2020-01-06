package typings.awsDashSdk.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableRestoreStatus extends js.Object {
  /**
    * The identifier of the Amazon Redshift cluster that the table is being restored to.
    */
  var ClusterIdentifier: js.UndefOr[String] = js.native
  /**
    * A description of the status of the table restore request. Status values include SUCCEEDED, FAILED, CANCELED, PENDING, IN_PROGRESS.
    */
  var Message: js.UndefOr[String] = js.native
  /**
    * The name of the table to create as a result of the table restore request.
    */
  var NewTableName: js.UndefOr[String] = js.native
  /**
    * The amount of data restored to the new table so far, in megabytes (MB).
    */
  var ProgressInMegaBytes: js.UndefOr[LongOptional] = js.native
  /**
    * The time that the table restore request was made, in Universal Coordinated Time (UTC).
    */
  var RequestTime: js.UndefOr[TStamp] = js.native
  /**
    * The identifier of the snapshot that the table is being restored from.
    */
  var SnapshotIdentifier: js.UndefOr[String] = js.native
  /**
    * The name of the source database that contains the table being restored.
    */
  var SourceDatabaseName: js.UndefOr[String] = js.native
  /**
    * The name of the source schema that contains the table being restored.
    */
  var SourceSchemaName: js.UndefOr[String] = js.native
  /**
    * The name of the source table being restored.
    */
  var SourceTableName: js.UndefOr[String] = js.native
  /**
    * A value that describes the current state of the table restore request. Valid Values: SUCCEEDED, FAILED, CANCELED, PENDING, IN_PROGRESS 
    */
  var Status: js.UndefOr[TableRestoreStatusType] = js.native
  /**
    * The unique identifier for the table restore request.
    */
  var TableRestoreRequestId: js.UndefOr[String] = js.native
  /**
    * The name of the database to restore the table to.
    */
  var TargetDatabaseName: js.UndefOr[String] = js.native
  /**
    * The name of the schema to restore the table to.
    */
  var TargetSchemaName: js.UndefOr[String] = js.native
  /**
    * The total amount of data to restore to the new table, in megabytes (MB).
    */
  var TotalDataInMegaBytes: js.UndefOr[LongOptional] = js.native
}

object TableRestoreStatus {
  @scala.inline
  def apply(
    ClusterIdentifier: String = null,
    Message: String = null,
    NewTableName: String = null,
    ProgressInMegaBytes: Int | scala.Double = null,
    RequestTime: TStamp = null,
    SnapshotIdentifier: String = null,
    SourceDatabaseName: String = null,
    SourceSchemaName: String = null,
    SourceTableName: String = null,
    Status: TableRestoreStatusType = null,
    TableRestoreRequestId: String = null,
    TargetDatabaseName: String = null,
    TargetSchemaName: String = null,
    TotalDataInMegaBytes: Int | scala.Double = null
  ): TableRestoreStatus = {
    val __obj = js.Dynamic.literal()
    if (ClusterIdentifier != null) __obj.updateDynamic("ClusterIdentifier")(ClusterIdentifier.asInstanceOf[js.Any])
    if (Message != null) __obj.updateDynamic("Message")(Message.asInstanceOf[js.Any])
    if (NewTableName != null) __obj.updateDynamic("NewTableName")(NewTableName.asInstanceOf[js.Any])
    if (ProgressInMegaBytes != null) __obj.updateDynamic("ProgressInMegaBytes")(ProgressInMegaBytes.asInstanceOf[js.Any])
    if (RequestTime != null) __obj.updateDynamic("RequestTime")(RequestTime.asInstanceOf[js.Any])
    if (SnapshotIdentifier != null) __obj.updateDynamic("SnapshotIdentifier")(SnapshotIdentifier.asInstanceOf[js.Any])
    if (SourceDatabaseName != null) __obj.updateDynamic("SourceDatabaseName")(SourceDatabaseName.asInstanceOf[js.Any])
    if (SourceSchemaName != null) __obj.updateDynamic("SourceSchemaName")(SourceSchemaName.asInstanceOf[js.Any])
    if (SourceTableName != null) __obj.updateDynamic("SourceTableName")(SourceTableName.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (TableRestoreRequestId != null) __obj.updateDynamic("TableRestoreRequestId")(TableRestoreRequestId.asInstanceOf[js.Any])
    if (TargetDatabaseName != null) __obj.updateDynamic("TargetDatabaseName")(TargetDatabaseName.asInstanceOf[js.Any])
    if (TargetSchemaName != null) __obj.updateDynamic("TargetSchemaName")(TargetSchemaName.asInstanceOf[js.Any])
    if (TotalDataInMegaBytes != null) __obj.updateDynamic("TotalDataInMegaBytes")(TotalDataInMegaBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableRestoreStatus]
  }
}

