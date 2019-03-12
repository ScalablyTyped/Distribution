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
  var FilterFields2: stdLib.SafeArray[TableFilterField2]
  /** returns the collection of filter fields. */
  def getFilterFields2(): stdLib.SafeArray[TableFilterField2]
  /** sets a new collection of filter fields. */
  def setFilterFields2(aFilterFields: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[TableFilterField2]): scala.Unit
}

object XSheetFilterDescriptor2 {
  @scala.inline
  def apply(
    FilterFields2: stdLib.SafeArray[TableFilterField2],
    acquire: () => scala.Unit,
    getFilterFields2: () => stdLib.SafeArray[TableFilterField2],
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setFilterFields2: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[TableFilterField2] => scala.Unit
  ): XSheetFilterDescriptor2 = {
    val __obj = js.Dynamic.literal(FilterFields2 = FilterFields2, acquire = js.Any.fromFunction0(acquire), getFilterFields2 = js.Any.fromFunction0(getFilterFields2), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setFilterFields2 = js.Any.fromFunction1(setFilterFields2))
  
    __obj.asInstanceOf[XSheetFilterDescriptor2]
  }
}

