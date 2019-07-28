package typings.activexDashLibreoffice.comNs.sunNs.starNs.uiNs.dialogsNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.XWindow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is the interface of a client-provided controller of a custom {@link Wizard} .
  * @since OOo 3.3
  */
trait XWizardController extends js.Object {
  def canAdvance(): Boolean
  /**
    * called when the wizard is about to be finished.
    *
    * This method allows the controller to do any final checks, and ultimately veto finishing the wizard.
    */
  def confirmFinish(): Boolean
  /**
    * creates a page
    *
    * {@link Wizard} pages are created on demand, when the respective page is reached during traveling through the wizard. Effectively, this means the
    * method is called at most once for each possible page ID.
    * @param ParentWindow the parent window to use for the page window
    * @param PageId the ID of the page.
    * @returns the requested page.
    */
  def createPage(ParentWindow: XWindow, PageId: Double): XWizardPage
  /**
    * provides the title of a page given by ID
    *
    * The page titles are displayed in the wizard's roadmap.
    */
  def getPageTitle(PageId: Double): String
  /** called when a new page in the wizard is being activated */
  def onActivatePage(PageId: Double): Unit
  /** called when a page in the wizard is being deactivated */
  def onDeactivatePage(PageId: Double): Unit
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
}

