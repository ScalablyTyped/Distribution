package typings
package activexDashAdodbLib.ADODBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait IsolationLevelEnum extends js.Object

@JSGlobal("ADODB.IsolationLevelEnum")
@js.native
object IsolationLevelEnum extends js.Object {
  @js.native
  sealed trait adXactBrowse
    extends activexDashAdodbLib.ADODBNs.IsolationLevelEnum
  
  @js.native
  sealed trait adXactChaos
    extends activexDashAdodbLib.ADODBNs.IsolationLevelEnum
  
  @js.native
  sealed trait adXactCursorStability
    extends activexDashAdodbLib.ADODBNs.IsolationLevelEnum
  
  @js.native
  sealed trait adXactIsolated
    extends activexDashAdodbLib.ADODBNs.IsolationLevelEnum
  
  @js.native
  sealed trait adXactReadCommitted
    extends activexDashAdodbLib.ADODBNs.IsolationLevelEnum
  
  @js.native
  sealed trait adXactReadUncommitted
    extends activexDashAdodbLib.ADODBNs.IsolationLevelEnum
  
  @js.native
  sealed trait adXactRepeatableRead
    extends activexDashAdodbLib.ADODBNs.IsolationLevelEnum
  
  @js.native
  sealed trait adXactSerializable
    extends activexDashAdodbLib.ADODBNs.IsolationLevelEnum
  
  @js.native
  sealed trait adXactUnspecified
    extends activexDashAdodbLib.ADODBNs.IsolationLevelEnum
  
  /* 256 */ val adXactBrowse: adXactBrowse with scala.Double = js.native
  /* 16 */ val adXactChaos: adXactChaos with scala.Double = js.native
  /* 4096 */ val adXactCursorStability: adXactCursorStability with scala.Double = js.native
  /* 1048576 */ val adXactIsolated: adXactIsolated with scala.Double = js.native
  /* 4096 */ val adXactReadCommitted: adXactReadCommitted with scala.Double = js.native
  /* 256 */ val adXactReadUncommitted: adXactReadUncommitted with scala.Double = js.native
  /* 65536 */ val adXactRepeatableRead: adXactRepeatableRead with scala.Double = js.native
  /* 1048576 */ val adXactSerializable: adXactSerializable with scala.Double = js.native
  /* -1 */ val adXactUnspecified: adXactUnspecified with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAdodbLib.ADODBNs.IsolationLevelEnum with scala.Double] = js.native
}

