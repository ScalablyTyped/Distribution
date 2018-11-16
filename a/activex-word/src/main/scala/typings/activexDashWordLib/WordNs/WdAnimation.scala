package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdAnimation extends js.Object

@JSGlobal("Word.WdAnimation")
@js.native
object WdAnimation extends js.Object {
  @js.native
  sealed trait wdAnimationBlinkingBackground
    extends activexDashWordLib.WordNs.WdAnimation
  
  @js.native
  sealed trait wdAnimationLasVegasLights
    extends activexDashWordLib.WordNs.WdAnimation
  
  @js.native
  sealed trait wdAnimationMarchingBlackAnts
    extends activexDashWordLib.WordNs.WdAnimation
  
  @js.native
  sealed trait wdAnimationMarchingRedAnts
    extends activexDashWordLib.WordNs.WdAnimation
  
  @js.native
  sealed trait wdAnimationNone
    extends activexDashWordLib.WordNs.WdAnimation
  
  @js.native
  sealed trait wdAnimationShimmer
    extends activexDashWordLib.WordNs.WdAnimation
  
  @js.native
  sealed trait wdAnimationSparkleText
    extends activexDashWordLib.WordNs.WdAnimation
  
  /* 2 */ val wdAnimationBlinkingBackground: wdAnimationBlinkingBackground with scala.Double = js.native
  /* 1 */ val wdAnimationLasVegasLights: wdAnimationLasVegasLights with scala.Double = js.native
  /* 4 */ val wdAnimationMarchingBlackAnts: wdAnimationMarchingBlackAnts with scala.Double = js.native
  /* 5 */ val wdAnimationMarchingRedAnts: wdAnimationMarchingRedAnts with scala.Double = js.native
  /* 0 */ val wdAnimationNone: wdAnimationNone with scala.Double = js.native
  /* 6 */ val wdAnimationShimmer: wdAnimationShimmer with scala.Double = js.native
  /* 3 */ val wdAnimationSparkleText: wdAnimationSparkleText with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdAnimation with scala.Double] = js.native
}

