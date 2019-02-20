package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.BestRowTypeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.sdbc.BestRowType.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait NOT_PSEUDO
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.BestRowTypeNs.Constants
  
  @js.native
  sealed trait PSEUDO
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.BestRowTypeNs.Constants
  
  @js.native
  sealed trait UNKNOWN
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.BestRowTypeNs.Constants
  
  /* 1 */ val NOT_PSEUDO: NOT_PSEUDO with scala.Double = js.native
  /* 2 */ val PSEUDO: PSEUDO with scala.Double = js.native
  /* 0 */ val UNKNOWN: UNKNOWN with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.BestRowTypeNs.Constants with scala.Double
  ] = js.native
}

