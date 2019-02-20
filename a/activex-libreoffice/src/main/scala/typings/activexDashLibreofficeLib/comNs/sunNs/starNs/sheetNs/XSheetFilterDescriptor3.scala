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

