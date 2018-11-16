package typings
package activexDashMsformsLib.MSFormsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait fmRepeatDirection extends js.Object

@JSGlobal("MSForms.fmRepeatDirection")
@js.native
object fmRepeatDirection extends js.Object {
  @js.native
  sealed trait _fmRepeatDirectionHorizontal
    extends activexDashMsformsLib.MSFormsNs.fmRepeatDirection
  
  @js.native
  sealed trait _fmRepeatDirectionVertical
    extends activexDashMsformsLib.MSFormsNs.fmRepeatDirection
  
  /* 0 */ val _fmRepeatDirectionHorizontal: _fmRepeatDirectionHorizontal with scala.Double = js.native
  /* 1 */ val _fmRepeatDirectionVertical: _fmRepeatDirectionVertical with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMsformsLib.MSFormsNs.fmRepeatDirection with scala.Double] = js.native
}

