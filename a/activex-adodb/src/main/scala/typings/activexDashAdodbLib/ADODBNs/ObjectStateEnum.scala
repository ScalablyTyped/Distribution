package typings
package activexDashAdodbLib.ADODBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ObjectStateEnum extends js.Object

@JSGlobal("ADODB.ObjectStateEnum")
@js.native
object ObjectStateEnum extends js.Object {
  @js.native
  sealed trait adStateClosed
    extends activexDashAdodbLib.ADODBNs.ObjectStateEnum
  
  @js.native
  sealed trait adStateConnecting
    extends activexDashAdodbLib.ADODBNs.ObjectStateEnum
  
  @js.native
  sealed trait adStateExecuting
    extends activexDashAdodbLib.ADODBNs.ObjectStateEnum
  
  @js.native
  sealed trait adStateFetching
    extends activexDashAdodbLib.ADODBNs.ObjectStateEnum
  
  @js.native
  sealed trait adStateOpen
    extends activexDashAdodbLib.ADODBNs.ObjectStateEnum
  
  /* 0 */ val adStateClosed: adStateClosed with scala.Double = js.native
  /* 2 */ val adStateConnecting: adStateConnecting with scala.Double = js.native
  /* 4 */ val adStateExecuting: adStateExecuting with scala.Double = js.native
  /* 8 */ val adStateFetching: adStateFetching with scala.Double = js.native
  /* 1 */ val adStateOpen: adStateOpen with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAdodbLib.ADODBNs.ObjectStateEnum with scala.Double] = js.native
}

