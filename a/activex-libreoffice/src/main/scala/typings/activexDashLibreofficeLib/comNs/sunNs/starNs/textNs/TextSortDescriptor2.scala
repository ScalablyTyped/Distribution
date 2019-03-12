package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes sort criteria for sorting paragraphs or table contents in a text document.
  * @since OOo 1.1.2
  */
trait TextSortDescriptor2
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.TableSortDescriptor2 {
  /** contains the character that marks the column separator when a selection of paragraphs is to be sorted. */
  var Delimiter: java.lang.String
  /** determines if the content of a table or a selection of paragraphs is to be sorted. */
  var IsSortInTable: scala.Boolean
}

object TextSortDescriptor2 {
  @scala.inline
  def apply(
    Delimiter: java.lang.String,
    IsSortColumns: scala.Boolean,
    IsSortInTable: scala.Boolean,
    MaxSortFieldsCount: scala.Double,
    SortFields: stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.TableSortField]
  ): TextSortDescriptor2 = {
    val __obj = js.Dynamic.literal(Delimiter = Delimiter, IsSortColumns = IsSortColumns, IsSortInTable = IsSortInTable, MaxSortFieldsCount = MaxSortFieldsCount, SortFields = SortFields)
  
    __obj.asInstanceOf[TextSortDescriptor2]
  }
}

