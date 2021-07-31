package typings.activexLibreoffice.com_.sun.star.ui.dialogs

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.awt.XWindow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is the main interface implemented by the {@link Wizard} services.
  *
  * A wizard is a dialog which guides the user through a number of tasks (usually input of data), which the user can accomplish either sequentially or
  * out-of-order. For this, a wizard is comprised of a number of tab pages, each page representing a single **step** .
  *
  * Sequential navigation in a wizard is done via a **Next** and a **Back** button. Non-sequential navigation is done via a roadmap, which is displayed on
  * the left hand side of the wizard dialog, lists all available steps, and allows jumping to a certain step (where the creator of the wizard can restrict
  * the available steps depending on the current situation in the wizard, see below).
  *
  * A sequence of steps in a wizard dialog is called a **path** . A given wizard can support one or multiple paths, which are declared at the time of
  * construction of the wizard.
  *
  * In the simplest case, where the wizard supports only one path, all available steps are displayed in the roadmap, and the user can simply travel
  * through them as desired.
  *
  * If the wizard is more complex, and supports multiple paths, things become more complicated. In a given situation of the wizard, where the user is at
  * step **k** of the current path, the **potential** or **conflicting** paths are those whose first **k** steps are the same as in the current path.
  * Obviously, there's at least one potential path in every situation: the current one. If there is more than one, then the future steps in the dialog are
  * not finally decided. In such a case, the roadmap will display future steps up to the point where the potential paths diverge, and then an item **...**
  * indicating that the order of steps is undecided.
  *
  * An {@link XWizardController} can declare a certain path as active path by calling the {@link activatePath()} method. Usually, this is done depending
  * on user input. For instance, your wizard could have radio buttons on the first page which effectively decide about which path to take in the wizard.
  *
  * Single steps in the wizard can be freely enabled and disabled, using the {@link enablePage()} method. Disabled pages are skipped during sequential
  * traveling, and not selectable in the roadmap.
  *
  * The state of the **Next** button in the dialog will be automatically maintained in most situations, depending on the results of calls to the {@link
  * XWizardController.canAdvance()} and {@link XWizardPage.canAdvance()} methods. More sophisticated wizard logic, however, will need manual calls to the
  * {@link enableButton()} method. Also, the **Finish** button needs to be maintained by the wizard's controller, too, as it cannot be decided generically
  * in which situations it should be enabled or disabled.
  * @see XWizardController
  * @see XWizardPage
  * @since OOo 3.3
  */
trait XWizard
  extends StObject
     with XExecutableDialog {
  
  /** provides access to the current page of the wizard */
  val CurrentPage: XWizardPage
  
  var DialogWindow: XWindow
  
  /** is the help URL of the wizard's main window. */
  var HelpURL: String
  
  /**
    * activates a path
    *
    * If the wizard has been created with multiple paths of control flow, then this method allows switching to another path.
    *
    * You can only activate a path which shares the first `k` pages with the path which is previously active (if any), where `k` is the index of the current
    * page within the current path.
    *
    * **Example** : Say you have paths, `(0,1,2,5)` and `(0,1,4,5)` (with the numbers denoting page IDs). This means that after page `1` , you either
    * continue with page `2` or state `4` ,and after this, you finish in state `5` . ;  Now if the first path is active, and your current state is `1` ,
    * then you can easily switch to the second path, since both paths start with `(0,1)` . ;  However, if your current state is `2` , then you can not
    * switch to the second path anymore.
    * @param PathIndex the index of the path, as used in the {@link Wizard.createMultiplePathsWizard()} constructor.
    * @param Final  If `TRUE` , the path will be completely activated, even if it is a conflicting path (i.e. there is another path which shares the first `k`
    * @throws com::sun::star::container::NoSuchElementException if there is no path with the given index
    * @throws com::sun::star::util::InvalidStateException if the path cannot be activated in the current state of the wizard.
    */
  def activatePath(PathIndex: Double, Final: Boolean): Unit
  
  /**
    * advances to the given page, if possible.
    *
    * Calling this method is equivalent to the user repeatedly pressing the **Next** button, until the given page is reached. Consequently, the method will
    * fail if one of the intermediate pages does not allow advancing to the next page.
    */
  def advanceTo(PageId: Double): Boolean
  
  /**
    * enables or disables a certain button in the wizard
    *
    * Normally, you will want to use this method for the **Finish** button only: The **Next** and **Back** buttons are usually maintained automatically, the
    * **Help** and **Cancel** buttons are unlikely to ever being disabled.
    * @param WizardButton denotes the button to enable or disable, as one of the {@link WizardButton} constants. Must not be {@link WizardButton.NONE} .
    * @param Enable specifies whether the button should be enabled ( `TRUE` ) or disabled ( `FALSE` )
    */
  def enableButton(WizardButton: Double, Enable: Boolean): Unit
  
  /**
    * enables or disables the given page
    *
    * You can use this method when not all pages of your wizard are necessarily needed in all cases. For instance, assume that your first wizard page
    * contains a check box, which the user can check to enter additional data. If you place this data on the second page, then you will want to enable this
    * second page if and only if the checkbox is checked.
    *
    * If a page is disabled, it can reached neither by clicking the respective item in the wizard's roadmap, nor by sequential traveling. Still, the page's
    * item is displayed in the roadmap, though disabled.
    * @throws com::sun::star::container::NoSuchElementException if there is no page with the given ID
    * @throws com::sun::star::util::InvalidStateException if the page shall be disabled, but is active currently.
    */
  def enablePage(PageID: Double, Enable: Boolean): Unit
  
  /** provides access to the current page of the wizard */
  def getCurrentPage(): XWizardPage
  
  /**
    * goes back to the given page, if possible.
    *
    * Calling this method is equivalent to the user repeatedly pressing the **Back** button, until the given page is reached.
    */
  def goBackTo(PageId: Double): Boolean
  
  /**
    * sets a button in the wizard as default button
    *
    * In general, the default button in a wizard is the one which is activated when the user presses the **return** key while the focus is in a control
    * which does not handle this key itself (such as ordinary input controls).
    *
    * You can use this method, for instance, to make the **Next** button the default button on all pages except the last one, where **Finish** should be
    * defaulted.
    */
  def setDefaultButton(WizardButton: Double): Unit
  
  /**
    * travels to the next page, if possible
    *
    * Calling this method is equivalent to the user pressing the **Next** button in the wizard. Consequently, the method will fail if in the current state
    * of the wizard, it is not allowed to advance to a next page.
    */
  def travelNext(): Boolean
  
  /**
    * travels to the next page, if possible
    *
    * Calling this method is equivalent to the user pressing the **Back** button in the wizard.
    */
  def travelPrevious(): Boolean
  
  /**
    * updates the wizard elements which are related to traveling.
    *
    * For instance, the **Next** button is disabled if the current page's {@link XWizardPage.canAdvance()} method returns `FALSE` .
    *
    * You usually call this method from within a wizard page whose state changed in a way that it affects the user's ability to reach other pages.
    */
  def updateTravelUI(): Unit
}
object XWizard {
  
