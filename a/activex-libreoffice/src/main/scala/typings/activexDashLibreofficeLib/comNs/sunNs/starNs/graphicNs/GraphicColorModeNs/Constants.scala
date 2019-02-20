package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.graphicNs.GraphicColorModeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.graphic.GraphicColorMode.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait HIGH_CONTRAST
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.graphicNs.GraphicColorModeNs.Constants
  
  @js.native
  sealed trait NORMAL
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.graphicNs.GraphicColorModeNs.Constants
  
  /* 1 */ val HIGH_CONTRAST: HIGH_CONTRAST with scala.Double = js.native
  /* 0 */ val NORMAL: NORMAL with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.graphicNs.GraphicColorModeNs.Constants with scala.Double
  ] = js.native
}

