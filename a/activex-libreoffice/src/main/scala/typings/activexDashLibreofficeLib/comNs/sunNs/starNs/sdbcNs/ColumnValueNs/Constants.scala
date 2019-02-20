package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.ColumnValueNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.sdbc.ColumnValue.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait NO_NULLS
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.ColumnValueNs.Constants
  
  @js.native
  sealed trait NULLABLE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.ColumnValueNs.Constants
  
  @js.native
  sealed trait NULLABLE_UNKNOWN
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.ColumnValueNs.Constants
  
  /* 0 */ val NO_NULLS: NO_NULLS with scala.Double = js.native
  /* 1 */ val NULLABLE: NULLABLE with scala.Double = js.native
  /* 2 */ val NULLABLE_UNKNOWN: NULLABLE_UNKNOWN with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.ColumnValueNs.Constants with scala.Double
  ] = js.native
}