  @scala.inline
  def apply(
    CurrentPage: XWizardPage,
    DialogWindow: XWindow,
    HelpURL: String,
    acquire: () => Unit,
    activatePath: (Double, Boolean) => Unit,
    advanceTo: Double => Boolean,
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
  ): XWizard = {
    val __obj = js.Dynamic.literal(CurrentPage = CurrentPage.asInstanceOf[js.Any], DialogWindow = DialogWindow.asInstanceOf[js.Any], HelpURL = HelpURL.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), activatePath = js.Any.fromFunction2(activatePath), advanceTo = js.Any.fromFunction1(advanceTo), enableButton = js.Any.fromFunction2(enableButton), enablePage = js.Any.fromFunction2(enablePage), execute = js.Any.fromFunction0(execute), getCurrentPage = js.Any.fromFunction0(getCurrentPage), goBackTo = js.Any.fromFunction1(goBackTo), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setDefaultButton = js.Any.fromFunction1(setDefaultButton), setTitle = js.Any.fromFunction1(setTitle), travelNext = js.Any.fromFunction0(travelNext), travelPrevious = js.Any.fromFunction0(travelPrevious), updateTravelUI = js.Any.fromFunction0(updateTravelUI))
    __obj.asInstanceOf[XWizard]
  }
  
  @scala.inline
  implicit class XWizardMutableBuilder[Self <: XWizard] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivatePath(value: (Double, Boolean) => Unit): Self = StObject.set(x, "activatePath", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAdvanceTo(value: Double => Boolean): Self = StObject.set(x, "advanceTo", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCurrentPage(value: XWizardPage): Self = StObject.set(x, "CurrentPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDialogWindow(value: XWindow): Self = StObject.set(x, "DialogWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableButton(value: (Double, Boolean) => Unit): Self = StObject.set(x, "enableButton", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEnablePage(value: (Double, Boolean) => Unit): Self = StObject.set(x, "enablePage", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetCurrentPage(value: () => XWizardPage): Self = StObject.set(x, "getCurrentPage", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGoBackTo(value: Double => Boolean): Self = StObject.set(x, "goBackTo", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHelpURL(value: String): Self = StObject.set(x, "HelpURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetDefaultButton(value: Double => Unit): Self = StObject.set(x, "setDefaultButton", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTravelNext(value: () => Boolean): Self = StObject.set(x, "travelNext", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTravelPrevious(value: () => Boolean): Self = StObject.set(x, "travelPrevious", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUpdateTravelUI(value: () => Unit): Self = StObject.set(x, "updateTravelUI", js.Any.fromFunction0(value))
  }
}
