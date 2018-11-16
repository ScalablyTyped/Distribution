package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PpFarEastLineBreakLevel extends js.Object

@JSGlobal("PowerPoint.PpFarEastLineBreakLevel")
@js.native
object PpFarEastLineBreakLevel extends js.Object {
  @js.native
  sealed trait ppFarEastLineBreakLevelCustom
    extends activexDashPowerpointLib.PowerPointNs.PpFarEastLineBreakLevel
  
  @js.native
  sealed trait ppFarEastLineBreakLevelNormal
    extends activexDashPowerpointLib.PowerPointNs.PpFarEastLineBreakLevel
  
  @js.native
  sealed trait ppFarEastLineBreakLevelStrict
    extends activexDashPowerpointLib.PowerPointNs.PpFarEastLineBreakLevel
  
  /* 3 */ val ppFarEastLineBreakLevelCustom: ppFarEastLineBreakLevelCustom with scala.Double = js.native
  /* 1 */ val ppFarEastLineBreakLevelNormal: ppFarEastLineBreakLevelNormal with scala.Double = js.native
  /* 2 */ val ppFarEastLineBreakLevelStrict: ppFarEastLineBreakLevelStrict with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashPowerpointLib.PowerPointNs.PpFarEastLineBreakLevel with scala.Double] = js.native
}

