package typings
package awsDashSdkLib.clientsRdsdataserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResultSetMetadata extends js.Object {
  /**
    * Number of columns
    */
  var columnCount: js.UndefOr[Long] = js.undefined
  /**
    * List of columns and their types
    */
  var columnMetadata: js.UndefOr[ColumnMetadataList] = js.undefined
}

object ResultSetMetadata {
  @scala.inline
  def apply(columnCount: js.UndefOr[Long] = js.undefined, columnMetadata: ColumnMetadataList = null): ResultSetMetadata = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(columnCount)) __obj.updateDynamic("columnCount")(columnCount)
    if (columnMetadata != null) __obj.updateDynamic("columnMetadata")(columnMetadata)
    __obj.asInstanceOf[ResultSetMetadata]
  }
}

