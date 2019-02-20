package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.CommandTypeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.sdb.CommandType.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait COMMAND
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.CommandTypeNs.Constants
  
  @js.native
  sealed trait QUERY
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.CommandTypeNs.Constants
  
  @js.native
  sealed trait TABLE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.CommandTypeNs.Constants
  
  /* 2 */ val COMMAND: COMMAND with scala.Double = js.native
  /* 1 */ val QUERY: QUERY with scala.Double = js.native
  /* 0 */ val TABLE: TABLE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.CommandTypeNs.Constants with scala.Double
  ] = js.native
}

