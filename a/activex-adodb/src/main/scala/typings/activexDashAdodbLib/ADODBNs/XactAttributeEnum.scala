package typings
package activexDashAdodbLib.ADODBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XactAttributeEnum extends js.Object

@JSGlobal("ADODB.XactAttributeEnum")
@js.native
object XactAttributeEnum extends js.Object {
  @js.native
  sealed trait adXactAbortRetaining
    extends activexDashAdodbLib.ADODBNs.XactAttributeEnum
  
  @js.native
  sealed trait adXactAsyncPhaseOne
    extends activexDashAdodbLib.ADODBNs.XactAttributeEnum
  
  @js.native
  sealed trait adXactCommitRetaining
    extends activexDashAdodbLib.ADODBNs.XactAttributeEnum
  
  @js.native
  sealed trait adXactSyncPhaseOne
    extends activexDashAdodbLib.ADODBNs.XactAttributeEnum
  
  /* 262144 */ val adXactAbortRetaining: adXactAbortRetaining with scala.Double = js.native
  /* 524288 */ val adXactAsyncPhaseOne: adXactAsyncPhaseOne with scala.Double = js.native
  /* 131072 */ val adXactCommitRetaining: adXactCommitRetaining with scala.Double = js.native
  /* 1048576 */ val adXactSyncPhaseOne: adXactSyncPhaseOne with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAdodbLib.ADODBNs.XactAttributeEnum with scala.Double] = js.native
}

