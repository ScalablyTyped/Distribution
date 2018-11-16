package typings
package activexDashAdodbLib.ADODBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LineSeparatorEnum extends js.Object

@JSGlobal("ADODB.LineSeparatorEnum")
@js.native
object LineSeparatorEnum extends js.Object {
  @js.native
  sealed trait adCR
    extends activexDashAdodbLib.ADODBNs.LineSeparatorEnum
  
  @js.native
  sealed trait adCRLF
    extends activexDashAdodbLib.ADODBNs.LineSeparatorEnum
  
  @js.native
  sealed trait adLF
    extends activexDashAdodbLib.ADODBNs.LineSeparatorEnum
  
  /* 13 */ val adCR: adCR with scala.Double = js.native
  /* -1 */ val adCRLF: adCRLF with scala.Double = js.native
  /* 10 */ val adLF: adLF with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAdodbLib.ADODBNs.LineSeparatorEnum with scala.Double] = js.native
}

