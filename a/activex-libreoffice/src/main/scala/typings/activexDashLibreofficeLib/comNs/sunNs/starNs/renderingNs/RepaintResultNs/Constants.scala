package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs.RepaintResultNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.rendering.RepaintResult.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait DRAFTED
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs.RepaintResultNs.Constants
  
  @js.native
  sealed trait FAILED
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs.RepaintResultNs.Constants
  
  @js.native
  sealed trait REDRAWN
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs.RepaintResultNs.Constants
  
  /* 2 */ val DRAFTED: DRAFTED with scala.Double = js.native
  /* 3 */ val FAILED: FAILED with scala.Double = js.native
  /* 1 */ val REDRAWN: REDRAWN with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs.RepaintResultNs.Constants with scala.Double
  ] = js.native
}

