package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to a collection of filter conditions (filter fields).
  *
  * This interface uses the {@link TableFilterField3} struct. whereas the {@link XSheetFilterDescriptor2} interface uses the {@link TableFilterField2}
  * struct.
  * @see SheetFilterDescriptor2
  * @since LibreOffice 3.5
  */
trait XSheetFilterDescriptor3
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** returns the collection of filter fields. */
  var FilterFields3: activexDashInteropLib.SafeArray[TableFilterField3]
  /** returns the collection of filter fields. */
  def getFilterFields3(): activexDashInteropLib.SafeArray[TableFilterField3]
  /** sets a new collection of filter fields. */
  def setFilterFields3(aFilterFields: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[TableFilterField3]): scala.Unit
}

object XSheetFilterDescriptor3 {
  @scala.inline
  def apply(
    FilterFields3: activexDashInteropLib.SafeArray[TableFilterField3],
    acquire: js.Function0[scala.Unit],
    getFilterFields3: js.Function0[activexDashInteropLib.SafeArray[TableFilterField3]],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setFilterFields3: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[TableFilterField3], scala.Unit]
  ): XSheetFilterDescriptor3 = {
    val __obj = js.Dynamic.literal(FilterFields3 = FilterFields3, acquire = acquire, getFilterFields3 = getFilterFields3, queryInterface = queryInterface, release = release, setFilterFields3 = setFilterFields3)
  
    __obj.asInstanceOf[XSheetFilterDescriptor3]
  }
}

