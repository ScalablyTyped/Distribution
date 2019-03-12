package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.dialogsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides a framework for implementing a wizard dialog.
  * @since OOo 3.3
  */
trait Wizard extends XWizard {
  /**
    * creates a wizard with a multiple possible execution paths
    * @param PageIds the IDs of the pages which constitute the execution paths. IDs in each path must be in ascending order.
    * @param Controller the wizard controller.
    */
  def createMultiplePathsWizard(
    PageIds: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]],
    Controller: XWizardController
  ): scala.Unit
  /**
    * creates a wizard with a single execution path
    * @param PageIds the IDs of the pages which constitute the execution path. IDs must be in ascending order.
    * @param Controller the wizard controller.
    */
  def createSinglePathWizard(
    PageIds: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double],
    Controller: XWizardController
  ): scala.Unit
}

object Wizard {
  @scala.inline
  def apply(
    CurrentPage: XWizardPage,
    DialogWindow: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow,
    HelpURL: java.lang.String,
    acquire: () => scala.Unit,
    activatePath: (scala.Double, scala.Boolean) => scala.Unit,
    advanceTo: scala.Double => scala.Boolean,
    createMultiplePathsWizard: (activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]], XWizardController) => scala.Unit,
    createSinglePathWizard: (activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double], XWizardController) => scala.Unit,
    enableButton: (scala.Double, scala.Boolean) => scala.Unit,
    enablePage: (scala.Double, scala.Boolean) => scala.Unit,
    execute: () => scala.Double,
    getCurrentPage: () => XWizardPage,
    goBackTo: scala.Double => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setDefaultButton: scala.Double => scala.Unit,
    setTitle: java.lang.String => scala.Unit,
    travelNext: () => scala.Boolean,
    travelPrevious: () => scala.Boolean,
    updateTravelUI: () => scala.Unit
  ): Wizard = {
    val __obj = js.Dynamic.literal(CurrentPage = CurrentPage, DialogWindow = DialogWindow, HelpURL = HelpURL, acquire = js.Any.fromFunction0(acquire), activatePath = js.Any.fromFunction2(activatePath), advanceTo = js.Any.fromFunction1(advanceTo), createMultiplePathsWizard = js.Any.fromFunction2(createMultiplePathsWizard), createSinglePathWizard = js.Any.fromFunction2(createSinglePathWizard), enableButton = js.Any.fromFunction2(enableButton), enablePage = js.Any.fromFunction2(enablePage), execute = js.Any.fromFunction0(execute), getCurrentPage = js.Any.fromFunction0(getCurrentPage), goBackTo = js.Any.fromFunction1(goBackTo), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setDefaultButton = js.Any.fromFunction1(setDefaultButton), setTitle = js.Any.fromFunction1(setTitle), travelNext = js.Any.fromFunction0(travelNext), travelPrevious = js.Any.fromFunction0(travelPrevious), updateTravelUI = js.Any.fromFunction0(updateTravelUI))
  
    __obj.asInstanceOf[Wizard]
  }
}

