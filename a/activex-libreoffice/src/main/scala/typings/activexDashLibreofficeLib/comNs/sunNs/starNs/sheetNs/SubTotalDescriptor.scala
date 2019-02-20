package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents a description of how subtotals are created.
  *
  * The descriptor contains properties and a collection of subtotal fields which control the behavior of operation.
  */
trait SubTotalDescriptor
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XEnumerationAccess
     with XSubTotalDescriptor
     with activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet {
  /** specifies if cell formats are moved with the contents they belong to. */
  var BindFormatsToContent: scala.Boolean
  /** specifies if the contents of the fields will be sorted to groups while performing a subtotal operation. */
  var EnableSort: scala.Boolean
  /** specifies if a user defined sorting list is used. */
  var EnableUserSortList: scala.Boolean
  /** specifies if page breaks are inserted after each group change. */
  var InsertPageBreaks: scala.Boolean
  /** specifies if the case of letters is important when comparing entries. */
  var IsCaseSensitive: scala.Boolean
  /**
    * returns the maximum number of subtotal fields the descriptor can hold.
    *
    * This read-only property indicates the maximum count of fields the current implementation supports.
    */
  var MaxFieldCount: scala.Double
  /** specifies the sorting order if {@link SubTotalDescriptor.EnableSort} is set to `TRUE` . */
  var SortAscending: scala.Boolean
  /**
    * specifies which user defined sorting list is used.
    *
    * This property is only used if {@link SubTotalDescriptor.EnableUserSortList} is `TRUE` .
    */
  var UserSortListIndex: scala.Double
}

