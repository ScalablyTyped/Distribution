package typings
package activexDashMsformsLib.MSFormsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait fmButtonEffect extends js.Object

@JSGlobal("MSForms.fmButtonEffect")
@js.native
object fmButtonEffect extends js.Object {
  @js.native
  sealed trait fmButtonEffectFlat
    extends activexDashMsformsLib.MSFormsNs.fmButtonEffect
  
  @js.native
  sealed trait fmButtonEffectSunken
    extends activexDashMsformsLib.MSFormsNs.fmButtonEffect
  
  /* 0 */ val fmButtonEffectFlat: fmButtonEffectFlat with scala.Double = js.native
  /* 2 */ val fmButtonEffectSunken: fmButtonEffectSunken with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMsformsLib.MSFormsNs.fmButtonEffect with scala.Double] = js.native
}

