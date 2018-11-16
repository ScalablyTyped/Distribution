package typings
package activexDashMsformsLib.MSFormsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait fmListBoxStyles extends js.Object

@JSGlobal("MSForms.fmListBoxStyles")
@js.native
object fmListBoxStyles extends js.Object {
  @js.native
  sealed trait _fmListBoxStylesComboBox
    extends activexDashMsformsLib.MSFormsNs.fmListBoxStyles
  
  @js.native
  sealed trait _fmListBoxStylesListBox
    extends activexDashMsformsLib.MSFormsNs.fmListBoxStyles
  
  @js.native
  sealed trait _fmListBoxStylesNone
    extends activexDashMsformsLib.MSFormsNs.fmListBoxStyles
  
  /* 2 */ val _fmListBoxStylesComboBox: _fmListBoxStylesComboBox with scala.Double = js.native
  /* 1 */ val _fmListBoxStylesListBox: _fmListBoxStylesListBox with scala.Double = js.native
  /* 0 */ val _fmListBoxStylesNone: _fmListBoxStylesNone with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMsformsLib.MSFormsNs.fmListBoxStyles with scala.Double] = js.native
}

