package typings
package activexDashAdodbLib.ADODBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MarshalOptionsEnum extends js.Object

@JSGlobal("ADODB.MarshalOptionsEnum")
@js.native
object MarshalOptionsEnum extends js.Object {
  @js.native
  sealed trait adMarshalAll
    extends activexDashAdodbLib.ADODBNs.MarshalOptionsEnum
  
  @js.native
  sealed trait adMarshalModifiedOnly
    extends activexDashAdodbLib.ADODBNs.MarshalOptionsEnum
  
  /* 0 */ val adMarshalAll: adMarshalAll with scala.Double = js.native
  /* 1 */ val adMarshalModifiedOnly: adMarshalModifiedOnly with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAdodbLib.ADODBNs.MarshalOptionsEnum with scala.Double] = js.native
}

