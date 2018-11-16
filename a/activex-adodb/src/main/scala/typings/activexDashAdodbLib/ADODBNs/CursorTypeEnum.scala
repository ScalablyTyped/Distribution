package typings
package activexDashAdodbLib.ADODBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CursorTypeEnum extends js.Object

@JSGlobal("ADODB.CursorTypeEnum")
@js.native
object CursorTypeEnum extends js.Object {
  @js.native
  sealed trait adOpenDynamic
    extends activexDashAdodbLib.ADODBNs.CursorTypeEnum
  
  @js.native
  sealed trait adOpenForwardOnly
    extends activexDashAdodbLib.ADODBNs.CursorTypeEnum
  
  @js.native
  sealed trait adOpenKeyset
    extends activexDashAdodbLib.ADODBNs.CursorTypeEnum
  
  @js.native
  sealed trait adOpenStatic
    extends activexDashAdodbLib.ADODBNs.CursorTypeEnum
  
  @js.native
  sealed trait adOpenUnspecified
    extends activexDashAdodbLib.ADODBNs.CursorTypeEnum
  
  /* 2 */ val adOpenDynamic: adOpenDynamic with scala.Double = js.native
  /* 0 */ val adOpenForwardOnly: adOpenForwardOnly with scala.Double = js.native
  /* 1 */ val adOpenKeyset: adOpenKeyset with scala.Double = js.native
  /* 3 */ val adOpenStatic: adOpenStatic with scala.Double = js.native
  /* -1 */ val adOpenUnspecified: adOpenUnspecified with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAdodbLib.ADODBNs.CursorTypeEnum with scala.Double] = js.native
}

