package typings.activexDashLibreoffice.comNs.sunNs.starNs.sheetNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.CellAddress
import typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.TableSortDescriptor2
import typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.TableSortField
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * a description of how a cell range is to be sorted.
  *
  * This service extends the {@link com.sun.star.table.TableSortDescriptor2} service with spreadsheet specific properties.
  * @since OOo 1.1.2
  */
trait SheetSortDescriptor2 extends TableSortDescriptor2 {
  /** specifies if cell formats are moved with the contents they belong to. */
  var BindFormatsToContent: Boolean
  /**
    * specifies whether the first row or column (depending on {@link com.sun.star.table.TableSortDescriptor.Orientation} ) is a header which should not be
    * sorted.
    */
  var ContainsHeader: Boolean
  /** specifies if the sorted data should be copied to another position in the document. */
  var CopyOutputData: Boolean
  /** specifies if a user defined sorting list is used. */
  var IsUserListEnabled: Boolean
  /**
    * specifies the position where sorted data are to be copied.
    *
    * This property is only used, if {@link SheetSortDescriptor.CopyOutputData} is `TRUE` .
    */
  var OutputPosition: CellAddress
  /**
    * specifies which user defined sorting list is used.
    *
    * This property is only used, if {@link SheetSortDescriptor.IsUserListEnabled} is `TRUE` .
    */
  var UserListIndex: Double
}

object SheetSortDescriptor2 {
  @scala.inline
  def apply(
    BindFormatsToContent: Boolean,
    ContainsHeader: Boolean,
    CopyOutputData: Boolean,
    IsSortColumns: Boolean,
    IsUserListEnabled: Boolean,
    MaxSortFieldsCount: Double,
    OutputPosition: CellAddress,
    SortFields: SafeArray[TableSortField],
    UserListIndex: Double
  ): SheetSortDescriptor2 = {
    val __obj = js.Dynamic.literal(BindFormatsToContent = BindFormatsToContent, ContainsHeader = ContainsHeader, CopyOutputData = CopyOutputData, IsSortColumns = IsSortColumns, IsUserListEnabled = IsUserListEnabled, MaxSortFieldsCount = MaxSortFieldsCount, OutputPosition = OutputPosition, SortFields = SortFields, UserListIndex = UserListIndex)
  
    __obj.asInstanceOf[SheetSortDescriptor2]
  }
}

