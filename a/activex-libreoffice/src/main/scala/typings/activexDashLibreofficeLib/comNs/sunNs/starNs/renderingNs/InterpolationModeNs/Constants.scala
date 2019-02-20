package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs.InterpolationModeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.rendering.InterpolationMode.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait BEZIERSPLINE3
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs.InterpolationModeNs.Constants
  
  @js.native
  sealed trait BEZIERSPLINE4
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs.InterpolationModeNs.Constants
  
  @js.native
  sealed trait CUBIC
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs.InterpolationModeNs.Constants
  
  @js.native
  sealed trait LINEAR
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs.InterpolationModeNs.Constants
  
  @js.native
  sealed trait NEAREST_NEIGHBOR
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs.InterpolationModeNs.Constants
  
  /* 4 */ val BEZIERSPLINE3: BEZIERSPLINE3 with scala.Double = js.native
  /* 5 */ val BEZIERSPLINE4: BEZIERSPLINE4 with scala.Double = js.native
  /* 3 */ val CUBIC: CUBIC with scala.Double = js.native
  /* 2 */ val LINEAR: LINEAR with scala.Double = js.native
  /* 1 */ val NEAREST_NEIGHBOR: NEAREST_NEIGHBOR with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs.InterpolationModeNs.Constants with scala.Double
  ] = js.native
}

