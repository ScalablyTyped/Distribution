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

