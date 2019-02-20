package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs.TextDirectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.rendering.TextDirection.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait STRONG_LEFT_TO_RIGHT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs.TextDirectionNs.Constants
  
  @js.native
  sealed trait STRONG_RIGHT_TO_LEFT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs.TextDirectionNs.Constants
  
  @js.native
  sealed trait WEAK_LEFT_TO_RIGHT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs.TextDirectionNs.Constants
  
  @js.native
  sealed trait WEAK_RIGHT_TO_LEFT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs.TextDirectionNs.Constants
  
  /* 2 */ val STRONG_LEFT_TO_RIGHT: STRONG_LEFT_TO_RIGHT with scala.Double = js.native
  /* 3 */ val STRONG_RIGHT_TO_LEFT: STRONG_RIGHT_TO_LEFT with scala.Double = js.native
  /* 0 */ val WEAK_LEFT_TO_RIGHT: WEAK_LEFT_TO_RIGHT with scala.Double = js.native
  /* 1 */ val WEAK_RIGHT_TO_LEFT: WEAK_RIGHT_TO_LEFT with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs.TextDirectionNs.Constants with scala.Double
  ] = js.native
}

