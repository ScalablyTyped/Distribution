package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.KeyRuleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.sdbc.KeyRule.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait CASCADE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.KeyRuleNs.Constants
  
  @js.native
  sealed trait NO_ACTION
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.KeyRuleNs.Constants
  
  @js.native
  sealed trait RESTRICT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.KeyRuleNs.Constants
  
  @js.native
  sealed trait SET_DEFAULT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.KeyRuleNs.Constants
  
  @js.native
  sealed trait SET_NULL
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.KeyRuleNs.Constants
  
  /* 0 */ val CASCADE: CASCADE with scala.Double = js.native
  /* 3 */ val NO_ACTION: NO_ACTION with scala.Double = js.native
  /* 1 */ val RESTRICT: RESTRICT with scala.Double = js.native
  /* 4 */ val SET_DEFAULT: SET_DEFAULT with scala.Double = js.native
  /* 2 */ val SET_NULL: SET_NULL with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.KeyRuleNs.Constants with scala.Double
  ] = js.native
}

