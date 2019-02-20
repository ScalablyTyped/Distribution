package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.VisualEffectNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.awt.VisualEffect.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait FLAT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.VisualEffectNs.Constants
  
  @js.native
  sealed trait LOOK3D
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.VisualEffectNs.Constants
  
  @js.native
  sealed trait NONE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.VisualEffectNs.Constants
  
  /* 2 */ val FLAT: FLAT with scala.Double = js.native
  /* 1 */ val LOOK3D: LOOK3D with scala.Double = js.native
  /* 0 */ val NONE: NONE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.VisualEffectNs.Constants with scala.Double
  ] = js.native
}

