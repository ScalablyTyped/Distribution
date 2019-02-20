package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs.PathJoinTypeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.rendering.PathJoinType.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait BEVEL
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs.PathJoinTypeNs.Constants
  
  @js.native
  sealed trait MITER
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs.PathJoinTypeNs.Constants
  
  @js.native
  sealed trait NONE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs.PathJoinTypeNs.Constants
  
  @js.native
  sealed trait ROUND
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs.PathJoinTypeNs.Constants
  
  /* 3 */ val BEVEL: BEVEL with scala.Double = js.native
  /* 1 */ val MITER: MITER with scala.Double = js.native
  /* 0 */ val NONE: NONE with scala.Double = js.native
  /* 2 */ val ROUND: ROUND with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs.PathJoinTypeNs.Constants with scala.Double
  ] = js.native
}

