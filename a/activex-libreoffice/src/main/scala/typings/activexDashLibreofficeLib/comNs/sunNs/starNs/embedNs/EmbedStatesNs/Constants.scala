package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.EmbedStatesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.embed.EmbedStates.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait ACTIVE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.EmbedStatesNs.Constants
  
  @js.native
  sealed trait INPLACE_ACTIVE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.EmbedStatesNs.Constants
  
  @js.native
  sealed trait LOADED
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.EmbedStatesNs.Constants
  
  @js.native
  sealed trait RUNNING
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.EmbedStatesNs.Constants
  
  @js.native
  sealed trait UI_ACTIVE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.EmbedStatesNs.Constants
  
  /* 2 */ val ACTIVE: ACTIVE with scala.Double = js.native
  /* 3 */ val INPLACE_ACTIVE: INPLACE_ACTIVE with scala.Double = js.native
  /* 0 */ val LOADED: LOADED with scala.Double = js.native
  /* 1 */ val RUNNING: RUNNING with scala.Double = js.native
  /* 4 */ val UI_ACTIVE: UI_ACTIVE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.EmbedStatesNs.Constants with scala.Double
  ] = js.native
}

