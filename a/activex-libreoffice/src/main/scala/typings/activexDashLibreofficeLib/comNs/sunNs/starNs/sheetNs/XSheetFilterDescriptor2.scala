package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to a collection of filter conditions (filter fields).
  *
  * This interface uses the {@link TableFilterField2} struct, whereas the {@link XSheetFilterDescriptor} interface uses the {@link TableFilterField}
  * struct.
  * @see SheetFilterDescriptor
  * @since OOo 3.2
  */
trait XSheetFilterDescriptor2
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** returns the collection of filter fields. */
  var FilterFields2: activexDashInteropLib.SafeArray[TableFilterField2]
  /** returns the collection of filter fields. */
  def getFilterFields2(): activexDashInteropLib.SafeArray[TableFilterField2]
  /** sets a new collection of filter fields. */
  def setFilterFields2(aFilterFields: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[TableFilterField2]): scala.Unit
}

object XSheetFilterDescriptor2 {
  @scala.inline
  def apply(
    FilterFields2: activexDashInteropLib.SafeArray[TableFilterField2],
    acquire: js.Function0[scala.Unit],
    getFilterFields2: js.Function0[activexDashInteropLib.SafeArray[TableFilterField2]],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setFilterFields2: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[TableFilterField2], scala.Unit]
  ): XSheetFilterDescriptor2 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("FilterFields2")(FilterFields2)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getFilterFields2")(getFilterFields2)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("setFilterFields2")(setFilterFields2)
    __obj.asInstanceOf[XSheetFilterDescriptor2]
  }
}

