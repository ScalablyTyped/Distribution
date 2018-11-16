package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdRevisionsBalloonPrintOrientation extends js.Object

@JSGlobal("Word.WdRevisionsBalloonPrintOrientation")
@js.native
object WdRevisionsBalloonPrintOrientation extends js.Object {
  @js.native
  sealed trait wdBalloonPrintOrientationAuto
    extends activexDashWordLib.WordNs.WdRevisionsBalloonPrintOrientation
  
  @js.native
  sealed trait wdBalloonPrintOrientationForceLandscape
    extends activexDashWordLib.WordNs.WdRevisionsBalloonPrintOrientation
  
  @js.native
  sealed trait wdBalloonPrintOrientationPreserve
    extends activexDashWordLib.WordNs.WdRevisionsBalloonPrintOrientation
  
  /* 0 */ val wdBalloonPrintOrientationAuto: wdBalloonPrintOrientationAuto with scala.Double = js.native
  /* 2 */ val wdBalloonPrintOrientationForceLandscape: wdBalloonPrintOrientationForceLandscape with scala.Double = js.native
  /* 1 */ val wdBalloonPrintOrientationPreserve: wdBalloonPrintOrientationPreserve with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdRevisionsBalloonPrintOrientation with scala.Double] = js.native
}

