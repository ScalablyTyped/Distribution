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

object XSheetFilterableEx {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    createFilterDescriptor: js.Function1[scala.Boolean, XSheetFilterDescriptor],
    createFilterDescriptorByObject: js.Function1[XSheetFilterable, XSheetFilterDescriptor],
    filter: js.Function1[XSheetFilterDescriptor, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XSheetFilterableEx = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("createFilterDescriptor")(createFilterDescriptor)
    __obj.updateDynamic("createFilterDescriptorByObject")(createFilterDescriptorByObject)
    __obj.updateDynamic("filter")(filter)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XSheetFilterableEx]
  }
}

