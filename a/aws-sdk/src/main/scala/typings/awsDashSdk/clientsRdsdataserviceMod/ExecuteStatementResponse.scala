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
    * Values for fields generated during the request.  &lt;note&gt; &lt;p&gt;The &lt;code&gt;generatedFields&lt;/code&gt; data isn't supported by Aurora PostgreSQL. To get the values of generated fields, use the &lt;code&gt;RETURNING&lt;/code&gt; clause. For more information, see &lt;a href=&quot;https://www.postgresql.org/docs/10/dml-returning.html&quot;&gt;Returning Data From Modified Rows&lt;/a&gt; in the PostgreSQL documentation.&lt;/p&gt; &lt;/note&gt; 
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

