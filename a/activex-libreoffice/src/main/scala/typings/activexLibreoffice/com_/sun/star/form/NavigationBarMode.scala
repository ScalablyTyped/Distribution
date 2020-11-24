package typings.activexLibreoffice.com_.sun.star.form

import typings.activexLibreoffice.activexLibreofficeNumbers.`0`
import typings.activexLibreoffice.activexLibreofficeNumbers.`1`
import typings.activexLibreoffice.activexLibreofficeNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** describes in which way the navigation of the records of a database form is performed. */
/* Rewritten from type alias, can be one of: 
  - typings.activexLibreoffice.activexLibreofficeNumbers.`1`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`0`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`2`
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
  def CURRENT: `1` = 1.asInstanceOf[`1`]
  
  /**
    * no navigation bar is provided and navigation on the current form is only possible with the keyboard (TAB/SHIFT TAB).
    *
    * Note that when this mode is set, a simultaneous TabulatorCycle value of TabulatorCycle::CURRENT means that you cannot travel between records anymore.
    * @see TabulatorCycle
    */
  @scala.inline
  def NONE: `0` = 0.asInstanceOf[`0`]
  
  /**
    * a navigation bar is provided and navigation will be performed on the parent of the current/active form.
    *
    * This options is usually used for forms containing an grid control only. In such a form, the control has it's own navigation elements, so there is no
    * need to use the navigation bar for the form, but rather for its parent.
    */
  @scala.inline
  def PARENT: `2` = 2.asInstanceOf[`2`]
}
