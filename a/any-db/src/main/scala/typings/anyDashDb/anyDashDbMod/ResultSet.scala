package typings.anyDashDb.anyDashDbMod

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
    affectedRows: Int | Double = null,
    changedRows: Int | Double = null,
    fieldCount: Int | Double = null,
    lastInsertId: js.Any = null
  ): ResultSet = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    if (affectedRows != null) __obj.updateDynamic("affectedRows")(affectedRows.asInstanceOf[js.Any])
    if (changedRows != null) __obj.updateDynamic("changedRows")(changedRows.asInstanceOf[js.Any])
    if (fieldCount != null) __obj.updateDynamic("fieldCount")(fieldCount.asInstanceOf[js.Any])
    if (lastInsertId != null) __obj.updateDynamic("lastInsertId")(lastInsertId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultSet]
  }
}

