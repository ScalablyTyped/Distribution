package typings
package awsDashSdkLib.clientsKinesisanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecordColumn extends js.Object {
  /**
    * Reference to the data element in the streaming input or the reference data source. This element is required if the RecordFormatType is JSON.
    */
  var Mapping: js.UndefOr[RecordColumnMapping] = js.undefined
  /**
    * Name of the column created in the in-application input stream or reference table.
    */
  var Name: RecordColumnName
  /**
    * Type of column created in the in-application input stream or reference table.
    */
  var SqlType: RecordColumnSqlType
}

object RecordColumn {
  @scala.inline
  def apply(Name: RecordColumnName, SqlType: RecordColumnSqlType, Mapping: RecordColumnMapping = null): RecordColumn = {
    val __obj = js.Dynamic.literal(Name = Name, SqlType = SqlType)
    if (Mapping != null) __obj.updateDynamic("Mapping")(Mapping)
    __obj.asInstanceOf[RecordColumn]
  }
}

