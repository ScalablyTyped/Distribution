package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PpAfterEffect extends js.Object

@JSGlobal("PowerPoint.PpAfterEffect")
@js.native
object PpAfterEffect extends js.Object {
  @js.native
  sealed trait ppAfterEffectDim
    extends activexDashPowerpointLib.PowerPointNs.PpAfterEffect
  
  @js.native
  sealed trait ppAfterEffectHide
    extends activexDashPowerpointLib.PowerPointNs.PpAfterEffect
  
  @js.native
  sealed trait ppAfterEffectHideOnClick
    extends activexDashPowerpointLib.PowerPointNs.PpAfterEffect
  
  @js.native
  sealed trait ppAfterEffectMixed
    extends activexDashPowerpointLib.PowerPointNs.PpAfterEffect
  
  @js.native
  sealed trait ppAfterEffectNothing
    extends activexDashPowerpointLib.PowerPointNs.PpAfterEffect
  
  /* 2 */ val ppAfterEffectDim: ppAfterEffectDim with scala.Double = js.native
  /* 1 */ val ppAfterEffectHide: ppAfterEffectHide with scala.Double = js.native
  /* 3 */ val ppAfterEffectHideOnClick: ppAfterEffectHideOnClick with scala.Double = js.native
  /* -2 */ val ppAfterEffectMixed: ppAfterEffectMixed with scala.Double = js.native
  /* 0 */ val ppAfterEffectNothing: ppAfterEffectNothing with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashPowerpointLib.PowerPointNs.PpAfterEffect with scala.Double] = js.native
}

