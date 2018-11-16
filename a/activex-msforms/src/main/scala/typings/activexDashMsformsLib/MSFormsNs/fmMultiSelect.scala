package typings
package activexDashMsformsLib.MSFormsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait fmMultiSelect extends js.Object

@JSGlobal("MSForms.fmMultiSelect")
@js.native
object fmMultiSelect extends js.Object {
  @js.native
  sealed trait fmMultiSelectExtended
    extends activexDashMsformsLib.MSFormsNs.fmMultiSelect
  
  @js.native
  sealed trait fmMultiSelectMulti
    extends activexDashMsformsLib.MSFormsNs.fmMultiSelect
  
  @js.native
  sealed trait fmMultiSelectSingle
    extends activexDashMsformsLib.MSFormsNs.fmMultiSelect
  
  /* 2 */ val fmMultiSelectExtended: fmMultiSelectExtended with scala.Double = js.native
  /* 1 */ val fmMultiSelectMulti: fmMultiSelectMulti with scala.Double = js.native
  /* 0 */ val fmMultiSelectSingle: fmMultiSelectSingle with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMsformsLib.MSFormsNs.fmMultiSelect with scala.Double] = js.native
}

