package typings
package activexDashMsformsLib.MSFormsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait fmLayoutEffect extends js.Object

@JSGlobal("MSForms.fmLayoutEffect")
@js.native
object fmLayoutEffect extends js.Object {
  @js.native
  sealed trait _fmLayoutEffectRespond
    extends activexDashMsformsLib.MSFormsNs.fmLayoutEffect
  
  @js.native
  sealed trait fmLayoutEffectInitiate
    extends activexDashMsformsLib.MSFormsNs.fmLayoutEffect
  
  @js.native
  sealed trait fmLayoutEffectNone
    extends activexDashMsformsLib.MSFormsNs.fmLayoutEffect
  
  /* 2 */ val _fmLayoutEffectRespond: _fmLayoutEffectRespond with scala.Double = js.native
  /* 1 */ val fmLayoutEffectInitiate: fmLayoutEffectInitiate with scala.Double = js.native
  /* 0 */ val fmLayoutEffectNone: fmLayoutEffectNone with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMsformsLib.MSFormsNs.fmLayoutEffect with scala.Double] = js.native
}

