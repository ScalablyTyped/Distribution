package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.formNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TabulatorCycle extends js.Object

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
@JSGlobal("com.sun.star.form.TabulatorCycle")
@js.native
object TabulatorCycle extends js.Object {
  /**
    * a navigation bar is provided and navigation will be performed on the current/active form.
    *
    * This is the default and most often encountered mode.
    *
    * pressing the TAB key from the last control moves the focus to the first control in the tab order of the same record.
    */
  @js.native
  sealed trait CURRENT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.TabulatorCycle
  
  /** pressing the TAB key from the last control of a form moves the focus to the first control of the next form in the tab order. */
  @js.native
  sealed trait PAGE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.TabulatorCycle
  
  /** pressing the TAB key from the last control moves the focus to the first control in the tab order of the next record. */
  @js.native
  sealed trait RECORDS
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.TabulatorCycle
  
  /* 1 */ val CURRENT: CURRENT with scala.Double = js.native
  /* 2 */ val PAGE: PAGE with scala.Double = js.native
  /* 0 */ val RECORDS: RECORDS with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.TabulatorCycle with scala.Double
  ] = js.native
}

