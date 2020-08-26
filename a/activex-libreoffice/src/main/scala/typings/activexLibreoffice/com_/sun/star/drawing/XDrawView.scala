package typings.activexLibreoffice.com_.sun.star.drawing

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** is implemented by views that display {@link DrawPages} or {@link MasterPages} . */
@js.native
trait XDrawView extends XInterface {
  /**
    * returns the current page.
    * @returns the {@link DrawPage} or {@link MasterPage} that is currently displayed.
    */
  var CurrentPage: XDrawPage = js.native
  /**
    * returns the current page.
    * @returns the {@link DrawPage} or {@link MasterPage} that is currently displayed.
    */
  def getCurrentPage(): XDrawPage = js.native
  /**
    * changes the current page.
    * @param xPage this {@link DrawPage} or {@link MasterPage} will be displayed inside this view.
    */
  def setCurrentPage(xPage: XDrawPage): Unit = js.native
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
    val __obj = js.Dynamic.literal(CurrentPage = CurrentPage.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getCurrentPage = js.Any.fromFunction0(getCurrentPage), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setCurrentPage = js.Any.fromFunction1(setCurrentPage))
    __obj.asInstanceOf[XDrawView]
  }
  @scala.inline
  implicit class XDrawViewOps[Self <: XDrawView] (val x: Self) extends AnyVal {
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
    def setCurrentPage(value: XDrawPage): Self = this.set("CurrentPage", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetCurrentPage(value: () => XDrawPage): Self = this.set("getCurrentPage", js.Any.fromFunction0(value))
    @scala.inline
    def setSetCurrentPage(value: XDrawPage => Unit): Self = this.set("setCurrentPage", js.Any.fromFunction1(value))
  }
  
}

