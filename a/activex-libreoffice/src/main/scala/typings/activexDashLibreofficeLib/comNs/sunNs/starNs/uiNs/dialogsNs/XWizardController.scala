package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.dialogsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is the interface of a client-provided controller of a custom {@link Wizard} .
  * @since OOo 3.3
  */
trait XWizardController extends js.Object {
  def canAdvance(): scala.Boolean
  /**
    * called when the wizard is about to be finished.
    *
    * This method allows the controller to do any final checks, and ultimately veto finishing the wizard.
    */
  def confirmFinish(): scala.Boolean
  /**
    * creates a page
    *
    * {@link Wizard} pages are created on demand, when the respective page is reached during traveling through the wizard. Effectively, this means the
    * method is called at most once for each possible page ID.
    * @param ParentWindow the parent window to use for the page window
    * @param PageId the ID of the page.
    * @returns the requested page.
    */
  def createPage(ParentWindow: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow, PageId: scala.Double): XWizardPage
  /**
    * provides the title of a page given by ID
    *
    * The page titles are displayed in the wizard's roadmap.
    */
  def getPageTitle(PageId: scala.Double): java.lang.String
  /** called when a new page in the wizard is being activated */
  def onActivatePage(PageId: scala.Double): scala.Unit
  /** called when a page in the wizard is being deactivated */
  def onDeactivatePage(PageId: scala.Double): scala.Unit
}

object XWizardController {
  @scala.inline
  def apply(
    canAdvance: js.Function0[scala.Boolean],
    confirmFinish: js.Function0[scala.Boolean],
    createPage: js.Function2[
      activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow, 
      scala.Double, 
      XWizardPage
    ],
    getPageTitle: js.Function1[scala.Double, java.lang.String],
    onActivatePage: js.Function1[scala.Double, scala.Unit],
    onDeactivatePage: js.Function1[scala.Double, scala.Unit]
  ): XWizardController = {
    val __obj = js.Dynamic.literal(canAdvance = canAdvance, confirmFinish = confirmFinish, createPage = createPage, getPageTitle = getPageTitle, onActivatePage = onActivatePage, onDeactivatePage = onDeactivatePage)
  
    __obj.asInstanceOf[XWizardController]
  }
}

