package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.FetchErrorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.ucb.FetchError.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait ENDOFDATA
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.FetchErrorNs.Constants
  
  @js.native
  sealed trait EXCEPTION
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.FetchErrorNs.Constants
  
  @js.native
  sealed trait SUCCESS
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.FetchErrorNs.Constants
  
  /* 1 */ val ENDOFDATA: ENDOFDATA with scala.Double = js.native
  /* 2 */ val EXCEPTION: EXCEPTION with scala.Double = js.native
  /* 0 */ val SUCCESS: SUCCESS with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.FetchErrorNs.Constants with scala.Double
  ] = js.native
}

