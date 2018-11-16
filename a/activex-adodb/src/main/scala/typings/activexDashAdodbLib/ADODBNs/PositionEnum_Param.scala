package typings
package activexDashAdodbLib.ADODBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PositionEnum_Param extends js.Object

@JSGlobal("ADODB.PositionEnum_Param")
@js.native
object PositionEnum_Param extends js.Object {
  @js.native
  sealed trait adPosBOF
    extends activexDashAdodbLib.ADODBNs.PositionEnum_Param
  
  @js.native
  sealed trait adPosEOF
    extends activexDashAdodbLib.ADODBNs.PositionEnum_Param
  
  @js.native
  sealed trait adPosUnknown
    extends activexDashAdodbLib.ADODBNs.PositionEnum_Param
  
  /* -2 */ val adPosBOF: adPosBOF with scala.Double = js.native
  /* -3 */ val adPosEOF: adPosEOF with scala.Double = js.native
  /* -1 */ val adPosUnknown: adPosUnknown with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAdodbLib.ADODBNs.PositionEnum_Param with scala.Double] = js.native
}

