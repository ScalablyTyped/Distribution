package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents something that can be filtered using an {@link XSheetFilterDescriptor} .
  * @see com.sun.star.sheet.XSheetFilterableEx
  */
trait XSheetFilterable
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * creates a filter descriptor.
    * @param bEmpty if set to `TRUE` , creates an empty filter descriptor. If set to `FALSE` , fills the filter descriptor with previous settings of the curre
    */
  def createFilterDescriptor(bEmpty: scala.Boolean): XSheetFilterDescriptor
  /**
    * performs a filter operation, using the settings of the passed filter descriptor.
    * @param xDescriptor the settings for the filter operation.
    */
  def filter(xDescriptor: XSheetFilterDescriptor): scala.Unit
}

object XSheetFilterable {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    createFilterDescriptor: js.Function1[scala.Boolean, XSheetFilterDescriptor],
    filter: js.Function1[XSheetFilterDescriptor, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XSheetFilterable = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("createFilterDescriptor")(createFilterDescriptor)
    __obj.updateDynamic("filter")(filter)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XSheetFilterable]
  }
}

