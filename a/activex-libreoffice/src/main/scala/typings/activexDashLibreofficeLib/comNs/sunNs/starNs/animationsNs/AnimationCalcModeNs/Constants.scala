package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.animationsNs.AnimationCalcModeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.animations.AnimationCalcMode.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait DISCRETE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.animationsNs.AnimationCalcModeNs.Constants
  
  @js.native
  sealed trait LINEAR
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.animationsNs.AnimationCalcModeNs.Constants
  
  @js.native
  sealed trait PACED
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.animationsNs.AnimationCalcModeNs.Constants
  
  @js.native
  sealed trait SPLINE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.animationsNs.AnimationCalcModeNs.Constants
  
  /* 0 */ val DISCRETE: DISCRETE with scala.Double = js.native
  /* 1 */ val LINEAR: LINEAR with scala.Double = js.native
  /* 2 */ val PACED: PACED with scala.Double = js.native
  /* 3 */ val SPLINE: SPLINE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.animationsNs.AnimationCalcModeNs.Constants with scala.Double
  ] = js.native
}

