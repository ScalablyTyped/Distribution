package typings.activexDashLibreoffice.comNs.sunNs.starNs.sheetNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents something that can be filtered using an {@link XSheetFilterDescriptor} .
  * @see com.sun.star.sheet.XSheetFilterableEx
  */
trait XSheetFilterable extends XInterface {
  /**
    * creates a filter descriptor.
    * @param bEmpty if set to `TRUE` , creates an empty filter descriptor. If set to `FALSE` , fills the filter descriptor with previous settings of the curre
    */
  def createFilterDescriptor(bEmpty: Boolean): XSheetFilterDescriptor
  /**
    * performs a filter operation, using the settings of the passed filter descriptor.
    * @param xDescriptor the settings for the filter operation.
    */
  def filter(xDescriptor: XSheetFilterDescriptor): Unit
}

object XSheetFilterable {
  @scala.inline
  def apply(
    acquire: () => Unit,
    createFilterDescriptor: Boolean => XSheetFilterDescriptor,
    filter: XSheetFilterDescriptor => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XSheetFilterable = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createFilterDescriptor = js.Any.fromFunction1(createFilterDescriptor), filter = js.Any.fromFunction1(filter), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XSheetFilterable]
  }
}

