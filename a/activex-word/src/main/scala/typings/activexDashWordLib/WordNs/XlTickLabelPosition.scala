package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlTickLabelPosition extends js.Object

@JSGlobal("Word.XlTickLabelPosition")
@js.native
object XlTickLabelPosition extends js.Object {
  @js.native
  sealed trait xlTickLabelPositionHigh
    extends activexDashWordLib.WordNs.XlTickLabelPosition
  
  @js.native
  sealed trait xlTickLabelPositionLow
    extends activexDashWordLib.WordNs.XlTickLabelPosition
  
  @js.native
  sealed trait xlTickLabelPositionNextToAxis
    extends activexDashWordLib.WordNs.XlTickLabelPosition
  
  @js.native
  sealed trait xlTickLabelPositionNone
    extends activexDashWordLib.WordNs.XlTickLabelPosition
  
  /* -4127 */ val xlTickLabelPositionHigh: xlTickLabelPositionHigh with scala.Double = js.native
  /* -4134 */ val xlTickLabelPositionLow: xlTickLabelPositionLow with scala.Double = js.native
  /* 4 */ val xlTickLabelPositionNextToAxis: xlTickLabelPositionNextToAxis with scala.Double = js.native
  /* -4142 */ val xlTickLabelPositionNone: xlTickLabelPositionNone with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.XlTickLabelPosition with scala.Double] = js.native
}

