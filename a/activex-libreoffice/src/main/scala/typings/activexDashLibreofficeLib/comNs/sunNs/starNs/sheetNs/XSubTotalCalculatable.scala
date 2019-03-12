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
    acquire: () => scala.Unit,
    applySubTotals: (XSubTotalDescriptor, scala.Boolean) => scala.Unit,
    createSubTotalDescriptor: scala.Boolean => XSubTotalDescriptor,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeSubTotals: () => scala.Unit
  ): XSubTotalCalculatable = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), applySubTotals = js.Any.fromFunction2(applySubTotals), createSubTotalDescriptor = js.Any.fromFunction1(createSubTotalDescriptor), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeSubTotals = js.Any.fromFunction0(removeSubTotals))
  
    __obj.asInstanceOf[XSubTotalCalculatable]
  }
}

