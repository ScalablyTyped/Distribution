package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * a description of how a cell range is to be sorted.
  *
  * This service extends the {@link com.sun.star.table.TableSortDescriptor} service with spreadsheet specific properties.
  */
trait SheetSortDescriptor
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.TableSortDescriptor {
  /** specifies if cell formats are moved with the contents they belong to. */
  var BindFormatsToContent: scala.Boolean
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

