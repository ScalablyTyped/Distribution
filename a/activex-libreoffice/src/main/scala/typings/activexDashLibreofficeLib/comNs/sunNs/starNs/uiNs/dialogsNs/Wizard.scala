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
    acquire: js.Function0[scala.Unit],
    activatePath: js.Function2[scala.Double, scala.Boolean, scala.Unit],
    advanceTo: js.Function1[scala.Double, scala.Boolean],
    createMultiplePathsWizard: js.Function2[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]], 
      XWizardController, 
      scala.Unit
    ],
    createSinglePathWizard: js.Function2[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double], 
      XWizardController, 
      scala.Unit
    ],
    enableButton: js.Function2[scala.Double, scala.Boolean, scala.Unit],
    enablePage: js.Function2[scala.Double, scala.Boolean, scala.Unit],
    execute: js.Function0[scala.Double],
    getCurrentPage: js.Function0[XWizardPage],
    goBackTo: js.Function1[scala.Double, scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setDefaultButton: js.Function1[scala.Double, scala.Unit],
    setTitle: js.Function1[java.lang.String, scala.Unit],
    travelNext: js.Function0[scala.Boolean],
    travelPrevious: js.Function0[scala.Boolean],
    updateTravelUI: js.Function0[scala.Unit]
  ): Wizard = {
    val __obj = js.Dynamic.literal(CurrentPage = CurrentPage, DialogWindow = DialogWindow, HelpURL = HelpURL, acquire = acquire, activatePath = activatePath, advanceTo = advanceTo, createMultiplePathsWizard = createMultiplePathsWizard, createSinglePathWizard = createSinglePathWizard, enableButton = enableButton, enablePage = enablePage, execute = execute, getCurrentPage = getCurrentPage, goBackTo = goBackTo, queryInterface = queryInterface, release = release, setDefaultButton = setDefaultButton, setTitle = setTitle, travelNext = travelNext, travelPrevious = travelPrevious, updateTravelUI = updateTravelUI)
  
    __obj.asInstanceOf[Wizard]
  }
}

