package typings.anyDb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResultSet extends js.Object {
  /**
    * Not supported by all drivers.
    */
  var affectedRows: js.UndefOr[Double] = js.undefined
  /**
    * Not supported by all drivers.
    */
  var changedRows: js.UndefOr[Double] = js.undefined
  /**
    * Not supported by all drivers.
    */
  var fieldCount: js.UndefOr[Double] = js.undefined
  /**
    * Result field descriptions
    */
  var fields: js.Array[Field]
  /**
    * Not supported by all drivers.
    */
  var lastInsertId: js.UndefOr[js.Any] = js.undefined
  /**
    * Affected rows. Note e.g. for INSERT queries the rows property is not filled even
    * though rowCount is non-zero.
    */
  var rowCount: Double
  /**
    * Result rows
    */
  var rows: js.Array[_]
}

object ResultSet {
  @scala.inline
  def apply(
    fields: js.Array[Field],
    rowCount: Double,
    rows: js.Array[_],
    affectedRows: js.UndefOr[Double] = js.undefined,
    changedRows: js.UndefOr[Double] = js.undefined,
    fieldCount: js.UndefOr[Double] = js.undefined,
    lastInsertId: js.Any = null
  ): ResultSet = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    if (!js.isUndefined(affectedRows)) __obj.updateDynamic("affectedRows")(affectedRows.get.asInstanceOf[js.Any])
    if (!js.isUndefined(changedRows)) __obj.updateDynamic("changedRows")(changedRows.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fieldCount)) __obj.updateDynamic("fieldCount")(fieldCount.get.asInstanceOf[js.Any])
    if (lastInsertId != null) __obj.updateDynamic("lastInsertId")(lastInsertId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultSet]
  }
}

