package typings.activexDashLibreoffice.comNs.sunNs.starNs.sheetNs

import typings.activexDashLibreoffice.`type`
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

object XSheetFilterableEx {
  @scala.inline
  def apply(
    acquire: () => Unit,
    createFilterDescriptor: Boolean => XSheetFilterDescriptor,
    createFilterDescriptorByObject: XSheetFilterable => XSheetFilterDescriptor,
    filter: XSheetFilterDescriptor => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XSheetFilterableEx = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createFilterDescriptor = js.Any.fromFunction1(createFilterDescriptor), createFilterDescriptorByObject = js.Any.fromFunction1(createFilterDescriptorByObject), filter = js.Any.fromFunction1(filter), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XSheetFilterableEx]
  }
}

