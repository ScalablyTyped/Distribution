package typings.activexLibreoffice.com_.sun.star.ui.dialogs

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.awt.XWindow
import typings.activexLibreoffice.com_.sun.star.lang.XComponent
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is a single page of a {@link Wizard}
  * @since OOo 3.3
  */
trait XWizardPage
  extends StObject
     with XComponent {
  
  /**
    * denotes the ID of the page.
    *
    * Within a wizard, no two pages are allowed to have the same ID.
    */
  var PageId: Double
  
  /** provides read-only access to the window of the page */
  var Window: XWindow
  
  /** called when the page is activated */
  def activatePage(): Unit
  
  /**
    * determines whether it is allowed to travel to a later page in the wizard
    *
    * You should base this decision on the state of the page only, not on a global state of the wizard. Usually, you return `FALSE` here if and only if not
    * all necessary input on the page has been provided by the user, or the provided input is not valid.
    *
    * If checked for validity is expensive, or if you prefer giving your user more detailed feedback on validity than a disabled `Next` button in the
    * wizard, then move your checks to the {@link commitPage()} method.
    */
  def canAdvance(): Boolean
  
  /**
    * is called when the page is about to be left
    *
    * An implementation can veto the leave by returning `FALSE` here. Usually, the decision about this depends on the current state of the page.
    * @param Reason is one of the {@link WizardTravelType} constants denoting the reason why the page should be committed.
    */
  def commitPage(Reason: Double): Boolean
}
object XWizardPage {
  
  inline def apply(
    PageId: Double,
    Window: XWindow,
    acquire: () => Unit,
    activatePage: () => Unit,
    addEventListener: XEventListener => Unit,
    canAdvance: () => Boolean,
    commitPage: Double => Boolean,
    dispose: () => Unit,
    queryInterface: `type` => Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit
  ): XWizardPage = {
    val __obj = js.Dynamic.literal(PageId = PageId.asInstanceOf[js.Any], Window = Window.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), activatePage = js.Any.fromFunction0(activatePage), addEventListener = js.Any.fromFunction1(addEventListener), canAdvance = js.Any.fromFunction0(canAdvance), commitPage = js.Any.fromFunction1(commitPage), dispose = js.Any.fromFunction0(dispose), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener))
    __obj.asInstanceOf[XWizardPage]
  }
  
  extension [Self <: XWizardPage](x: Self) {
    
    inline def setActivatePage(value: () => Unit): Self = StObject.set(x, "activatePage", js.Any.fromFunction0(value))
    
    inline def setCanAdvance(value: () => Boolean): Self = StObject.set(x, "canAdvance", js.Any.fromFunction0(value))
    
    inline def setCommitPage(value: Double => Boolean): Self = StObject.set(x, "commitPage", js.Any.fromFunction1(value))
    
    inline def setPageId(value: Double): Self = StObject.set(x, "PageId", value.asInstanceOf[js.Any])
    
    inline def setWindow(value: XWindow): Self = StObject.set(x, "Window", value.asInstanceOf[js.Any])
  }
}
