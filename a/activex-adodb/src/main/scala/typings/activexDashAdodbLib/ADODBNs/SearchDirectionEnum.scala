package typings
package activexDashAdodbLib.ADODBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SearchDirectionEnum extends js.Object

@JSGlobal("ADODB.SearchDirectionEnum")
@js.native
object SearchDirectionEnum extends js.Object {
  @js.native
  sealed trait adSearchBackward
    extends activexDashAdodbLib.ADODBNs.SearchDirectionEnum
  
  @js.native
  sealed trait adSearchForward
    extends activexDashAdodbLib.ADODBNs.SearchDirectionEnum
  
  /* -1 */ val adSearchBackward: adSearchBackward with scala.Double = js.native
  /* 1 */ val adSearchForward: adSearchForward with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAdodbLib.ADODBNs.SearchDirectionEnum with scala.Double] = js.native
}

