package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RememberAuthentication extends js.Object

/** A specification of how long to remember some authentication data. */
@JSGlobal("com.sun.star.ucb.RememberAuthentication")
@js.native
object RememberAuthentication extends js.Object {
  /** Do not remember the authentication data (use it once and immediately forget about it). */
  @js.native
  sealed trait NO
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.RememberAuthentication
  
  /** Remember the authentication data "forever". */
  @js.native
  sealed trait PERSISTENT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.RememberAuthentication
  
  /** Remember the authentication data, but only until the end of the current session. */
  @js.native
  sealed trait SESSION
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.RememberAuthentication
  
  /* 0 */ val NO: NO with scala.Double = js.native
  /* 2 */ val PERSISTENT: PERSISTENT with scala.Double = js.native
  /* 1 */ val SESSION: SESSION with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.RememberAuthentication with scala.Double
  ] = js.native
}

