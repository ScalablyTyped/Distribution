package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.DispatchResultStateNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.frame.DispatchResultState.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait DONTKNOW
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.DispatchResultStateNs.Constants
  
  @js.native
  sealed trait FAILURE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.DispatchResultStateNs.Constants
  
  @js.native
  sealed trait SUCCESS
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.DispatchResultStateNs.Constants
  
  /* 2 */ val DONTKNOW: DONTKNOW with scala.Double = js.native
  /* 0 */ val FAILURE: FAILURE with scala.Double = js.native
  /* 1 */ val SUCCESS: SUCCESS with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.DispatchResultStateNs.Constants with scala.Double
  ] = js.native
}

