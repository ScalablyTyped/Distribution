package typings
package awsDashSdkLib.clientsKinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecordColumn extends js.Object {
  /**
    * A reference to the data element in the streaming input or the reference data source.
    */
  var Mapping: js.UndefOr[RecordColumnMapping] = js.undefined
  /**
    * The name of the column that is created in the in-application input stream or reference table.
    */
  var Name: RecordColumnName
  /**
    * The type of column created in the in-application input stream or reference table.
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

