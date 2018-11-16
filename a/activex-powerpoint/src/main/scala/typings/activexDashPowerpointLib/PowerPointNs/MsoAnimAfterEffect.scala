package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoAnimAfterEffect extends js.Object

@JSGlobal("PowerPoint.MsoAnimAfterEffect")
@js.native
object MsoAnimAfterEffect extends js.Object {
  @js.native
  sealed trait msoAnimAfterEffectDim
    extends activexDashPowerpointLib.PowerPointNs.MsoAnimAfterEffect
  
  @js.native
  sealed trait msoAnimAfterEffectHide
    extends activexDashPowerpointLib.PowerPointNs.MsoAnimAfterEffect
  
  @js.native
  sealed trait msoAnimAfterEffectHideOnNextClick
    extends activexDashPowerpointLib.PowerPointNs.MsoAnimAfterEffect
  
  @js.native
  sealed trait msoAnimAfterEffectMixed
    extends activexDashPowerpointLib.PowerPointNs.MsoAnimAfterEffect
  
  @js.native
  sealed trait msoAnimAfterEffectNone
    extends activexDashPowerpointLib.PowerPointNs.MsoAnimAfterEffect
  
  /* 1 */ val msoAnimAfterEffectDim: msoAnimAfterEffectDim with scala.Double = js.native
  /* 2 */ val msoAnimAfterEffectHide: msoAnimAfterEffectHide with scala.Double = js.native
  /* 3 */ val msoAnimAfterEffectHideOnNextClick: msoAnimAfterEffectHideOnNextClick with scala.Double = js.native
  /* -1 */ val msoAnimAfterEffectMixed: msoAnimAfterEffectMixed with scala.Double = js.native
  /* 0 */ val msoAnimAfterEffectNone: msoAnimAfterEffectNone with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashPowerpointLib.PowerPointNs.MsoAnimAfterEffect with scala.Double] = js.native
}

