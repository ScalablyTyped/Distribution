package typings.activexLibreoffice.com_.sun.star.ucb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * contains information for sorting a {@link ContentResultSet} .
  *
  * In contrast to the struct {@link SortingInfo} this struct is used to be on the safe side, that no one asks for sorting by a property which is not
  * contained in a {@link ContentResultSet} .
  */
@js.native
trait NumberedSortingInfo extends js.Object {
  /** contains a flag indicating the sort mode (ascending or descending). */
  var Ascending: Boolean = js.native
  /** sort the result set by this column. Index starts with `1` . */
  var ColumnIndex: Double = js.native
}

object NumberedSortingInfo {
  @scala.inline
  def apply(Ascending: Boolean, ColumnIndex: Double): NumberedSortingInfo = {
    val __obj = js.Dynamic.literal(Ascending = Ascending.asInstanceOf[js.Any], ColumnIndex = ColumnIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberedSortingInfo]
  }
  @scala.inline
  implicit class NumberedSortingInfoOps[Self <: NumberedSortingInfo] (val x: Self) extends AnyVal {
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
    def setAscending(value: Boolean): Self = this.set("Ascending", value.asInstanceOf[js.Any])
    @scala.inline
    def setColumnIndex(value: Double): Self = this.set("ColumnIndex", value.asInstanceOf[js.Any])
  }
  
}

