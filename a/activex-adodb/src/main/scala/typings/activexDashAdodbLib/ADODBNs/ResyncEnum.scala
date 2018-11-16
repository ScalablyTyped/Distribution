package typings
package activexDashAdodbLib.ADODBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ResyncEnum extends js.Object

@JSGlobal("ADODB.ResyncEnum")
@js.native
object ResyncEnum extends js.Object {
  @js.native
  sealed trait adResyncAllValues
    extends activexDashAdodbLib.ADODBNs.ResyncEnum
  
  @js.native
  sealed trait adResyncUnderlyingValues
    extends activexDashAdodbLib.ADODBNs.ResyncEnum
  
  /* 2 */ val adResyncAllValues: adResyncAllValues with scala.Double = js.native
  /* 1 */ val adResyncUnderlyingValues: adResyncUnderlyingValues with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAdodbLib.ADODBNs.ResyncEnum with scala.Double] = js.native
}

