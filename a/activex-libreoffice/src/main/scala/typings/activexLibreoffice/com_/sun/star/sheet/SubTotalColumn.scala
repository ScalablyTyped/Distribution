package typings.activexLibreoffice.com_.sun.star.sheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes how a single data column is treated when creating subtotals.
  * @see com.sun.star.sheet.SubTotalDescriptor
  */
trait SubTotalColumn extends js.Object {
  /** the index of the column inside the source data area. */
  var Column: Double
  /** specifies what kind of subtotals are calculated. */
  var Function: GeneralFunction
}

object SubTotalColumn {
  @scala.inline
  def apply(Column: Double, Function: GeneralFunction): SubTotalColumn = {
    val __obj = js.Dynamic.literal(Column = Column.asInstanceOf[js.Any], Function = Function.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubTotalColumn]
  }
}

