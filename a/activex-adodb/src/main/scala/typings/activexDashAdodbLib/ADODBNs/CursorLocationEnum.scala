package typings
package activexDashAdodbLib.ADODBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CursorLocationEnum extends js.Object

@JSGlobal("ADODB.CursorLocationEnum")
@js.native
object CursorLocationEnum extends js.Object {
  @js.native
  sealed trait adUseClient
    extends activexDashAdodbLib.ADODBNs.CursorLocationEnum
  
  @js.native
  sealed trait adUseClientBatch
    extends activexDashAdodbLib.ADODBNs.CursorLocationEnum
  
  @js.native
  sealed trait adUseNone
    extends activexDashAdodbLib.ADODBNs.CursorLocationEnum
  
  @js.native
  sealed trait adUseServer
    extends activexDashAdodbLib.ADODBNs.CursorLocationEnum
  
  /* 3 */ val adUseClient: adUseClient with scala.Double = js.native
  /* 3 */ val adUseClientBatch: adUseClientBatch with scala.Double = js.native
  /* 1 */ val adUseNone: adUseNone with scala.Double = js.native
  /* 2 */ val adUseServer: adUseServer with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAdodbLib.ADODBNs.CursorLocationEnum with scala.Double] = js.native
}

