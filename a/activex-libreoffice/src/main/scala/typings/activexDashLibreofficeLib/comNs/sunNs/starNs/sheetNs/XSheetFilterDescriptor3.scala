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
  var FilterFields3: stdLib.SafeArray[TableFilterField3]
  /** returns the collection of filter fields. */
  def getFilterFields3(): stdLib.SafeArray[TableFilterField3]
  /** sets a new collection of filter fields. */
  def setFilterFields3(aFilterFields: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[TableFilterField3]): scala.Unit
}

object XSheetFilterDescriptor3 {
  @scala.inline
  def apply(
    FilterFields3: stdLib.SafeArray[TableFilterField3],
    acquire: () => scala.Unit,
    getFilterFields3: () => stdLib.SafeArray[TableFilterField3],
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setFilterFields3: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[TableFilterField3] => scala.Unit
  ): XSheetFilterDescriptor3 = {
    val __obj = js.Dynamic.literal(FilterFields3 = FilterFields3, acquire = js.Any.fromFunction0(acquire), getFilterFields3 = js.Any.fromFunction0(getFilterFields3), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setFilterFields3 = js.Any.fromFunction1(setFilterFields3))
  
    __obj.asInstanceOf[XSheetFilterDescriptor3]
  }
}

