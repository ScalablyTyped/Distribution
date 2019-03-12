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
  var SubTotalColumns: stdLib.SafeArray[SubTotalColumn]
  /** returns the column by which entries are grouped. */
  def getGroupColumn(): scala.Double
  /** returns the definitions of which columns should have subtotals added to them. */
  def getSubTotalColumns(): stdLib.SafeArray[SubTotalColumn]
  /** sets the column by which entries are grouped. */
  def setGroupColumn(nGroupColumn: scala.Double): scala.Unit
  /** sets the definitions of which columns should have subtotals added to them. */
  def setSubTotalColumns(aSubTotalColumns: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[SubTotalColumn]): scala.Unit
}

object XSubTotalField {
  @scala.inline
  def apply(
    GroupColumn: scala.Double,
    SubTotalColumns: stdLib.SafeArray[SubTotalColumn],
    acquire: () => scala.Unit,
    getGroupColumn: () => scala.Double,
    getSubTotalColumns: () => stdLib.SafeArray[SubTotalColumn],
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setGroupColumn: scala.Double => scala.Unit,
    setSubTotalColumns: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[SubTotalColumn] => scala.Unit
  ): XSubTotalField = {
    val __obj = js.Dynamic.literal(GroupColumn = GroupColumn, SubTotalColumns = SubTotalColumns, acquire = js.Any.fromFunction0(acquire), getGroupColumn = js.Any.fromFunction0(getGroupColumn), getSubTotalColumns = js.Any.fromFunction0(getSubTotalColumns), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setGroupColumn = js.Any.fromFunction1(setGroupColumn), setSubTotalColumns = js.Any.fromFunction1(setSubTotalColumns))
  
    __obj.asInstanceOf[XSubTotalField]
  }
}

