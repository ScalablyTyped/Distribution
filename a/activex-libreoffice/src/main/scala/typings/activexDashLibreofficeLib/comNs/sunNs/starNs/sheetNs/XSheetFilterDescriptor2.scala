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

