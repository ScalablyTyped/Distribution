package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs.PrivilegeObjectNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.sdbcx.PrivilegeObject.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait COLUMN
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs.PrivilegeObjectNs.Constants
  
  @js.native
  sealed trait TABLE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs.PrivilegeObjectNs.Constants
  
  @js.native
  sealed trait VIEW
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs.PrivilegeObjectNs.Constants
  
  /* 2 */ val COLUMN: COLUMN with scala.Double = js.native
  /* 0 */ val TABLE: TABLE with scala.Double = js.native
  /* 1 */ val VIEW: VIEW with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs.PrivilegeObjectNs.Constants with scala.Double
  ] = js.native
}

