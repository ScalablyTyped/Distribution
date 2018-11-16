package typings
package activexDashAdodbLib.ADODBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait StreamOpenOptionsEnum extends js.Object

@JSGlobal("ADODB.StreamOpenOptionsEnum")
@js.native
object StreamOpenOptionsEnum extends js.Object {
  @js.native
  sealed trait adOpenStreamAsync
    extends activexDashAdodbLib.ADODBNs.StreamOpenOptionsEnum
  
  @js.native
  sealed trait adOpenStreamFromRecord
    extends activexDashAdodbLib.ADODBNs.StreamOpenOptionsEnum
  
  @js.native
  sealed trait adOpenStreamUnspecified
    extends activexDashAdodbLib.ADODBNs.StreamOpenOptionsEnum
  
  /* 1 */ val adOpenStreamAsync: adOpenStreamAsync with scala.Double = js.native
  /* 4 */ val adOpenStreamFromRecord: adOpenStreamFromRecord with scala.Double = js.native
  /* -1 */ val adOpenStreamUnspecified: adOpenStreamUnspecified with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAdodbLib.ADODBNs.StreamOpenOptionsEnum with scala.Double] = js.native
}

