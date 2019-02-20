package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.formNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NavigationBarMode extends js.Object

/** describes in which way the navigation of the records of a database form is performed. */
@JSGlobal("com.sun.star.form.NavigationBarMode")
@js.native
object NavigationBarMode extends js.Object {
  /**
    * a navigation bar is provided and navigation will be performed on the current/active form.
    *
    * This is the default and most often encountered mode.
    *
    * pressing the TAB key from the last control moves the focus to the first control in the tab order of the same record.
    */
  @js.native
  sealed trait CURRENT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.NavigationBarMode
  
  /**
    * no navigation bar is provided and navigation on the current form is only possible with the keyboard (TAB/SHIFT TAB).
    *
    * Note that when this mode is set, a simultaneous TabulatorCycle value of TabulatorCycle::CURRENT means that you cannot travel between records anymore.
    * @see TabulatorCycle
    */
  @js.native
  sealed trait NONE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.NavigationBarMode
  
  /**
    * a navigation bar is provided and navigation will be performed on the parent of the current/active form.
    *
    * This options is usually used for forms containing an grid control only. In such a form, the control has it's own navigation elements, so there is no
    * need to use the navigation bar for the form, but rather for its parent.
    */
  @js.native
  sealed trait PARENT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.NavigationBarMode
  
  /* 1 */ val CURRENT: CURRENT with scala.Double = js.native
  /* 0 */ val NONE: NONE with scala.Double = js.native
  /* 2 */ val PARENT: PARENT with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.NavigationBarMode with scala.Double
  ] = js.native
}

