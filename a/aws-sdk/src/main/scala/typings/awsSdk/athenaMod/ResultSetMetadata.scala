package typings.awsSdk.athenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResultSetMetadata extends js.Object {
  /**
    * Information about the columns returned in a query result metadata.
    */
  var ColumnInfo: js.UndefOr[ColumnInfoList] = js.native
}

object ResultSetMetadata {
  @scala.inline
  def apply(ColumnInfo: ColumnInfoList = null): ResultSetMetadata = {
    val __obj = js.Dynamic.literal()
    if (ColumnInfo != null) __obj.updateDynamic("ColumnInfo")(ColumnInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultSetMetadata]
  }
}

