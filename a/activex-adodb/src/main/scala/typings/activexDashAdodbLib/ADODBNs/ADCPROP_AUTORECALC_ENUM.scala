package typings
package activexDashAdodbLib.ADODBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ADCPROP_AUTORECALC_ENUM extends js.Object

@JSGlobal("ADODB.ADCPROP_AUTORECALC_ENUM")
@js.native
object ADCPROP_AUTORECALC_ENUM extends js.Object {
  @js.native
  sealed trait adRecalcAlways
    extends activexDashAdodbLib.ADODBNs.ADCPROP_AUTORECALC_ENUM
  
  @js.native
  sealed trait adRecalcUpFront
    extends activexDashAdodbLib.ADODBNs.ADCPROP_AUTORECALC_ENUM
  
  /* 1 */ val adRecalcAlways: adRecalcAlways with scala.Double = js.native
  /* 0 */ val adRecalcUpFront: adRecalcUpFront with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAdodbLib.ADODBNs.ADCPROP_AUTORECALC_ENUM with scala.Double] = js.native
}

