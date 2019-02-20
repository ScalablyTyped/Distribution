package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.ResultSetTypeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.sdbc.ResultSetType.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait FORWARD_ONLY
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.ResultSetTypeNs.Constants
  
  @js.native
  sealed trait SCROLL_INSENSITIVE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.ResultSetTypeNs.Constants
  
  @js.native
  sealed trait SCROLL_SENSITIVE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.ResultSetTypeNs.Constants
  
  /* 1003 */ val FORWARD_ONLY: FORWARD_ONLY with scala.Double = js.native
  /* 1004 */ val SCROLL_INSENSITIVE: SCROLL_INSENSITIVE with scala.Double = js.native
  /* 1005 */ val SCROLL_SENSITIVE: SCROLL_SENSITIVE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.ResultSetTypeNs.Constants with scala.Double
  ] = js.native
}

