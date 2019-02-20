package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.FetchDirectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.sdbc.FetchDirection.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait FORWARD
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.FetchDirectionNs.Constants
  
  @js.native
  sealed trait REVERSE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.FetchDirectionNs.Constants
  
  @js.native
  sealed trait UNKNOWN
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.FetchDirectionNs.Constants
  
  /* 1000 */ val FORWARD: FORWARD with scala.Double = js.native
  /* 1001 */ val REVERSE: REVERSE with scala.Double = js.native
  /* 1002 */ val UNKNOWN: UNKNOWN with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.FetchDirectionNs.Constants with scala.Double
  ] = js.native
}

