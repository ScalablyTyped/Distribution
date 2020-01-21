package typings.awsSdk.athenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResultSet extends js.Object {
  /**
    * The metadata that describes the column structure and data types of a table of query results.
    */
  var ResultSetMetadata: js.UndefOr[typings.awsSdk.athenaMod.ResultSetMetadata] = js.native
  /**
    * The rows in the table.
    */
  var Rows: js.UndefOr[RowList] = js.native
}

object ResultSet {
  @scala.inline
  def apply(ResultSetMetadata: ResultSetMetadata = null, Rows: RowList = null): ResultSet = {
    val __obj = js.Dynamic.literal()
    if (ResultSetMetadata != null) __obj.updateDynamic("ResultSetMetadata")(ResultSetMetadata.asInstanceOf[js.Any])
    if (Rows != null) __obj.updateDynamic("Rows")(Rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultSet]
  }
}

