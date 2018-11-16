package typings
package activexDashAdodbLib.ADODBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ConnectModeEnum extends js.Object

@JSGlobal("ADODB.ConnectModeEnum")
@js.native
object ConnectModeEnum extends js.Object {
  @js.native
  sealed trait adModeRead
    extends activexDashAdodbLib.ADODBNs.ConnectModeEnum
  
  @js.native
  sealed trait adModeReadWrite
    extends activexDashAdodbLib.ADODBNs.ConnectModeEnum
  
  @js.native
  sealed trait adModeRecursive
    extends activexDashAdodbLib.ADODBNs.ConnectModeEnum
  
  @js.native
  sealed trait adModeShareDenyNone
    extends activexDashAdodbLib.ADODBNs.ConnectModeEnum
  
  @js.native
  sealed trait adModeShareDenyRead
    extends activexDashAdodbLib.ADODBNs.ConnectModeEnum
  
  @js.native
  sealed trait adModeShareDenyWrite
    extends activexDashAdodbLib.ADODBNs.ConnectModeEnum
  
  @js.native
  sealed trait adModeShareExclusive
    extends activexDashAdodbLib.ADODBNs.ConnectModeEnum
  
  @js.native
  sealed trait adModeUnknown
    extends activexDashAdodbLib.ADODBNs.ConnectModeEnum
  
  @js.native
  sealed trait adModeWrite
    extends activexDashAdodbLib.ADODBNs.ConnectModeEnum
  
  /* 1 */ val adModeRead: adModeRead with scala.Double = js.native
  /* 3 */ val adModeReadWrite: adModeReadWrite with scala.Double = js.native
  /* 4194304 */ val adModeRecursive: adModeRecursive with scala.Double = js.native
  /* 16 */ val adModeShareDenyNone: adModeShareDenyNone with scala.Double = js.native
  /* 4 */ val adModeShareDenyRead: adModeShareDenyRead with scala.Double = js.native
  /* 8 */ val adModeShareDenyWrite: adModeShareDenyWrite with scala.Double = js.native
  /* 12 */ val adModeShareExclusive: adModeShareExclusive with scala.Double = js.native
  /* 0 */ val adModeUnknown: adModeUnknown with scala.Double = js.native
  /* 2 */ val adModeWrite: adModeWrite with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAdodbLib.ADODBNs.ConnectModeEnum with scala.Double] = js.native
}

