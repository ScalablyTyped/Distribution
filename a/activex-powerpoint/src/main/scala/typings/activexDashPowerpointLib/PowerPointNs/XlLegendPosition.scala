package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlLegendPosition extends js.Object

@JSGlobal("PowerPoint.XlLegendPosition")
@js.native
object XlLegendPosition extends js.Object {
  @js.native
  sealed trait xlLegendPositionBottom
    extends activexDashPowerpointLib.PowerPointNs.XlLegendPosition
  
  @js.native
  sealed trait xlLegendPositionCorner
    extends activexDashPowerpointLib.PowerPointNs.XlLegendPosition
  
  @js.native
  sealed trait xlLegendPositionCustom
    extends activexDashPowerpointLib.PowerPointNs.XlLegendPosition
  
  @js.native
  sealed trait xlLegendPositionLeft
    extends activexDashPowerpointLib.PowerPointNs.XlLegendPosition
  
  @js.native
  sealed trait xlLegendPositionRight
    extends activexDashPowerpointLib.PowerPointNs.XlLegendPosition
  
  @js.native
  sealed trait xlLegendPositionTop
    extends activexDashPowerpointLib.PowerPointNs.XlLegendPosition
  
  /* -4107 */ val xlLegendPositionBottom: xlLegendPositionBottom with scala.Double = js.native
  /* 2 */ val xlLegendPositionCorner: xlLegendPositionCorner with scala.Double = js.native
  /* -4161 */ val xlLegendPositionCustom: xlLegendPositionCustom with scala.Double = js.native
  /* -4131 */ val xlLegendPositionLeft: xlLegendPositionLeft with scala.Double = js.native
  /* -4152 */ val xlLegendPositionRight: xlLegendPositionRight with scala.Double = js.native
  /* -4160 */ val xlLegendPositionTop: xlLegendPositionTop with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashPowerpointLib.PowerPointNs.XlLegendPosition with scala.Double] = js.native
}

