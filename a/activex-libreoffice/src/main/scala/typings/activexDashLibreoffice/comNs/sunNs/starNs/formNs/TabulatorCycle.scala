package typings.activexDashLibreoffice.comNs.sunNs.starNs.formNs

import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies how the TAB key should be used in a form.
  *
  * If the last control of a form is focused, and the user pressed the TAB key, there are several possibilities how a {@link FormController} should handle
  * this. TabulatorCycle specifies these possibilities.
  *
  * Note that the TabulatorCycle determines what happens when SHIFT-TAB is pressed on the **first** control of a form, as well as when TAB is pressed on
  * the **last** control.
  *
  * **First** and **last** refers to the tabbing order of controls.
  * @see FormControlModel.TabIndex
  * @see FormController
  */
/* Rewritten from type alias, can be one of: 
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`2`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
*/
trait TabulatorCycle extends js.Object

object TabulatorCycle {
  /**
    * a navigation bar is provided and navigation will be performed on the current/active form.
    *
    * This is the default and most often encountered mode.
    *
    * pressing the TAB key from the last control moves the focus to the first control in the tab order of the same record.
    */
  @scala.inline
  def CURRENT: `1` = this.cast(1)
  /** pressing the TAB key from the last control of a form moves the focus to the first control of the next form in the tab order. */
  @scala.inline
  def PAGE: `2` = this.cast(2)
  /** pressing the TAB key from the last control moves the focus to the first control in the tab order of the next record. */
  @scala.inline
  def RECORDS: `0` = this.cast(0)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

