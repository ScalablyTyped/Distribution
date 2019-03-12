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
  var FilterFields: stdLib.SafeArray[TableFilterField]
  /** returns the collection of filter fields. */
  def getFilterFields(): stdLib.SafeArray[TableFilterField]
  /** sets a new collection of filter fields. */
  def setFilterFields(aFilterFields: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[TableFilterField]): scala.Unit
}

object XSheetFilterDescriptor {
  @scala.inline
  def apply(
    FilterFields: stdLib.SafeArray[TableFilterField],
    acquire: () => scala.Unit,
    getFilterFields: () => stdLib.SafeArray[TableFilterField],
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setFilterFields: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[TableFilterField] => scala.Unit
  ): XSheetFilterDescriptor = {
    val __obj = js.Dynamic.literal(FilterFields = FilterFields, acquire = js.Any.fromFunction0(acquire), getFilterFields = js.Any.fromFunction0(getFilterFields), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setFilterFields = js.Any.fromFunction1(setFilterFields))
  
    __obj.asInstanceOf[XSheetFilterDescriptor]
  }
}

