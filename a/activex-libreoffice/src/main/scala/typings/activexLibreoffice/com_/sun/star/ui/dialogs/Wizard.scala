package typings.activexLibreoffice.com_.sun.star.ui.dialogs

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.awt.XWindow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides a framework for implementing a wizard dialog.
  * @since OOo 3.3
  */
@js.native
trait Wizard extends XWizard {
  
  /**
    * creates a wizard with a multiple possible execution paths
    * @param PageIds the IDs of the pages which constitute the execution paths. IDs in each path must be in ascending order.
    * @param Controller the wizard controller.
    */
  def createMultiplePathsWizard(PageIds: SeqEquiv[SeqEquiv[Double]], Controller: XWizardController): Unit = js.native
  
  /**
    * creates a wizard with a single execution path
    * @param PageIds the IDs of the pages which constitute the execution path. IDs must be in ascending order.
    * @param Controller the wizard controller.
    */
  def createSinglePathWizard(PageIds: SeqEquiv[Double], Controller: XWizardController): Unit = js.native
}
object Wizard {
  
  @scala.inline
  def apply(
    CurrentPage: XWizardPage,
    DialogWindow: XWindow,
    HelpURL: String,
    acquire: () => Unit,
    activatePath: (Double, Boolean) => Unit,
    advanceTo: Double => Boolean,
    createMultiplePathsWizard: (SeqEquiv[SeqEquiv[Double]], XWizardController) => Unit,
    createSinglePathWizard: (SeqEquiv[Double], XWizardController) => Unit,
    enableButton: (Double, Boolean) => Unit,
    enablePage: (Double, Boolean) => Unit,
    execute: () => Double,
    getCurrentPage: () => XWizardPage,
    goBackTo: Double => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setDefaultButton: Double => Unit,
    setTitle: String => Unit,
    travelNext: () => Boolean,
    travelPrevious: () => Boolean,
    updateTravelUI: () => Unit
  ): Wizard = {
    val __obj = js.Dynamic.literal(CurrentPage = CurrentPage.asInstanceOf[js.Any], DialogWindow = DialogWindow.asInstanceOf[js.Any], HelpURL = HelpURL.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), activatePath = js.Any.fromFunction2(activatePath), advanceTo = js.Any.fromFunction1(advanceTo), createMultiplePathsWizard = js.Any.fromFunction2(createMultiplePathsWizard), createSinglePathWizard = js.Any.fromFunction2(createSinglePathWizard), enableButton = js.Any.fromFunction2(enableButton), enablePage = js.Any.fromFunction2(enablePage), execute = js.Any.fromFunction0(execute), getCurrentPage = js.Any.fromFunction0(getCurrentPage), goBackTo = js.Any.fromFunction1(goBackTo), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setDefaultButton = js.Any.fromFunction1(setDefaultButton), setTitle = js.Any.fromFunction1(setTitle), travelNext = js.Any.fromFunction0(travelNext), travelPrevious = js.Any.fromFunction0(travelPrevious), updateTravelUI = js.Any.fromFunction0(updateTravelUI))
    __obj.asInstanceOf[Wizard]
  }
  
  @scala.inline
  implicit class WizardMutableBuilder[Self <: Wizard] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateMultiplePathsWizard(value: (SeqEquiv[SeqEquiv[Double]], XWizardController) => Unit): Self = StObject.set(x, "createMultiplePathsWizard", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCreateSinglePathWizard(value: (SeqEquiv[Double], XWizardController) => Unit): Self = StObject.set(x, "createSinglePathWizard", js.Any.fromFunction2(value))
  }
}
