package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to the settings of a field in a subtotal descriptor.
  * @see com.sun.star.sheet.SubTotalField
  * @see com.sun.star.sheet.SubTotalDescriptor
  */
trait XSubTotalField
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** returns the column by which entries are grouped. */
  var GroupColumn: scala.Double
  /** returns the definitions of which columns should have subtotals added to them. */
  var SubTotalColumns: activexDashInteropLib.SafeArray[SubTotalColumn]
  /** returns the column by which entries are grouped. */
  def getGroupColumn(): scala.Double
  /** returns the definitions of which columns should have subtotals added to them. */
  def getSubTotalColumns(): activexDashInteropLib.SafeArray[SubTotalColumn]
  /** sets the column by which entries are grouped. */
  def setGroupColumn(nGroupColumn: scala.Double): scala.Unit
  /** sets the definitions of which columns should have subtotals added to them. */
  def setSubTotalColumns(aSubTotalColumns: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[SubTotalColumn]): scala.Unit
}

