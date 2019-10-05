package typings.awsDashSdk.clientsDmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableStatistics extends js.Object {
  /**
    * The Data Definition Language (DDL) used to build and modify the structure of your tables.
    */
  var Ddls: js.UndefOr[Long] = js.undefined
  /**
    * The number of delete actions performed on a table.
    */
  var Deletes: js.UndefOr[Long] = js.undefined
  /**
    * The number of rows that failed conditional checks during the Full Load operation (valid only for DynamoDB as a target migrations).
    */
  var FullLoadCondtnlChkFailedRows: js.UndefOr[Long] = js.undefined
  /**
    * The number of rows that failed to load during the Full Load operation (valid only for DynamoDB as a target migrations).
    */
  var FullLoadErrorRows: js.UndefOr[Long] = js.undefined
  /**
    * The number of rows added during the Full Load operation.
    */
  var FullLoadRows: js.UndefOr[Long] = js.undefined
  /**
    * The number of insert actions performed on a table.
    */
  var Inserts: js.UndefOr[Long] = js.undefined
  /**
    * The last time the table was updated.
    */
  var LastUpdateTime: js.UndefOr[TStamp] = js.undefined
  /**
    * The schema name.
    */
  var SchemaName: js.UndefOr[String] = js.undefined
  /**
    * The name of the table.
    */
  var TableName: js.UndefOr[String] = js.undefined
  /**
    * The state of the tables described. Valid states: Table does not exist | Before load | Full load | Table completed | Table cancelled | Table error | Table all | Table updates | Table is being reloaded
    */
  var TableState: js.UndefOr[String] = js.undefined
  /**
    * The number of update actions performed on a table.
    */
  var Updates: js.UndefOr[Long] = js.undefined
  /**
    * The number of records that failed validation.
    */
  var ValidationFailedRecords: js.UndefOr[Long] = js.undefined
  /**
    * The number of records that have yet to be validated.
    */
  var ValidationPendingRecords: js.UndefOr[Long] = js.undefined
  /**
    * The validation state of the table. The parameter can have the following values   Not enabled—Validation is not enabled for the table in the migration task.   Pending records—Some records in the table are waiting for validation.   Mismatched records—Some records in the table do not match between the source and target.   Suspended records—Some records in the table could not be validated.   No primary key—The table could not be validated because it had no primary key.   Table error—The table was not validated because it was in an error state and some data was not migrated.   Validated—All rows in the table were validated. If the table is updated, the status can change from Validated.   Error—The table could not be validated because of an unexpected error.  
    */
  var ValidationState: js.UndefOr[String] = js.undefined
  /**
    * Additional details about the state of validation.
    */
  var ValidationStateDetails: js.UndefOr[String] = js.undefined
  /**
    * The number of records that could not be validated.
    */
  var ValidationSuspendedRecords: js.UndefOr[Long] = js.undefined
}

object TableStatistics {
  @scala.inline
  def apply(
    Ddls: Int | Double = null,
    Deletes: Int | Double = null,
    FullLoadCondtnlChkFailedRows: Int | Double = null,
    FullLoadErrorRows: Int | Double = null,
    FullLoadRows: Int | Double = null,
    Inserts: Int | Double = null,
    LastUpdateTime: TStamp = null,
    SchemaName: String = null,
    TableName: String = null,
    TableState: String = null,
    Updates: Int | Double = null,
    ValidationFailedRecords: Int | Double = null,
    ValidationPendingRecords: Int | Double = null,
    ValidationState: String = null,
    ValidationStateDetails: String = null,
    ValidationSuspendedRecords: Int | Double = null
  ): TableStatistics = {
    val __obj = js.Dynamic.literal()
    if (Ddls != null) __obj.updateDynamic("Ddls")(Ddls.asInstanceOf[js.Any])
    if (Deletes != null) __obj.updateDynamic("Deletes")(Deletes.asInstanceOf[js.Any])
    if (FullLoadCondtnlChkFailedRows != null) __obj.updateDynamic("FullLoadCondtnlChkFailedRows")(FullLoadCondtnlChkFailedRows.asInstanceOf[js.Any])
    if (FullLoadErrorRows != null) __obj.updateDynamic("FullLoadErrorRows")(FullLoadErrorRows.asInstanceOf[js.Any])
    if (FullLoadRows != null) __obj.updateDynamic("FullLoadRows")(FullLoadRows.asInstanceOf[js.Any])
    if (Inserts != null) __obj.updateDynamic("Inserts")(Inserts.asInstanceOf[js.Any])
    if (LastUpdateTime != null) __obj.updateDynamic("LastUpdateTime")(LastUpdateTime)
    if (SchemaName != null) __obj.updateDynamic("SchemaName")(SchemaName)
    if (TableName != null) __obj.updateDynamic("TableName")(TableName)
    if (TableState != null) __obj.updateDynamic("TableState")(TableState)
    if (Updates != null) __obj.updateDynamic("Updates")(Updates.asInstanceOf[js.Any])
    if (ValidationFailedRecords != null) __obj.updateDynamic("ValidationFailedRecords")(ValidationFailedRecords.asInstanceOf[js.Any])
    if (ValidationPendingRecords != null) __obj.updateDynamic("ValidationPendingRecords")(ValidationPendingRecords.asInstanceOf[js.Any])
    if (ValidationState != null) __obj.updateDynamic("ValidationState")(ValidationState)
    if (ValidationStateDetails != null) __obj.updateDynamic("ValidationStateDetails")(ValidationStateDetails)
    if (ValidationSuspendedRecords != null) __obj.updateDynamic("ValidationSuspendedRecords")(ValidationSuspendedRecords.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableStatistics]
  }
}

