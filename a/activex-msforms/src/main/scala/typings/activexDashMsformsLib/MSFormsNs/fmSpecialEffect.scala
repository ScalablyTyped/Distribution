package typings
package activexDashMsformsLib.MSFormsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait fmSpecialEffect extends js.Object

@JSGlobal("MSForms.fmSpecialEffect")
@js.native
object fmSpecialEffect extends js.Object {
  @js.native
  sealed trait fmSpecialEffectBump
    extends activexDashMsformsLib.MSFormsNs.fmSpecialEffect
  
  @js.native
  sealed trait fmSpecialEffectEtched
    extends activexDashMsformsLib.MSFormsNs.fmSpecialEffect
  
  @js.native
  sealed trait fmSpecialEffectFlat
    extends activexDashMsformsLib.MSFormsNs.fmSpecialEffect
  
  @js.native
  sealed trait fmSpecialEffectRaised
    extends activexDashMsformsLib.MSFormsNs.fmSpecialEffect
  
  @js.native
  sealed trait fmSpecialEffectSunken
    extends activexDashMsformsLib.MSFormsNs.fmSpecialEffect
  
  /* 6 */ val fmSpecialEffectBump: fmSpecialEffectBump with scala.Double = js.native
  /* 3 */ val fmSpecialEffectEtched: fmSpecialEffectEtched with scala.Double = js.native
  /* 0 */ val fmSpecialEffectFlat: fmSpecialEffectFlat with scala.Double = js.native
  /* 1 */ val fmSpecialEffectRaised: fmSpecialEffectRaised with scala.Double = js.native
  /* 2 */ val fmSpecialEffectSunken: fmSpecialEffectSunken with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMsformsLib.MSFormsNs.fmSpecialEffect with scala.Double] = js.native
}

