package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** is the main interface of a {@link SpreadsheetView} . It manages the active sheet within this view. */
trait XSpreadsheetView
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** returns the sheet that is shown in the view. */
  var ActiveSheet: XSpreadsheet
  /** returns the sheet that is shown in the view. */
  def getActiveSheet(): XSpreadsheet
  /** sets the sheet that is shown in the view. */
  def setActiveSheet(xActiveSheet: XSpreadsheet): scala.Unit
}

