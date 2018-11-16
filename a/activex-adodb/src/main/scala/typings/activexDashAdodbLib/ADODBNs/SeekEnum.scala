package typings
package activexDashAdodbLib.ADODBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SeekEnum extends js.Object

@JSGlobal("ADODB.SeekEnum")
@js.native
object SeekEnum extends js.Object {
  @js.native
  sealed trait adSeekAfter
    extends activexDashAdodbLib.ADODBNs.SeekEnum
  
  @js.native
  sealed trait adSeekAfterEQ
    extends activexDashAdodbLib.ADODBNs.SeekEnum
  
  @js.native
  sealed trait adSeekBefore
    extends activexDashAdodbLib.ADODBNs.SeekEnum
  
  @js.native
  sealed trait adSeekBeforeEQ
    extends activexDashAdodbLib.ADODBNs.SeekEnum
  
  @js.native
  sealed trait adSeekFirstEQ
    extends activexDashAdodbLib.ADODBNs.SeekEnum
  
  @js.native
  sealed trait adSeekLastEQ
    extends activexDashAdodbLib.ADODBNs.SeekEnum
  
  /* 8 */ val adSeekAfter: adSeekAfter with scala.Double = js.native
  /* 4 */ val adSeekAfterEQ: adSeekAfterEQ with scala.Double = js.native
  /* 32 */ val adSeekBefore: adSeekBefore with scala.Double = js.native
  /* 16 */ val adSeekBeforeEQ: adSeekBeforeEQ with scala.Double = js.native
  /* 1 */ val adSeekFirstEQ: adSeekFirstEQ with scala.Double = js.native
  /* 2 */ val adSeekLastEQ: adSeekLastEQ with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAdodbLib.ADODBNs.SeekEnum with scala.Double] = js.native
}

