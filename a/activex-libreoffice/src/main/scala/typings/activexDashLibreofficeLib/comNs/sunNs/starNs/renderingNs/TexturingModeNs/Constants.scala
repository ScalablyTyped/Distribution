package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs.TexturingModeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.rendering.TexturingMode.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait CLAMP
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs.TexturingModeNs.Constants
  
  @js.native
  sealed trait NONE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs.TexturingModeNs.Constants
  
  @js.native
  sealed trait REPEAT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs.TexturingModeNs.Constants
  
  /* 1 */ val CLAMP: CLAMP with scala.Double = js.native
  /* 0 */ val NONE: NONE with scala.Double = js.native
  /* 2 */ val REPEAT: REPEAT with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs.TexturingModeNs.Constants with scala.Double
  ] = js.native
}

