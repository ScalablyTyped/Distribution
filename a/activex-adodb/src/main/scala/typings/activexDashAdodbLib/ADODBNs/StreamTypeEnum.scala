package typings
package activexDashAdodbLib.ADODBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait StreamTypeEnum extends js.Object

@JSGlobal("ADODB.StreamTypeEnum")
@js.native
object StreamTypeEnum extends js.Object {
  @js.native
  sealed trait adTypeBinary
    extends activexDashAdodbLib.ADODBNs.StreamTypeEnum
  
  @js.native
  sealed trait adTypeText
    extends activexDashAdodbLib.ADODBNs.StreamTypeEnum
  
  /* 1 */ val adTypeBinary: adTypeBinary with scala.Double = js.native
  /* 2 */ val adTypeText: adTypeText with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAdodbLib.ADODBNs.StreamTypeEnum with scala.Double] = js.native
}

