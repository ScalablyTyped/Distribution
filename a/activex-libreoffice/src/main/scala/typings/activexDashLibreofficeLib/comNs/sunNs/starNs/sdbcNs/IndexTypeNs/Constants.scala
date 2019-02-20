package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.IndexTypeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.sdbc.IndexType.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait CLUSTERED
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.IndexTypeNs.Constants
  
  @js.native
  sealed trait HASHED
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.IndexTypeNs.Constants
  
  @js.native
  sealed trait OTHER
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.IndexTypeNs.Constants
  
  @js.native
  sealed trait STATISTIC
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.IndexTypeNs.Constants
  
  /* 1 */ val CLUSTERED: CLUSTERED with scala.Double = js.native
  /* 2 */ val HASHED: HASHED with scala.Double = js.native
  /* 3 */ val OTHER: OTHER with scala.Double = js.native
  /* 0 */ val STATISTIC: STATISTIC with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.IndexTypeNs.Constants with scala.Double
  ] = js.native
}

