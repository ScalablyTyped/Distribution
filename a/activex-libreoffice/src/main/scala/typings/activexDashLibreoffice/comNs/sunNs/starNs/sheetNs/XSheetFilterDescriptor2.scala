package typings.activexDashLibreoffice.comNs.sunNs.starNs.sheetNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.std.SafeArray
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
trait XSheetFilterDescriptor2 extends XInterface {
  /** returns the collection of filter fields. */
  var FilterFields2: SafeArray[TableFilterField2]
  /** returns the collection of filter fields. */
  def getFilterFields2(): SafeArray[TableFilterField2]
  /** sets a new collection of filter fields. */
  def setFilterFields2(aFilterFields: SeqEquiv[TableFilterField2]): Unit
}

object XSheetFilterDescriptor2 {
  @scala.inline
  def apply(
    FilterFields2: SafeArray[TableFilterField2],
    acquire: () => Unit,
    getFilterFields2: () => SafeArray[TableFilterField2],
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setFilterFields2: SeqEquiv[TableFilterField2] => Unit
  ): XSheetFilterDescriptor2 = {
    val __obj = js.Dynamic.literal(FilterFields2 = FilterFields2, acquire = js.Any.fromFunction0(acquire), getFilterFields2 = js.Any.fromFunction0(getFilterFields2), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setFilterFields2 = js.Any.fromFunction1(setFilterFields2))
  
    __obj.asInstanceOf[XSheetFilterDescriptor2]
  }
}

