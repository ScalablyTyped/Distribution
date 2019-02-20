package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.BooleanComparisonModeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.sdb.BooleanComparisonMode.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait ACCESS_COMPAT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.BooleanComparisonModeNs.Constants
  
  @js.native
  sealed trait EQUAL_INTEGER
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.BooleanComparisonModeNs.Constants
  
  @js.native
  sealed trait EQUAL_LITERAL
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.BooleanComparisonModeNs.Constants
  
  @js.native
  sealed trait IS_LITERAL
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.BooleanComparisonModeNs.Constants
  
  /* 3 */ val ACCESS_COMPAT: ACCESS_COMPAT with scala.Double = js.native
  /* 0 */ val EQUAL_INTEGER: EQUAL_INTEGER with scala.Double = js.native
  /* 2 */ val EQUAL_LITERAL: EQUAL_LITERAL with scala.Double = js.native
  /* 1 */ val IS_LITERAL: IS_LITERAL with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.BooleanComparisonModeNs.Constants with scala.Double
  ] = js.native
}

