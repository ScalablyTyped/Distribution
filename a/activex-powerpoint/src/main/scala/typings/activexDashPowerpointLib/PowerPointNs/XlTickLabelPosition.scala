package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlTickLabelPosition extends js.Object

@JSGlobal("PowerPoint.XlTickLabelPosition")
@js.native
object XlTickLabelPosition extends js.Object {
  @js.native
  sealed trait xlTickLabelPositionHigh
    extends activexDashPowerpointLib.PowerPointNs.XlTickLabelPosition
  
  @js.native
  sealed trait xlTickLabelPositionLow
    extends activexDashPowerpointLib.PowerPointNs.XlTickLabelPosition
  
  @js.native
  sealed trait xlTickLabelPositionNextToAxis
    extends activexDashPowerpointLib.PowerPointNs.XlTickLabelPosition
  
  @js.native
  sealed trait xlTickLabelPositionNone
    extends activexDashPowerpointLib.PowerPointNs.XlTickLabelPosition
  
  /* -4127 */ val xlTickLabelPositionHigh: xlTickLabelPositionHigh with scala.Double = js.native
  /* -4134 */ val xlTickLabelPositionLow: xlTickLabelPositionLow with scala.Double = js.native
  /* 4 */ val xlTickLabelPositionNextToAxis: xlTickLabelPositionNextToAxis with scala.Double = js.native
  /* -4142 */ val xlTickLabelPositionNone: xlTickLabelPositionNone with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashPowerpointLib.PowerPointNs.XlTickLabelPosition with scala.Double] = js.native
}

