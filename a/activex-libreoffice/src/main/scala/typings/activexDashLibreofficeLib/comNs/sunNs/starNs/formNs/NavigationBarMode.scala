package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.formNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** describes in which way the navigation of the records of a database form is performed. */
/* Rewritten from type alias, can be one of: 
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`0`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`2`
*/
trait NavigationBarMode extends js.Object

object NavigationBarMode {
  /**
    * a navigation bar is provided and navigation will be performed on the current/active form.
    *
    * This is the default and most often encountered mode.
    *
    * pressing the TAB key from the last control moves the focus to the first control in the tab order of the same record.
    */
  @scala.inline
  def CURRENT: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1` = this.cast(1)
  /**
    * no navigation bar is provided and navigation on the current form is only possible with the keyboard (TAB/SHIFT TAB).
    *
    * Note that when this mode is set, a simultaneous TabulatorCycle value of TabulatorCycle::CURRENT means that you cannot travel between records anymore.
    * @see TabulatorCycle
    */
  @scala.inline
  def NONE: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`0` = this.cast(0)
  /**
    * a navigation bar is provided and navigation will be performed on the parent of the current/active form.
    *
    * This options is usually used for forms containing an grid control only. In such a form, the control has it's own navigation elements, so there is no
    * need to use the navigation bar for the form, but rather for its parent.
    */
  @scala.inline
  def PARENT: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`2` = this.cast(2)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

