package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents something from which criteria for filtering can be read.
  *
  * In general the current object will be used only to create the descriptor to filter another object, i.e. the advanced filter feature in a spreadsheet.
  * @see com.sun.star.sheet.SheetCellRange
  */
trait XSheetFilterableEx extends XSheetFilterable {
  /** creates a filter descriptor for the specified filterable object from the contents of this object. */
  def createFilterDescriptorByObject(xObject: XSheetFilterable): XSheetFilterDescriptor
}

