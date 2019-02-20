package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents a description of how a cell range is to be filtered.
  *
  * The descriptor contains properties and a collection of filter conditions (filter fields) which control the behavior of a filter operation.
  */
trait SheetFilterDescriptor
  extends XSheetFilterDescriptor
     with XSheetFilterDescriptor2
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet {
  /** specifies if the first row (or column) contains headers which should not be filtered. */
  var ContainsHeader: scala.Boolean
  /** specifies if the filtered data should be copied to another position in the document. */
  var CopyOutputData: scala.Boolean
  /** specifies if the case of letters is important when comparing entries. */
  var IsCaseSensitive: scala.Boolean
  /**
    * returns the maximum number of filter fields in the descriptor.
    *
    * This read-only property indicates the maximum count of fields the current implementation supports.
    */
  var MaxFieldCount: scala.Double
  /** specifies if columns or rows are filtered. */
  var Orientation: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.TableOrientation
  /**
    * specifies the position where filtered data are to be copied.
    *
    * This is only used if {@link SheetFilterDescriptor.CopyOutputData} is `TRUE` .
    */
  var OutputPosition: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress
  /**
    * specifies if the {@link SheetFilterDescriptor.OutputPosition} position is saved for future calls.
    *
    * This is only used if {@link SheetFilterDescriptor.CopyOutputData} is `TRUE` .
    */
  var SaveOutputPosition: scala.Boolean
  /** specifies if duplicate entries are left out of the result. */
  var SkipDuplicates: scala.Boolean
  /** specifies if the {@link TableFilterField.StringValue} strings are interpreted as regular expressions. */
  var UseRegularExpressions: scala.Boolean
}

