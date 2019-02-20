package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.animationsNs.AnimationAdditiveModeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.animations.AnimationAdditiveMode.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait BASE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.animationsNs.AnimationAdditiveModeNs.Constants
  
  @js.native
  sealed trait MULTIPLY
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.animationsNs.AnimationAdditiveModeNs.Constants
  
  @js.native
  sealed trait NONE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.animationsNs.AnimationAdditiveModeNs.Constants
  
  @js.native
  sealed trait REPLACE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.animationsNs.AnimationAdditiveModeNs.Constants
  
  @js.native
  sealed trait SUM
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.animationsNs.AnimationAdditiveModeNs.Constants
  
  /* 0 */ val BASE: BASE with scala.Double = js.native
  /* 3 */ val MULTIPLY: MULTIPLY with scala.Double = js.native
  /* 4 */ val NONE: NONE with scala.Double = js.native
  /* 2 */ val REPLACE: REPLACE with scala.Double = js.native
  /* 1 */ val SUM: SUM with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.animationsNs.AnimationAdditiveModeNs.Constants with scala.Double
  ] = js.native
}

