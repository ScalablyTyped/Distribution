package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** is implemented by views that display {@link DrawPages} or {@link MasterPages} . */
trait XDrawView
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * returns the current page.
    * @returns the {@link DrawPage} or {@link MasterPage} that is currently displayed.
    */
  var CurrentPage: XDrawPage
  /**
    * returns the current page.
    * @returns the {@link DrawPage} or {@link MasterPage} that is currently displayed.
    */
  def getCurrentPage(): XDrawPage
  /**
    * changes the current page.
    * @param xPage this {@link DrawPage} or {@link MasterPage} will be displayed inside this view.
    */
  def setCurrentPage(xPage: XDrawPage): scala.Unit
}

object XDrawView {
  @scala.inline
  def apply(
    CurrentPage: XDrawPage,
    acquire: js.Function0[scala.Unit],
    getCurrentPage: js.Function0[XDrawPage],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setCurrentPage: js.Function1[XDrawPage, scala.Unit]
  ): XDrawView = {
    val __obj = js.Dynamic.literal(CurrentPage = CurrentPage, acquire = acquire, getCurrentPage = getCurrentPage, queryInterface = queryInterface, release = release, setCurrentPage = setCurrentPage)
  
    __obj.asInstanceOf[XDrawView]
  }
}

