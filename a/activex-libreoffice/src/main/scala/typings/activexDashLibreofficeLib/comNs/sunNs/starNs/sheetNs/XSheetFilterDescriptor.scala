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

