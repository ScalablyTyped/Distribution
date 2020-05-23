package typings.activexLibreoffice.com_.sun.star.table

import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies properties which describe sorting of fields (rows or columns) in a table.
  * @since OOo 1.1.2
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ trait TableSortDescriptor2 extends js.Object {
  /**
    * specifies if the columns or rows are to be sorted.
    *
    * **TRUE**: The columns are to be sorted.
    *
    * **FALSE**: The rows are to be sorted.
    */
  var IsSortColumns: Boolean
  /** contains the maximum number of sort fields the descriptor can hold. */
  var MaxSortFieldsCount: Double
  /**
    * specifies a list of individual sort fields.
    *
    * Each entry specifies properties that state the row/column to be sorted and how that should be done.
    */
  var SortFields: SafeArray[TableSortField]
}

object TableSortDescriptor2 {
  @scala.inline
  def apply(IsSortColumns: Boolean, MaxSortFieldsCount: Double, SortFields: SafeArray[TableSortField]): TableSortDescriptor2 = {
    val __obj = js.Dynamic.literal(IsSortColumns = IsSortColumns.asInstanceOf[js.Any], MaxSortFieldsCount = MaxSortFieldsCount.asInstanceOf[js.Any], SortFields = SortFields.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableSortDescriptor2]
  }
}

