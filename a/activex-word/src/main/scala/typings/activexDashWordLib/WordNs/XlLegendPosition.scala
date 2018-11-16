package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlLegendPosition extends js.Object

@JSGlobal("Word.XlLegendPosition")
@js.native
object XlLegendPosition extends js.Object {
  @js.native
  sealed trait xlLegendPositionBottom
    extends activexDashWordLib.WordNs.XlLegendPosition
  
  @js.native
  sealed trait xlLegendPositionCorner
    extends activexDashWordLib.WordNs.XlLegendPosition
  
  @js.native
  sealed trait xlLegendPositionCustom
    extends activexDashWordLib.WordNs.XlLegendPosition
  
  @js.native
  sealed trait xlLegendPositionLeft
    extends activexDashWordLib.WordNs.XlLegendPosition
  
  @js.native
  sealed trait xlLegendPositionRight
    extends activexDashWordLib.WordNs.XlLegendPosition
  
  @js.native
  sealed trait xlLegendPositionTop
    extends activexDashWordLib.WordNs.XlLegendPosition
  
  /* -4107 */ val xlLegendPositionBottom: xlLegendPositionBottom with scala.Double = js.native
  /* 2 */ val xlLegendPositionCorner: xlLegendPositionCorner with scala.Double = js.native
  /* -4161 */ val xlLegendPositionCustom: xlLegendPositionCustom with scala.Double = js.native
  /* -4131 */ val xlLegendPositionLeft: xlLegendPositionLeft with scala.Double = js.native
  /* -4152 */ val xlLegendPositionRight: xlLegendPositionRight with scala.Double = js.native
  /* -4160 */ val xlLegendPositionTop: xlLegendPositionTop with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.XlLegendPosition with scala.Double] = js.native
}

