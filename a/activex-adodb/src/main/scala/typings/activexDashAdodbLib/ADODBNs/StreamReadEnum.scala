package typings
package activexDashAdodbLib.ADODBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait StreamReadEnum extends js.Object

@JSGlobal("ADODB.StreamReadEnum")
@js.native
object StreamReadEnum extends js.Object {
  @js.native
  sealed trait adReadAll
    extends activexDashAdodbLib.ADODBNs.StreamReadEnum
  
  @js.native
  sealed trait adReadLine
    extends activexDashAdodbLib.ADODBNs.StreamReadEnum
  
  /* -1 */ val adReadAll: adReadAll with scala.Double = js.native
  /* -2 */ val adReadLine: adReadLine with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAdodbLib.ADODBNs.StreamReadEnum with scala.Double] = js.native
}

