package typings
package activexDashMsformsLib.MSFormsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait fmDropEffect extends js.Object

@JSGlobal("MSForms.fmDropEffect")
@js.native
object fmDropEffect extends js.Object {
  @js.native
  sealed trait fmDropEffectCopy
    extends activexDashMsformsLib.MSFormsNs.fmDropEffect
  
  @js.native
  sealed trait fmDropEffectCopyOrMove
    extends activexDashMsformsLib.MSFormsNs.fmDropEffect
  
  @js.native
  sealed trait fmDropEffectMove
    extends activexDashMsformsLib.MSFormsNs.fmDropEffect
  
  @js.native
  sealed trait fmDropEffectNone
    extends activexDashMsformsLib.MSFormsNs.fmDropEffect
  
  /* 1 */ val fmDropEffectCopy: fmDropEffectCopy with scala.Double = js.native
  /* 3 */ val fmDropEffectCopyOrMove: fmDropEffectCopyOrMove with scala.Double = js.native
  /* 2 */ val fmDropEffectMove: fmDropEffectMove with scala.Double = js.native
  /* 0 */ val fmDropEffectNone: fmDropEffectNone with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMsformsLib.MSFormsNs.fmDropEffect with scala.Double] = js.native
}

