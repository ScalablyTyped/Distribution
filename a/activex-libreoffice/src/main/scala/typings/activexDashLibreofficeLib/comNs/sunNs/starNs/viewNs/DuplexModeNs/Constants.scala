package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.viewNs.DuplexModeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.view.DuplexMode.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait LONGEDGE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.viewNs.DuplexModeNs.Constants
  
  @js.native
  sealed trait OFF
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.viewNs.DuplexModeNs.Constants
  
  @js.native
  sealed trait SHORTEDGE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.viewNs.DuplexModeNs.Constants
  
  @js.native
  sealed trait UNKNOWN
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.viewNs.DuplexModeNs.Constants
  
  /* 2 */ val LONGEDGE: LONGEDGE with scala.Double = js.native
  /* 1 */ val OFF: OFF with scala.Double = js.native
  /* 3 */ val SHORTEDGE: SHORTEDGE with scala.Double = js.native
  /* 0 */ val UNKNOWN: UNKNOWN with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.viewNs.DuplexModeNs.Constants with scala.Double
  ] = js.native
}

