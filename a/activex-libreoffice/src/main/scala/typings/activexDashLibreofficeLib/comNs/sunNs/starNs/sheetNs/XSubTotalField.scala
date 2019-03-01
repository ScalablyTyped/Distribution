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

object XSubTotalField {
  @scala.inline
  def apply(
    GroupColumn: scala.Double,
    SubTotalColumns: activexDashInteropLib.SafeArray[SubTotalColumn],
    acquire: js.Function0[scala.Unit],
    getGroupColumn: js.Function0[scala.Double],
    getSubTotalColumns: js.Function0[activexDashInteropLib.SafeArray[SubTotalColumn]],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setGroupColumn: js.Function1[scala.Double, scala.Unit],
    setSubTotalColumns: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[SubTotalColumn], scala.Unit]
  ): XSubTotalField = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("GroupColumn")(GroupColumn)
    __obj.updateDynamic("SubTotalColumns")(SubTotalColumns)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getGroupColumn")(getGroupColumn)
    __obj.updateDynamic("getSubTotalColumns")(getSubTotalColumns)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("setGroupColumn")(setGroupColumn)
    __obj.updateDynamic("setSubTotalColumns")(setSubTotalColumns)
    __obj.asInstanceOf[XSubTotalField]
  }
}

