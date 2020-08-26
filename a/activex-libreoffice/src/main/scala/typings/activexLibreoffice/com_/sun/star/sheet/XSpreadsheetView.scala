package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** is the main interface of a {@link SpreadsheetView} . It manages the active sheet within this view. */
@js.native
trait XSpreadsheetView extends XInterface {
  /** returns the sheet that is shown in the view. */
  var ActiveSheet: XSpreadsheet = js.native
  /** returns the sheet that is shown in the view. */
  def getActiveSheet(): XSpreadsheet = js.native
  /** sets the sheet that is shown in the view. */
  def setActiveSheet(xActiveSheet: XSpreadsheet): Unit = js.native
}

object XSpreadsheetView {
  @scala.inline
  def apply(
    ActiveSheet: XSpreadsheet,
    acquire: () => Unit,
    getActiveSheet: () => XSpreadsheet,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setActiveSheet: XSpreadsheet => Unit
  ): XSpreadsheetView = {
    val __obj = js.Dynamic.literal(ActiveSheet = ActiveSheet.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getActiveSheet = js.Any.fromFunction0(getActiveSheet), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setActiveSheet = js.Any.fromFunction1(setActiveSheet))
    __obj.asInstanceOf[XSpreadsheetView]
  }
  @scala.inline
  implicit class XSpreadsheetViewOps[Self <: XSpreadsheetView] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setActiveSheet(value: XSpreadsheet): Self = this.set("ActiveSheet", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetActiveSheet(value: () => XSpreadsheet): Self = this.set("getActiveSheet", js.Any.fromFunction0(value))
    @scala.inline
    def setSetActiveSheet(value: XSpreadsheet => Unit): Self = this.set("setActiveSheet", js.Any.fromFunction1(value))
  }
  
}

