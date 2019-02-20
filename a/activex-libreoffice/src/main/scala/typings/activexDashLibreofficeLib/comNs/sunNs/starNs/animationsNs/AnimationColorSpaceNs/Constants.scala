package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.animationsNs.AnimationColorSpaceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.animations.AnimationColorSpace.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait HSL
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.animationsNs.AnimationColorSpaceNs.Constants
  
  @js.native
  sealed trait RGB
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.animationsNs.AnimationColorSpaceNs.Constants
  
  /* 1 */ val HSL: HSL with scala.Double = js.native
  /* 0 */ val RGB: RGB with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.animationsNs.AnimationColorSpaceNs.Constants with scala.Double
  ] = js.native
}

