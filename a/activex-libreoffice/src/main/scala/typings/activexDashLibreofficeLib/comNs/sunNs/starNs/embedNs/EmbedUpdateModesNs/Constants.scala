package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.EmbedUpdateModesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.embed.EmbedUpdateModes.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait ALWAYS_UPDATE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.EmbedUpdateModesNs.Constants
  
  @js.native
  sealed trait EXPLICIT_UPDATE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.EmbedUpdateModesNs.Constants
  
  /* 0 */ val ALWAYS_UPDATE: ALWAYS_UPDATE with scala.Double = js.native
  /* 1 */ val EXPLICIT_UPDATE: EXPLICIT_UPDATE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.EmbedUpdateModesNs.Constants with scala.Double
  ] = js.native
}

