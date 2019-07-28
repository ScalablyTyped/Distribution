package typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.TableSortDescriptor2
import typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.TableSortField
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes sort criteria for sorting paragraphs or table contents in a text document.
  * @since OOo 1.1.2
  */
trait TextSortDescriptor2 extends TableSortDescriptor2 {
  /** contains the character that marks the column separator when a selection of paragraphs is to be sorted. */
  var Delimiter: String
  /** determines if the content of a table or a selection of paragraphs is to be sorted. */
  var IsSortInTable: Boolean
}

object TextSortDescriptor2 {
  @scala.inline
  def apply(
    Delimiter: String,
    IsSortColumns: Boolean,
    IsSortInTable: Boolean,
    MaxSortFieldsCount: Double,
    SortFields: SafeArray[TableSortField]
  ): TextSortDescriptor2 = {
    val __obj = js.Dynamic.literal(Delimiter = Delimiter, IsSortColumns = IsSortColumns, IsSortInTable = IsSortInTable, MaxSortFieldsCount = MaxSortFieldsCount, SortFields = SortFields)
  
    __obj.asInstanceOf[TextSortDescriptor2]
  }
}

