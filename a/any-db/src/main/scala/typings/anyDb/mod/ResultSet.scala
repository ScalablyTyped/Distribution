package typings.anyDb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResultSet extends js.Object {
  /**
    * Not supported by all drivers.
    */
  var affectedRows: js.UndefOr[Double] = js.native
  /**
    * Not supported by all drivers.
    */
  var changedRows: js.UndefOr[Double] = js.native
  /**
    * Not supported by all drivers.
    */
  var fieldCount: js.UndefOr[Double] = js.native
  /**
    * Result field descriptions
    */
  var fields: js.Array[Field] = js.native
  /**
    * Not supported by all drivers.
    */
  var lastInsertId: js.UndefOr[js.Any] = js.native
  /**
    * Affected rows. Note e.g. for INSERT queries the rows property is not filled even
    * though rowCount is non-zero.
    */
  var rowCount: Double = js.native
  /**
    * Result rows
    */
  var rows: js.Array[_] = js.native
}

object ResultSet {
  @scala.inline
  def apply(fields: js.Array[Field], rowCount: Double, rows: js.Array[_]): ResultSet = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultSet]
  }
  @scala.inline
  implicit class ResultSetOps[Self <: ResultSet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFieldsVarargs(value: Field*): Self = this.set("fields", js.Array(value :_*))
    @scala.inline
    def setFields(value: js.Array[Field]): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def setRowCount(value: Double): Self = this.set("rowCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setRowsVarargs(value: js.Any*): Self = this.set("rows", js.Array(value :_*))
    @scala.inline
    def setRows(value: js.Array[_]): Self = this.set("rows", value.asInstanceOf[js.Any])
    @scala.inline
    def setAffectedRows(value: Double): Self = this.set("affectedRows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAffectedRows: Self = this.set("affectedRows", js.undefined)
    @scala.inline
    def setChangedRows(value: Double): Self = this.set("changedRows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChangedRows: Self = this.set("changedRows", js.undefined)
    @scala.inline
    def setFieldCount(value: Double): Self = this.set("fieldCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFieldCount: Self = this.set("fieldCount", js.undefined)
    @scala.inline
    def setLastInsertId(value: js.Any): Self = this.set("lastInsertId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastInsertId: Self = this.set("lastInsertId", js.undefined)
  }
  
}

