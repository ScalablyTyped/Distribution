package typings.activexLibreoffice.com_.sun.star.sheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes how a single data column is treated when creating subtotals.
  * @see com.sun.star.sheet.SubTotalDescriptor
  */
@js.native
trait SubTotalColumn extends js.Object {
  /** the index of the column inside the source data area. */
  var Column: Double = js.native
  /** specifies what kind of subtotals are calculated. */
  var Function: GeneralFunction = js.native
}

object SubTotalColumn {
  @scala.inline
  def apply(Column: Double, Function: GeneralFunction): SubTotalColumn = {
    val __obj = js.Dynamic.literal(Column = Column.asInstanceOf[js.Any], Function = Function.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubTotalColumn]
  }
  @scala.inline
  implicit class SubTotalColumnOps[Self <: SubTotalColumn] (val x: Self) extends AnyVal {
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
    def setColumn(value: Double): Self = this.set("Column", value.asInstanceOf[js.Any])
    @scala.inline
    def setFunction(value: GeneralFunction): Self = this.set("Function", value.asInstanceOf[js.Any])
  }
  
}

