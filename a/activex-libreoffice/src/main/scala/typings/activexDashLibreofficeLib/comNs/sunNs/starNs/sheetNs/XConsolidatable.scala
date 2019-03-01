package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides methods to consolidate ranges in a spreadsheet document.
  *
  * Consolidation combines the cells of multiple cell ranges, using a specific function.
  * @deprecated Deprecated
  */
trait XConsolidatable
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * consolidates data from several cell ranges, using the settings in the passed descriptor.
    * @param xDescriptor the descriptor used to perform the consolidation.
    * @see com.sun.star.sheet.ConsolidationDescriptor
    */
  def consolidate(xDescriptor: XConsolidationDescriptor): scala.Unit
  /**
    * creates a consolidation descriptor.
    * @param bEmpty `TRUE` leaves the descriptor empty, `FALSE` fills it with the settings from the last consolidation action.
    * @see com.sun.star.sheet.ConsolidationDescriptor
    */
  def createConsolidationDescriptor(bEmpty: scala.Boolean): XConsolidationDescriptor
}

object XConsolidatable {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    consolidate: js.Function1[XConsolidationDescriptor, scala.Unit],
    createConsolidationDescriptor: js.Function1[scala.Boolean, XConsolidationDescriptor],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XConsolidatable = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("consolidate")(consolidate)
    __obj.updateDynamic("createConsolidationDescriptor")(createConsolidationDescriptor)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XConsolidatable]
  }
}

