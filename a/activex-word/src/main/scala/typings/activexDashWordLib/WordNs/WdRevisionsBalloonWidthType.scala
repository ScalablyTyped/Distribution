package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdRevisionsBalloonWidthType extends js.Object

@JSGlobal("Word.WdRevisionsBalloonWidthType")
@js.native
object WdRevisionsBalloonWidthType extends js.Object {
  @js.native
  sealed trait wdBalloonWidthPercent
    extends activexDashWordLib.WordNs.WdRevisionsBalloonWidthType
  
  @js.native
  sealed trait wdBalloonWidthPoints
    extends activexDashWordLib.WordNs.WdRevisionsBalloonWidthType
  
  /* 0 */ val wdBalloonWidthPercent: wdBalloonWidthPercent with scala.Double = js.native
  /* 1 */ val wdBalloonWidthPoints: wdBalloonWidthPoints with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdRevisionsBalloonWidthType with scala.Double] = js.native
}

