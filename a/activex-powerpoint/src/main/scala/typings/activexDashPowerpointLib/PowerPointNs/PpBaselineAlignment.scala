package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PpBaselineAlignment extends js.Object

@JSGlobal("PowerPoint.PpBaselineAlignment")
@js.native
object PpBaselineAlignment extends js.Object {
  @js.native
  sealed trait ppBaselineAlignAuto
    extends activexDashPowerpointLib.PowerPointNs.PpBaselineAlignment
  
  @js.native
  sealed trait ppBaselineAlignBaseline
    extends activexDashPowerpointLib.PowerPointNs.PpBaselineAlignment
  
  @js.native
  sealed trait ppBaselineAlignCenter
    extends activexDashPowerpointLib.PowerPointNs.PpBaselineAlignment
  
  @js.native
  sealed trait ppBaselineAlignFarEast50
    extends activexDashPowerpointLib.PowerPointNs.PpBaselineAlignment
  
  @js.native
  sealed trait ppBaselineAlignMixed
    extends activexDashPowerpointLib.PowerPointNs.PpBaselineAlignment
  
  @js.native
  sealed trait ppBaselineAlignTop
    extends activexDashPowerpointLib.PowerPointNs.PpBaselineAlignment
  
  /* 5 */ val ppBaselineAlignAuto: ppBaselineAlignAuto with scala.Double = js.native
  /* 1 */ val ppBaselineAlignBaseline: ppBaselineAlignBaseline with scala.Double = js.native
  /* 3 */ val ppBaselineAlignCenter: ppBaselineAlignCenter with scala.Double = js.native
  /* 4 */ val ppBaselineAlignFarEast50: ppBaselineAlignFarEast50 with scala.Double = js.native
  /* -2 */ val ppBaselineAlignMixed: ppBaselineAlignMixed with scala.Double = js.native
  /* 2 */ val ppBaselineAlignTop: ppBaselineAlignTop with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashPowerpointLib.PowerPointNs.PpBaselineAlignment with scala.Double] = js.native
}

