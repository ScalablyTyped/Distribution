package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to a collection of filter conditions (filter fields).
  * @see SheetFilterDescriptor
  */
trait XSheetFilterDescriptor
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** returns the collection of filter fields. */
  var FilterFields: activexDashInteropLib.SafeArray[TableFilterField]
  /** returns the collection of filter fields. */
  def getFilterFields(): activexDashInteropLib.SafeArray[TableFilterField]
  /** sets a new collection of filter fields. */
  def setFilterFields(aFilterFields: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[TableFilterField]): scala.Unit
}

object XSheetFilterDescriptor {
  @scala.inline
  def apply(
    FilterFields: activexDashInteropLib.SafeArray[TableFilterField],
    acquire: js.Function0[scala.Unit],
    getFilterFields: js.Function0[activexDashInteropLib.SafeArray[TableFilterField]],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setFilterFields: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[TableFilterField], scala.Unit]
  ): XSheetFilterDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("FilterFields")(FilterFields)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getFilterFields")(getFilterFields)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("setFilterFields")(setFilterFields)
    __obj.asInstanceOf[XSheetFilterDescriptor]
  }
}

