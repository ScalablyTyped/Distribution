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

object XSpreadsheetView {
  @scala.inline
  def apply(
    ActiveSheet: XSpreadsheet,
    acquire: js.Function0[scala.Unit],
    getActiveSheet: js.Function0[XSpreadsheet],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setActiveSheet: js.Function1[XSpreadsheet, scala.Unit]
  ): XSpreadsheetView = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ActiveSheet")(ActiveSheet)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getActiveSheet")(getActiveSheet)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("setActiveSheet")(setActiveSheet)
    __obj.asInstanceOf[XSpreadsheetView]
  }
}

