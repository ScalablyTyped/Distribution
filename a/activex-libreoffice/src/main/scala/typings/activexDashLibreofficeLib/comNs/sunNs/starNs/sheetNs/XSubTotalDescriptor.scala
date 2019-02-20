package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to the collection of subtotal fields in a subtotal descriptor.
  * @see com.sun.star.sheet.SubTotalDescriptor
  */
trait XSubTotalDescriptor
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * adds a subtotal field definition to the descriptor.
    * @param aSubTotalColumns a sequence of all columns used to calculate subtotal values.
    * @param nGroupColumn specifies which column of the source range is used to group the contents of the source data.
    */
  def addNew(
    aSubTotalColumns: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[SubTotalColumn],
    nGroupColumn: scala.Double
  ): scala.Unit
  /** removes all subtotal field definitions from the descriptor. */
  def clear(): scala.Unit
}

