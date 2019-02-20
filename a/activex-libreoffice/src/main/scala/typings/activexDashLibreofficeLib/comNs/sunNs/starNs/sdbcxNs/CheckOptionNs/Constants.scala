package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs.CheckOptionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.sdbcx.CheckOption.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait CASCADE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs.CheckOptionNs.Constants
  
  @js.native
  sealed trait LOCAL
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs.CheckOptionNs.Constants
  
  @js.native
  sealed trait NONE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs.CheckOptionNs.Constants
  
  /* 2 */ val CASCADE: CASCADE with scala.Double = js.native
  /* 3 */ val LOCAL: LOCAL with scala.Double = js.native
  /* 0 */ val NONE: NONE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs.CheckOptionNs.Constants with scala.Double
  ] = js.native
}

