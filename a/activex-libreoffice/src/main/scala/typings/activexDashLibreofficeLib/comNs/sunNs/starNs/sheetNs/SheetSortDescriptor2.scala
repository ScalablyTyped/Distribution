package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * a description of how a cell range is to be sorted.
  *
  * This service extends the {@link com.sun.star.table.TableSortDescriptor2} service with spreadsheet specific properties.
  * @since OOo 1.1.2
  */
trait SheetSortDescriptor2
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.TableSortDescriptor2 {
  /** specifies if cell formats are moved with the contents they belong to. */
  var BindFormatsToContent: scala.Boolean
  /**
    * specifies whether the first row or column (depending on {@link com.sun.star.table.TableSortDescriptor.Orientation} ) is a header which should not be
    * sorted.
    */
  var ContainsHeader: scala.Boolean
  /** specifies if the sorted data should be copied to another position in the document. */
  var CopyOutputData: scala.Boolean
  /** specifies if a user defined sorting list is used. */
  var IsUserListEnabled: scala.Boolean
  /**
    * specifies the position where sorted data are to be copied.
    *
    * This property is only used, if {@link SheetSortDescriptor.CopyOutputData} is `TRUE` .
    */
  var OutputPosition: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress
  /**
    * specifies which user defined sorting list is used.
    *
    * This property is only used, if {@link SheetSortDescriptor.IsUserListEnabled} is `TRUE` .
    */
  var UserListIndex: scala.Double
}

