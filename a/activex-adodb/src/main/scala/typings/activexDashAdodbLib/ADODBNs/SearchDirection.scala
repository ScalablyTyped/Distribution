package typings
package activexDashAdodbLib.ADODBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SearchDirection extends js.Object

@JSGlobal("ADODB.SearchDirection")
@js.native
object SearchDirection extends js.Object {
  @js.native
  sealed trait adSearchBackward
    extends activexDashAdodbLib.ADODBNs.SearchDirection
  
  @js.native
  sealed trait adSearchForward
    extends activexDashAdodbLib.ADODBNs.SearchDirection
  
  /* -1 */ val adSearchBackward: adSearchBackward with scala.Double = js.native
  /* 1 */ val adSearchForward: adSearchForward with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAdodbLib.ADODBNs.SearchDirection with scala.Double] = js.native
}

