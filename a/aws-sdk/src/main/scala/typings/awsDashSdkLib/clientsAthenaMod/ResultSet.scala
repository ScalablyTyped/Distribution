package typings
package awsDashSdkLib.clientsAthenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResultSet extends js.Object {
  /**
    * The metadata that describes the column structure and data types of a table of query results.
    */
  var ResultSetMetadata: js.UndefOr[ResultSetMetadata] = js.undefined
  /**
    * The rows in the table.
    */
  var Rows: js.UndefOr[RowList] = js.undefined
}

object ResultSet {
  @scala.inline
  def apply(ResultSetMetadata: ResultSetMetadata = null, Rows: RowList = null): ResultSet = {
    val __obj = js.Dynamic.literal()
    if (ResultSetMetadata != null) __obj.updateDynamic("ResultSetMetadata")(ResultSetMetadata)
    if (Rows != null) __obj.updateDynamic("Rows")(Rows)
    __obj.asInstanceOf[ResultSet]
  }
}

