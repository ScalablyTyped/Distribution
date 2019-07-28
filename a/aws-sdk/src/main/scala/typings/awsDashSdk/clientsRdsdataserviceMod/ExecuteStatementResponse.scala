package typings.awsDashSdk.clientsRdsdataserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecuteStatementResponse extends js.Object {
  /**
    * Metadata for the columns included in the results.
    */
  var columnMetadata: js.UndefOr[Metadata] = js.undefined
  /**
    * Values for fields generated during the request.
    */
  var generatedFields: js.UndefOr[FieldList] = js.undefined
  /**
    * The number of records updated by the request.
    */
  var numberOfRecordsUpdated: js.UndefOr[RecordsUpdated] = js.undefined
  /**
    * The records returned by the SQL statement.
    */
  var records: js.UndefOr[SqlRecords] = js.undefined
}

object ExecuteStatementResponse {
  @scala.inline
  def apply(
    columnMetadata: Metadata = null,
    generatedFields: FieldList = null,
    numberOfRecordsUpdated: js.UndefOr[RecordsUpdated] = js.undefined,
    records: SqlRecords = null
  ): ExecuteStatementResponse = {
    val __obj = js.Dynamic.literal()
    if (columnMetadata != null) __obj.updateDynamic("columnMetadata")(columnMetadata)
    if (generatedFields != null) __obj.updateDynamic("generatedFields")(generatedFields)
    if (!js.isUndefined(numberOfRecordsUpdated)) __obj.updateDynamic("numberOfRecordsUpdated")(numberOfRecordsUpdated)
    if (records != null) __obj.updateDynamic("records")(records)
    __obj.asInstanceOf[ExecuteStatementResponse]
  }
}

