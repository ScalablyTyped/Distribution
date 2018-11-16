package typings
package activexDashAdodbLib.ADODBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ADCPROP_UPDATERESYNC_ENUM extends js.Object

@JSGlobal("ADODB.ADCPROP_UPDATERESYNC_ENUM")
@js.native
object ADCPROP_UPDATERESYNC_ENUM extends js.Object {
  @js.native
  sealed trait adResyncAll
    extends activexDashAdodbLib.ADODBNs.ADCPROP_UPDATERESYNC_ENUM
  
  @js.native
  sealed trait adResyncAutoIncrement
    extends activexDashAdodbLib.ADODBNs.ADCPROP_UPDATERESYNC_ENUM
  
  @js.native
  sealed trait adResyncConflicts
    extends activexDashAdodbLib.ADODBNs.ADCPROP_UPDATERESYNC_ENUM
  
  @js.native
  sealed trait adResyncInserts
    extends activexDashAdodbLib.ADODBNs.ADCPROP_UPDATERESYNC_ENUM
  
  @js.native
  sealed trait adResyncNone
    extends activexDashAdodbLib.ADODBNs.ADCPROP_UPDATERESYNC_ENUM
  
  @js.native
  sealed trait adResyncUpdates
    extends activexDashAdodbLib.ADODBNs.ADCPROP_UPDATERESYNC_ENUM
  
  /* 15 */ val adResyncAll: adResyncAll with scala.Double = js.native
  /* 1 */ val adResyncAutoIncrement: adResyncAutoIncrement with scala.Double = js.native
  /* 2 */ val adResyncConflicts: adResyncConflicts with scala.Double = js.native
  /* 8 */ val adResyncInserts: adResyncInserts with scala.Double = js.native
  /* 0 */ val adResyncNone: adResyncNone with scala.Double = js.native
  /* 4 */ val adResyncUpdates: adResyncUpdates with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAdodbLib.ADODBNs.ADCPROP_UPDATERESYNC_ENUM with scala.Double] = js.native
}

