package typings
package activexDashAdodbLib.ADODBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ConnectOptionEnum extends js.Object

@JSGlobal("ADODB.ConnectOptionEnum")
@js.native
object ConnectOptionEnum extends js.Object {
  @js.native
  sealed trait adAsyncConnect
    extends activexDashAdodbLib.ADODBNs.ConnectOptionEnum
  
  @js.native
  sealed trait adConnectUnspecified
    extends activexDashAdodbLib.ADODBNs.ConnectOptionEnum
  
  /* 16 */ val adAsyncConnect: adAsyncConnect with scala.Double = js.native
  /* -1 */ val adConnectUnspecified: adConnectUnspecified with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAdodbLib.ADODBNs.ConnectOptionEnum with scala.Double] = js.native
}

