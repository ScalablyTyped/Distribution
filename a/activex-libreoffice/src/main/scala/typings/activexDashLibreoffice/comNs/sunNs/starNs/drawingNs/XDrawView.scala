package typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** is implemented by views that display {@link DrawPages} or {@link MasterPages} . */
trait XDrawView extends XInterface {
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
  def setCurrentPage(xPage: XDrawPage): Unit
}

object XDrawView {
  @scala.inline
  def apply(
    CurrentPage: XDrawPage,
    acquire: () => Unit,
    getCurrentPage: () => XDrawPage,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setCurrentPage: XDrawPage => Unit
  ): XDrawView = {
    val __obj = js.Dynamic.literal(CurrentPage = CurrentPage, acquire = js.Any.fromFunction0(acquire), getCurrentPage = js.Any.fromFunction0(getCurrentPage), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setCurrentPage = js.Any.fromFunction1(setCurrentPage))
  
    __obj.asInstanceOf[XDrawView]
  }
}

