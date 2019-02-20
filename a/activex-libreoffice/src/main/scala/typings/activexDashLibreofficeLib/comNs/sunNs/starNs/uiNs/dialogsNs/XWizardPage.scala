package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.dialogsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is a single page of a {@link Wizard}
  * @since OOo 3.3
  */
trait XWizardPage
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent {
  /**
    * denotes the ID of the page.
    *
    * Within a wizard, no two pages are allowed to have the same ID.
    */
  var PageId: scala.Double
  /** provides read-only access to the window of the page */
  var Window: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow
  /** called when the page is activated */
  def activatePage(): scala.Unit
  /**
    * determines whether it is allowed to travel to a later page in the wizard
    *
    * You should base this decision on the state of the page only, not on a global state of the wizard. Usually, you return `FALSE` here if and only if not
    * all necessary input on the page has been provided by the user, or the provided input is not valid.
    *
    * If checked for validity is expensive, or if you prefer giving your user more detailed feedback on validity than a disabled `Next` button in the
    * wizard, then move your checks to the {@link commitPage()} method.
    */
  def canAdvance(): scala.Boolean
  /**
    * is called when the page is about to be left
    *
    * An implementation can veto the leave by returning `FALSE` here. Usually, the decision about this depends on the current state of the page.
    * @param Reason is one of the {@link WizardTravelType} constants denoting the reason why the page should be committed.
    */
  def commitPage(Reason: scala.Double): scala.Boolean
}

