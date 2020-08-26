package typings.activexLibreoffice.com_.sun.star.presentation

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.drawing.XDrawPage
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** returns the handout master page for this document */
@js.native
trait XHandoutMasterSupplier extends XInterface {
  /** returns the {@link DrawPage} . */
  val HandoutMasterPage: XDrawPage = js.native
  /** returns the {@link DrawPage} . */
  def getHandoutMasterPage(): XDrawPage = js.native
}

object XHandoutMasterSupplier {
  @scala.inline
  def apply(
    HandoutMasterPage: XDrawPage,
    acquire: () => Unit,
    getHandoutMasterPage: () => XDrawPage,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XHandoutMasterSupplier = {
    val __obj = js.Dynamic.literal(HandoutMasterPage = HandoutMasterPage.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getHandoutMasterPage = js.Any.fromFunction0(getHandoutMasterPage), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XHandoutMasterSupplier]
  }
  @scala.inline
  implicit class XHandoutMasterSupplierOps[Self <: XHandoutMasterSupplier] (val x: Self) extends AnyVal {
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
    def setHandoutMasterPage(value: XDrawPage): Self = this.set("HandoutMasterPage", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetHandoutMasterPage(value: () => XDrawPage): Self = this.set("getHandoutMasterPage", js.Any.fromFunction0(value))
  }
  
}

