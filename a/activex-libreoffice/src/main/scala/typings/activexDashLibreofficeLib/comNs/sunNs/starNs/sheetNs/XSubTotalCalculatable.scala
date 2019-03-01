package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * contains methods to handle a subtotal descriptor.
  *
  * The subtotal descriptor provides properties to set up the subtotal function.
  * @see com.sun.star.sheet.SheetCellRange
  * @see com.sun.star.sheet.SubTotalDescriptor
  */
trait XSubTotalCalculatable
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * creates subtotals using the settings of the passed descriptor.
    * @param xDescriptor the subtotal descriptor with the settings used for the subtotal operation.
    * @param bReplace if set to `TRUE` , replaces previous subtotal results.
    */
  def applySubTotals(xDescriptor: XSubTotalDescriptor, bReplace: scala.Boolean): scala.Unit
  /**
    * creates a subtotal descriptor.
    * @param bEmpty if set to `TRUE` , creates an empty descriptor. If set to `FALSE` , fills the descriptor with previous settings of the current object (i.e
    */
  def createSubTotalDescriptor(bEmpty: scala.Boolean): XSubTotalDescriptor
  /** removes the subtotals from the current object. */
  def removeSubTotals(): scala.Unit
}

object XSubTotalCalculatable {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    applySubTotals: js.Function2[XSubTotalDescriptor, scala.Boolean, scala.Unit],
    createSubTotalDescriptor: js.Function1[scala.Boolean, XSubTotalDescriptor],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeSubTotals: js.Function0[scala.Unit]
  ): XSubTotalCalculatable = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("applySubTotals")(applySubTotals)
    __obj.updateDynamic("createSubTotalDescriptor")(createSubTotalDescriptor)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeSubTotals")(removeSubTotals)
    __obj.asInstanceOf[XSubTotalCalculatable]
  }
}

