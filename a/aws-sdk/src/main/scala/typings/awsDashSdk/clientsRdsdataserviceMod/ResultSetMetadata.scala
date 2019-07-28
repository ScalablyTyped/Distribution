package typings.awsDashSdk.clientsRdsdataserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResultSetMetadata extends js.Object {
  /**
    * The number of columns in the result set.
    */
  var columnCount: js.UndefOr[Long] = js.undefined
  /**
    * The metadata of the columns in the result set.
    */
  var columnMetadata: js.UndefOr[Metadata] = js.undefined
}

object ResultSetMetadata {
  @scala.inline
  def apply(columnCount: js.UndefOr[Long] = js.undefined, columnMetadata: Metadata = null): ResultSetMetadata = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(columnCount)) __obj.updateDynamic("columnCount")(columnCount)
    if (columnMetadata != null) __obj.updateDynamic("columnMetadata")(columnMetadata)
    __obj.asInstanceOf[ResultSetMetadata]
  }
}

