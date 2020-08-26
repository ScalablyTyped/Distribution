package typings.activexLibreoffice.com_.sun.star.ui.dialogs

import typings.activexLibreoffice.com_.sun.star.awt.XWindow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is the interface of a client-provided controller of a custom {@link Wizard} .
  * @since OOo 3.3
  */
@js.native
trait XWizardController extends js.Object {
  def canAdvance(): Boolean = js.native
  /**
    * called when the wizard is about to be finished.
    *
    * This method allows the controller to do any final checks, and ultimately veto finishing the wizard.
    */
  def confirmFinish(): Boolean = js.native
  /**
    * creates a page
    *
    * {@link Wizard} pages are created on demand, when the respective page is reached during traveling through the wizard. Effectively, this means the
    * method is called at most once for each possible page ID.
    * @param ParentWindow the parent window to use for the page window
    * @param PageId the ID of the page.
    * @returns the requested page.
    */
  def createPage(ParentWindow: XWindow, PageId: Double): XWizardPage = js.native
  /**
    * provides the title of a page given by ID
    *
    * The page titles are displayed in the wizard's roadmap.
    */
  def getPageTitle(PageId: Double): String = js.native
  /** called when a new page in the wizard is being activated */
  def onActivatePage(PageId: Double): Unit = js.native
  /** called when a page in the wizard is being deactivated */
  def onDeactivatePage(PageId: Double): Unit = js.native
}

object XWizardController {
  @scala.inline
  def apply(
    canAdvance: () => Boolean,
    confirmFinish: () => Boolean,
    createPage: (XWindow, Double) => XWizardPage,
    getPageTitle: Double => String,
    onActivatePage: Double => Unit,
    onDeactivatePage: Double => Unit
  ): XWizardController = {
    val __obj = js.Dynamic.literal(canAdvance = js.Any.fromFunction0(canAdvance), confirmFinish = js.Any.fromFunction0(confirmFinish), createPage = js.Any.fromFunction2(createPage), getPageTitle = js.Any.fromFunction1(getPageTitle), onActivatePage = js.Any.fromFunction1(onActivatePage), onDeactivatePage = js.Any.fromFunction1(onDeactivatePage))
    __obj.asInstanceOf[XWizardController]
  }
  @scala.inline
  implicit class XWizardControllerOps[Self <: XWizardController] (val x: Self) extends AnyVal {
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
    def setCanAdvance(value: () => Boolean): Self = this.set("canAdvance", js.Any.fromFunction0(value))
    @scala.inline
    def setConfirmFinish(value: () => Boolean): Self = this.set("confirmFinish", js.Any.fromFunction0(value))
    @scala.inline
    def setCreatePage(value: (XWindow, Double) => XWizardPage): Self = this.set("createPage", js.Any.fromFunction2(value))
    @scala.inline
    def setGetPageTitle(value: Double => String): Self = this.set("getPageTitle", js.Any.fromFunction1(value))
    @scala.inline
    def setOnActivatePage(value: Double => Unit): Self = this.set("onActivatePage", js.Any.fromFunction1(value))
    @scala.inline
    def setOnDeactivatePage(value: Double => Unit): Self = this.set("onDeactivatePage", js.Any.fromFunction1(value))
  }
  
}

