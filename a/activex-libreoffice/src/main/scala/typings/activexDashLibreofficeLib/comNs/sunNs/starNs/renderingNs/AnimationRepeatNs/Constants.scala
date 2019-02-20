package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs.AnimationRepeatNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.rendering.AnimationRepeat.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait ONE_SHOT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs.AnimationRepeatNs.Constants
  
  @js.native
  sealed trait ONE_SHOT_PINGPONG
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs.AnimationRepeatNs.Constants
  
  @js.native
  sealed trait PINGPONG
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs.AnimationRepeatNs.Constants
  
  @js.native
  sealed trait REPEAT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs.AnimationRepeatNs.Constants
  
  /* 0 */ val ONE_SHOT: ONE_SHOT with scala.Double = js.native
  /* 1 */ val ONE_SHOT_PINGPONG: ONE_SHOT_PINGPONG with scala.Double = js.native
  /* 2 */ val PINGPONG: PINGPONG with scala.Double = js.native
  /* 3 */ val REPEAT: REPEAT with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs.AnimationRepeatNs.Constants with scala.Double
  ] = js.native
}

